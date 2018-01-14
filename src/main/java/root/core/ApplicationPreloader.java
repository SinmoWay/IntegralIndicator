package root.core;

import javafx.animation.FadeTransition;
import javafx.application.Preloader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import root.ui.window.LoadingWindow;

public class ApplicationPreloader extends Preloader {

    private final LoadingWindow loading;

    public ApplicationPreloader() {
        loading = new LoadingWindow();
    }

    @Override
    public void start(Stage primaryStage) {
        loading.init(primaryStage);
        loading.getScene().setFill(null);
        loading.getStage().initStyle(StageStyle.TRANSPARENT);
        loading.getStage().setAlwaysOnTop(true);
        loading.startWindow();
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification evt) {
        if (evt.getType() == StateChangeNotification.Type.BEFORE_START) {

            FadeTransition ft = new FadeTransition(Duration.seconds(2), loading.getScene().getRoot());

            ft.setFromValue(1.0);
            ft.setToValue(0.0);
            ft.setCycleCount(1);

            ft.play();

            ft.setOnFinished(event -> loading.closeWindow());
        }
    }

}