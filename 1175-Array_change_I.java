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
        int[] A = new int[20];
        for(int i=0; i<A.length; i++)
        {
            A[i] = timtim.nextInt();
        }
        // System.out.println(Arrays.toString(A));
        int indexvalue = A.length - 1;
        for(int j=0; j<A.length/2; j++)
        {
            int temp = A[j];
            A[j] = A[indexvalue];
            A[indexvalue] = temp;
            indexvalue--;
        }
        for(int k=0; k<A.length; k++)
        {
            System.out.println("N["+k+"] = " + A[k]);
        }
 
    }
 
}
