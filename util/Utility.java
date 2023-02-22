package util;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import src.Chatter;

import java.awt.Color;

public class Utility {
    public static void makeDefaults(JComponent component) {
        component.setBackground(Color.WHITE);
        component.setFont(Chatter.font);
    }
    public static void setUser(String username) {
        Chatter.username_mi.setText(username);
        Chatter.form_frame.dispose();
        Chatter.chat_frame.setVisible(true);
    }
    public static boolean checkRegex(String username, String password) {
        if (!(username.matches("^[A-Za-z0-9_]{4,16}") && password.matches("^[A-Za-z0-9_]{4,16}"))) {
            JOptionPane.showMessageDialog(null, "Only 4-16 characters A-Z, \na-z, 0-9 and _ are allowed!", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}