import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        //scan.useDelimiter(",|\\s+");
        int[] array = new int[51];
        int num;
        for (int i : array) {
            array[i]=i;
            i++;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Please enter arbitrary number between 0 to 50 inclusive.");
        System.out.println("Input value that outside of the range will end the process.");
        try{do{
            num = scan.nextInt();
            array[num+25]++;
        }while (num >= -25 && num <= 25);
    }
        catch (Exception e) {
            //TODO: handle exception
        }
        int j=-25;
        for(int i:array){
            System.out.println("The "+ j +" occurrences:  " + i + " times.");
            j++;
        }
    }
}
