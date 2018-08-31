package finalSuperKey;

public class FinalVariable {
    final int  number;

    public FinalVariable(){
        number = 67;
        //final variable can only be initialized once
    }
 public void showNumber(){
     System.out.println(number);
 }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        fv.showNumber();
    }
}
