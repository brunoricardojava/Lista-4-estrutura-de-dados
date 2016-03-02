import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao11{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int quant = 20;
        int var = 0;

        int vetor[][] = new int[quant][quant];

        
        /*
        for(int i = 0;i<quant;i++) {
            for(int j = 0;j<quant;j++) {
                System.out.println("Digite o valor da posicao["+ (i+1) +"]["+ (j+1) +"] : ");
                vetor[i][j] = entrada.nextInt();
            }
        }
        */

        for(int i = 0;i<quant;i++) {
            for(int j = 0;j<quant;j++) {
                vetor[i][j] = i+j;
            }
        }

        System.out.println("Digite um valor a ser procurado: ");
        var = entrada.nextInt();

            System.out.print("\nResultado: \n");

            for (int i=0; i<quant; i++){   
                for (int j=0; j<quant; j++){
                    if(vetor[i][j] == var){
                        System.out.println("\nValor "+var+" encontrado na posicao: ["+(i)+"] ["+(j)+"].<---\n");
                    }
                    else{
                        System.out.println("Valor "+var+" nao encontrado na posicao: ["+(i)+"] ["+(j)+"].");
                    }
                }

                System.out.print("\n"); 

            }


    }
    
}