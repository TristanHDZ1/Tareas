package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Ventana  extends JFrame {
    private JLabel lblid;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrolador;

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrolador;

    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaVideojuego modelo;
    private ArrayList<VideoJuego> info;
    private JScrollPane scroll;
    private JTable tbltabla;

    public Ventana (String title) throws  HeadlessException{
        super(title);
        this.setSize(500,1000);
        layout = new GridLayout(2,1);
        this.setLayout(layout);


        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(252, 96, 96));
        lblid = new JLabel("Id:");
        txtId = new JTextField(4);
        panel1.add(lblid);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblGenero = new JLabel("Genero:");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);

        lblPeso = new JLabel("Peso en GB:");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);

        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblDesarrolador = new JLabel("Desarrolador:");
        txtDesarrolador = new JTextField(25);
        panel1.add(lblDesarrolador);
        panel1.add(txtDesarrolador);
        btnAgregar = new JButton("Agregar  juego");
        panel1.add(btnAgregar);


        this.getContentPane().add(panel1,0);



        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(222, 9, 45));
        info = new ArrayList<>();
        info.add(new VideoJuego(1,"League of Legend","Moba",4.5,
                "Windonw y Mac","Rio "));
        modelo = new ModeloTablaVideojuego(info);
        tbltabla = new JTable(modelo);
        scroll = new JScrollPane(tbltabla);
        panel2.add(scroll);



        this.getContentPane().add(panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoGB(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrolador.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tbltabla.updateUI();

            }
        });
        this.setVisible(true);

}
}

