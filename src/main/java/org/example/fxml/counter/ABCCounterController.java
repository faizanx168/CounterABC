package org.example.fxml.counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import org.example.service.CounterService;
import org.example.utility.DigitalUtility;

import java.util.ArrayList;
import java.util.List;

public class ABCCounterController {
    @FXML
    private FlowPane fpCounter;
    @FXML
    private Label lblTitle;

    @FXML
    private ToggleGroup tgHighlight;

    @FXML
    private ToggleGroup tgMode;

    @FXML
    void onActionAll(ActionEvent event) {
        RadioButton radioButton = (RadioButton) tgMode.getSelectedToggle();
        RadioButton rbHighlight = (RadioButton) tgHighlight.getSelectedToggle();
        drawCount(radioButton,rbHighlight);
    }
    private void drawCount(RadioButton radioButton, RadioButton rbHighlight) {
        String text = radioButton.getText();
        char[] modes = radioButton.getUserData().toString().toCharArray();
        System.out.println(modes);
        List<String> listAbc = new ArrayList<>();
        CounterService.generate(listAbc::add, modes);
        lblTitle.setText(text);
        var children = fpCounter.getChildren();
        children.clear();
        for (var abc : listAbc
        ) {
            var label = new Label(abc);
            boolean isVowel = DigitalUtility.isVowel(abc);
            String highLight = rbHighlight.getText();
            label.getStyleClass().add("abc");
            if (highLight.equals("None")) {
                System.out.println(highLight);
                label.getStyleClass().add("abc");
            }
            else if (highLight.equals("Both")) {
                if (isVowel)
                    label.getStyleClass().add("vowel");
                else
                    label.getStyleClass().add("consonant");
            } else {
                if (highLight.equals("Vowel") && isVowel) {
                    label.getStyleClass().add("vowel");
                } else if (highLight.equals("Consonant") && !isVowel) {
                    label.getStyleClass().add("consonant");
                }}
                children.add(label);
            }
        }
    }


