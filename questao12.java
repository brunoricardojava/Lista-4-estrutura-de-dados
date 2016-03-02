import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao12{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int quant = 4;
        int var = 0;

        int vetor[][] = new int[quant][quant];
        int vetorAux[] = new int[quant];

        
        
        for(int i = 0;i<quant;i++) {
            for(int j = 0;j<quant;j++) {
                System.out.println("Digite o valor da posicao["+ (i+1) +"]["+ (j+1) +"] : ");
                vetor[i][j] = entrada.nextInt();
            }
        }
        
        /*
        for(int i = 0;i<quant;i++) {
            for(int j = 0;j<quant;j++) {
                vetor[i][j] = i+j;
            }
        }
        */


        for(int i = 0;i<quant;i++) {
            vetorAux[i] = vetor[0][i];
            vetor[0][i] = vetor[3][i];
            vetor[3][i] = vetorAux[i];
        }


            System.out.print("\nResultado: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){
                    System.out.print(vetor[i][j]);
                }

                System.out.print("\n"); 

            }


    }
    
}