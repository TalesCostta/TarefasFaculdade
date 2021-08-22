import javax.swing.JOptionPane;

public class App {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}

    public static void main(String[] args) {    
	    int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
	    for (int i = 0; i < numero; i++) {
                System.out.print("(" + i + "):" + App.fibo(i) + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < numero; i++) {
            System.out.print("(" + i + "):" + App.fibonacciIterative(i) + "\t");
    }
    }
}