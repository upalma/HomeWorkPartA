package NestedClass;

public class NestedClassChild {

    Father father = new Father();

    public  void Son(){
        System.out.println("Outer Method :Son is doing a nice job");
        father.fatherBusiness();
        father.fatherBankBalance();
        Mother.motherIndustry();
        Mother.motherJewelery();
    }

    public void Daughter(){
        System.out.println("Outer Method :Daughter is studying in NYU");
        father.fatherBusiness();
        father.fatherBankBalance();
        Mother.motherIndustry();
        Mother.motherJewelery();
    }

    public class Father{
        private void fatherBusiness(){
            System.out.println("Inner Method: Father is a businessman");
        }

        private void fatherBankBalance(){
            System.out.println("Inner Method: Father is a Bilinear");
        }
    }

    public static class Mother{
        private static void motherIndustry(){
            System.out.println("Inner Method: Father is a businessman");
        }
        private static void motherJewelery (){
            System.out.println("Inner Method: Father is a Bilinear");
        }
    }
}
