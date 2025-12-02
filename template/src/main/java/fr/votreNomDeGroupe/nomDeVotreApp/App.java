package fr.VotreNomDeGroupe.NomDeVotreApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

        @Override
        public void start(Stage stage) throws Exception {
                BorderPane test = new BorderPane();
                test.setCenter(new Text("Si ça s'affiche, c'est que ça marche"));
                Scene scene = new Scene(test); 
                stage.setScene(scene);
                stage.show();
        }
        public static void main(String[] args) {
                launch();
        }
}