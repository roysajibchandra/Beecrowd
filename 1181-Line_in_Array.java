import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
                 Scanner timtim = new Scanner(System.in);

        int N = timtim.nextInt();
        char T = timtim.next().charAt(0);
        double[][] X = new double[12][12];
        for(int i=0; i<X.length; i++)
        {
            for(int j=0; j<X[i].length; j++)
            {
                X[i][j] = timtim.nextDouble();
            }
        }
//        for(int i=0; i<X.length; i++)
//        {
//            for(int j=0; j<X[i].length; j++)
//            {
//                System.out.print(X[i][j]+" ");
//            }
//            System.out.println();
//        }

        switch (T){
            case 'S':
                double somaa=0;
                for(int i=0; i<X[0].length; i++)
                {
                    somaa += X[N][i];
                }
                System.out.printf("%.1f", somaa);
                break;
            case 'M':
                double media=0;
                for(int i=0; i<X[0].length; i++)
                {
                    media += X[N][i];
                }
                media /= X[0].length;
                System.out.printf("%.1f", media);
                break;
        }
        System.out.println();
 
    }
 
}
