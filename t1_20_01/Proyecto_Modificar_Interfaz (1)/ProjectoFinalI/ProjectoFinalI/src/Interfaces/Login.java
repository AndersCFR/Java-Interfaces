/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Metodos.Listas;
import Metodos.Hora;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Metodos.Empleado;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Anderson
 */
public class Login extends javax.swing.JFrame {
    
    public static String nom = ""; //Se declara así para enviar datos entre interfaces
    public static String tipo_equipos = ""; //Se declara así para enviar datos entre interfaces
    String contra = "";
    Listas UsuarioTec = new Listas();
    Listas UsuarioMan = new Listas();
    Listas UsuarioCon = new Listas();
    Listas UsuarioAd = new Listas();
    Listas Equipos = new Listas();
    Listas Global = new Listas();
    Listas Tiempo = new Listas();
    int hora=0,minutos=0,segundos=0;
    int hora2=0,minutos2=0,segundos2=0;
    int logueo = 0;
    String userOK="";
    
    /**
     * Creates new form Login2
     */
    public Login() {
        initComponents();
        setSize(400, 550);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/Fondo.jpg");
       /* Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        ImageIcon wallapper_logo = new ImageIcon("src/images/User.png");
        Icon icono_logo = new ImageIcon(wallapper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();*/
    }
    
     @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/User.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton_Acceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_user.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        jButton_Acceder.setBackground(new java.awt.Color(0, 51, 102));
        jButton_Acceder.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Acceder.setText("Acceder");
        jButton_Acceder.setBorder(null);
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        int validacion = 0;
        nom = txt_user.getText().trim();
        contra = txt_password.getText().trim();
        if (nom.equals("")) {
            txt_user.setBackground(Color.red);
            validacion++;
        }
        if (contra.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;
        }
        if (!nom.equals("") || !contra.equals("")) {

            // LISTA QUEMADA DE DATOS DE USUARIOS
            //TECNICO
            UsuarioTec.insertarFin(new Empleado("Miguel", "1784512698","Router"));
            UsuarioTec.insertarFin(new Empleado("Manuel", "1784525659","Switch"));
            UsuarioTec.insertarFin(new Empleado("Bryan", "1748592525","Router"));
            UsuarioTec.insertarFin(new Empleado("Joselin", "1751974906","Access Point"));
            //MANTENIMIENTO
            UsuarioMan.insertarFin(new Empleado("Belen", "1754896235","Switch"));
            UsuarioMan.insertarFin(new Empleado("Sofía", "1758968488","Router"));
            UsuarioMan.insertarFin(new Empleado("Andres", "1784552623","Switch"));
            UsuarioMan.insertarFin(new Empleado("Walter", "1744584241","Access Point"));
            //CONTROLADOR
            UsuarioCon.insertarFin(new Empleado("Andres", "1744452554","Router"));
            UsuarioCon.insertarFin(new Empleado("Maria", "1749955863","Router"));
            UsuarioCon.insertarFin(new Empleado("Lucas", "1744525598","switch"));
            UsuarioCon.insertarFin(new Empleado("Eduarda", "1744851521","Access Point"));
            //administrador
            UsuarioAd.insertarFin(new Empleado("Adrian", "1724762396","TODOS"));
            UsuarioAd.insertarFin(new Empleado("Karen", "1744458963","TODOS"));

            UsuarioAd.identificador(nom, contra);
            UsuarioMan.identificador(nom, contra);
            UsuarioCon.identificador(nom, contra);
            UsuarioTec.identificador(nom, contra);

            if(logueo==0){
                userOK=nom;
                Calendar calendario4= new GregorianCalendar();
                hora = calendario4.get(Calendar.HOUR_OF_DAY);
                minutos = calendario4.get(Calendar.MINUTE);
                segundos = calendario4.get(Calendar.SECOND);
                //Tiempo.insertarFinT(new Hora(nom,hora, minutos, segundos));
                logueo=1;
            }else{
                Calendar calendario2= new GregorianCalendar();
                hora2 = calendario2.get(Calendar.HOUR_OF_DAY);
                minutos2= calendario2.get(Calendar.MINUTE);
                segundos2= calendario2.get(Calendar.SECOND);
                //Tiempo.insertarFinT(new Hora(nom,hora2, minutos2, segundos2));
                //tiempo.imprimirTiempo();
                Hora axt = new Hora();
                axt= Tiempo.TiempoOK(hora, minutos, segundos, hora2, minutos2, segundos2,userOK);
                Tiempo.insertarFinT(new Hora(axt.getUsuario(),axt.getHora(), axt.getMinuto(), axt.getSegundo()));
                logueo=0;
                userOK=nom;
            }

            if (UsuarioAd.identificador(nom, contra) == true) {

                tipo_equipos=UsuarioAd.equipos(nom);

                //System.out.println("Login: "+tipo_equipos);

                new Administrador(UsuarioAd, UsuarioCon, UsuarioMan, UsuarioTec, Equipos).setVisible(true);
            } else if (UsuarioMan.identificador(nom, contra) == true) {

                tipo_equipos=UsuarioMan.equipos(nom);

                //System.out.println("Login: "+tipo_equipos);

                new Mantenimiento(Equipos).setVisible(true);
            } else if (UsuarioTec.identificador(nom, contra) == true) {

                tipo_equipos=UsuarioTec.equipos(nom);

               // System.out.println("Login: "+tipo_equipos);

                new Tecnico(Equipos).setVisible(true);
            } else if (UsuarioCon.identificador(nom, contra) == true) {

                tipo_equipos=UsuarioCon.equipos(nom);

                //System.out.println("Login: "+tipo_equipos);

                new Controlador(UsuarioAd, UsuarioCon, UsuarioMan, UsuarioTec, Equipos, Tiempo).setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }
    }//GEN-LAST:event_jButton_AccederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
