import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao14{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 8;
        int cont = 0;

        int vetor1[][] = new int[quant][quant];
        int vetor2[][] = new int[quant][quant];

        

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor1[i][j] = j+i;
            }
        }

        for(int i = 0;i<quant;i++) {
            for(int j=0;j<quant;j++) {
                vetor2[i][j]= vetor1[j][i];
            }
        }

            System.out.print("\nVetor Resultante: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){   
                    System.out.print(vetor2[i][j]);
                    System.out.print(" ");
                }

                System.out.print("\n"); 

            }


    }
    
}