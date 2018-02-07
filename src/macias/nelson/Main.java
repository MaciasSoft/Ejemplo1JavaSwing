package macias.nelson;
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame ventana=new JFrame("Swing es poder");
        JLabel etiqueta=new JLabel("Digite un numero");
        JTextField campo=new JTextField(5);
        JButton boton=new JButton("HAZ CLICK");

        ventana.setLayout(new FlowLayout());
        ventana.add(etiqueta);
        ventana.add(campo);
        ventana.add(boton);

        ventana.setSize(200,100);
        ventana.setVisible(true);
    }
}
