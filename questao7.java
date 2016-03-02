import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao7{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int quant = 10;

        int vetor[] = new int[quant];
        int vetorR[] = new int[quant];
        
        
        for(int i = 0;i<quant;i++) {
            System.out.println("Digite o valor da posicao["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }


        for(int i = 0;i<quant;i++) {
            for(int i2 = i+1 ;i2<quant; i2++) {
                if(vetor[i] == vetor[i2]){
                    vetorR[i2] = vetor[i];
                    vetorR[i] = vetor[i];
                }
            }
        }



        
        System.out.print("Os valores que se repetem sao: \n");
        
            for (int i=0; i<quant; i++){

                System.out.print(vetorR[i]);

                System.out.print(" ");

            } 

        System.out.print("\n");    
        
    }
    
}