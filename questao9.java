import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao9{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 5;
        int cont = 0;

        int matriz[][] = new int[quant][quant];

        

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                matriz[i][j] = j+i;
            }
        }

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){  
                if(i == j){ 
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
            }
        }

            System.out.print("\nVetor Resultante: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){   
                    System.out.print(matriz[i][j]);
                    System.out.print(" ");
                }

                System.out.print("\n"); 

            }


    }
    
}