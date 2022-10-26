public class FourHeads {
    public static void main(String[] args) {
        int HeadCounts=0, counts=0;
        Coin coin1 = new Coin();
        do{
            coin1.flip();
            if(coin1.isHeads()) HeadCounts++;
            counts++;
            System.out.println(coin1.toString());
        }while(HeadCounts<4);
        System.out.println("After " +counts+ " times flip, get four heads in a row.");
    }
}
