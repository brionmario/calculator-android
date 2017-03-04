package com.apareciumlabs.brionsilva.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    TextView operationTV,answerTV;
    Button clearBtn,plusBtn,minusBtn,divisionBtn,multiplyBtn,
            onebtn,twoBtn,threeBtn,fourBtn,fiveBtn,sixBtn,sevenBtn,eightBtn,nineBtn,equalBtn,dotBtn,zeroBtn;
    String clickedButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //initializing the display area
        operationTV = (TextView) findViewById(R.id.operationTextView);
        answerTV = (TextView) findViewById(R.id.answerTextView);

        //initialising the utility buttons
        clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(this);

        equalBtn = (Button) findViewById(R.id.equalBtn);
        equalBtn.setOnClickListener(this);

        dotBtn = (Button) findViewById(R.id.dotBtn);
        dotBtn.setOnClickListener(this);

        //initialising the operation buttons
        plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(this);

        minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(this);

        divisionBtn = (Button) findViewById(R.id.divisionBtn);
        divisionBtn.setOnClickListener(this);

        multiplyBtn = (Button) findViewById(R.id.multiBtn);
        multiplyBtn.setOnClickListener(this);

        //initialising number pad
        onebtn = (Button) findViewById(R.id.oneBtn);
        onebtn.setOnClickListener(this);

        twoBtn = (Button) findViewById(R.id.twoBtn);
        twoBtn.setOnClickListener(this);

        threeBtn = (Button) findViewById(R.id.threeBtn);
        threeBtn.setOnClickListener(this);

        fourBtn = (Button) findViewById(R.id.fourBtn);
        fourBtn.setOnClickListener(this);

        fiveBtn = (Button) findViewById(R.id.fiveBtn);
        fiveBtn.setOnClickListener(this);

        sixBtn = (Button) findViewById(R.id.sixBtn);
        sixBtn.setOnClickListener(this);

        sevenBtn = (Button) findViewById(R.id.sevenBtn);
        sevenBtn.setOnClickListener(this);

        eightBtn = (Button) findViewById(R.id.eightBtn);
        eightBtn.setOnClickListener(this);

        nineBtn = (Button) findViewById(R.id.nineBtn);
        nineBtn.setOnClickListener(this);

        zeroBtn = (Button) findViewById(R.id.zeroBtn);
        zeroBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch(view.getId()){
            //numpad
            case R.id.oneBtn:{
                operationTV.append("1");
                break;
            }
            case R.id.twoBtn:{
                operationTV.append("2");
                break;
            }
            case R.id.threeBtn:{
                operationTV.append("3");
                break;
            }
            case R.id.fourBtn:{
                operationTV.append("4");
                break;
            }
            case R.id.fiveBtn:{
                operationTV.append("5");
                break;
            }
            case R.id.sixBtn:{
                operationTV.append("6");
                break;
            }
            case R.id.sevenBtn:{
                operationTV.append("7");
                break;
            }
            case R.id.eightBtn:{
                operationTV.append("8");
                break;
            }
            case R.id.nineBtn:{
                operationTV.append("9");
                break;
            }
            case R.id.zeroBtn:{
                operationTV.append("0");
                break;
            }

            //utility buttons
            case R.id.clearBtn:{
                operationTV.setText(null);
                answerTV.setText(null);
                break;
            }
            case R.id.dotBtn:{
                operationTV.append(".");
                break;
            }
            case R.id.equalBtn:{

                if(clickedButton.equals("+")) {
                    String calculation = operationTV.getText().toString();
                    String calcArray[] = calculation.split("\\+",-1);

                    Double firstNumber = Double.parseDouble(calcArray[0]);
                    Double secondNumber = Double.parseDouble(calcArray[1]);

                    Double answer = firstNumber + secondNumber;
                    answerTV.setText(answer.toString());

                } else if(clickedButton.equals("-")) {
                    String calculation = operationTV.getText().toString();
                    String calcArray[] = calculation.split("-",-1);

                    Double firstNumber = Double.parseDouble(calcArray[0]);
                    Double secondNumber = Double.parseDouble(calcArray[1]);

                    Double answer = firstNumber-secondNumber;
                    System.out.println(answer);
                    answerTV.setText(answer.toString());

                } else if(clickedButton.equals("/")) {
                    String calculation = operationTV.getText().toString();
                    String calcArray[] = calculation.split("/",-1);

                    Double firstNumber = Double.parseDouble(calcArray[0]);
                    Double secondNumber = Double.parseDouble(calcArray[1]);

                    Double answer = firstNumber/secondNumber;
                    answerTV.setText(answer.toString());

                } else if(clickedButton.equals("x")) {
                    String calculation = operationTV.getText().toString();
                    String calcArray[] = calculation.split("x",-1);

                    Double firstNumber = Double.parseDouble(calcArray[0]);
                    Double secondNumber = Double.parseDouble(calcArray[1]);

                    Double answer = firstNumber*secondNumber;
                    answerTV.setText(answer.toString());

                }
                //clears the cuurent calcution
                operationTV.setText(null);

                break;
            }

            //Operation buttons
            case R.id.plusBtn:{
                operationTV.append("+");
                clickedButton = "+";
                break;
            }
            case R.id.minusBtn:{
                operationTV.append("-");
                clickedButton = "-";
                break;
            }
            case R.id.multiBtn:{
                operationTV.append("x");
                clickedButton = "x";
                break;
            }
            case R.id.divisionBtn:{
                operationTV.append("/");
                clickedButton = "/";
                break;
            }
        }

    }
}
