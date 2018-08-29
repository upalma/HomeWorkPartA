package StaticVariableAndMethod;

public class MakeStaticClass {

    static int  lentghtOfRoom = 35;
    static int  widthOfRoom = 65;

            public int getRoomSize(){
                return lentghtOfRoom * widthOfRoom;

            }

    public static void studentName() {
        System.out.println("Donald Trump");
    }
    public static void studentAddress() {
        System.out.println("Washingtom, DC");
    }
    public void display() {
        System.out.println("Hello Team");
    }
}

