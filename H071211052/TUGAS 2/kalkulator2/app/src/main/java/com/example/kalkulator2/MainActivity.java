package com.example.kalkulator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputText, outputText;

    private String input, output, newOutput;

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSubs, btnMultiply, btnDivide,
            btnPoint, btnPercent, btnPower, btnClear, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.addition_btn);
        btnSubs = findViewById(R.id.substraction_btn);
        btnMultiply = findViewById(R.id.multiply_btn);
        btnDivide = findViewById(R.id.division_btn);
        btnPoint = findViewById(R.id.point_btn);
        btnPercent = findViewById(R.id.percent_btn);
        btnPower = findViewById(R.id.power_btn);
        btnClear = findViewById(R.id.clear_btn);
        btnEqual = findViewById(R.id.equal_btn);
    }
    public void onButtonClicked(View view){

        Button button = (Button) view;
        String data = button.getText().toString();

        switch (data){
            case "C":
                input = null;
                output = null;
                newOutput = null;
                outputText.setText("");
                break;

            case "^":
                solve();
                input +="^";
                break;

            case "*":
                solve();
                input +="*";
                break;

            case "=":
                solve();
                break;

            case "%":
                input +="%";
                double d = Double.parseDouble(inputText.getText().toString()) / 100;
                outputText.setText(String.valueOf(d));
                break;

            default:
                if (input == null){
                    input = "";
                }
                if (data.equals("+") || data.equals("-") || data.equals("/")){
                    solve();
                }
                input += data;
        }
        inputText.setText(input);
    }
    private void solve(){
        if(input.split("\\+").length == 2){
            String numbers[] = input.split("\\+");
            try{
                double d = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                newOutput = cutDecimal(output);
                outputText.setText(newOutput);
                input = d +"";

            } catch(Exception e) {
                outputText.setError(e.getMessage().toString());
            }
        }
        if(input.split("\\*").length == 2){
            String numbers[] = input.split("\\*");
            try{
                double d = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                newOutput = cutDecimal(output);
                outputText.setText(newOutput);
                input = d +"";

            } catch(Exception e) {
                outputText.setError(e.getMessage().toString());
            }
        }
        if(input.split("\\/").length == 2){
            String numbers[] = input.split("\\/");
            try{
                double d = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                newOutput = cutDecimal(output);
                outputText.setText(newOutput);
                input = d +"";

            } catch(Exception e) {
                outputText.setError(e.getMessage().toString());
            }
        }
        if(input.split("\\^").length == 2){
            String numbers[] = input.split("\\^");
            try{
                double d = Math.pow(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
                output = Double.toString(d);
                newOutput = cutDecimal(output);
                outputText.setText(newOutput);
                input = d +"";

            } catch(Exception e) {
                outputText.setError(e.getMessage().toString());
            }
        }
        if(input.split("\\-").length == 2){
            String numbers[] = input.split("\\-");
            try{
                if (Double.parseDouble(numbers[0]) < Double.parseDouble(numbers[1])){
                    double d = Double.parseDouble(numbers[1]) - Double.parseDouble(numbers[0]);
                    output = Double.toString(d);
                    newOutput = cutDecimal(output);
                    outputText.setText("-" + newOutput);
                    input = d +"";
                } else {
                    double d = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                    output = Double.toString(d);
                    newOutput = cutDecimal(output);
                    outputText.setText(newOutput);
                    input = d + "";
                }

            } catch(Exception e) {
                outputText.setError(e.getMessage().toString());
            }
        }
    }


    private String cutDecimal(String number) {
        String n [] = number.split("\\.");
        if(n.length >1){
            if (n[1].equals("0")){
                number = n[0];
            }
        }
        return number;
    }
}