package root.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class AboutController extends AbstractController {
    @Override
    public void init() {

    }

    @Override
    public EventHandler<WindowEvent> onStart() {
        return Event::consume;
    }

    @Override
    public EventHandler<WindowEvent> onEnd() {
        return Event::consume;
    }
}
