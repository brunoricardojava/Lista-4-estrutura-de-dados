import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vetor[] = new int[20];

        /*
        for(int i = 0;i<20;i++) {
            System.out.println("Digite o valor da posicao["+ (i+1) +"] : ");
            vetor[i] = entrada.nextInt();
        }
        */
        
        for (int i=0; i<20; i++){   
            vetor[i] = i;
        }
    
        int valor;
        
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        
        valor = entrada.nextInt();
        
        
        System.out.print("Busca: ");
        
            for (int i=0; i<20; i++){

                if(vetor[i] == valor){
                    System.out.println("\nPosicao "+i+" tem o valor especificado <---\n");
                }
                else{
                    System.out.println("Posicao "+i+" nao tem o valor especificado");
                }

            }       
        
    }
    
}