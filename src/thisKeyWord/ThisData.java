package thisKeyWord;

    public class ThisData {
        int a;
        int b;
        int c;

    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void displahyData(){
        System.out.println("Value of A= :  " + a);
        System.out.println("Value of A= :  " + a);
    }
        public void plusData(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Value of a+b+c total= " +(a+b+c));
    }
    public static void main(String[] args) {
        ThisData td = new ThisData();
        td.setData(34, 78);
        td.displahyData();
        td.plusData(12, 13, 18);
    }
}
