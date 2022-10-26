import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        boolean a = true;
        Scanner scan = new Scanner(System.in);
        while(a == true){
        System.out.println("Please enter some text.");
        String text,textLower;
        text = scan.nextLine();
        System.out.println("You have entered: "+text);        
        text = text.replaceAll("[^a-zA-Z0-9]","");
        textLower = text.toLowerCase();
        int length = textLower.length();
        char[] ch = new char[length];
        for (int i = 0; i < length; i++) {
            ch[i] = textLower.charAt(i);
        }
        int i=0,j=0;
        do{
            i++;
            if(ch[i] != ch[length-1-i]) j++;
        }
        while(i<length/2);
        if ( j==0 ) System.out.println("It's a palindrome.");
        else System.out.println("It's not a palindrome.");
        System.out.println("Do you want enter next text? true or flase?");
        a = Boolean.parseBoolean(scan.nextLine()); 
    }
    }    
}

