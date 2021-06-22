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


public class ControllerConsulterRdv {

    @FXML
    private DatePicker dateChosie ;


    /* Asma use this attributes ,they contain the values of the attributs*/


    private LocalDate dateChoice;


    public void ButtonConsulterClicked(ActionEvent event) throws Exception {

        dateChoice= this. dateChosie.getValue();
            System.out.println(dateChoice);





        //Asma here u can add ur code.





        //here on affiche le mssg que l'element est enregistré et on ferme la fenetre


    }




}
