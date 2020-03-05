package com.example.rpsls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {
    int ComputerOption;
    int PlayerPoints = 0;
    int ComputerPoints = 0;
    ImageButton ImageButtonRules;
    CircleImageView CircleImageViewRock;
    CircleImageView CircleImageViewPaper;
    CircleImageView CircleImageViewScissor;
    CircleImageView CircleImageViewLizard;
    CircleImageView CircleImageViewSpock;
    CircleImageView CircleImageViewComputer;
    TextView TextViewResult;
    TextView TextViewPlayerPoints;
    TextView TextViewComputerPoints;
    TextView TextViewResultPhrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButtonRules = findViewById(R.id.imageButtonRules);

        ImageButtonRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RulesActivity.class);
                startActivity(i);
            }
        });

    }

    public void findAllCircleImageViews(){
        CircleImageViewRock = findViewById(R.id.circleImageViewRock);
        CircleImageViewPaper = findViewById(R.id.circleImageViewPaper);
        CircleImageViewScissor = findViewById(R.id.circleImageViewScissor);
        CircleImageViewLizard = findViewById(R.id.circleImageViewLizard);
        CircleImageViewSpock = findViewById(R.id.circleImageViewSpock);
        TextViewResult = findViewById(R.id.textViewResult);
        TextViewComputerPoints  = findViewById(R.id.textViewComputerPoints);
        TextViewPlayerPoints = findViewById(R.id.textViewPlayerPoints);
        TextViewResultPhrase = findViewById(R.id.textViewResultPhrase);
    }

    public void setAllCircleImageViewsTransparent(){
        CircleImageViewRock.setCircleBackgroundColor(Color.argb(0,0,0,0));
        CircleImageViewPaper.setCircleBackgroundColor(Color.argb(0,0,0,0));
        CircleImageViewScissor.setCircleBackgroundColor(Color.argb(0,0,0,0));
        CircleImageViewLizard.setCircleBackgroundColor(Color.argb(0,0,0,0));
        CircleImageViewSpock.setCircleBackgroundColor(Color.argb(0,0,0,0));
        CircleImageViewComputer.setCircleBackgroundColor(Color.argb(0,0,0,0));
    }


    public void optionRock(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 0){
            TextViewResult.setText(R.string.textResultItsTie);
            TextViewResultPhrase.setText(R.string.textResultPhraseRockTie);
            CircleImageViewRock.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 1 || ComputerOption == 4){
            TextViewResult.setText(R.string.textResultYouLose);
            if (ComputerOption == 1){
                TextViewResultPhrase.setText(R.string.textResultPhraseRockLosePaper);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseRockLoseSpock);
            }
            CircleImageViewRock.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        }else{
            TextViewResult.setText(R.string.textResultYouWin);
            if (ComputerOption == 2){
                TextViewResultPhrase.setText(R.string.textResultPhraseRockWinScissor);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseRockWinLizard);
            }
            CircleImageViewRock.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        }
    }

    public void optionPaper(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 1){
            TextViewResult.setText(R.string.textResultItsTie);
            TextViewResultPhrase.setText(R.string.textResultPhrasePaperTie);
            CircleImageViewPaper.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 2 || ComputerOption == 3){
            TextViewResult.setText(R.string.textResultYouLose);
            if (ComputerOption == 2){
                TextViewResultPhrase.setText(R.string.textResultPhrasePaperLoseScissor);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhrasePaperLoseLizard);
            }
            CircleImageViewPaper.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        }else{
            TextViewResult.setText(R.string.textResultYouWin);
            if (ComputerOption == 4){
                TextViewResultPhrase.setText(R.string.textResultPhrasePaperWinSpock);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhrasePaperWinRock);
            }
            CircleImageViewPaper.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        }
    }

    public void optionScissor(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 2){
            TextViewResult.setText(R.string.textResultItsTie);
            TextViewResultPhrase.setText(R.string.textResultPhraseScissorTie);
            CircleImageViewScissor.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 0 || ComputerOption == 4){
            TextViewResult.setText(R.string.textResultYouLose);
            if (ComputerOption == 0){
                TextViewResultPhrase.setText(R.string.textResultPhraseScissorLoseScissor);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseScissorLoseSpock);
            }
            CircleImageViewScissor.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        }else{
            TextViewResult.setText(R.string.textResultYouWin);
            if (ComputerOption == 1){
                TextViewResultPhrase.setText(R.string.textResultPhraseScissorWinPaper);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseScissorWinLizard);
            }
            CircleImageViewScissor.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        }
    }

    public void optionLizard(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 3){
            TextViewResult.setText(R.string.textResultItsTie);
            TextViewResultPhrase.setText(R.string.textResultPhraseLizardTie);
            CircleImageViewLizard.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 0 || ComputerOption == 2){
            TextViewResult.setText(R.string.textResultYouLose);
            if (ComputerOption == 0){
                TextViewResultPhrase.setText(R.string.textResultPhraseLizardLoseRock);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseLizardLoseScissor);
            }
            CircleImageViewLizard.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        }else{
            TextViewResult.setText(R.string.textResultYouWin);
            if (ComputerOption == 1){
                TextViewResultPhrase.setText(R.string.textResultPhraseLizardWinPaper);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseLizardWinSpock);
            }
            CircleImageViewLizard.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        }
    }

    public void optionSpock(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 4){
            TextViewResult.setText(R.string.textResultItsTie);
            TextViewResultPhrase.setText(R.string.textResultPhraseSpockTie);
            CircleImageViewSpock.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 1 || ComputerOption == 3){
            TextViewResult.setText(R.string.textResultYouLose);
            if (ComputerOption == 1){
                TextViewResultPhrase.setText(R.string.textResultPhraseSpockLosePaper);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseSpockLoseLizard);
            }
            CircleImageViewSpock.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        }else{
            TextViewResult.setText(R.string.textResultYouWin);
            if (ComputerOption == 0){
                TextViewResultPhrase.setText(R.string.textResultPhraseSpockWinRock);
            }else{
                TextViewResultPhrase.setText(R.string.textResultPhraseSpockWinScissor);
            }
            CircleImageViewSpock.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        }
    }

    public int optionComputer(){
        CircleImageViewComputer = findViewById(R.id.circleImageViewComputer);

        int opt = new Random().nextInt(5);
        switch(opt){
            case 0:
                CircleImageViewComputer.setImageResource(R.drawable.rock);
                break;
            case 1:
                CircleImageViewComputer.setImageResource(R.drawable.paper);
                break;
            case 2:
                CircleImageViewComputer.setImageResource(R.drawable.scissor);
                break;
            case 3:
                CircleImageViewComputer.setImageResource(R.drawable.lizard);
                break;
            case 4:
                CircleImageViewComputer.setImageResource(R.drawable.spock);
                break;
        }
        return opt;
    }


    public void resetGame(){
        ComputerPoints = 0;
        PlayerPoints = 0;
        TextViewComputerPoints.setText(String.format(Locale.getDefault(), "%d", ComputerPoints));
        TextViewPlayerPoints.setText(String.format(Locale.getDefault(), "%d", PlayerPoints));
        TextViewResult.setText(R.string.textResult);
        TextViewResultPhrase.setText("");
        setAllCircleImageViewsTransparent();
    }

    public void resetGameButton(View v){
        this.resetGame();
        CircleImageViewComputer = findViewById(R.id.circleImageViewComputer);
        CircleImageViewComputer.setImageResource(R.drawable.interrogation);
    }

}