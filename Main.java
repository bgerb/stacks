
public class Main {
    public static void main(String[] args){
        int fail =0;
        int pass = 0;

        stack f = new stack(2);
        for(int i=0; i<131072;++i){
            f.push(i);
        }
        try{
            f.push(131072);
        }
        catch(RuntimeException x) {
            ++pass;
        }


        for(int i=0; i<60000; ++i) {
            f.pop();
        }
        if(f.pop() == f.getIndex()) pass++;
        else ++fail;
        for(int i=0; i<131071-60000; ++i){
            f.pop();
        }
        try{
            f.pop();
        }
        catch(RuntimeException x) {
            ++pass;
        }
        if(f.getIndex() != 0) ++fail;

        f.push(5);

        if(f.pop() == 5){ ++pass;}
        else ++fail;
        f.push(276235672);
        f.push(16571);
        f.pop();

        f.push(3761835);
        f.push(365782352);
        f.pop();
        f.pop();
        if(f.pop()==276235672) ++pass;
        else ++fail;
        for(int i=0; i<131072;++i){
            f.push(i);
        }
        try{
            f.push(10);
        }
        catch(RuntimeException x) {
            ++pass;
        }
        if(f.getIndex() ==131072) ++pass;
        else ++fail;

        for(int i=0; i<52367; ++i) {
            f.pop();
        }
        if(f.pop() == f.getIndex()) pass++;
        else ++fail;
        for(int i=0; i<131071-52367; ++i){
            f.pop();
        }
        if(f.getIndex() == 0) pass++;
        else ++fail;
        System.out.println("test code passed " + pass + " out of " + (fail+pass) + " tests and failed " + fail + " tests");

    }
}
