package filehider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileHider extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField filePathField;
    private JButton browseButton;
    private JButton hideButton;
    private JButton unhideButton;
    private JFileChooser fileChooser;

    public FileHider() {
        // Set up the frame
        setTitle("File Hider");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        filePathField = new JTextField(20);
        browseButton = new JButton("Browse");
        hideButton = new JButton("Hide");
        unhideButton = new JButton("Unhide");
        fileChooser = new JFileChooser();

        // Add components to the frame
        add(new JLabel("File Path:"));
        add(filePathField);
        add(browseButton);
        add(hideButton);
        add(unhideButton);

        // Add action listeners
        browseButton.addActionListener(new BrowseButtonListener());
        hideButton.addActionListener(new HideButtonListener());
        unhideButton.addActionListener(new UnhideButtonListener());
    }

    private class BrowseButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                filePathField.setText(selectedFile.getAbsolutePath());
            }
        }
    }

    private class HideButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file = new File(filePathField.getText());
            if (file.exists()) {
                File hiddenFile = new File(file.getParent(), "." + file.getName());
                if (file.renameTo(hiddenFile)) {
                    JOptionPane.showMessageDialog(null, "File hidden successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to hide the file.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        }
    }

    private class UnhideButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file = new File(filePathField.getText());
            if (file.exists()) {
                String fileName = file.getName();
                if (fileName.startsWith(".")) {
                    File unhiddenFile = new File(file.getParent(), fileName.substring(1));
                    if (file.renameTo(unhiddenFile)) {
                        JOptionPane.showMessageDialog(null, "File unhidden successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to unhide the file.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File is not hidden.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileHider().setVisible(true);
            }
        });
    }
}
