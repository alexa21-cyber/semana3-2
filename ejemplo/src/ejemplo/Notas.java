package ejemplo;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,notafinal=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("ingrese la nota 1");
		nota1=scan.nextDouble();
		System.out.println("ingrese la nota 2");
		nota2=scan.nextDouble();
		System.out.println("ingrese la nota 3");
		nota3=scan.nextDouble();
		notafinal=nota1*0.3+nota2*0.4+nota3*0.2;
		
			if (notafinal>=15)
			System.out.println("Aprovado"); 
	
			if (notafinal<15)
			System.out.println("Desaprobado"); 
		
		System.out.println("usted esta "+ notafinal);

	}

}
