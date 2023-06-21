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
        double[] A = new double[100];

        for(int i=0; i<A.length; i++)
        {
            A[i] = timtim.nextDouble();

        }
        for(int j=0; j<A.length; j++)
        {
            if(A[j]<=10)
            {
                System.out.println("A["+j+"] = " + A[j]);
            }

        }
 
    }
 
}
