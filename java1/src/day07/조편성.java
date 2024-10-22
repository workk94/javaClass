package day07;

import java.util.Random;

public class 조편성 {
    public static void main(String[] args) throws InterruptedException {

        String[] students = new String[]{
                "김솔",
                "김도현",
                "김무궁",
                "김세중",
                "김세현",
                "김정석",
                "김채운",
                "백바울",
                "소병학",
                "송병화",
                "송수빈",
                "용지민",
                "이상민",
                "이효진",
                "장경호",
                "전우선",
                "전지형",
                "정보란",
                "주상길",
                "주형준",
                "최문길",
                "최형진",
                "하예진",
                "황지영"
        };

        Random random = new Random();

        //랜덤을 이용해서 배열 섞기 (배열 요소 섞기)
        for (int i = students.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = students[i];
            students[i] = students[j];
            students[j] = temp;
        }

        // 2차원 배열 생성 (예: 6개의 조, 각 조에 4명씩)
        String[][] groups = new String[6][4];

        // 2차원 배열에 학생 이름을 배정
        for (int i = 0; i < students.length; i++) {
            int row = i / 4;  // 조 인덱스 계산
            int column = i % 4;  // 조 내에서 학생 인덱스 계산
            groups[row][column] = students[i];
        }
        
        
        //3초후 출력하기
        
        Thread.sleep(3000);

        // 2차원 배열 출력
        for (int i = 0; i < groups.length; i++) {  // 행 반복
        	
            System.out.print("조 " + (i + 1) + ": ");
            for (int j = 0; j < groups[i].length; j++) {  // 열 반복
                System.out.print(groups[i][j] + " ");  // 각 요소 출력
            }
            System.out.println();  // 행이 끝나면 줄바꿈
            
        }
    }
}


/*
i      row (/4)    column(%4)
0        0               0
1        0               1
2        0               2
3        0               3
4        1               0
5        1               1
6        1               2
7        1               3
8        2               0
9        2               1
10       2               2
11       2               3
12       3               0
13       3               1
14       3               2
15       3               3
16       4               0
17       4               1
18       4               2
19       4               3
20       5               0
21       5               1
22       5               2
23       5               3

 */
