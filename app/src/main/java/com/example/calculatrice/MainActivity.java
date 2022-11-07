package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    private TextView ecran_1, ecran_2;
    private MaterialButton btnResetScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecran_1 = findViewById(R.id.ecran_1);
        ecran_2 = findViewById(R.id.ecran_2);
        btnResetScreen = findViewById(R.id.boutonResetScreen);
        btnResetScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (initScreen()) {
                    ecran_1.setText("0");
                } else {
                    int taille = ecran_1.getText().toString().length();
                    if (taille > 1)
                        ecran_1.setText(ecran_1.getText().toString().substring(0, taille - 1));
                    else{
                        ecran_1.setTextSize(ecran_1.getTextSize());
                        ecran_2.setTextSize(ecran_1.getTextSize());
                        ecran_1.setText("0");
                        ecran_2.setText("");
                    }
                }
                String finalResult = getResult(ecran_1.getText().toString());
                if(!finalResult.equals("Err")){
                    ecran_2.setText(finalResult);
                }
            }
        });
        btnResetScreen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                ecran_1.setTextSize(100);
                ecran_2.setTextSize(100);
                ecran_1.setText("0");
                ecran_2.setText("");
                return true;
            }
        });
    }


    public void buttonZero(View view) {initScreen();
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());
        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonOne(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());
        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }

    public void buttonTwo(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());
        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonThree(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonFour(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonFive(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonSix(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonSeven(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonHeigth(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonNine(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }

    public void buttonPoint(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }


    public void buttonPlusOrMinus(View view) {
        int taille = ecran_1.getText().toString().length();
        if (ecran_1.getText().toString().charAt(0) != '-') {
            initScreen();
            ecran_1.setText("-".concat(ecran_1.getText().toString()));
        } else {
            ecran_1.setText(ecran_1.getText().toString().substring(1, taille));
            if (ecran_1.getText().toString().length() == 0) {
                ecran_1.setText("0");
            }
        }
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }










    public void buttonMinus(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonModulo(View view) {
    }
    public void buttonDivided(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonMultiplier(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat("*"));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }
    public void buttonAdd(View view) {
        initScreen();
        MaterialButton button =(MaterialButton) view;
        ecran_1.setText(ecran_1.getText().toString().concat(button.getText().toString()));
        String finalResult = getResult(ecran_1.getText().toString());

        if(!finalResult.equals("Err")){
            ecran_2.setText(finalResult);
        }
    }

    public void buttonEqual(View view) {
        if (getResult(ecran_1.getText().toString()).equals("Err")) {
            ecran_2.setTextColor(Color.RED);
            ecran_2.setText("ERROR");
        } else ecran_1.setText("0");
    }

    public boolean initScreen() {
        if (ecran_1.getText().toString().equals("0")) {
            ecran_1.setText("");
            return true;
        } else {
            return false;
        }
    }
    public String getResult(String data){
        ecran_2.setTextColor(Color.GREEN);
        Log.i("MainActivity_43f","data : "+data);
        try{
            Context context  = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult =  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
            }
            Log.i("MainActivity_43dsef","finalResult : "+finalResult);
            return finalResult;
        }catch (Exception e){
            return "Err";
        }
    }


}