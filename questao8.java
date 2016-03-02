import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao8{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 4;
        int cont = 0;

        int vetor1[][] = new int[quant][quant];
        int vetor2[][] = new int[quant][quant];
        

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


        System.out.print("Array: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){   
                    System.out.print(vetor[i][j]);
                    System.out.print(" ");

                    if(vetor[i][j] > cont){
                        cont = vetor[i][j];
                    }

                }

                System.out.print("\n"); 

            }

            System.out.println("Maior valor da matriz e: " + cont);

    }
    
}