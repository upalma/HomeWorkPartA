package Random;

import java.util.Random;

    public class UseRandom {
        public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];

        for( int i =0; i<15; i++){
        array[i] = random.nextInt(1000);
        }

        for(int i = 0; i<10;i++){

        System.out.println(array[i]);
        }
    }

}
