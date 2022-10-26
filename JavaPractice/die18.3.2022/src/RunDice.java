public class RunDice {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        int count = 0;
        for(int i=0; i<1000; i++){
            d1.roll();
            d2.roll();
            if(d1.getFaceValue() == 6 && d2.getFaceValue() == 6)
            count ++;
        }
        System.out.println("You got "+ count +" times box cars (two sixes).");
    }
}
