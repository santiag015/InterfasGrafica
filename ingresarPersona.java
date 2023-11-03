package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ingresarPersona  extends JFrame{

    public ingresarPersona(){
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);
        this.setVisible(true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo=txtCodigo.getText();
                String nombre=txtNombre.getText();
                String apellido=txtApellido.getText();
                String idioma= cmbIdioma.getUIClassID().toString();
                String mensaje="Tus datos son: " + " \n" +"Código: " + codigo +  "Nombre: " + nombre + "Apellido: " + apellido + "Idioma: " + idioma ;

                JOptionPane.showMessageDialog(guardarButton, mensaje);
            }
        });
    }
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton guardarButton;
    private JPanel pnlPrincipal;
    private JLabel lblidioma;
    private JComboBox cmbIdioma;


    private void createUIComponents() {
    }
}
