package finalSuperKey;

public class FinalMethod {
    int  number;
    int id;

    FinalMethod(){
        id = 100;
        number = 67;

    }

    final public void showNumber(){
        System.out.println(id+ " "+number);
    }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        fv.showNumber();
    }
}