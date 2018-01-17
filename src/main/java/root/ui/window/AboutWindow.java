package root.ui.window;

import org.springframework.stereotype.Component;
import root.controller.AboutController;
import root.core.StringResources;

@Component
public class AboutWindow extends AbstractWindow<AboutController> {

    public AboutWindow() {
        super("/window/fxml/about.fxml", StringResources.getProperty("aboutTitle"), false);
    }
}
