import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao15{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 8;
        int cont = 0;
        int sum = 0;

        int vetor1[][] = new int[quant][quant];

        

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor1[i][j] = j+i;
            }
        }

        for(int i = 0;i<quant;i++) {
            for(int j=0;j<quant;j++) {
                if(j == i){
                    if(vetor1[i][j] > cont){
                        cont = vetor1[i][j];
                    }
                }
            }
        }

        for(int i = 0;i<quant;i++) {
            for(int j=0;j<quant;j++) {
                if(i == ((quant-1)-j)){
                    sum = sum + vetor1[i][j];
                }
            }
        }

            System.out.print("\nResultado: \n");

            for(int i = 0;i<quant;i++) {
                for(int j=0;j<quant;j++) {
                    System.out.print(vetor1[i][j]);
                    System.out.print(" ");
                }

                System.out.print("\n");
            }   

                System.out.print("O maior valor da diagonal principal e: "+cont+"\n");
                System.out.print("Asoma da diagonal secundaria e: "+sum+"\n");


    }
    
}