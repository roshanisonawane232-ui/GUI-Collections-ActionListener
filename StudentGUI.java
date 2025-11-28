import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.*;

class StudentGUI extends JFrame implements ActionListener {
    JTextField nameField;
    JButton addButton;
    JLabel listLabel, setLabel, mapLabel;

    // Collections
    List<String> studentList = new ArrayList<>();
    Set<String> studentSet = new HashSet<>();
    Map<Integer, String> studentMap = new HashMap<>();
    int rollNo = 1; // Auto-increment roll number

    // Constructor
    StudentGUI() {
        setTitle("Student Info");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Components
        JLabel namePrompt = new JLabel("Enter Student Name: ");
        nameField = new JTextField(15);
        addButton = new JButton("Add Student");

        listLabel = new JLabel("List: ");
        setLabel = new JLabel("Set: ");
        mapLabel = new JLabel("<html>Map:</html>"); // FIX: HTML enabled

        // Add components to frame
        add(namePrompt);
        add(nameField);
        add(addButton);
        add(listLabel);
        add(setLabel);
        add(mapLabel);

        // Add event listener
        addButton.addActionListener(this);

        setVisible(true);
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (!name.isEmpty()) {
            // Add to List
            studentList.add(name);

            // Add to Set (no duplicates)
            studentSet.add(name);

            // Add to Map (rollNo → name)
            studentMap.put(rollNo, name);
            rollNo++;

            // Display List using Enhanced for-loop
            StringBuilder listStr = new StringBuilder("List: ");
            for (String s : studentList) {
                listStr.append(s).append(" ");
            }
            listLabel.setText(listStr.toString());

            // Display Set using Iterator
            StringBuilder setStr = new StringBuilder("Set: ");
            Iterator<String> it = studentSet.iterator();
            while (it.hasNext()) {
                setStr.append(it.next()).append(" ");
            }
            setLabel.setText(setStr.toString());

            // Display Map (using for-each)
            StringBuilder mapStr = new StringBuilder("<html>Map:<br>");
            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                mapStr.append(entry.getKey())
                      .append(" → ")
                      .append(entry.getValue())
                      .append("<br>");
            }
            mapStr.append("</html>");
            mapLabel.setText(mapStr.toString());

            // Clear input field
            nameField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a name!");
        }
    }

    // Main method
    public static void main(String[] args) {
        new StudentGUI();
    }
}