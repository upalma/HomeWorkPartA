package StaticVariableAndMethod;

public class TestStaticClass {
    public static void main(String[] args) {


        MakeStaticClass.studentName();
        MakeStaticClass.studentAddress();

        MakeStaticClass msc = new MakeStaticClass();
        msc.display();

        msc.getRoomSize();
        System.out.println("Room Size: "+ msc.getRoomSize());
    }
}
