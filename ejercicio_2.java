import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palabra_ind=0;
        String palabratemp="";
        System.out.println("Introduce tu nombre y primer apellido: ");
        String nombre = entrada.nextLine();
        String[] palabras = new String[2];
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            if (c == ' ') {
                palabras[palabra_ind] = palabratemp;
                palabra_ind++;
                palabratemp = "";
            } else {
                palabratemp += c;
            }
        }
        palabras[palabra_ind] = palabratemp;
        char inicial1 = palabras[0].toUpperCase().charAt(0);
        char inicial2 = palabras[1].toUpperCase().charAt(0);

        String iniciales = inicial1 + " . " + inicial2;

        System.out.print("Tus iniciales son: " + iniciales);
}
}