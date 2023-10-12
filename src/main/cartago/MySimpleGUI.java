import cartago.INTERNAL_OPERATION;
import cartago.OPERATION;
import cartago.tools.GUIArtifact;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class MySimpleGUI extends GUIArtifact {
    private GUIFrame guiFrame;

    @Override
    public void setup() {
        this.guiFrame = new GUIFrame();
        /* Add your code here to link events and keystrokes to operations handling them. */
        /* Add your code here to define the observable property inherent to the value in the text field. */
        this.guiFrame.setVisible(true);
    }

    @INTERNAL_OPERATION
    private void onDialogButtonPressed(final ActionEvent event) {
        /* Add your code here to signal that the "open dialog" button has been pressed. */
    }

    @INTERNAL_OPERATION
    private void onValueUpdated(final ActionEvent event) {
        /* Add your code here to update the observable property related to the value in the text field. */
    }

    @INTERNAL_OPERATION
    private void onWindowClosed(final WindowEvent event) {
        this.guiFrame.closeDialog();
        /* Add your code here to signal that the main window frame has been closed. */
    }

    @OPERATION
    public void openDialog(final int value) {
        this.guiFrame.openDialog(value);
    }
}
