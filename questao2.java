import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 16; 

        int vetor[] = new int[quant];
        int aux[] = new int[8];
        
        for(int i = 0;i<quant;i++) {
            System.out.println("Digite o valor da posicao["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }

        System.out.print("Array: ");
        
            for (int i=0; i<quant; i++){

                System.out.print(vetor[i]);

            }  
        

        for (int i=0; i<8; i++){   
            aux[i] = vetor[i];
            vetor[i] = vetor[15-i];
        }


        for (int i=0; i<8; i++){   
            vetor[8+i] = aux[i];
        }


        
        System.out.print("Array: ");
        
            for (int i=0; i<quant; i++){

                System.out.print(vetor[i]);

            }     
        
    }
    
}