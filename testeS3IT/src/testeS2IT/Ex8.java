package testeS2IT;

public class Ex8 {

	/*8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
	regras:
	- O primeiro número de C é o primeiro número de A;
	- O segundo número de C é o primeiro número de B;
	- O terceiro número de C é o segundo número de A;
	- O quarto número de C é o segundo número de B;
	Assim sucessivamente...
	- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
	dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
	- Caso C seja maior que 1.000.000, retornar -1
	Desenvolva um algoritmo que atenda a todos os requisitos acima.*/


    public static void main(String[] args) {
        int a = 987;
        int b = 123456;
        String c = "";
        
        
        char[] arrayA = String.valueOf(a).toCharArray();
        char[] arrayB = String.valueOf(b).toCharArray();
        
        if(arrayA.length > arrayB.length) {
        	 for (int x = 0; arrayA.length > x ; x++) {
        		 c = c + arrayA[x];
        		 if(arrayB.length > x) {
        			 System.out.println("dentro");
        			 c = c + arrayB[x];
        		 }else {
        			 
        		 }
        	 }
        	
        }else {
        	for (int x = 0; arrayB.length > x ; x++) {
        		if(arrayA.length > x) {
          			 c = c + arrayA[x];
          		 }else {
          			 
          		 }
       		 c = c + arrayB[x];
       		 
       	 }
        }
        System.out.println(c);
    }

}
