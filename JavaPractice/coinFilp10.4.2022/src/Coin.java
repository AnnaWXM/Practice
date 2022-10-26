//********************************************************************
//  Coin.java       Author: Lewis/Loftus
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
import java.util.Scanner;
public class Coin implements Lockable

{
    private final int HEADS = 0;
    private final int TAILS = 1;
    public final int LOCK = 0;
    public final int UNLOCK = 1;

    Scanner scan = new Scanner(System.in);
    private int key;
    private boolean keyStatus;
    private int face;
    
    public Coin()
    {
        flip();
        setKey();
    }

    public void setKey(){
        key = 0;
    }

    public void lock(){
        key = LOCK;
    }

    public void unlock(){
        key = UNLOCK;
    }

    public boolean locked(int key){
        if(key==0) keyStatus = false;
        else keyStatus = true;
        return keyStatus;
    }
    //-----------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip()
    {
        if(locked(key))  {
            System.out.println("The coin is unlocked, you can flip it.");
            face = (int) (Math.random() * 2);  }
        else
        {
            System.out.println("The coin is locked. Please unlock it first.");
        }      
    }

    //-----------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //-----------------------------------------------------------------
    public boolean isHeads()
    {
        return (face == HEADS);
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String faceName;

        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
    }
}
