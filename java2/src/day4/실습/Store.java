package day4.실습;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Store {
    private String path = "src/day4/실습/config.txt";

    public Store() {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static void main(String[] args) {
        Cook cook = getCook();
        Set<Dish> dishes = new LinkedHashSet<>();
        dishes.add(new Dish(1, "돼지불백"));
        dishes.add(new Dish(2, "모둠쌈밥"));
        dishes.add(new Dish(3, "불고기된장찌개"));

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            printOption();
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("close")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (input) {
                case "1":
                    handleOrder(scanner, cook, dishes);
                    break;
                case "2":
                    System.out.println("\n메뉴를 보여드립니다:");
                    printMenuList(dishes);
                    break;
                case "3":
                    handleManageMenu(scanner, dishes);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }

    private static Cook getCook() {
        Properties p = new Properties();
        Cook cooker = null;

        Store store = new Store();
        String path = store.getPath();

        try {
            p.load(new FileReader(path));
            String className = (String) p.get("Cook");
            Class<?> clazz = Class.forName(className);
            cooker = (Cook) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cooker;
    }

    public static void printOption() {
        System.out.println("\n메뉴를 선택하세요:");
        System.out.println("1. 주문하기");
        System.out.println("2. 메뉴 보여주기");
        System.out.println("3. 메뉴 관리하기 (추가/삭제)");
        System.out.println("종료하려면 'close'를 입력하세요.");
    }

    public static void printMenuList(Set<Dish> dishes) {
        for (Dish dish : dishes) {
            System.out.println(dish.getId() + ". " + dish.getName());
        }
    }

    public static void handleOrder(Scanner sc, Cook cook, Set<Dish> dishes) {
        System.out.println("\n주문할 음식을 선택하세요:");
        printMenuList(dishes);

        int orderId = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Dish selectedDish = null;
        for (Dish dish : dishes) {
            if (dish.getId() == orderId) {
                selectedDish = dish;
                break;
            }
        }

        if (selectedDish != null) {
            cook.doCook(selectedDish);
        } else {
            System.out.println("유효한 메뉴를 선택하세요.");
        }
    }

    private static void handleManageMenu(Scanner scanner, Set<Dish> dishes) {
        System.out.println();
        while (true) {
            printManageMenuOptions();
            String manageInput = scanner.nextLine().trim();

            if (manageInput.equalsIgnoreCase("back")) {
                break;
            }

            switch (manageInput) {
                case "1":
                    addDish(scanner, dishes);
                    break;
                case "2":
                    removeDish(scanner, dishes);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void printManageMenuOptions() {
        System.out.println("\n메뉴 관리:");
        System.out.println("1. 메뉴 추가하기");
        System.out.println("2. 메뉴 삭제하기");
        System.out.println("돌아가려면 'back'을 입력하세요.");
    }

    public static void addDish(Scanner sc, Set<Dish> dishes) {
        System.out.println("\n새로운 요리를 추가합니다.");

        // 최대 ID를 찾고, 그 다음 ID 생성
        int newId = 0;
        for (Dish dish : dishes) {
            if (dish.getId() > newId) {
                newId = dish.getId();
            }
        }
        newId++;  // 가장 큰 ID에 1을 더함

        System.out.print("요리 이름을 입력하세요: ");
        String name = sc.nextLine().trim();

        Dish newDish = new Dish(newId, name);
        if (dishes.add(newDish)) {
            System.out.println("새로운 요리가 추가되었습니다: " + newDish.getId() + ". " + newDish.getName());
        } else {
            System.out.println("이미 존재하는 요리입니다.");
        }
    }


    public static void removeDish(Scanner sc, Set<Dish> dishes) {
        System.out.println("\n삭제할 요리의 ID를 입력하세요:");
        printMenuList(dishes);
        int removeId = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Iterator<Dish> iterator = dishes.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            if (dish.getId() == removeId) {
                iterator.remove();
                System.out.println("요리가 삭제되었습니다: " + dish.getName());
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("해당 ID의 요리를 찾을 수 없습니다.");
        }
    }
}
