import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner entrada = new Scanner(System.in);
		int[] v = new int[5]; //Local ao m�todo main
		lerDados(v); // argumento --> variavel que ser� enviada para o m�todo
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("Maior Valor =" +maior);
		System.out.println("Menor Valor =" +menor);
	}
	
	public static int maiorValor(int[] v) {
		int aux = v[0];
		for(int i=0; i< v.length; i++) {
			if (v[i] > aux) {
				aux = v[i];
			}
			
		}
		return aux;
	}
	
	public static int menorValor(int[] v) {
		int aux = v[0];
		for(int i=0; i< v.length; i++) {
			if (v[i] < aux) {
				aux = v[i];
			}
			
		}
		return aux;
	}
	
	//(n�o tem objeto nesse momento)
	public static void lerDados(int[] v) { // Paremetro --> variavel que recebe o valor
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i< v.length; i++) {
			System.out.println("Valor: ");
			v[i] = teclado.nextInt();
		}
		teclado.close();
	}

}
