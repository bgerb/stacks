import java.nio.BufferUnderflowException;

/*
public class stack {
    int[] ar;
    int index =0;

    public stack(){
        ar = new int[0];
    }
    public stack(int size){
        ar = new int[size];

    }
    public int pop() throws RuntimeException{
        if(index==0) throw new RuntimeException("Underflow");

        return ar[--index];
    }
    public void push(int x){
        ar[index++]=x;
    }
    public int getSize(){
        return(ar.length);
    }
}
*/
public class stack {
    int[] ar;
    int index =0;
    public stack(int size){
        ar = new int[size];
    }
    public stack(){
        ar = new int[2];
    }
    public int getSize(){
        return(ar.length);
    }
    public int pop() throws RuntimeException{
        if(index-1 == -1) throw (new RuntimeException("underflow"));
        return ar[--index];
    }
    public void push(int x) throws RuntimeException{
        if(index == ar.length) {
            if((index)*2>131072) throw (new RuntimeException("overflow"));
            int[] corr = new int[(index)*2];
            for (int i = 0; i < index; ++i) {
                corr[i] = ar[i];
            }
            ar = corr;
        }
        ar[index++]=x;
    }
    public void fullprint(){for(int i =0;i<ar.length; ++i) System.out.println(ar[i]);}


    public int getIndex(){return index;}
}