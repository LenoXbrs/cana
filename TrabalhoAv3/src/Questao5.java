

public class Questao5 {
	public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 1, 5, 3, 8, 7};
     
        int element = 5;
        System.out.println("=== Força bruta ===");
        int index = bruteForceSearch(arr, element);
        System.out.println("=== Força bruta2 ===");
        inverseBruteForceSearch(arr, element);
        int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};
        Questao5 bin = new Questao5();
        
        
        if (index != -1) {
            System.out.println("Elemento encontrado no index: " + index);
        } else {
            System.out.println("Elemento não encontrado");
        }
        System.out.println("=== Pesquisa binaria ===");
        bin.pesquisarNumero(20, numeros);
        
    }
	
	
	
	

    public static int bruteForceSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("buscando o elemento " + element + " no index " + i + ": " + arr[i]);
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; 
    }
    
    
    public static int inverseBruteForceSearch(int[] arr, int element) {
        for (int i = arr.length - 1; i >= 0; i--) {
        	System.out.println("buscando o elemento " + element + " no index " + i + ": " + arr[i]);
            if (arr[i] == element) {
                return i; 
            }
        }
        return -1; 
    }
    
    
    
    public void pesquisarNumero(int x, int[] numeros) {
        int inicio = 0;         //Posição inicial do vetor.
        int meio = 0;          //Posição do meio do vetor.
        int fim = numeros.length - 1;  //Posição final do vetor.
        
        /* Enquanto a posição do inicio for menor ou igual a posição do fim,
          procura o valor de x dentro do vetor. */
        while(inicio <= fim) {
          meio = (fim + inicio) / 2; //Encontra o meio do vetor.
          
          System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " + numeros[fim]);
          System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);
          
          /* Se o valor que está no meio do vetor é igual ao valor procurado, 
            imprime que encontrou o valor e para de pesquisar. */
          if(numeros[meio] == x) {
            System.out.println("Encontrou o número " + x);
            break;
          }
          
          /* Este if serve para diminuir o tamanho do vetor pela métade. */
          /* Se o valor que está no meio do vetor for menor que o valor de x, 
            então o inicio do vetor será igual a posição do meio + 1. */
          if(numeros[meio] < x) {
            inicio = meio + 1;
          } else {
            /* Se o valor que está no meio do vetor for maior que o valor de x, 
              então o fim do vetor será igual a posição do meio - 1. */
            fim = meio - 1;
          }
        }
        
        /* Caso não encontre o valor pesquisado dentro do vetor,
          imprime que não encontrou o valor pesquisado. */
        if(inicio > fim) {
          System.out.println("Não encontrou o número " + x);
        }
      }
}
