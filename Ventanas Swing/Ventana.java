package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private Button botonPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;

    private JPanel panel3;
    private JComboBox <String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //PANEL 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(255, 106, 106));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new Button("Presioname !!!");
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel("...");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el boton del panel 1");
            }
        });
        this.getContentPane().add(panel1,0);



        //PANEL 2
        String urlImagen = "https://static.wikia.nocookie.net/sonic/images/6/67/Sonic_sonicx.png/revision/latest?cb=20201014023705&path-prefix=es";

        panel2 = new JPanel();
        panel2.setBackground(new Color(255, 125, 78));
        panel2.setLayout(new FlowLayout());
        //cargar la imagen de internet
        try {
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imageIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);

        }catch (MalformedURLException me){
            System.out.println("Url no valida");
        }catch(Exception e){
            System.out.println("Error al cargar la  imagen");

        }


        //PANEL3
        panel3 = new JPanel();
        panel3.setBackground(new Color(255, 175, 99));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opcion 1","Opcion 2", "Opcion 3", "Opcion 4"};
        comboBoxPanel3 =  new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());

            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);

        //PANEL 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(255, 197, 60));
        this.getContentPane().add(panel4,3);

        this.setVisible(true);
    }
}
