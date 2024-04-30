/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author aiman
 */
public class Panel extends JPanel implements ActionListener {
    // Declaración de variables
    private JComboBox<String> categoria;
    private JComboBox<String> idioma ;
    private JLabel labelCategoria;
    private JLabel labelidioma;

    // Constructor
    public Panel() {
        initComponents();
    }

    // Inicialización de componentes
    private void initComponents() {
        // Inicialización de los componentes
        categoria = new JComboBox<>(new String[] {"Programming", "Miscellaneous", "Dark", "Pun", "Spooky", "Christmas"});
        
        labelCategoria = new JLabel("Categoría:");
        labelidioma = new JLabel("Idioma: ");

        // Configuración del combo box
        categoria.addActionListener(this);

        // Configuración del layout
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

        // Configuración del diseño horizontal
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCategoria)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(labelidioma)
                .addContainerGap(200, Short.MAX_VALUE)
        );
        
        // Configuración del diseño vertical
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(categoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(labelidioma))
                .addContainerGap(200, Short.MAX_VALUE)
        );
    }

    // Manejo de eventos del combo box
    @Override
    public void actionPerformed(ActionEvent e) {
        // Manejo de eventos del combo box
        String itemSeleccionado = (String) categoria.getSelectedItem();
        // Agrega el código para manejar la selección aquí
    }
}
