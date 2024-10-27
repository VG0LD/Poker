import java.awt.font.FontRenderContext;
import java.sql.SQLOutput;
import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {

        //exercise 1
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(i + " ");
//        }

        //exercise 2
//        int a = 7;
//        while (a <= 98) {
//            System.out.print(a + " ");
//            a += 7;
//        }

        //exercise 3
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //exercise 4
//        int n0 = 1;
//        int n1 = 1;
//        int n2;
//        System.out.print(n0+" "+n1+" ");
//        for (int i = 0; i <= 10 ;i++) {
//            n2=n0+n1;
//            System.out.print(n2+" ");
//            n0=n1;
//            n1=n2;
//        }
//        System.out.println();

        //exercise 5
//        String answer;
//        Boolean exit;
//        System.out.println(" What is big, blue, with antennae and full of bunnies?");
//        Scanner inputAnswer = new Scanner(System.in);
//        exit = false;
//        for(int i = 1; i <= 3; i++) {
//            if (exit == true)
//                break;
//            answer = inputAnswer.next();
//            switch (answer) {
//                case ("bus"):
//                    System.out.println("You won");
//                    exit = true;
//                    break;
//                case ("idk"):
//                    System.out.println("The answer is bus");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Think again");
//            }
//        }

//        //exercise 6
//        int gift = 0;
//        while (gift < 10) {
//            if (gift == 5) {
//                System.out.println("Here is your gift - " + gift);
//                break;
//            }
//            gift++;
//        }

        //exercise 7.1
//        String[] a = {"1", "2", "3", "4", "5", "6", "7"};
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a [i] + " ");
//            if (i == 6) {
//                System.out.println();
//                for (int j = a.length - 1; j >= 0; j--) {
//                    System.out.print(a[j] + " ");
//                }
//            }
//        }

        //exercise 7.2
//        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
//        //Выводим изначальный массив в консоль
//        for (int i=0; i<a.length; i++){
//            System.out.print(a[i]);
//        }
//        System.out.println();
//
//        int n = a.length;
//        //Переменная, которая будет использоваться при обмене элементов
//        String temp;
//
//        for (int i = 0; i < n/2; i++) {
//            temp = a[n-i-1];                //temp = a[6]
//            a[n-i-1] = a[i];                //a[6] = a[0]
//            a[i] = temp;                    //a[0] = a[6]
//        }
//        //Выводим конечный массив в консоль
//        for (int i=0; i<a.length; i++){
//            System.out.print(a[i]);
//        }
//        System.out.println();
//        System.out.println(a[6]);

        //exercise 8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please write something:");
//        String input = sc.nextLine();
//        int count = 0;
//        if(input.length() != 0){
//            count++;
//            for (int i = 0; i < input.length(); i++) {
//                if(input.charAt(i) == ' '){
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("You wrote "+count+"words");

        //exercise9
//        for (int i = 5; i > 0; i--) {
//            System.out.print(i + " ");
//        }

        //exercise 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("3 * " + i + " = " + 3 * i);
//        }

        //exercise 11
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please write any number:");
//        int n = sc.nextInt();
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n != 0) {
//                count = count + i;
//            }
//        }
//        System.out.println(count);

        //exercise 12
//        int n = 1;
//        while (n <= 512) {
//            System.out.print(n + " ");
//            n *= 2;
//        }

        //exercise 13
//        int n = 0;
//        while (n < 98) {
//            n += 7;
//            System.out.print(n + " ");
//        }

        //exercise 14
//        int n1 = 1;
//        int n2 = 1;
//        int n3;
//        System.out.print(n1 + " " + n2 + " ");
//        for (int i = 1; i <= 9; i++) {
//            n3 = n2 + n1;
//            System.out.print(n3 + " ");
//            n1 = n2;
//            n2 = n3;
//        }
//        System.out.println();

        //exercise 15.1
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                System.out.println("Your ticket is " + i);
//                break;
//            }
//        }
//        System.out.println();

        //exercise 15.2
//        int n = 0;
//        while (n < 10) {
//            if (n == 5) {
//                System.out.println("Your ticket is " + n);
//                break;
//            }
//            break;
//        }

        //exercise 16
//        System.out.println("What is big, blue, with antennae and full of bunnies?");
//        Scanner sc = new Scanner(System.in);
//        String answer;
//        Boolean exit = false;
//        for (int i = 0; i < 3; i++) {
//            if (exit == true)
//                break;
//            answer = sc.next();
//            switch (answer) {
//                case "bus":
//                    System.out.println("You won!");
//                    exit = true;
//                    break;
//                case "idk":
//                    System.out.println("The answer is - bus");
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Try again");
//            }
//        }

        //exercise 17
//        String[] s1 = {"1 ", "2 ", "3", "4", "5", "6", "7"};
//        for (int i = 0; i <= s1.length-1; i++) {
//            System.out.print(s1[i] + " ");
//        }
//        System.out.println();
//        for (int j = s1.length-1; j >= 0; j--) {
//            System.out.print(s1[j] + " ");
//        }

        //exercise 18
//        System.out.println("Please write words:");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        int count = 1;
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        System.out.println("The total words is " + count);

    }
}