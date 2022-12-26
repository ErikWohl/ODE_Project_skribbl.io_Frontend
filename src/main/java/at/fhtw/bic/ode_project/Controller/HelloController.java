package at.fhtw.bic.ode_project.Controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Canvas canvas;
    @FXML
    private TextArea textOutput;
    @FXML
    private TextField textInput;

    @FXML
    protected void onGraphicClearButtonClick() {
        var gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
        System.out.printf("Button was clicked!\n");
    }

    @FXML
    protected void onTextClearButtonClick() {
        textOutput.clear();
        System.out.printf("Button was clicked!\n");
    }

    @FXML
    protected void onStrokeIncreaseButtonClick() {
        canvas.getGraphicsContext2D().setLineWidth(10);
        System.out.printf("Stroke width is 10!\n");
    }

    @FXML
    protected void onStrokeDecreaseButtonClick() {
        canvas.getGraphicsContext2D().setLineWidth(1);
        System.out.printf("Stroke width is 1!\n");
    }

    @FXML
    protected void onEnterText() {
        textOutput.setText(textOutput.getText() + "\n" + textInput.getText());
        textInput.clear();
    }
    public HelloController() {

    }

    @FXML
    private void initialize() {

    }
}