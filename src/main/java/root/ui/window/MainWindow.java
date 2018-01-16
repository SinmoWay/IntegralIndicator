package root.ui.window;

import org.springframework.stereotype.Component;
import root.controller.MainController;

import java.io.IOException;

@Component
public class MainWindow extends AbstractWindow<MainController> {

    public MainWindow() throws IOException {
        super("/window/fxml/main.fxml", "Формирование данных", true);
    }
}