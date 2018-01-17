package root.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import root.ui.window.AboutWindow;

public class MainController extends AbstractController {

    @Autowired
    private AboutWindow about;

    @Override
    public EventHandler<WindowEvent> onStart() {
        return Event::consume;
    }

    @Override
    public EventHandler<WindowEvent> onEnd() {
        return Event::consume;
    }

    @FXML
    private void handleAboutButtonClick(ActionEvent event) {

        about.init(new Stage());
        about.startWindow();

    }
}