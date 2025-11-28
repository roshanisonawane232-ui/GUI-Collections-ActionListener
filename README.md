Student Info GUI – Java Swing Project

This project is a Java Swing-based GUI application that allows users to enter student names and automatically stores them in List, Set, and Map collections.
It visually displays how each data structure stores the data differently.

🚀 Features

✔ Accepts student names through a text input field
✔ Stores names in List, Set, and Map simultaneously
✔ List stores names in insertion order (supports duplicates)
✔ Set stores unique names only (no duplicates)
✔ Map stores data as Roll No → Name pairs
✔ GUI updates automatically after each entry

🖼 Preview

When a student name is entered and the "Add Student" button is clicked:

Collection	Behavior	Display Format
List	Allows duplicates	List: John Alex John
Set	Removes duplicates	Set: John Alex
Map	Auto-increment roll number	1 → John 2 → Alex
🧩 Technologies Used
Component	Description
Language	Java
GUI Toolkit	Swing
Layout	FlowLayout
Concepts	List, Set, Map collections
📂 How to Run

Install JDK 8+

Save the file as StudentGUI.java

Compile and run using:

javac StudentGUI.java
java StudentGUI

🧠 Key Learning Outcomes

This program demonstrates:

Building GUIs using Java Swing

Handling events with ActionListener

Using Collection Frameworks:

ArrayList

HashSet

HashMap

Iterating with Enhanced for-loop and Iterator

📌 Code Snippet
studentList.add(name);
studentSet.add(name);
studentMap.put(rollNo++, name);
