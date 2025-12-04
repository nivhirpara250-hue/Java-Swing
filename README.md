## 🚀 Java-Swing – Modern & Clean Java GUI Applications
<p align="center"> <img src="https://img.shields.io/badge/Java-Swing-blue?logo=java&style=for-the-badge" /> <img src="https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge" /> <img src="https://img.shields.io/badge/Platform-Cross%20Platform-orange?style=for-the-badge" /> <img src="https://img.shields.io/github/repo-size/nivhirpara250-hue/Java-Swing?style=for-the-badge" /> </p>

## 📌 Overview

Java-Swing is a collection of modern and beginner-friendly desktop GUI applications built using Java Swing.
This repository is perfect for students, new learners, and developers who want to master GUI development in Java.

- Swing allows you to build:

🖼️ Windows

🔘 Buttons, Labels, Fields

📥 Input Forms

🧮 Mini Apps (Calculator, Login Form, etc.)

🔔 Event-Driven Interactive UI

This repo gives clean, readable, and well-explained examples.

## ✨ Key Features

- ✔️ Beginner-friendly code
- ✔️ Modern UI examples
- ✔️ Covers all major Swing components
- ✔️ Full code explanations
- ✔️ Layout manager examples
- ✔️ Event-handling demos
- ✔️ Mini projects included
- ✔️ Open-source & easy to contribute


## 🧠 Code Explanation

Here are the main Swing concepts used in this repo:

- 🎛️ 1. Creating a Window
JFrame frame = new JFrame("My App");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

 Explanation:
```
JFrame → Main application window

setSize → Window width & height

EXIT_ON_CLOSE → Closes app completely

setVisible(true) → Displays the window
```
- 🔘 2. Adding Components
```
JButton btn = new JButton("Click Me");
JLabel label = new JLabel("Welcome!");
frame.add(btn);
frame.add(label);
```

Explanation:
Each UI element (button, text field, label) starts with J.
All components must be added to a container.

- 🧩 3. Event Handling
```
btn.addActionListener(e -> {
    System.out.println("Button Clicked!");
});
```

Explanation:
```
Detects button click

Runs the code block inside the listener

Useful for form submission, calculator operations, etc.
```

## 📐 4. Layout Managers
```
Layout Manager	Description
FlowLayout	Left → Right flow
BorderLayout	5 regions layout
GridLayout	Rows × Columns
BoxLayout	Vertical / Horizontal layout
Null Layout	Manual positioning
🛠 Example Snippet: Simple Calculator
int a = Integer.parseInt(txtA.getText());
int b = Integer.parseInt(txtB.getText());
resultLabel.setText("Result: " + (a + b));
```

Explanation:

Takes numbers from text fields

Converts them into integers

Displays result on UI

## 🛠️ Installation / Run
- 1. Clone the repository
git clone https://github.com/nivhirpara250-hue/Java-Swing.git

- 2. Go to the project folder
cd Java-Swing

- 3. Compile the Java files
javac -d bin src/**/*.java

- 4. Run the application
java -cp bin MainClassName


Replace MainClassName with your main class.

## 📁 Project Structure
```
Java-Swing/
│
├── src/                  # Source Code
│   ├── basics/           # Basic Swing Examples
│   ├── layouts/          # Layout Manager Examples
│   ├── events/           # Event Handling Examples
│   └── projects/         # Mini Apps
│
├── bin/                  # Compiled Files
└── README.md             # Documentation
```
## 🧰 Tech Stack
Technology	Used For
Java	Main language
Swing	UI Toolkit
AWT	Event handling & base components
JDK 8+	Minimum required version
🚀 Future Improvements

- 🔹 Add JavaFX versions
- 🔹 Add custom themes (Dark Mode UI)
- 🔹 Add MySQL Database examples (Login/Signup CRUD App)
- 🔹 Add animations & sounds
- 🔹 Convert mini-apps into standalone .exe or .jar files
- 🔹 Add more advanced projects

I can help you build any of these!

## 👨‍💻 Author

# Niv Hirpara
- 🟦 GitHub: https://github.com/nivhirpara250-hue

💻 Java Developer | Student
📍 India
