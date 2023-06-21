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
         int[] A = new int[10];
        int N = timtim.nextInt();
        int sum = N;
        for(int i=0; i<A.length; i++)
        {
            A[i]=sum;
            sum *= 2;
        }
        for(int j=0; j<A.length; j++)
        {
            System.out.println("N["+j+"] = " + A[j]);
        }
 
    }
 
}
