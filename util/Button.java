package util;

import javax.swing.JButton;

import src.Chatter;

import java.awt.Color;

public class Button extends JButton {
    public Button(String name) {
        setText(name);
        setFocusPainted(false);
        setFont(Chatter.font);
        setBackground(Color.LIGHT_GRAY);
        setBorderPainted(false);
        addActionListener(Chatter.button_listener);
    }
}