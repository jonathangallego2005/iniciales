import javax.swing.JOptionPane;

public class ejercicio_1 {
    public static void main(String[] args){
        int num,suma=0,numeros;
        int [] numero =  new int [num];
    
        num = Integer.parseInt(JOptionPane.showInputDialog(" ingresa la cantidad de números que quieres en el array"));
    
        for (int i = 0; i<num; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa en numero "+(i+1)+ ": "));
        }

        for (int i = 0; i < num; i++){
            suma += numeros;
            JOptionPane.showMessageDialog(null, "la suma de los numeros es: "+ suma);
        }
        
    }       
    