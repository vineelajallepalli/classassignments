import java.util.Random;
import java.util.Scanner;

public class AsciiChars {
    public static void main(String[] args) {
        System.out.println("Hello World");
        AsciiChars.printNumbers();
        AsciiChars.printUpperCaseLetters();
        AsciiChars.printLowerCaseLetters();
        AsciiChars.powerBall();
    }

    public static void printNumbers() {
        // TODO: print valid numeric input
        for (int i = 48; i < 57; i++)
            System.out.println((char) i);
    }

    public static void printLowerCaseLetters() {
        // TODO: print valid lowercase alphabetic input
        for (int i = 65; i < 90; i++)
            System.out.println((char) i);
    }

    public static void printUpperCaseLetters() {
        // TODO: print valid uppercase alphabetic input
        for (int i = 97; i < 122; i++)
            System.out.println((char) i);
    }

    public static void powerBall() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");     // type a word and hit enter
        String name = scanner.next();
        System.out.println(String.format("Hello %s", name));
//
        System.out.println("Do you want to continue");
        char reply1 = scanner.next().toLowerCase().charAt(0);
        char reply2;

        if (reply1 == 'n')
            System.out.println(" please return later to complete the survey.");
        else {
            do {
                System.out.println("Name your favorite pet(dog,cat)");
                String pet = scanner.next();
                System.out.println("what is the age of your favorite pet?");
                int age = scanner.nextInt();
                int luckyNum;

                    System.out.println("What is your lucky number?");
                    luckyNum = scanner.nextInt();


                System.out.println("What is your favorite Jersey number?");
                int jersey = scanner.nextInt();
                int carModel;
                do {
                    System.out.println("What is two-digit model year of their car?");
                     carModel = scanner.nextInt();
                }while (carModel>99);
                System.out.println("Name your favorite actor or actress?");
                String actor = scanner.next();
                int randomNum;
                do {
                    System.out.println("Enter a random number between 1 and 50");
                    randomNum = scanner.nextInt();
                }while(randomNum>50);

                Random rand = new Random();
                int random1 = rand.nextInt(10);
                int magicball = (jersey * random1)%75;
                //   System.out.println(magicball);
//                if (magicball >= 75)
//                    magicball -= 75;
                System.out.println(magicball%75);

                int lotNum1 = (carModel + luckyNum)%65;
                int lotNum2 = ((int) actor.charAt(0))%65;
                int lotNum3 = (age + carModel)%65;
                int lotNum4 = (jersey + age + luckyNum)%65;
                int lotNum5 = ((int) pet.charAt(2))%65;
                //System.out.println(lotNum1);
//                int[] lotteryNumbers = {lotNum1, lotNum2, lotNum3, lotNum4, lotNum5};
//                for (int i = 0; i < 5; i++) {
//                    if (lotteryNumbers[i] > 65)
//                        lotteryNumbers[i] -= 65;
//                }
//                System.out.println("Lottery Numbers:" + lotteryNumbers[0] + "," + lotteryNumbers[1] + "," + lotteryNumbers[2]
//                        + "," + lotteryNumbers[3] + "," + lotteryNumbers[4] + " Magicball:" + magicball);
                System.out.println("Lottery Numbers:"+ lotNum1+","+lotNum2+","+lotNum3+","+lotNum4+","+lotNum5+" MagicBall:"+magicball);
                System.out.println(" would like to answer questions to generate another set of numbers?(y,n)");

                reply2 = scanner.next().toLowerCase().charAt(0);


            } while (reply2 == 'y');
            System.out.println("Thankyou!!");
        }
    }

}
