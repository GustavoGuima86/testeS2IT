package testeS2IT;

public class Ex8 {

	/*8 - Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
	regras:
	- O primeiro n�mero de C � o primeiro n�mero de A;
	- O segundo n�mero de C � o primeiro n�mero de B;
	- O terceiro n�mero de C � o segundo n�mero de A;
	- O quarto n�mero de C � o segundo n�mero de B;
	Assim sucessivamente...
	- Caso os n�meros de A ou B sejam de tamanhos diferentes, completar C com o restante
	dos n�meros do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
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
