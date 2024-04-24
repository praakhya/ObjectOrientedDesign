import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Store {
    private static final StoreController storeController = new StoreController();
    private static class table {
        JTable table;
        JFrame parent;
        table(String[][] items,JFrame f){
            //creating instance of JFrame
            this.parent = f;
            String[] column={"Description","Price","ID"};
            table=new JTable(items,column);
            f.add(table);

        }
        void setItems(String[][] data) {
            parent.remove(table);
            String[] column={"Description","Price","ID"};
            table=new JTable(data,column);
            parent.add(table);
        }
    }
        public static void main(String[] args) {
        table t;
        String[][] items = storeController.getItems();
        JFrame f=new JFrame();
        f.setLayout(new FlowLayout());
        JTextField tf1 = new JTextField("Enter description");
        JTextField tf2 = new JTextField("Enter price");
        JTextField tf3 = new JTextField("Enter id");
        JTextField tf4 = new JTextField("Enter quantity");
        JButton b = new JButton("Submit");
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(b);
        t= new table(items,f);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String desc = tf1.getText(), price = tf2.getText(), itemId = tf3.getText(), quant = tf4.getText();
                storeController.addItems(desc,price,itemId, quant);
                t.setItems(storeController.getItems());
                tf1.setText("Enter description"); tf2.setText("Enter price"); tf3.setText("Enter id"); tf4.setText("Enter quantity");
                SwingUtilities.updateComponentTreeUI(f);
            }
        });
        f.setSize(500,500);
        f.setVisible(true);


    }
}
