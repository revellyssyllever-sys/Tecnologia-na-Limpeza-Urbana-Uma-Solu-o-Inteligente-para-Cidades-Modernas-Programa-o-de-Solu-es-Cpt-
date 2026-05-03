package view;

import javax.swing.JOptionPane;

public class TelaSistema {
    public void exibirResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado,
                "Tecnologia na Limpeza Urbana",
                JOptionPane.INFORMATION_MESSAGE);
    }
}