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

        while(true)
        {
            int T = timtim.nextInt();
            if(T==0)
            {

                break;
            }
            int sum=0, sum1=0;
            if(T%2==0)
            {
                for(int i=T; i<T+9; i += 2)
                {
                    sum += i;
                }
            }
            else
            {
                for(int j=T+1; j<=T+9; j+=2)
                {
                    sum += j;
                }
            }
        
            
            System.out.println(sum);


        }
 
    }
 
}
