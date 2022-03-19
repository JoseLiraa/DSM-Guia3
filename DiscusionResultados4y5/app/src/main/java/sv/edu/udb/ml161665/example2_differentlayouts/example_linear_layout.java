package sv.edu.udb.ml161665.example2_differentlayouts;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class example_linear_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_linear_layout);
    }

    public void finishActivity(View v){
        finish();
    }
}