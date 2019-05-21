import java.util.Scanner;

public class ControlFlowLab {


    public static void main(String args[]) {
        int sum=0;
        stepFive1(20);
       System.out.println(stepFive2(25));

    //     scanner reads input from the command line through various methods
       Scanner scanner = new Scanner(System.in);
     char reply;
        do{

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Hello %s, your age is %d", username, age));

////    #### STEP #1

        if (age>=67)
            System.out.println("You can starting drawing Social Security");
        else
            System.out.println("You can't start drawing Social Security");
        if (age>=55)
            System.out.println("You can join AARP");
        else
            System.out.println("You can't join AARP");
        if (age >=35)
            System.out.println("You are old enough to be President");
        else
            System.out.println("You are not old enough to be President");
        if (age >=21)
            System.out.println("You are old enough to drink");
        else
            System.out.println("You are not old enough to drink");
        if (age >=18)
            System.out.println("You are old enough to vote");
            else
                System.out.println("You are not old enough to drink");
        if(age >=16)
            System.out.println("You are old enough to drive");
        else
            System.out.println("You are not old enough to drive");
         System.out.println("Do you want to answer the questions again?");
            reply =scanner.next().toLowerCase().charAt(0);

     }  while(reply == 'y');

        ////        ### Lab Step #2 (switch statements)

        System.out.println("Enter Your Employment Status 'E' 'U' 'S' : ");
        String employment = scanner.next().toLowerCase();

        System.out.println("Enter your vehicle 'C''T''S''N': " );
        String vehicle = scanner.next().toLowerCase();

        //System.out.println(String.format("You are employed %s You own an SUV %s", employment,vehicle));

        switch(employment)
        {
            case "e":
                System.out.println("you are employed");
                break;
            case "u":
                System.out.println("You are unemployed");
                break;
            case "s":
                System.out.println("you are student");
                break;
            default:
                System.out.println("invalid entry");
        }
        switch(vehicle)
        {
            case"c":
                System.out.println("you own a car");
                break;
            case "t":
                System.out.println("You own a truck");
                break;
            case "s":
                System.out.println("you own a SUV");
                break;
            case "n":
                System.out.println("you don't own a vehicle");
                break;
            default:
                System.out.println("Invalid entry");
        }


//        ### Addl Lab Step #3 (for loops)

        int[] myArray = new int[30];

        for(int i=0;i<30;i++)
            myArray[i]=i;
        for( int i : myArray)
            System.out.println(i);
               for( int i=0;i<30;i++)
                   myArray[i]=2*(i+1);
        for(int i: myArray)
            System.out.println(i);
              for(int i=29;i>=0;i--)
             System.out.println(myArray[i]);

//        ### Addl Lab Step #4 (while loops)

        int i=0;
        while( i<30) {
            myArray[i] = i;
            i++;
        }
            for (int n:myArray)
                System.out.println(n);

        int k = 29;
        while (k >= 0) {
            System.out.println(myArray[k]);
//            myArray[k] = i;
            k--;
        }
        for (int n : myArray)
            System.out.println(n);
    }
//        ### Addl Lab Step #5 (branching)


    public static void stepFive1(int newNum)
    {
        int[] myArray = new int[30];
        for(int i=0;i<30;i++){
            myArray[i]=i;
            if(myArray[i]==newNum)
                break;
            if(myArray[i]%2==0)
                System.out.println(myArray[i]);
            if(myArray[i]%2==1)
                continue;
            }
        }
    public static int stepFive2(int newNum) {
        int[] myArray = new int[30];
            int sum=0;
        for (int i = 0; i < 30; i++) {
            myArray[i] = i;
            if (myArray[i] % 2 == 1)
                System.out.println(myArray[i]);
            if (myArray[i] % 2 == 0)
                sum += myArray[i];
            if (myArray[i] == newNum)
                break;
        }
       // System.out.println(sum);
        return sum;
        }
    }









