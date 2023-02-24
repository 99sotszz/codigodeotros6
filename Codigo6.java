public class codigo6 {
	  public static void main (String[]args) // faltaba es el metodo static
	    int[] n = new int[20]; // nuevo int?

	    for (int i = 0; i < 20; i++) { // faltaba un + de incremento de i
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " "); // faltaba el .out y ln nomas por si acaso 
	    }
	    
	    System.out.printl("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7) "); // estan raros los 2 puntos los borré y el ln
	    int opcion = Integer.parseInt(System.console().readLine();

	    int multiplo = (opcion == 1) : 5 ? 7;

	    foreach (char e : n) { // ese char de donde sale?
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	       else {
	        System.out.print(e + " ");//out en lugar de in
	      }
	    }
	  
	}