package root.ui.window;

import root.controller.LoadingController;

public class LoadingWindow extends AbstractWindow<LoadingController> {

    public LoadingWindow() {
        super("/window/fxml/loading.fxml", null, false);
    }

}