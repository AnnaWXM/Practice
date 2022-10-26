import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Task T1= new Task();
        int priority,level;
        Scanner scan = new Scanner(System.in);
        String task;
        System.out.println("Please enter the priority");
        task=scan.nextLine();
        T1.setPriority(task);
        priority=T1.getPriority();
        System.out.println("The numeric priority is "+ priority);
        System.out.println("Please enter the level of complexity.");
        level=Integer.parseInt(scan.nextLine());
        T1.setComplexity(level);
        level = T1.getComplexity();
        System.out.println("The complexity is "+ level);
    }
}
