package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import sample.BinaryCalculator;

public class Controller {
    @FXML private Button CalcButton;
    @FXML TextField Bit1, Bit2, Bit3, Bit4, Bit5, Bit6, Bit7, Bit8;
    @FXML Label ResultLabel;

    public void initialize() {
        CalcButton.setOnAction((event) -> {
            int bit1 = Integer.parseInt(Bit1.getText());
            int bit2 = Integer.parseInt(Bit2.getText());
            int bit3 = Integer.parseInt(Bit3.getText());
            int bit4 = Integer.parseInt(Bit4.getText());
            int bit5 = Integer.parseInt(Bit5.getText());
            int bit6 = Integer.parseInt(Bit6.getText());
            int bit7 = Integer.parseInt(Bit7.getText());
            int bit8 = Integer.parseInt(Bit8.getText());

            BinaryCalculator.setBit1(bit1);
            BinaryCalculator.setBit2(bit2);
            BinaryCalculator.setBit3(bit3);
            BinaryCalculator.setBit4(bit4);
            BinaryCalculator.setBit5(bit5);
            BinaryCalculator.setBit6(bit6);
            BinaryCalculator.setBit7(bit7);
            BinaryCalculator.setBit8(bit8);

            ResultLabel.setText(BinaryCalculator.getTotal());


        });
    }
}
