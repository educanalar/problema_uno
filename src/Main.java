import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ejercicio conversor = new Ejercicio();
        conversor.monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir;    "));
        JOptionPane.showMessageDialog(null,conversor.toString());

    }
}