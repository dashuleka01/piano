package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public Main() throws AWTException {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Piano");
        Scene scene = new Scene(root, 1500, 500);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        Controller controller = new Controller();

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case Q: controller.pressNote("src/sample/music/c.wav"); break;
                case W: controller.pressNote("src/sample/music/d.wav"); break;
                case E: controller.pressNote("src/sample/music/e.wav"); break;
                case R: controller.pressNote("src/sample/music/f.wav"); break;
                case T: controller.pressNote("src/sample/music/g.wav"); break;
                case Y: controller.pressNote("src/sample/music/a.wav"); break;
                case U: controller.pressNote("src/sample/music/h.wav"); break;
                case DIGIT1: controller.pressNote("src/sample/music/cc.wav"); break;
                case DIGIT2: controller.pressNote("src/sample/music/ee.wav"); break;
                case DIGIT3: controller.pressNote("src/sample/music/ff.wav"); break;
                case DIGIT4: controller.pressNote("src/sample/music/gg.wav"); break;
                case DIGIT5: controller.pressNote("src/sample/music/hh.wav"); break;

                case A: controller.pressNote("src/sample/music1/c.wav"); break;
                case S: controller.pressNote("src/sample/music1/d.wav"); break;
                case D: controller.pressNote("src/sample/music1/e.wav"); break;
                case F: controller.pressNote("src/sample/music1/f.wav"); break;
                case G: controller.pressNote("src/sample/music1/g.wav"); break;
                case H: controller.pressNote("src/sample/music1/a.wav"); break;
                case J: controller.pressNote("src/sample/music1/h.wav"); break;
                case DIGIT6: controller.pressNote("src/sample/music1/cc.wav"); break;
                case DIGIT7: controller.pressNote("src/sample/music1/ee.wav"); break;
                case DIGIT8: controller.pressNote("src/sample/music1/ff.wav"); break;
                case DIGIT9: controller.pressNote("src/sample/music1/gg.wav"); break;
                case DIGIT0: controller.pressNote("src/sample/music1/hh.wav"); break;
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}


