import java.util.Scanner;
public class soltMachine {
    public static void main(String[] args) {
        String keepPlay="y";
        Scanner scan = new Scanner(System.in);
        while (keepPlay.equalsIgnoreCase("y"))
    {
        System.out.println("Got three ramdom numbers between 0 to 9.");
        int a,b,c;
        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        c = (int)(Math.random()*10);
        System.out.println(a + "  " + b + "  " + c);
        if (a == b && b == c) System.out.println("All three of the numbers are same.");
        else {
            if(a == b || b == c || c==a) System.out.println("Two of the numbers are same.");
            else System.out.println("None of the numbers are same.");
        }
        System.out.println("Would you want keep play?");
        keepPlay = scan.nextLine();
    }
        
    }
}
