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
        int T = timtim.nextInt();
        int[] X = new int[T];
        int possiton=0;
        for(int i=0; i<X.length; i++) 
        {
            X[i] = timtim.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        for(int j=0; j<X.length; j++)
        {
            if(X[j]<min)
            {
                min=X[j];
                possiton=j;
            }
        }
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + possiton);
 
    }
 
}
