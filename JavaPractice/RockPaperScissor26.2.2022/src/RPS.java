import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        /*private final int Rock = 0;
        private final int Paper = 1;
        private final int Scissors =2;*/
        int optionByComputer, option, userWin=0, userLoss=0, tie=0;
        String ComputerOption, winner="someone";
        while(a == true){
        optionByComputer = (int)(Math.random()*3);
        System.out.println("Which option you choose? 0 for Rock, 1 for paper or 2 for scissors?");
        option = Integer.parseInt(scan.nextLine());
        if(optionByComputer==0) ComputerOption = "Rock";
        else if(optionByComputer==1) ComputerOption = "Paper";
        else ComputerOption="Scissors";
        if(option==optionByComputer) {tie++; winner="no winner";}
        else if (option==0 && optionByComputer==1 ) {userLoss++; winner="Computer";}
        else if (option==0 && optionByComputer==2 ) {userWin++; winner="user";}
        else if (option==1 && optionByComputer==0 ) {userWin++; winner="user";}
        else if (option==1 && optionByComputer==2 ) {userLoss++; winner="Computer";}
        else if (option==2 && optionByComputer==0 ) {userLoss++; winner="Computer";}
        else if (option==2 && optionByComputer==1 ) {userWin++; winner="user";}
        System.out.println("The option of computer is " + ComputerOption + ". So, the winner of this turn is " + winner);
        System.out.println("Would you want play Rock-Paper-Scissors? true or false ");
        a = Boolean.parseBoolean(scan.nextLine()); 
        }
        System.out.println("User wins " + userWin + " times.");
        System.out.println("User losses "+ userLoss + " times.");
        System.out.println("Ties " + tie + " times.");
    }
}
