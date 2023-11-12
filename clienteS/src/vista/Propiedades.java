/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author flavi
 */
public class Propiedades extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent com) {
        return new Propiedades();

    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/com.resources/nose.png")));
        //btn.setBorder(BorderFactory.createLineBorder(new java.awt.Color(70,73,75)));

        btn.setBorder(BorderFactory.createEmptyBorder());
        btn.setContentAreaFilled(true);
        return btn;
    }

    protected JScrollBar createScrollBar() {
        JScrollBar bar = new JScrollBar(0);
        bar.setVisible(false);

        bar.setBorder(BorderFactory.createEmptyBorder());
        return bar;
    }

    @Override
    protected ListCellRenderer<Object> createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                list.setSelectionBackground(new java.awt.Color(157, 157, 157));
                return this;
            }

        };
    }
}
