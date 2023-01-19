package FirstYear2ndSem;

public class AsynchronousActivity1 {

    public static void main(String[] args) {

        double[] array = new double[50];

        for(int i = 0; i < 25; i++){
            array[i] = i*i;
        }

        for(int i = 25; i < 50; i++){
            array[i] = i*3;
        }

        for(int i = 0; i  < 50; i++){
            if(i%10 == 0) System.out.println();
            System.out.printf("%10.2f",array[i]);
        }

    }

}
