import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class questao16{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quant = 4;
        int cont = 0;
        int sum = 0;

        int vetor1[][] = new int[quant][quant];
        int vetor2[][] = new int[quant][quant];

        boolean palindromo1 = true;
        boolean palindromo2 = true;

        

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor1[i][j] = j+i;
            }
        }

        for (int i=0; i<quant; i++){   
            for (int j=0; j<quant; j++){   
                vetor2[i][j] = 1;
            }
        }

        for(int i = 0;i<quant;i++) {
            if(vetor1[i][0]!=vetor1[i][2])
                if(vetor1[i][1]!=vetor1[i][3])
                    palindromo1=false;
        }
        
        //Verificando matriz 2
        for(int i = 0;i<4;i++) {
            if(vetor2[i][0]!=vetor2[i][2])
                if(vetor2[i][1]!=vetor2[i][3])
                    palindromo2=false;
        }
        
        if(palindromo1 && palindromo2)
                System.out.println("Os dois vetores são palindromos");
        else if(palindromo1 && !palindromo2)
                System.out.println("A primeira matriz é palindromo");
        else if(!palindromo1 && palindromo2)
                System.out.println("A segunda matriz é palindromo");
        else
            System.out.println("Nenhuma é palindromo");

    }
    
}