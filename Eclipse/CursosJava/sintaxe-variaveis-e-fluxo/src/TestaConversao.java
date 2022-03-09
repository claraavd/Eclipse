
public class TestaConversao {
	public static void main (String [] args) {
		double salario = 1270.50;
		
		//casting
        int valor = (int) salario;
        System.out.println(valor);
        
        //soma inconsistente
        double a = 0.1;
        double b = 0.2;
        double total = a + b;
        System.out.println(total);
        
        //float = 3.14 n compila, ja que 3.14 seria double.
        float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante);
        		
	}
}
