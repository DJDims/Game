package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean win = false;
        String try_again = "yes";
        
        int i = 0;
        while(try_again.equals("yes")){
            int number = random.nextInt(10);

            System.out.println("Программа загадала число от 0 до 9. У вас 5 попыток. Отгадайте число.");
            
            do{
                int userNumber = scanner.nextInt();

                if(userNumber == number){
                    System.out.println("Поздравляю. Вы победили!");
                    System.out.println("Вы отгадали число с " + ++i + " попытки.");
                    win = true;
                    break;
                }else if (userNumber > number) {
                    System.out.println("Неверно. Попробуйте число поменьше.");
                }else{
                    System.out.println("Неверно. Попробуйте число побольше.");
                }
                if(i==4){
                    break;
                }
                i++;
            }while(true);
            
            if (!win) {
                System.out.println("Вы проиграли. Загаданное число = " + number);
            }
            System.out.println("Хотите продолжить? (no - нет, yes - да)");
            try_again = scanner.next();
        }
    }
}
