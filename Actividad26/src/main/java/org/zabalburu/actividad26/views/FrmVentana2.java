/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.actividad26.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class FrmVentana2 extends JFrame {
    private Dimension dmVentana = new Dimension(500, 500);
    
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    private JLabel lblTag = new JLabel("GAMERTAG");
    private JLabel lblMail = new JLabel("EMAIL");
    private JLabel lblPassword = new JLabel("PASSWORD");
    
    private JTextField txtTag = new JTextField();
    private JTextField txtMail = new JTextField();
    private JPasswordField pswPassword = new JPasswordField("PASSWORD");
    
    private JButton btnRegistro = new JButton("REGISTRARSE");
    private JButton btnCancelar = new JButton("CANCELAR");
    
    private JPanel pnlDatos = new JPanel(new GridLayout(0, 1));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    private final Color COLOR_FONDO = new Color(25, 25, 35);
    private final Color COLOR_FONDO_TITULO = new Color(41,127,184);
    private final Color COLOR_TEXTO = new Color(2, 253,171);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN, 13);
    
    public FrmVentana2() {
        this.setSize(dmVentana);
        this.setTitle("GameZOne - Registro");
        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 24));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setBackground(COLOR_FONDO_TITULO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20,20,10,0));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblSitioWeb);
        pnlDatos.add(txtSitioWeb);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        pnlDatos.setBackground(COLOR_FONDO);
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            if (cmp instanceof JTextField) {
                cmp.setFont(FUENTE);
                ((JTextField) cmp).setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_FONDO_AZUL));
            } else {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
            }
        }
        this.add(pnlDatos, BorderLayout.CENTER);
        
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardar);
        btnCancelar.setBackground(new Color(190, 195, 199));
        btnGuardar.setBackground(COLOR_FONDO_AZUL);
        btnGuardar.setBorder(BorderFactory.createLineBorder(COLOR_FONDO_AZUL, 5));
        btnCancelar.setBorder(BorderFactory.createLineBorder(new Color(190, 195, 199), 5));
        btnGuardar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnCancelar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pnlBotones.setBackground(COLOR_FONDO);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        for (int i = 0; i < pnlBotones.getComponentCount(); i++) {
            pnlBotones.setFont(FUENTE.deriveFont(Font.BOLD));
            pnlBotones.getComponent(i).setForeground(Color.WHITE);
            pnlBotones.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnGuardar);
    }
    
    public static void main(String[] args) {
        FrmVentana2 v2 = new FrmVentana2();
        v2.setVisible(true);
    }
}
