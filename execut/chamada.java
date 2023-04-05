package execut;

import java.util.Scanner;

import program.busca1;
import program.hello;

public class chamada {
	static void myMethod() {
		System.out.println("bom dia! ");
		// code to be executed
	}

	public static void calPara() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		hello hel = new hello();
		System.out.println(hel.a + " " + hel.b);
		
		busca1 XX = new busca1();
		Scanner x1 = new Scanner(System.in);
		System.out.println("enter valor de x ");
		int valorX = x1.nextInt();
		
		Scanner x2 = new Scanner(System.in);
		System.out.println("enter valor de y");
		int valorY = x2.nextInt();
		
		Scanner x3 = new Scanner(System.in);
		System.out.println("enter valor de z");
		int valorZ = x3.nextInt();
		
		System.out.println("valor de x e " + valorX);
		System.out.println("valor de y e " + valorY);
		System.out.println("valor de x e " +" " + valorZ);
		
		int h = valorX * valorY * valorZ;
		System.out.println("valor de H e " + h);
		
		myMethod();
		//calPara();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = sc.next();
		System.out.println("You entered: " + name);
		
		sc.close();
		
	}
}
