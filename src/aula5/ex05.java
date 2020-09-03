package aula5;

public class ex05 {
    public static void main(String[] args) {

        //Dado o array a seguir, encontre o menor e o maior valor:
        //int[] tab = {545, 5665, 65, 76, 12, 65};

        int[] tab = {545, 5665, 65, 76, 12, 65};

        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        int menor = Integer.MAX_VALUE;
        int indiceMenor = -1;

        for (int i = 0 ; i <  tab.length;i++ ){
            if(tab[i] > maior){
                maior=tab[i];
                indiceMaior = i;
            }
            if (tab[i]< menor){
                menor=tab[i];
                indiceMenor=i;
            }
        }
        System.out.println("maior numero é: " + maior + " no indice: " + indiceMaior);
        System.out.println("menor numero é: " + menor + " no indice: " + indiceMenor);








    }
}
