package gui.adminPanels.tipoPaneles;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public interface AdminJList extends SetRespuestas {

    default void addItem(DefaultListModel<String> modelo) {
        String newOne = JOptionPane.showInputDialog("Nueva respuesta correcta:");
        if (newOne != null && newOne.length() != 0) {
            modelo.addElement(newOne);
        }
    }

    default void removeItem(JList list, DefaultListModel<String> modelo) {
        int index = list.getSelectedIndex();
        if (index != -1) {
            modelo.remove(index);
        }
    }
}
