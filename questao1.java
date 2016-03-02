import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vetor[] = new int[12];
        
        for(int i = 0;i<12;i++) {
            System.out.println("Digite o valor da posicao["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
    
        int pos1;
        int pos2;
        
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor inteiro da posicao (1) entre 1 e 12: ");
        
        pos1 = entrada.nextInt();
        
        System.out.println("Digite o valor inteiro da posicao (2) entre 1 e 12: ");
        
        pos2 = entrada.nextInt();
        
        
        System.out.print("Array: ");
        
            for (int i=0; i<12; i++){

                System.out.print(vetor[i]);

            }
            
        System.out.println("\nA soma dos valores nas posicoes selacionadas sao: " + (vetor[pos1-1]+vetor[pos2-1]));
            
        
        
    }
    
}