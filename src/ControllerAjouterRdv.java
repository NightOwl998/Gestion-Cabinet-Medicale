package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;


public class ControllerAjouterRdv {
    @FXML
    private ChoiceBox patient ;
    @FXML
    private DatePicker dateChoosed ;
    @FXML
    private TextArea objetField ;
    @FXML
    private TextField heureField ;

    /* Asma use this attributes ,they contain the values of the attributs*/
    private String patientChoise;

    private LocalDate dateChoice;
    private String objetValeur;
    private String heureValeur;

    public void buttonValiderClicked(ActionEvent event) throws Exception {
        patientChoise=(String) this.patient.getValue();
        System.out.println(((String) this.patient.getValue()));

        dateChoice= this.dateChoosed.getValue();
            System.out.println(dateChoice);



        if (!this.objetField.getText().isEmpty())
        {    objetValeur=this.objetField.getText();
            System.out.println(this.objetField.getText());
        }
        if (!this.heureField.getText().isEmpty())
        {    heureValeur=this.heureField.getText();
            System.out.println(this.heureField.getText());
        }

        //Asma here u can add ur code.





        //here on affiche le mssg que l'element est enregistré et on ferme la fenetre
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("PageElementAjouterAvecSucees.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Ajouter Patient");
        stage.setScene(scene);
        stage.show();

    }




}
