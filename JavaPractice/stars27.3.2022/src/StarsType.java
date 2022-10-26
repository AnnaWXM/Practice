public class StarsType{
    public StarsType(){

    }

    public void TypeA(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j< num-i; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
    }

    public void TypeB(int num){
        for(int i=0; i<num; i++){
            for(int k=0; k<num-i; k++)
                {System.out.print("  ");}
            for(int j=0; j<i ; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
    }

    public void TypeC(int num){
        for(int i=0; i<num; i++){
            for(int k=0; k<i; k++)
                {System.out.print("  ");}
            for(int j=0; j<num-i ; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
    }

    public void TypeD(int num){
        for(int i=0; i<=num/2; i++){
            for(int k=0; k<num/2-i; k++)
                {System.out.print("  ");}
            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
        for(int i=0; i<num/2; i++){
            for(int k=0; k<i; k++)
                {System.out.print("  ");}
            for(int j=0; j<num-2*i-1; j++){
                System.out.print("* ");
            }
        System.out.print("\n");
        }
    }
}
