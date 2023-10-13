!gui_tester.

+!gui_tester : true <-
    makeArtifact("gui", "io.github.cakelier.MySimpleGUI", [], GUIId);
    focus(GUIId).

+value_updated(N) : true <-
    println("The value is now ", N).

+dialog_button_pressed : value_updated(N) <-
    openDialog(N).

+window_closed : true <-
    .my_name(Me);
    .kill_agent(Me).

{ include("$jacamoJar/templates/common-cartago.asl") }
