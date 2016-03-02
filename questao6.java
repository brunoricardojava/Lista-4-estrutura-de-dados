import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao6{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int quant = 5;

        int vetor[] = new int[quant];
        
            for(int i = 4;i>=0;i--) {
                System.out.println("Digite o valor da posicao["+ (5-i) +"] do seu numero: ");
                vetor[i] = entrada.nextInt();
            }

        String valorString = Arrays.toString(vetor);


        
    }
    
}