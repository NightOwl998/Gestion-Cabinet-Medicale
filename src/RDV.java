package sample;

import java.util.Date;

public class RDV {
    private Date dateRdv;
    private  String objetRDV;


    public RDV(Date dateRdv,
               String objetRDV) {
        this.dateRdv = dateRdv;
        this.objetRDV = objetRDV;
    }
    public void modifierDateRdv(Date nouvelleDate){
        this.dateRdv=nouvelleDate;

    }
}
