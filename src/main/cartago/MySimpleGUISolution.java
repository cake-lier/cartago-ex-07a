import cartago.INTERNAL_OPERATION;
import cartago.OPERATION;
import cartago.tools.GUIArtifact;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class MySimpleGUISolution extends GUIArtifact {
    private GUIFrame guiFrame;

    @Override
    public void setup() {
        this.guiFrame = new GUIFrame();
        linkActionEventToOp(this.guiFrame.getDialogButton(), "onDialogButtonPressed");
        linkKeyStrokeToOp(this.guiFrame.getTextField(), "ENTER", "onValueUpdated");
        linkWindowClosingEventToOp(this.guiFrame, "onWindowClosed");
        defineObsProperty("value_updated", Integer.parseInt(this.guiFrame.getTextField().getText()));
        this.guiFrame.setVisible(true);
    }

    @INTERNAL_OPERATION
    private void onDialogButtonPressed(final ActionEvent event) {
        signal("dialog_button_pressed");
    }

    @INTERNAL_OPERATION
    private void onValueUpdated(final ActionEvent event) {
        updateObsProperty("value_updated", Integer.parseInt(this.guiFrame.getTextField().getText()));
    }

    @INTERNAL_OPERATION
    private void onWindowClosed(final WindowEvent event) {
        this.guiFrame.closeDialog();
        signal("window_closed");
    }

    @OPERATION
    public void openDialog(final int value) {
        this.guiFrame.openDialog(value);
    }
}
