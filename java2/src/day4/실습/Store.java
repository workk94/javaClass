package day4.실습;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {

		Cook cook = getCook();
		List<Dish> dishes = new ArrayList<>();
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
		String path;

		try {
			
			
			//File f = new File("./config.txt");
			
			//System.out.println(f.toPath());
			p.load(new FileReader("./config.txt"));

			String className = (String) p.get("Cook");
			Class<?> clazz = Class.forName(className);
			cooker = (Cook) clazz.newInstance();

		} catch (FileNotFoundException e) {
			// 없으면 파일 만듬
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
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

	public static void printMenuList(List<Dish> dishes) {
		for (Dish dish : dishes) {
			System.out.println(dish.getId() + ". " + dish.getName());
		}
	}

	public static void handleOrder(Scanner sc, Cook cook, List<Dish> dishes) {
		System.out.println("\n주문할 음식을 선택하세요:");
		printMenuList(dishes);

		int orderId = sc.nextInt();

		Dish selectedDish = null;
		for (Dish dish : dishes) {
			if (dish.getId() == orderId) {
				selectedDish = dish;
				break;
			}
		}
		if (selectedDish != null) {
			cook.doCook(selectedDish);
		}
	}

	private static void handleManageMenu(Scanner scanner, List<Dish> dishes) {
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

	public static void addDish(Scanner sc, List<Dish> dishes) {
		System.out.println("\n새로운 요리를 추가합니다.");
		int newId = 1;
		if (!dishes.isEmpty()) {
			int maxId = 0;
			for (Dish dish : dishes) {
				int id = dish.getId();
				if (id > maxId) {
					maxId = id;
				}
			}
			newId = maxId + 1;
		}
		System.out.print("요리 이름을 입력하세요: ");
		String name = sc.nextLine().trim();

		// 새로운 Dish 객체 생성 및 리스트에 추가
		Dish newDish = new Dish(newId, name);
		dishes.add(newDish);
		System.out.println("새로운 요리가 추가되었습니다: " + newDish.getId() + ". " + newDish.getName());
	}

	public static void removeDish(Scanner sc, List<Dish> dishes) {
		System.out.println("\n삭제할 요리의 ID를 입력하세요:");
		printMenuList(dishes);
		int removeId = -1;
		int input = sc.nextInt();
		removeId = input;

		// iterator->
		// 1.컬렉션 요소 제어
		// 2.next(),previous()로 앞뒤
		// 3.hasNext()로
		Iterator<Dish> iterator = dishes.iterator();

		while (iterator.hasNext()) {
			Dish dish = iterator.next();
			if (dish.getId() == removeId) {
				iterator.remove();
				System.out.println("요리가 삭제되었습니다: " + dish.getName());
				break;
			}
		}
	}
}
