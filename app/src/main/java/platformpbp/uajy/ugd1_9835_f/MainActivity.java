/**/package platformpbp.uajy.ugd1_9835_f;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb;
    public Button btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuSelect();
    }

    public void menuSelect(){
        btnSelect= findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String menu="";
                try {
                    RadioGroup radioGroup= findViewById(R.id.radioGroup);
                    int rbId= radioGroup.getCheckedRadioButtonId();
                    rb= findViewById(rbId);
                    menu=rb.getText().toString();
                }catch(NullPointerException e){}

                if(menu.equals("Profil")) Profile();
                else if(menu.equals("Kalkulator")) Kalkulator();
            }
        });
    }

    public void Profile(){
        Intent profile=new Intent(this, Profile.class);
        startActivity(profile);
    }

    public void Kalkulator(){
        Intent calc=new Intent(this, Kalkulator.class);
        startActivity(calc);
    }
}