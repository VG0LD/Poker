import java.util.Scanner;

public class repeat2 {
    public static void main(String[] args) {

        //exercise 19
//        int cardsPerPlayer = 5;
//        int players =0 ;
//
//        String[] suits = {
//                "Пик", "Бубен", "Черв", "Треф"
//        };
//
//        String[] rank = {
//                "2", "3", "4", "5", "6", "7", "8", "9", "10",
//                "Валет", "Королева", "Король", "Туз"
//        };
//
//        int n = suits.length * rank.length; // количество карт
//
//
//        // часть 2 - ввод с консоли
//        for(;;){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Введите количество игроков: ");
//
//            if(sc.hasNextInt()){
//
//                players = sc.nextInt();
//                if(cardsPerPlayer * players <= n){
//                    break;
//                } else {
//                    if (players ==0){
//
//                        System.out.println("Игра прекращена.");
//                        break;
//
//                    } else if (players<0){
//
//                        System.out.println("Число игроков не может быть меньше 0");
//
//                    } else{
//
//                        System.out.println("Слишком много игроков!");
//                    }
//                }
//
//            } else{
//                System.out.println("Вы ввели не число, или Ваше число слишком большое!");
//
//            }
//        }
//        // часть 3 - инициализация колоды
//        String[] deck = new String[n];
//        for (int i = 0; i < rank.length; i++) {                        //13
//            for (int j = 0; j < suits.length; j++) {                   //4
//                deck[suits.length*i + j] = rank[i] + " " + suits[j];   //deck[4*1 + 1] = rank[1] + " " + suits[1]
//            }
//        }
//
//        // часть 4 - перетасовка колоды
//        for (int i = 0; i < n; i++) {
//            int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
//            String temp = deck[r];
//            deck[r] = deck[i];
//            deck[i] = temp;
//        }
//
//        // часть 5 - перетасованная колода выводится на экран
//        for (int i = 0; i < players * cardsPerPlayer; i++) {
//            System.out.println(deck[i]);
//            if (i % cardsPerPlayer == cardsPerPlayer - 1)
//                System.out.println();
//        }

        //exercise 20
//        Scanner sc = new Scanner(System.in);
//        //Вводим предложение в консоль
//        System.out.println("Введите слова одной строкой через пробел");
//        String input = sc.nextLine();
//        //Начальное количество слов равно 0
//        int count = 0;
//
//        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
//        if(input.length() != 0){
//            count++;
//            //Проверяем каждый символ, не пробел ли это
//            for (int i = 0; i < input.length(); i++) {
//                if(input.charAt(i) == ' '){
//                    //Если пробел - увеличиваем количество слов на 1
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Вы ввели "+count+" слова");

        //exercise 21
//        System.out.println("First matrix");
//        System.out.println("---------------");
//        for (int i = 0; i < 9; i++) {
//            if (i == 3) {
//                System.out.println();
//            }
//            if (i == 6) {
//                System.out.println();
//            }
//            System.out.print(i + "   ");
//            if (i == 8) {
//                System.out.println();
//                System.out.println();
//                System.out.println("Transpond matrix");
//                System.out.println("---------------");
//                for (int j = i; j > 0; j --) {
//                    if (j == 5) {
//
//                    }
//                    System.out.print(j + "   ");
//                }
//            }
//        }
//        System.out.println();


//        // часть 1 - создаем матрицу n на n
//        int n = 3;
//        int[][] a = new int[n][n];
//        for (int i = 0; i < n; i++) {                           //3 times
//            for (int j = 0; j < n; j++) {                       //3 times
//                a[i][j] = n*i + j;                              //a[i][j] = 3*i + j
//            }
//        }
//
//        // часть 2 - выводит на экран начальную матрицу
//        System.out.println("Начальная матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%4d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//        // часть 3 - транспонирование матрицы
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//
//        // часть 4 - выводит на экран транспонированную матрицу
//        System.out.println();
//        System.out.println("Новая матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%3d", a[i][j]);
//            }
//            System.out.println();
//        }

    }
}
