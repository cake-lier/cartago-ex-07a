# CArtAgO by exercises — Exercise 07a — Programming GUI as Artifacts

In this exercise, you'll get familiar with artifacts that implement GUI components. 
This is done by extending the abstract class "GUIArtifact" instead of the usual "Artifact" class.
The artifact you need to implement is called "MySimpleGUI."
It represents a window made by a text field in which values can be inserted,
and upon pressing the "enter" key, the artifact will update the corresponding observable property.
Another component inside the window is the button below the text field,
opening a dialog that will contain the value of the observable property in a non-changeable text field.
This is possible by linking "action events" and keystrokes to given operations in the artifact,
then handling their events.

In our case,
the insertion of a new value will cause the existing agent
to update its beliefs about the observable property current value.
The press of the button will cause the opening of the dialog
displaying the value of the property as it is believed by the agent to be.
The closing of the main window will cause the agent to terminate.

To complete this exercise, you will provide the implementation for "MySimpleGUI."
You'll need to link events and define observable properties in the "init"
method and properly implement the "event handling"
operations either by signaling that an event happened or by updating the observable property.
You won't need to implement the GUI, it has already been done.

## Solution

All solution files are marked with the "solution" suffix, don't open them before solving the exercise!
