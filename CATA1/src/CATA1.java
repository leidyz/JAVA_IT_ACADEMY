import java.util.ArrayList;
import java.util.Scanner;

public class CATA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in); 
		int a = 0;
		int b = 0;
		int sum = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		
		while(a >= 0 && a < 109) {
			System.out.println("Introduce un numero positivo");
			a = sc.nextInt();
			numeros.add(a);
			sc.nextLine();
			/*
			 * String input = "1234";
System.out.println(Arrays.toString(input.split("")));
// output: [1, 2, 3, 4]
			 */
			//for(int i = 0; i < a.length(); i++) {
				
			//}
		}
		
		for(int i = 0; i < numeros.size()-1; i++) {
			System.out.print(numeros.get(i) + " + ");
		}
		
		for (int i = 0; i < numeros.size()-1; i++) { //se comienza desde 1 ya que el primero es 0
			a = numeros.get(i);
			b= numeros.get(i+1);
			sum = a+b; //la b tomara la represetnacion de la suma
		}
		System.out.print(" = " + sum);
		
			
		sc.close();
	}

}
