import javax.swing.*;

public class kcb {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new kcbData());
        JScrollPane pane = new JScrollPane(table);
        frame.add(pane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
