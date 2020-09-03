package aula5;

import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;

public class ex02 {
    public static void main(String[] args) {

        //Preencha um vetor com vinte números e mostre a soma dos números pares que o vetor possui.


        int[] vetor = new int[20];
        int j = 0;

        for (int i = 0; i < vetor.length; i++){
            if (i % 2 == 0){
                vetor[i]=i;
                System.out.println(" vetor: " + vetor[i] );
                j = j+(vetor[i]++); }
        }
        System.out.println("soma: " + j);


    }


}
