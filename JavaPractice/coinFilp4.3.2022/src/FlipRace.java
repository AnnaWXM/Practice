public class FlipRace {
    public static void main(String[] args) {
        Coin coin1 = new Coin(), coin2 = new Coin();
        for(int i=0;i<3;i++){
            coin1.flip();
            System.out.print(coin1.toString()+" ");}
            System.out.println("");
        for(int i=0;i<3;i++){
            coin2.flip(); 
            System.out.print(coin2.toString()+" ");
        }
        int turn=3;
        System.out.println("");
        System.out.println("Keep flip after 3 times flip.");
        do{
        turn ++;
        coin1.flip(); 
        System.out.println("Coin 1 is " + coin1.toString());
        coin2.flip(); 
        System.out.println("Coin 2 is " + coin2.toString());
        }
        while(coin1.isHeads() && coin2.isHeads());
        System.out.println("After " + turn + " times flips, ");
        if(coin1.isHeads()){
        System.out.print("Coin 1 is winner.");}
        else System.out.print("Coin 2 is winner");
    }
}