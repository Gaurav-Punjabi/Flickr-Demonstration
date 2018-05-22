/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import jiconfont.icons.GoogleMaterialDesignIcons;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author gauravpunjabi
 */
public class IndexPanel extends javax.swing.JPanel implements MouseListener,IndexPanelConstants{

    /**
     * Creates new form IndexPanel
     */
    public IndexPanel() {
        initComponents();
        customInit();
        addListeners();
        this.setSize(497,52);
    }
    private void addListeners() {
        jlBack.addMouseListener(this);
        jlNext.addMouseListener(this);
        jl1.addMouseListener(this);
        jl2.addMouseListener(this);
        jl3.addMouseListener(this);
        jl4.addMouseListener(this);
        jl5.addMouseListener(this);
    }
    private void customInit() {
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        jlBack.setIcon(IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ARROW_BACK, 30, Color.gray.darker()));
        jlNext.setIcon(IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ARROW_FORWARD,30,Color.gray.darker()));
        selectedLabel = jl1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl2 = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jl1 = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jl3 = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jl4 = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jl5 = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jlNext = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };
        jlBack = new javax.swing.JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(this.getBackground());
                g.fillOval(0,0,this.getWidth(),this.getHeight());
                super.paintComponent(g);
            }
        };

        setBackground(new java.awt.Color(255, 255, 255));

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jl2.setForeground(new java.awt.Color(102, 102, 102));
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setText("2");
        jl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jl1.setBackground(new java.awt.Color(236, 83, 93));
        jl1.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jl1.setForeground(new java.awt.Color(102, 102, 102));
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setText("1");
        jl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jl3.setBackground(new java.awt.Color(255, 255, 255));
        jl3.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jl3.setForeground(new java.awt.Color(102, 102, 102));
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setText("3");
        jl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jl4.setBackground(new java.awt.Color(255, 255, 255));
        jl4.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jl4.setForeground(new java.awt.Color(102, 102, 102));
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setText("5");
        jl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jl5.setBackground(new java.awt.Color(255, 255, 255));
        jl5.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jl5.setForeground(new java.awt.Color(102, 102, 102));
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setText("4");
        jl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlNext.setBackground(new java.awt.Color(255, 255, 255));
        jlNext.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jlNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlBack.setBackground(new java.awt.Color(255, 255, 255));
        jlBack.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        jlBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400,500);
        jf.setLayout(null);
        IndexPanel indexPanel = new IndexPanel();
        jf.add(indexPanel);
        indexPanel.setLocation(200,200);
        jf.setVisible(true);
    }
    /**
     * Listener Methods
     */
    @Override
    public void mouseEntered(MouseEvent me) {
        buttonHoverEntered((JLabel)me.getSource());
    }
    @Override
    public void mouseExited(MouseEvent me) {
        buttonHoverExited((JLabel)me.getSource());
    }
    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getSource() != jlBack && me.getSource() != jlNext) {
            buttonReleased(selectedLabel);
            selectedLabel = (JLabel)me.getSource();
        }
        buttonPressed((JLabel)me.getSource());
    }
    @Override
    public void mouseReleased(MouseEvent me) {
        if(me.getSource() == jlBack || me.getSource() == jlNext) {
            buttonReleased((JLabel)me.getSource());
        }
    }
    @Override
    public void mouseClicked(MouseEvent me) {}
    
    private void buttonHoverEntered(JLabel jLabel) {
        if(jLabel != selectedLabel) {
            jLabel.setBackground(HOVER_BACKGROUND_COLOR);
            jLabel.setForeground(UNSELECTED_FOREGROUND_COLOR);
        }
    }
    private void buttonHoverExited(JLabel jLabel) {
        if(jLabel != selectedLabel) {
            jLabel.setBackground(UNSELECTED_BACKGROUND_COLOR);
            jLabel.setForeground(UNSELECTED_FOREGROUND_COLOR);
        }
    }
    private void buttonReleased(JLabel jLabel) {
        jLabel.setForeground(UNSELECTED_FOREGROUND_COLOR);
        jLabel.setBackground(UNSELECTED_BACKGROUND_COLOR);
    }
    private void buttonPressed(JLabel jLabel) {
        jLabel.setBackground(SELECTED_BACKGROUND_COLOR);
        jLabel.setForeground(SELECTED_FOREGROUND_COLOR);
    }
    private JLabel selectedLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jlBack;
    private javax.swing.JLabel jlNext;
    // End of variables declaration//GEN-END:variables
}