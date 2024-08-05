package sample;

public class Switch2 {

	public static void main(String[] args) {
        double sum = 0;
        double l = 0; // 항
        int sw = 0; // 스위치 변수

        for(int i = 1; i <= 49; i++) {
            l = (double) i / ((i + 1) * (i + 2));
            if(sw == 0) {
                sum += l;
                sw = 1;
            } else {
                sum -= l;
                sw = 0;
            }
        }

        System.out.println(sum);
    }

}
