package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Controller {
    public void ConsulterRdvButtonClicked() throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("PageConsulterRdv.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 610);
        Stage stage = new Stage();
        stage.setTitle("Consulter Rdv");
        stage.setScene(scene);
        stage.show();

    }
    public void AjouterRdvbuttonClicked() throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("PageAjouterRdv.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 850, 610);
        Stage stage = new Stage();
        stage.setTitle("Ajouter Rdv");
        stage.setScene(scene);
        stage.show();


    }
    public void AjouterPatientuttonClicked() throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("PageAjouterPatient.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 610);
        Stage stage = new Stage();
        stage.setTitle("Ajouter Patient");
        stage.setScene(scene);
        stage.show();


    }


}
