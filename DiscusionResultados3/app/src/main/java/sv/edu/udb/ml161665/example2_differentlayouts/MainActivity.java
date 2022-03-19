package sv.edu.udb.ml161665.example2_differentlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickRelative(View v){
        Intent call = new Intent(this,ConstrainLayoutLogin.class);
        startActivity(call);
    }

}