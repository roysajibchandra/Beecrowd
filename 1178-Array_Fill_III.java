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
        double T = timtim.nextDouble();
        double[] array = new double[100];
        array[0] = T;
        
        for(int i=1; i<array.length; i++)
        {
            array[i] = array[i-1] / 2.0000;
        }
        // prit array of N[i]=Y 
        for(int j=0; j<array.length; j++)
        {
            System.out.println(String.format("N["+j+"] = %.4f",array[j]));
        }
 
    }
 
}
