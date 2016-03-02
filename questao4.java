import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 40; 
        int par = 0;
        int impar = 0;

        int vetor[] = new int[quant];

        /*
        for(int i = 0;i<quant;i++) {
            System.out.println("Digite o valor da posicao["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        */
        
        for (int i=0; i<quant; i++){   
            vetor[i] = i;
        }


        for (int i=0; i<quant; i++){
            if((vetor[i]%2) == 1){
                impar++;
            }
            else{
                par++;
            }
        }


        
        System.out.print("Array com "+par+" numeros par e "+impar+" numeros imapares.\n\n");
        
            for (int i=0; i<quant; i++){

                System.out.print(vetor[i]);

            }     
        System.out.print("\n");
    }
    
}