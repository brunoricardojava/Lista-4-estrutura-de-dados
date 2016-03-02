import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao10{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 4;
        int cont = 0;

        int vetor1[][] = new int[quant][quant];
        int vetor2[][] = new int[quant][quant];
        int vetorR[][] = new int[quant][quant];

        

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor1[i][j] = j+2;
            }
        }

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor2[i][j] = j+i;
            }
        }

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){ 
                if(vetor1[i][j] > vetor2[i][j]){  
                    vetorR[i][j] = vetor1[i][j];
                }
                else{
                    vetorR[i][j] = vetor2[i][j];
                }
            }
        }

            System.out.print("\nVetor Resultante: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){   
                    System.out.print(vetorR[i][j]);
                    System.out.print(" ");
                }

                System.out.print("\n"); 

            }


    }
    
}