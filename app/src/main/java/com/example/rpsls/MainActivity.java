package com.example.rpsls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

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
            TextViewResult.setText("IT'S A TIE!");
            TextViewResultPhrase.setText("\"Ouch ... with stone against stone you may break a bone.\"");
            CircleImageViewRock.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 1 || ComputerOption == 4){
            TextViewResult.setText("YOU LOSE!");
            if (ComputerOption == 1){
                TextViewResultPhrase.setText("\"That's a nice wrap for a suck a ugly rock ...\"");
            }else{
                TextViewResultPhrase.setText("\"Spock is vaping rocks tonight baby!\"");
            }
            CircleImageViewRock.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        }else{
            TextViewResult.setText("YOU WIN!");
            if (ComputerOption == 2){
                TextViewResultPhrase.setText("\"Your rock just crushed my scissor ... and my dreams :(\"");
            }else{
                TextViewResultPhrase.setText("\"WOW, YOU PSYCHO! You just crushed my little lizard friend with that rock!\"");
            }
            CircleImageViewRock.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
        }
    }

    public void optionPaper(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 1){
            TextViewResult.setText("IT'S A TIE!");
            TextViewResultPhrase.setText("\"Paper,paper,paper ... are we working for Dunder Mifflin?\"");
            CircleImageViewPaper.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 2 || ComputerOption == 3){
            TextViewResult.setText("YOU LOSE!");
            if (ComputerOption == 2){
                TextViewResultPhrase.setText("\"Chop chop chop ... I'm cutting deep bro.\"");
            }else{
                TextViewResultPhrase.setText("\"Lizard is hungry, got eat some paper ... I guess!?\"");
            }
            CircleImageViewPaper.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        }else{
            TextViewResult.setText("YOU WIN!");
            if (ComputerOption == 4){
                TextViewResultPhrase.setText("\"WHAT? How can paper disproves Spock?\"");
            }else{
                TextViewResultPhrase.setText("\"Take your toilet paper from around my nice rock right now!\"");
            }
            CircleImageViewPaper.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
        }
    }

    public void optionScissor(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 2){
            TextViewResult.setText("IT'S A TIE!");
            TextViewResultPhrase.setText("\"Wait ... are you scissoring me? I'm gonna call the police!\"");
            CircleImageViewScissor.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 0 || ComputerOption == 4){
            TextViewResult.setText("YOU LOSE!");
            if (ComputerOption == 0){
                TextViewResultPhrase.setText("\"ROuCK SMASH !!!.\"");
            }else{
                TextViewResultPhrase.setText("\"Spock is not running with scissors!\"");
            }
            CircleImageViewScissor.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        }else{
            TextViewResult.setText("YOU WIN!");
            if (ComputerOption == 1){
                TextViewResultPhrase.setText("\"Cut my paper into pieces ... this is my last resort.\"");
            }else{
                TextViewResultPhrase.setText("\"Jeez man, you just decapitated a little lizard?\"");
            }
            CircleImageViewScissor.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
        }
    }

    public void optionLizard(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 3){
            TextViewResult.setText("IT'S A TIE!");
            TextViewResultPhrase.setText("\"Look its the Lizard of OZ and Queen Elizardbeth!\"");
            CircleImageViewLizard.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 0 || ComputerOption == 2){
            TextViewResult.setText("YOU LOSE!");
            if (ComputerOption == 0){
                TextViewResultPhrase.setText("\"With great stone comes great crushability.\"");
            }else{
                TextViewResultPhrase.setText("\"Relax man, I just cut the tail, it's gonna grow up again.\"");
            }
            CircleImageViewLizard.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        }else{
            TextViewResult.setText("YOU WIN!");
            if (ComputerOption == 1){
                TextViewResultPhrase.setText("\"Come on, I'm telling the teacher you ate my homework!.\"");
            }else{
                TextViewResultPhrase.setText("\"Congratulations! You just poisoned a geek symbol of our generation.\"");
            }
            CircleImageViewLizard.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
        }
    }

    public void optionSpock(View v){
        this.findAllCircleImageViews();
        ComputerOption = this.optionComputer();
        this.setAllCircleImageViewsTransparent();

        if (ComputerOption == 4){
            TextViewResult.setText("IT'S A TIE!");
            TextViewResultPhrase.setText("\"DOUBLE SPOCK! DO NOT google that!\"");
            CircleImageViewSpock.setCircleBackgroundColor(Color.YELLOW);
            CircleImageViewComputer.setCircleBackgroundColor(Color.YELLOW);
        }else if (ComputerOption == 1 || ComputerOption == 3){
            TextViewResult.setText("YOU LOSE!");
            if (ComputerOption == 1){
                TextViewResultPhrase.setText("\"Technology is never gonna replace the good old Paper!\"");
            }else{
                TextViewResultPhrase.setText("\"Rompopopom rompopopom rompopopom Spock man down.\"");
            }
            CircleImageViewSpock.setCircleBackgroundColor(Color.RED);
            CircleImageViewComputer.setCircleBackgroundColor(Color.GREEN);
            ComputerPoints++;
            TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        }else{
            TextViewResult.setText("YOU WIN!");
            if (ComputerOption == 0){
                TextViewResultPhrase.setText("\"Sometimes life give you rocks, sometimes Spock vaporizes them...\"");
            }else{
                TextViewResultPhrase.setText("\"Spock is in the neighbourhood, hide your scissors, hide your wife.\"");
            }
            CircleImageViewSpock.setCircleBackgroundColor(Color.GREEN);
            CircleImageViewComputer.setCircleBackgroundColor(Color.RED);
            PlayerPoints++;
            TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
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
        TextViewComputerPoints.setText(Integer.toString(ComputerPoints));
        TextViewPlayerPoints.setText(Integer.toString(PlayerPoints));
        setAllCircleImageViewsTransparent();
    }

    public void resetGameButton(View v){
        this.resetGame();
        CircleImageViewComputer = findViewById(R.id.circleImageViewComputer);
        CircleImageViewComputer.setImageResource(R.drawable.interrogation);
    }

}