package root.ui.window;

import root.controller.DatabaseController;

public class DatabaseWindow extends AbstractWindow<DatabaseController> {
    protected DatabaseWindow() {
        super("/window/fxml/database.fxml", "База данных", true);
    }
}
