package root.ui.window;

import root.controller.NewProfileController;

public class NewProfileWindow extends AbstractWindow<NewProfileController> {
    public NewProfileWindow() {
        super("/window/fxml/new_profile.fxml", "", true);
    }
}
