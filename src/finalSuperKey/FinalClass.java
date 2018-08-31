package finalSuperKey;

public final class FinalClass {
    // A final class can not extended in to a subClass.

    String name = "Uzzal";
    String address = "Woodside";
    int id = 101;

    public void showInfo(){
        System.out.println(name+"\n"+address+"\n"+id);
    }

    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.showInfo();
    }
}
