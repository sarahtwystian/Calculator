package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void plusFunc (View view){
        int[] nums = clickFunction();
        String result = Integer.toString(nums[0]+nums[1]);

        goToActivity2(result);
    }

    public void minusFunc (View view){
        int[] nums = clickFunction();
        String result = Integer.toString(nums[0]-nums[1]);

        goToActivity2(result);
    }

    public void multiplyFunc (View view){
        int[] nums = clickFunction();
        String result = Integer.toString(nums[0]*nums[1]);

        goToActivity2(result);
    }

    public void divideFunc (View view){
        int[] nums = clickFunction();
        String res = Integer.toString(nums[0]/nums[1]);

        goToActivity2(res);
    }

    public int[] clickFunction (){
        EditText num_A = (EditText) findViewById(R.id.num_A);
        EditText num_B = (EditText) findViewById(R.id.num_B);
        int num1 = Integer.parseInt(num_A.getText().toString());
        int num2 = Integer.parseInt(num_B.getText().toString());

        int[] nums = {num1, num2};
        return nums;
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}