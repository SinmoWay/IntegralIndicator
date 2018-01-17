package root.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import root.ui.window.AboutWindow;
import root.ui.window.MainWindow;

import java.io.IOException;

@Configuration
public class WindowConfigurations {

    @Bean
    public MainWindow getMainWindow() throws IOException {
        return new MainWindow();
    }

    @Bean
    public AboutWindow getAboutWindow() throws IOException {
        return new AboutWindow();
    }
}
