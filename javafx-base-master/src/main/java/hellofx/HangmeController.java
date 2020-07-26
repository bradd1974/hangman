package hellofx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;

import java.net.URL;
import java.util.ResourceBundle;

public class HangmeController implements Initializable {
/*	
	private static final Font fontLarge = Font.font("Courier New", FontWeight.BOLD, 35);

    @FXML
    private AnchorPane base;

    @FXML
    private Button badButton;

    @FXML
    private Button goodButton;

    @FXML
    private Button newGameButt;
    private Canvas canvas;
    private GraphicsContext gc;
    

    private void resetGame() {
    	gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
    
    @FXML
    void badPressed(ActionEvent event) {
    	gc = canvas.getGraphicsContext2D();
//    	drawHead();
    	drawGallow();

    }
    

    private void drawGallow() {
		// TODO Auto-generated method stub
		gc.beginPath();
        gc.moveTo(31, 60);
        gc.lineTo(60, 31);
        gc.moveTo(30, 30);
        gc.lineTo(150, 30);
        gc.lineTo(150, 60);
        gc.stroke();
    
	}

/*    private void drawHead() {
		// TODO Auto-generated method stub
		Circle head = new Circle(303, 150, 35);
		gc.stroke();
    	
	}
*/
/*
	@FXML
    void goodPressed(ActionEvent event) {
    	gc.setFont(fontLarge);
        gc.setFill(Color.GREEN);
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText("You Won!", Math.round(canvas.getWidth() / 2), Math.round(canvas.getHeight()) / 2);
    	

    }

    @FXML
    void newGamePressed(ActionEvent event) {
    	gc.clearRect(0, 0,  canvas.getWidth(), canvas.getHeight());

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
*/
    private static final Font fontLarge = Font.font("Droid Sans", FontWeight.BOLD, 35);
    private static final Font fontWord = Font.font("Courier New", FontWeight.BOLD, 20);

    @FXML
    BorderPane bdPane;
//    @FXML
//    private LetterTextField txtInput;
//    @FXML
//    private TextField txtEntered;
    @FXML
    private Canvas canvas;
    private GraphicsContext gc;
//    private GameController gameController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
  //      gameController = new GameController();
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(5);
    }
    
    @FXML
    private Button badButton;

    @FXML
    private Button goodButton;

    @FXML
    private Button newGameButt;

/*      txtInput.textProperty().addListener((observable, oldValue, newValue) -> {
            if ("".equalsIgnoreCase(newValue)) {
                return;
            }

            char ch = newValue.charAt(0);
            if (gameController.addChar(ch)) {
                // Update graphic
                int wrongGuesses = gameController.getWrongGuesses();
                drawHangman(wrongGuesses);

            }

            txtInput.clear();
            updateEnteredChars();
            updateWord();
            checkGameOver();
        });

        updateWord();
    }
*/
/*    private void updateWord() {
        gc.setFont(fontWord);
        gc.setFill(Color.BLACK);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText(gameController.getCurrentWord(), 70, canvas.getHeight() - 60);
    }

    private void drawCorrectWord() {
        gc.setFont(fontWord);
        gc.setFill(Color.GREEN);
        gc.setTextAlign(TextAlignment.LEFT);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText(gameController.getMissingChars(), 70, canvas.getHeight() - 60);
    }

    private void checkGameOver() {
        if (gameController.isGameWon()) {
            // Return game won message
            disableGame();
            drawWon();

        } else if (gameController.isGameOver()) {
            // Return game over message
            disableGame();
            drawGameOver();
            drawCorrectWord();
        }
    }
*/
    @FXML
    private void handleNewGame(final ActionEvent event)
    {
        newGamePressed(event);
    }

    private void disableGame() {
 //       txtInput.setDisable(true);
    }

    
    @FXML
    void newGamePressed(ActionEvent event) {
//        gameController.reset();
//        txtEntered.clear();
//        txtInput.setDisable(false);
        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
//        updateWord();
    }
    @FXML
    void goodPressed(ActionEvent event) {
        gc.setFont(fontLarge);
        gc.setFill(Color.GREEN);
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText("You Won!", Math.round(canvas.getWidth() / 2), Math.round(canvas.getHeight()) / 2);
    }

    private void drawGameOver() {
        gc.setFont(fontLarge);
        gc.setFill(Color.RED);
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText("Game Over!", Math.round(canvas.getWidth() / 2), Math.round(canvas.getHeight()) / 2);
    }


    @FXML
    void badPressed(ActionEvent event) {
                drawVerticalGallows();
       
                drawHorizontalGallows();
                drawHead();
                drawBody();
                drawLegs();
                drawArms();
                drawFace();
       
       
    }

    private void drawFace() {
        gc.beginPath();
        gc.moveTo(135, 75);
        gc.lineTo(145, 85);
        gc.moveTo(145, 75);
        gc.lineTo(135, 85);
        gc.moveTo(165, 75);
        gc.lineTo(155, 85);
        gc.moveTo(155, 75);
        gc.lineTo(165, 85);
        gc.stroke();
        gc.strokeArc(135, 95, 30, 30, 50, 80, ArcType.OPEN);
    }

    private void drawArms() {
        gc.beginPath();
        gc.moveTo(120,140);
        gc.lineTo(180,140);
        gc.stroke();
    }

    private void drawLegs() {
        gc.beginPath();
        gc.moveTo(150,180);
        gc.lineTo(120, 220);
        gc.moveTo(150,180);
        gc.lineTo(180, 220);
        gc.stroke();
    }

    private void drawBody() {
        gc.beginPath();
        gc.moveTo(150,110);
        gc.lineTo(150,180);
        gc.stroke();
    }

    private void drawHead() {
        gc.strokeOval(125, 60, 50, 50);
    }

    private void drawHorizontalGallows() {
        gc.beginPath();
        gc.moveTo(31, 60);
        gc.lineTo(60, 31);
        gc.moveTo(30, 30);
        gc.lineTo(150, 30);
        gc.lineTo(150, 60);
        gc.stroke();
    }

    private void drawVerticalGallows() {
        gc.beginPath();
        gc.moveTo(30,30);
        gc.lineTo(30, 300);
        gc.moveTo(0, 300);
        gc.lineTo(60,300);
        gc.stroke();
    }

//    private void updateEnteredChars() {
//        StringBuilder enteredFormatted = new StringBuilder();
//        gameController.getEnteredChars().stream().sorted().forEach(i -> enteredFormatted.append(i).append(","));
//        txtEntered.setText(enteredFormatted.toString().substring(0, enteredFormatted.length() - 1));
//    }
}
