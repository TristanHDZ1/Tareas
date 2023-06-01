package org.example.vista;

import javax.swing.*;
import java.awt.*;


public class VistaMineral extends JFrame {
    private JLabel lblID;
    private JLabel lblNombreMineral;
    private JLabel lblDureza;
    private JLabel lblConductor;
    private JLabel lblLuminoso;
    private JLabel lblUrlFoto;
    private JLabel lblRealizarCambios;

    private JTextField txtID;
    private JTextField txtNombreMinreal;
    private JTextField txtDureza;
    private JTextField txtConductor;
    private JTextField txtLuminoso;
    private JTextField txtUrlFoto;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;


    private JTable tblMineral;

    private JScrollPane scrollPane;

    private GridLayout layout;

    private JLabel lblImagenMineral;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public VistaMineral(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(158, 188, 206));
        lblID= new JLabel("ID:");
        lblNombreMineral= new JLabel("Nombre del mineral:");
        lblDureza= new JLabel("Dureza Mohs:");
        lblConductor= new JLabel("Es Conductor Si/No:");
        lblLuminoso= new JLabel("Es luminoso Si/No:");
        lblUrlFoto = new JLabel("URL de la Imagen:");
        txtID= new JTextField(3);
        txtID.setText("0");
        txtID.setEnabled(false);
        txtNombreMinreal =  new JTextField(15);
        txtDureza = new JTextField(5);
        txtConductor = new JTextField(5);
        txtLuminoso =  new JTextField(5);
        txtUrlFoto= new JTextField(30);

        panel1.add(lblID);
        panel1.add(txtID);
        panel1.add(lblNombreMineral);
        panel1.add(txtNombreMinreal);
        panel1.add(lblDureza);
        panel1.add(txtDureza);
        panel1.add(lblConductor);
        panel1.add(txtConductor);
        panel1.add(lblLuminoso);
        panel1.add(txtLuminoso);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlFoto);
        btnAgregar= new JButton("Agregar Mineral");
        panel1.add(btnAgregar);
        this.getContentPane().add(panel1,0);







        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(147, 183, 203));
        tblMineral = new JTable();
        scrollPane = new JScrollPane(tblMineral);
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        panel2.add(scrollPane);
        this.getContentPane().add(panel2,1);

        //Panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(138, 176, 206));
        lblImagenMineral= new JLabel("...");
        this.panel3.add(lblImagenMineral);
        this.getContentPane().add(panel3,2);

        //Panel4
        panel4= new JPanel(new FlowLayout());
        panel4.setBackground(new Color(130, 174, 201));
        lblRealizarCambios = new JLabel("Realizar Cambios");
        btnActualizar= new JButton("Actualizar datos");
        btnEliminar= new JButton("Eliminar datos");
        panel4.add(btnActualizar);
        panel4.add(lblRealizarCambios);
        panel4.add(btnEliminar);


        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblNombreMineral() {
        return lblNombreMineral;
    }

    public void setLblNombreMineral(JLabel lblNombreMineral) {
        this.lblNombreMineral = lblNombreMineral;
    }

    public JLabel getLblDureza() {
        return lblDureza;
    }

    public void setLblDureza(JLabel lblDureza) {
        this.lblDureza = lblDureza;
    }

    public JLabel getLblConductor() {
        return lblConductor;
    }

    public void setLblConductor(JLabel lblConductor) {
        this.lblConductor = lblConductor;
    }

    public JLabel getLblLuminoso() {
        return lblLuminoso;
    }

    public void setLblLuminoso(JLabel lblLuminoso) {
        this.lblLuminoso = lblLuminoso;
    }

    public JLabel getLblUrlFoto() {
        return lblUrlFoto;
    }

    public void setLblUrlFoto(JLabel lblUrlFoto) {
        this.lblUrlFoto = lblUrlFoto;
    }

    public JLabel getLblRealizarCambios() {
        return lblRealizarCambios;
    }

    public void setLblRealizarCambios(JLabel lblRealizarCambios) {
        this.lblRealizarCambios = lblRealizarCambios;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombreMinreal() {
        return txtNombreMinreal;
    }

    public void setTxtNombreMinreal(JTextField txtNombreMinreal) {
        this.txtNombreMinreal = txtNombreMinreal;
    }

    public JTextField getTxtDureza() {
        return txtDureza;
    }

    public void setTxtDureza(JTextField txtDureza) {
        this.txtDureza = txtDureza;
    }

    public JTextField getTxtConductor() {
        return txtConductor;
    }

    public void setTxtConductor(JTextField txtConductor) {
        this.txtConductor = txtConductor;
    }

    public JTextField getTxtLuminoso() {
        return txtLuminoso;
    }

    public void setTxtLuminoso(JTextField txtLuminoso) {
        this.txtLuminoso = txtLuminoso;
    }

    public JTextField getTxtUrlFoto() {
        return txtUrlFoto;
    }

    public void setTxtUrlFoto(JTextField txtUrlFoto) {
        this.txtUrlFoto = txtUrlFoto;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblMineral() {
        return tblMineral;
    }

    public void setTblMineral(JTable tblMineral) {
        this.tblMineral = tblMineral;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getLblImagenMineral() {
        return lblImagenMineral;
    }

    public void setLblImagenMineral(JLabel lblImagenMineral) {
        this.lblImagenMineral = lblImagenMineral;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public void limpiar() {
        txtNombreMinreal.setText("");
        txtDureza.setText("");
        txtConductor.setText("");
        txtLuminoso.setText("");
        txtUrlFoto.setText("");
    }


}
