package root.ui.window;

import root.controller.AboutController;

public class AboutWindow extends AbstractWindow<AboutController> {

    protected AboutWindow() {
        super("/window/about.fxml", "О программе", false);
    }
}
