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

        int[] par = new int[5];
        int[] impar = new int[5];
        int countPar=0, countImpar=0;
        for(int i=0; i<15; i++)
        {
            int N = timtim.nextInt();

            if(N%2==0)
            {
                par[countPar] = N;
                countPar++;
            }
            else
            {
                impar[countImpar] = N;
                countImpar++;
            }

            if(countPar==5)
            {
                countPar=0;
                for(int j=0; j<par.length; j++)
                {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
            }
            else if (countImpar==5)
            {
                countImpar=0;
                for (int k = 0; k < impar.length; k++)
                {
                    System.out.println("impar[" + k + "] = " + impar[k]);
                }
            }
        }
        for (int i = 0; i < countImpar; i++)
        {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < countPar; i++)
        {
            System.out.println("par[" + i + "] = " + par[i]);
        }
 
    }
 
}
