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

        while(T-->0)
        {
            int N = timtim.nextInt();
            int sum=0;
            boolean D = false;
            for(int i=1; i<N; i++)
            {
                sum+=i;
                if(sum==N)
                {
                    D = true;
                    break;
                }
                else
                {
                    D = false;
                }
            }
            System.out.println((D==true)? N + " eh perfeito": N+" nao eh perfeito");

        }
 
    }
 
}
