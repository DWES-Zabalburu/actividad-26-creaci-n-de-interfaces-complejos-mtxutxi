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
    
    private JPanel pnlTitulo = new JPanel(new FlowLayout (FlowLayout.CENTER));
    private JPanel pnlDatos = new JPanel(new GridLayout(0, 1));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    private final Color COLOR_FONDO = new Color(25, 25, 35);
    private final Color COLOR_FONDO_TITULO = new Color(49,50,70);
    private final Color COLOR_TEXTO = new Color(2, 253,171);
    private final Color COLOR_CANCELAR = new Color(255, 49, 80);
    private final Font FUENTE = new Font("Calibri", Font.BOLD, 16);
    
    public FrmVentana2() {
        this.setSize(dmVentana);
        this.setTitle("GameZone - Registro");
        lblTitulo.setFont(new Font("Impact", Font.BOLD, 32));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setBackground(COLOR_FONDO_TITULO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createCompoundBorder(
                                BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_TEXTO), 
                                BorderFactory.createEmptyBorder(5, 10, 5, 10)
                            ));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        pnlDatos.add(lblTag);
        pnlDatos.add(txtTag);
        pnlDatos.add(lblMail);
        pnlDatos.add(txtMail);
        pnlDatos.add(lblPassword);
        pnlDatos.add(pswPassword);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        pnlDatos.setBackground(COLOR_FONDO);
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            if (cmp instanceof JTextField || cmp instanceof JPasswordField) {
                ((JTextField)cmp).setBorder(BorderFactory.createLineBorder(COLOR_TEXTO, 1));
                cmp.setFont(FUENTE);
                cmp.setForeground(Color.LIGHT_GRAY);
                cmp.setBackground(COLOR_FONDO_TITULO);
            } else {
                cmp.setFont(FUENTE);
                cmp.setForeground(COLOR_TEXTO);
            }
        }
        this.add(pnlDatos, BorderLayout.CENTER);
        
        pnlBotones.add(btnRegistro);
        pnlBotones.add(btnCancelar);
        btnCancelar.setBackground(COLOR_CANCELAR);
        btnRegistro.setBackground(COLOR_TEXTO);
        /*btnRegistro.setBorder(BorderFactory.createLineBorder(COLOR_TEXTO, 15));
        btnCancelar.setBorder(BorderFactory.createLineBorder(COLOR_CANCELAR.darker(), 15));
        btnCancelar.setBorderPainted(true);
        btnRegistro.setBorderPainted(true);*/
        btnRegistro.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnCancelar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pnlBotones.setBackground(COLOR_FONDO);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        for (int i = 0; i < pnlBotones.getComponentCount(); i++) {
            pnlBotones.getComponent(i).setForeground(COLOR_FONDO);
            pnlBotones.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnRegistro);
    }
    
    public static void main(String[] args) {
        FrmVentana2 v2 = new FrmVentana2();
        v2.setVisible(true);
    }
}
