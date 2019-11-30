package edu.citytech.games;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import java.util.List;
import com.citytech.service.Connect4Service;
import javafx.event.ActionEvent;

public class GamesController {

	@FXML
    private FlowPane fpPane;
	
	@FXML
    private Circle circle0;
	
    @FXML
    private Circle circle1;

    @FXML
    private Circle circle2;

    @FXML
    private Circle circle;

    @FXML
    private Circle circle4;

    @FXML
    private Circle circle5;

    @FXML
    private Circle circle6;

    @FXML
    private Circle circle7;

    @FXML
    private Circle circle8;

    @FXML
    private Circle circle9;

    @FXML
    private Circle circle10;

    @FXML
    private Circle circle11;

    @FXML
    private Circle circle12;

    @FXML
    private Circle circle13;

    @FXML
    private Circle circle14;

    @FXML
    private Circle circle15;

    @FXML
    private Circle circle16;

    @FXML
    private Circle circle17;

    @FXML
    private Circle circle18;

    @FXML
    private Circle circle19;

    @FXML
    private Circle circle20;

    @FXML
    private Circle circle21;

    @FXML
    private Circle circle22;

    @FXML
    private Circle circle23;

    @FXML
    private Circle circle24;

    @FXML
    private Circle circle25;

    @FXML
    private Circle circle26;

    @FXML
    private Circle circle27;

    @FXML
    private Circle circle28;

    @FXML
    private Circle circle29;

    @FXML
    private Circle circle30;

    @FXML
    private Circle circle31;

    @FXML
    private Circle circle32;

    @FXML
    private Circle circle33;

    @FXML
    private Circle circle34;

    @FXML
    private Circle circle35;

    @FXML
    private Circle circle36;

    @FXML
    private Circle circle37;

    @FXML
    private Circle circle38;

    @FXML
    private Circle circle39;

    @FXML
    private Circle circle40;

    @FXML
    private Circle circle41;
   
    @FXML
    private Button btnReset;

    @FXML
    private Label txtLabel;
    
    
    private boolean isRed = false;
    
    
    @FXML
	void onMouseClicked(MouseEvent event) {
		Circle circle = (Circle) event.getSource();

		if (circle.getFill() != Color.WHITE) {
			txtLabel.setText("This is not your turn!");
			return;
		}

		List<Node> nodes = fpPane.getChildren();


		String[] rawMoves = nodes.stream().map(x -> {
			Circle cir = (Circle) x;
			Paint fillColor = cir.getFill();
			return fillColor == Color.WHITE ? "?" : fillColor == Color.RED ? "X" : "O";
		}).toArray(String[]::new);
		
		int id = Integer.parseInt(circle.getId().replace("circle", ""));
		int validMove = Connect4Service.getValidCellMoves(rawMoves, id);

		Circle validCircle = (Circle) nodes.get(validMove);
		Color color = isRed ? Color.RED : Color.YELLOW;
		
		validCircle.setFill(color);
		validCircle.setDisable(true);
		isRed = !isRed;
		
		rawMoves = nodes.stream().map(x -> {
			Circle cir = (Circle) x;
			Paint fillColor = cir.getFill();
			return fillColor == Color.WHITE ? "?" : fillColor == Color.RED ? "X" : "O";
		}).toArray(String[]::new);

		int[] winnerMoves = Connect4Service.getWinner(rawMoves);
		if (winnerMoves.length != 0) {
			txtLabel.setText("You won!");
			fpPane.getChildren().forEach(x -> {
				Circle cir = (Circle) x;
				cir.setDisable(true);
			});
		}
		
	}

    
	@FXML
	void reset(ActionEvent event) {
		fpPane.getChildren().forEach(x -> {
			Circle circle = (Circle) x;

			if (circle.isDisabled())
				circle.setDisable(false);
			circle.setFill(Color.WHITE);
		});

		txtLabel.setText("");
	}
}
