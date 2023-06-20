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
            int prime = 0;
            if(N<4)
            {
                System.out.println(N+" eh primo");
            }
            else
            {
                for(int i=2; i<N; i++)
                {
                    if(N%i==0)
                    {
                        prime = 1;
                        break;
                    }
                    else {
                        prime = 2;
                    }

                }
            }
            if(prime==2)
            {
                System.out.println(N+" eh primo");
            }
            else if(prime==1)
            {
                System.out.println(N+" nao eh primo");
            }


        }

 
    }
 
}
