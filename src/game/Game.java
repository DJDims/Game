package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int number = random.nextInt(10);

        System.out.println("Программа загадала число от 0 до 9. Отгадайте число.");
        // System.out.println(number);

        int userNumber = scanner.nextInt();
        
        if(userNumber == number){
            System.out.println("Поздравляю. Вы победили!");
        }else{
            System.out.println("Вы проиграли. Загаданное число = " + number);
        }
    }
    
}