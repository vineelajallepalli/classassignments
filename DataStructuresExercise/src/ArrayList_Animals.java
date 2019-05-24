import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayList_Animals {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("pig");
        animals.add("bunny");
        animals.add("deer");

        for (String i : animals)
            System.out.println(i);

        String favAnimal = "bunny";
        for (String i : animals) {
            if (i == favAnimal)
                if (animals.contains(favAnimal)) {
                    System.out.println(String.format("I love %s ", favAnimal));
                } else {
                    System.out.println("No, I don't care for those.");
                }

            HashMap<String, String> person = new HashMap<String, String>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name?");
            String name = scanner.next();
            System.out.println("What is your age?");
            String age = scanner.next();
            System.out.println("What is your Hometown?");
            String hometown = scanner.next();
            System.out.println("What is your Favorite food");
            String food = scanner.next();

            person.put("Name", name);
            person.put("Age", age);
            person.put("Hometown", hometown);
            person.put("food", food);

            for (Map.Entry<String, String> entry : person.entrySet()) {

                switch (entry.getKey()) {
                    case "Name":
                        System.out.println(String.format("This is " + entry.getValue()));
                        break;
                    case "Age":
                        System.out.println(String.format("I am " + entry.getValue() + "years old"));
                        break;
                    case "Hometown":
                        System.out.println(String.format("I am from" + entry.getValue()));
                        break;
                    case "food":
                        System.out.println(String.format("My favorite food is" + entry.getValue()));
                        break;

                }
            }

            ArrayList<Integer> numbers = new ArrayList<Integer>();
            System.out.println("Give 5 numbers");

            for (int j = 0; j < 5; j++) {
                numbers.add(scanner.nextInt());
            }
            int sum = 0;
            int product = 1;
            int largest;
            int smallest;
            for (Integer n : numbers) {
                sum = sum + n;
                product = product * n;
            }
            System.out.println("Sum is" + sum);
            System.out.println("product is" + product);

//        for (Integer n : numbers) {
//            for (int i = 0; i < 5; i++) {
//                if (numbers.get(i) > numbers.get(i + 1)) {
//                    n = numbers.get(i + 1);
//
//                }
//                System.out.println(n + "is largest number");
//            }


        }


    }
}




