package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button note_FF;

    @FXML
    private Button note_HH;

    @FXML
    private Label PianoText;

    @FXML
    private Button note_GG1;

    @FXML
    private Button note_EE1;

    @FXML
    private Button note_CC1;

    @FXML
    private Label label_file;

    @FXML
    private Button note_E1;

    @FXML
    private Button note_C1;

    @FXML
    private Button file_button;

    @FXML
    private Button note_A1;

    @FXML
    private Button note_G1;

    @FXML
    private Button note_CC;

    @FXML
    private Button note_EE;

    @FXML
    private Button note_GG;

    @FXML
    private Button note_HH1;

    @FXML
    private Button note_FF1;

    @FXML
    private Button note_D;

    @FXML
    private Button note_C;

    @FXML
    private Button note_F1;

    @FXML
    private Button note_A;

    @FXML
    private Button note_D1;

    @FXML
    private TextField fileField;

    @FXML
    private Button note_H;

    @FXML
    private Button note_G;

    @FXML
    private Button note_F;

    @FXML
    private Button note_E;

    @FXML
    private Button note_H1;

    @FXML
    private Label error_label;


    public void pressNote(String file) {
        Media music = new Media(new File(file).toURI().toString());
        MediaPlayer player = new MediaPlayer(music);
        player.play();
    }

    public String getFile() {
        return fileField.getText();
    }

    public void playFromFile(String text) throws IOException, InterruptedException {
        FileReader fileReader = new FileReader(text);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            for (String i : scanner.nextLine().split(" ")) {
                switch (i) {
                    case "a":
                        note_A.fire();
                        break;

                    case "c":
                        note_C.fire();
                        break;

                    case "cc":
                        note_CC.fire();
                        break;

                    case "d":
                        note_D.fire();
                        break;

                    case "e":
                        note_E.fire();
                        break;

                    case "ee":
                        note_EE.fire();
                        break;

                    case "f":
                        note_F.fire();
                        break;

                    case "ff":
                        note_FF.fire();
                        break;

                    case "g":
                        note_G.fire();
                        break;

                    case "gg":
                        note_GG.fire();
                        break;

                    case "h":
                        note_H.fire();
                        break;

                    case "hh":
                        note_HH.fire();
                        break;

                    default:
                        error_label.setText("Неверный формат данных");
                }
                Thread.sleep(1000);
            }
        }
        fileReader.close();
    }


    @FXML
    public void initialize() {
        note_A.setOnAction(event -> pressNote("src/sample/music/a.wav"));
        note_C.setOnAction(event -> pressNote("src/sample/music/c.wav"));
        note_CC.setOnAction(event -> pressNote("src/sample/music/cc.wav"));
        note_D.setOnAction(event -> pressNote("src/sample/music/d.wav"));
        note_E.setOnAction(event -> pressNote("src/sample/music/e.wav"));
        note_EE.setOnAction(event -> pressNote("src/sample/music/ee.wav"));
        note_F.setOnAction(event -> pressNote("src/sample/music/f.wav"));
        note_FF.setOnAction(event -> pressNote("src/sample/music/ff.wav"));
        note_G.setOnAction(event -> pressNote("src/sample/music/g.wav"));
        note_GG.setOnAction(event -> pressNote("src/sample/music/gg.wav"));
        note_H.setOnAction(event -> pressNote("src/sample/music/h.wav"));
        note_HH.setOnAction(event -> pressNote("src/sample/music/hh.wav"));
        note_A1.setOnAction(event -> pressNote("src/sample/music1/a.wav"));
        note_C1.setOnAction(event -> pressNote("src/sample/music1/c.wav"));
        note_CC1.setOnAction(event -> pressNote("src/sample/music1/cc.wav"));
        note_D1.setOnAction(event -> pressNote("src/sample/music1/d.wav"));
        note_E1.setOnAction(event -> pressNote("src/sample/music1/e.wav"));
        note_EE1.setOnAction(event -> pressNote("src/sample/music1/ee.wav"));
        note_F1.setOnAction(event -> pressNote("src/sample/music1/f.wav"));
        note_FF1.setOnAction(event -> pressNote("src/sample/music1/ff.wav"));
        note_G1.setOnAction(event -> pressNote("src/sample/music1/g.wav"));
        note_GG1.setOnAction(event -> pressNote("src/sample/music1/gg.wav"));
        note_H1.setOnAction(event -> pressNote("src/sample/music1/h.wav"));
        note_HH1.setOnAction(event -> pressNote("src/sample/music1/hh.wav"));

        file_button.setOnAction(event -> {
            try {
                playFromFile(getFile());
            } catch (FileNotFoundException e) {
                error_label.setText("Файл не найден");
            } catch (InterruptedException e) {
                //e.printStackTrace();

            } catch (IOException e) {
                error_label.setText("Ytdthysq a");
                //e.printStackTrace();
            }
        });
    }
}
