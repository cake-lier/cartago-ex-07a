import javax.swing.*;
import java.awt.*;

/** The {@link JFrame} containing the whole GUI. */
public class GUIFrame extends JFrame {
    private final JButton dialogButton;
    private final JTextField textField;
    private final JDialog dialog;
    private final JTextField dialogTextField;

    /** Default constructor. */
    protected GUIFrame() {
        this.setTitle("Simple GUI");
        this.setSize(new Dimension(300, 100));
        final var panel = new JPanel(new BorderLayout());
        this.setContentPane(panel);
        this.textField = new JTextField(10);
        this.textField.setText("0");
        panel.add(this.textField, BorderLayout.CENTER);
        this.dialogButton = new JButton("Open Dialog");
        panel.add(this.dialogButton, BorderLayout.SOUTH);
        this.dialog = new JDialog();
        this.dialog.setTitle("New value");
        this.dialog.setSize(200, 50);
        final var dialogPanel = new JPanel(new BorderLayout());
        this.dialog.setContentPane(dialogPanel);
        this.dialogTextField = new JTextField();
        this.dialogTextField.setEditable(false);
        dialogPanel.add(this.dialogTextField, BorderLayout.CENTER);
    }

    /** Opens the {@link JDialog} showing the given value.
     *
     * @param value the value to display in the {@link JTextField} in the {@link JDialog}
     */
    public void openDialog(final int value) {
        this.dialogTextField.setText("%d".formatted(value));
        this.dialog.setVisible(true);
    }

    /** Closes the {@link JDialog}. */
    public void closeDialog() {
        this.dialog.setVisible(false);
    }

    /** Returns the {@link JButton} that opens the {@link Dialog} in the main {@link JPanel}. */
    public JButton getDialogButton() {
        return this.dialogButton;
    }

    /** Returns the {@link JTextField} in the main {@link JPanel}. */
    public JTextField getTextField() {
        return this.textField;
    }
}
