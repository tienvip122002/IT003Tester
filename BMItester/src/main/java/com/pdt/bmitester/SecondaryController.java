package com.pdt.bmitester;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        int a = 10;
<<<<<<< HEAD
        if (a>0)
=======
        if(a>0 && a%2 == 0)
>>>>>>> main
            App.setRoot("primary");
    }
}