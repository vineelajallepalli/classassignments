
//Step #1
import java.rmi.activation.ActivationGroup_Stub;
import java.sql.SQLOutput;

public class JavaLab1 {
    public static void main(String[] args) {
        int firstInt = 5;
        int secondInt = 20;
        int thirdInt;
        float four = 4.4f;
        boolean isCold = false;
        double d = 1_00_000;
        thirdInt = 10;
        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
        System.out.println(four);
        System.out.println(isCold);
        System.out.println(d);


// step #2

        System.out.println(firstInt + secondInt);
        System.out.println(firstInt + thirdInt);
        System.out.println(firstInt/secondInt);
        System.out.println(firstInt % secondInt);
        int i = firstInt + firstInt % secondInt;
        System.out.println(++i);


//        ### Lab Step #3


        int x = 100;
        boolean b = x==100;
       System.out.println(b);
        int y = 106;
        System.out.println(x>y);
        System.out.println(y>x);
        System.out.println(x>=y-6);
        int z = 92;
        System.out.println(x<y && y<z);
        System.out.println(y<z && x >= y);
        System.out.println((z>y+x)|| (x-y < z));
// * prove that x less than y is equal to NOT x greater than y.
        System.out.println((x<y)!=(x>y) );


//        ### Lab Step #4


        int n = 64;
        System.out.println(n>>1==n/2); //true
        System.out.println(n<<1==n*2); //true

        int  n = 40;
        System.out.println(n>>1==n/2); // true
        System.out.println(n<<1==n*2); //true

        System.out.println(n>>2==n/4); //true
        System.out.println(n<<2==n*4); //true

        int n = 15;
        System.out.println(n>>2==n/4); //true
        System.out.println(n<<2==n*4); //true


//        ### Lab Step #5
//
//

        //  System.out.println(b);  //doesn't print b cause b is declared in static method
        //anotherMethod();
        //anotherMethod();
        playWithStrings();
    }

//    ### Lab Step #6
public static void anotherMethod() {
    Integer a = Integer.valueOf("1000");
    Integer b = 100;


    if (b.compareTo(a)> 0) {
        //        int b = a/2;
        //   System.out.println("Big Value");
        System.out.println(a + "is a big Value");
        System.out.println(b + "half a big value" + a);
    } else {

        //   System.out.println("Not a big Value");
        System.out.println(a + "is not a big Value");
        System.out.println(b + "half a big variable" + a);
        //Oops, is there a problem?  How can it befixed?
        //yes declare the variable outside the if else scope
    }
}

    public static void playWithStrings() {
        String firstName = "vineela";
        String lastName = new String ("jallepalli");
        System.out.println("Hello "+ firstName +" "+lastName);
        String fullName = firstName.concat(" "+lastName);
        System.out.println("The total length of the String vineela jallepalli is "+fullName.length());
        System.out.println("The first occurrence of 'i' in the String vineela jallepalli is at position "+fullName.indexOf('o'));
        System.out.println("The character at position 7 is "+fullName.charAt(7));
        if(fullName.contains("pal")) {
            System.out.println("The String vineela jallepalli contains 'pal'.");
        }
        else {
            System.out.println("The String vineela jallepalli does not contain 'pal'.");
        }
        System.out.println("The last 5 characters are "+fullName.substring(fullName.length() - 5));
        if(fullName.contains("\'") && fullName.contains("-")) {
            System.out.println("The String vineela jallepalli contains an apostrophe and a dash.");
        }
        else if(fullName.contains("\'")) {
            System.out.println("The String vineela jallepalli contains an apostrophe");
        }
        else if(fullName.contains("-")) {
            System.out.println("The String vineela jallepalli contains a dash");
        }
        else {
            System.out.println("The String vineela jallepalli does not contain an apostrophe or a dash.");
        }
    }

}
