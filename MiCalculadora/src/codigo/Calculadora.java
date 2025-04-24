package codigo;
import java.util.*;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce primer número:");
		numero1=sc.nextInt();
		System.out.println();
		System.out.println("Introduce segundo número:");
		numero2=sc.nextInt();
		
		//Operaciones suma y resta
		System.out.println("Suma = "+ (numero1+numero2));
		System.out.println("Resta = "+ (numero1-numero2));
		// Falta por hacer producto y división

	}

}
