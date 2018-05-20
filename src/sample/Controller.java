package sample;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import sun.plugin.com.Utils;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button note_D;

    @FXML
    private Button note_C;

    @FXML
    private Button note_A;

    @FXML
    private Button note_CC;

    @FXML
    private Button note_EE;

    @FXML
    private Button note_FF;

    @FXML
    private Button note_GG;

    @FXML
    private Button note_HH;

    @FXML
    private Button note_H;

    @FXML
    private Button note_G;

    @FXML
    private Button note_F;

    @FXML
    private Button note_E;

    public void pressNote(String file){
        Media music = new Media(new File(file).toURI().toString());
        MediaPlayer player = new MediaPlayer(music);
        player.play();
    }

    @FXML
    void initialize() {
        note_A.setOnAction(event ->  pressNote("src/sample/music/a.wav"));
        note_C.setOnAction(event ->  pressNote("src/sample/music/c.wav"));
        note_CC.setOnAction(event ->  pressNote("src/sample/music/cc.wav"));
        note_D.setOnAction(event ->  pressNote("src/sample/music/d.wav"));
        note_E.setOnAction(event ->  pressNote("src/sample/music/e.wav"));
        note_EE.setOnAction(event ->  pressNote("src/sample/music/ee.wav"));
        note_F.setOnAction(event ->  pressNote("src/sample/music/f.wav"));
        note_FF.setOnAction(event ->  pressNote("src/sample/music/ff.wav"));
        note_G.setOnAction(event ->  pressNote("src/sample/music/g.wav"));
        note_GG.setOnAction(event ->  pressNote("src/sample/music/gg.wav"));
        note_H.setOnAction(event ->  pressNote("src/sample/music/h.wav"));
        note_HH.setOnAction(event ->  pressNote("src/sample/music/hh.wav"));
    }
}
