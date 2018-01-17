package root.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class NewProfileController extends AbstractController {

    @Override
    public EventHandler<WindowEvent> onStart() {
        return Event::consume;
    }

    @Override
    public EventHandler<WindowEvent> onEnd() {
        return Event::consume;
    }
}
