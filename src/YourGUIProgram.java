import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class YourGUIProgram extends JFrame {

    private ArrayList<String> itemList;
    private ArrayList<Double> priceList;
    private JTextArea displayArea;

    public YourGUIProgram() {
        itemList = new ArrayList<>();
        priceList = new ArrayList<>();
        displayArea = new JTextArea();

        JButton addButton = new JButton("Add Item");
        JButton deleteButton = new JButton("Delete Item");
        JButton displayButton = new JButton("Display Items");
        JButton calculateButton = new JButton("Calculate Total");

        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(displayButton);
        panel.add(calculateButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = JOptionPane.showInputDialog("Enter item:");
                double price;
                if (newItem != null && !newItem.isEmpty()) {
                    itemList.add(newItem);
                    price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
                    priceList.add(price);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemToDelete = JOptionPane.showInputDialog("Enter item to delete:");
                int itemIndex = itemList.indexOf(itemToDelete);
                itemList.remove(itemIndex);
                priceList.remove(itemIndex);
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayArea.setText("");
                for(int i = 0; i < itemList.size(); i++){
                    displayArea.append(itemList.get(i) + " " + "$ " + priceList.get(i) + "\n");
                }
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;
                for(double price : priceList){
                    total += price;
                }
                JOptionPane.showMessageDialog(null, "Total Price: $" + total);
            }
        });

        add(panel, "North");
        add(new JScrollPane(displayArea), "Center");

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Your GUI Program");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new YourGUIProgram().setVisible(true));
    }
}
