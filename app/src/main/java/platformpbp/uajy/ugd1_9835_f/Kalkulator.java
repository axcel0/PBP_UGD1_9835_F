package platformpbp.uajy.ugd1_9835_f;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Kalkulator extends AppCompatActivity {
    private String operator="";
    public EditText input1,input2;
    double result = 0;

    double in1=0,in2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }

    public void btnCheck(View v) {
        int btnId = v.getId();
        Button btn = findViewById(btnId);
        operator = btn.getText().toString();

        try{
            input1= findViewById(R.id.input1);
            input2= findViewById(R.id.input2);
            in1=Double.parseDouble(input1.getText().toString());
            in2=Double.parseDouble(input2.getText().toString());
            result();
        }catch (NumberFormatException e){}
    }

    public void result(){
        try {
            switch(operator){
                case "+":  result=in1+in2;break;
                case "-":  result=in1-in2;break;
                case "*":  result=in1*in2;break;
                case "/":  result=in1/in2;break;
            }
            TextView tv= findViewById(R.id.tvResult);
            tv.setText(Double.toString(result));
        }catch (NullPointerException e){}
    }

    public void back(View back){
        Intent b=new Intent(Kalkulator.this, MainActivity.class);
        startActivity(b);
    }
}