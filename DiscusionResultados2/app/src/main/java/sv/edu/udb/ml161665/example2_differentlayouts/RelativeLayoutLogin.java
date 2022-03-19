package sv.edu.udb.ml161665.example2_differentlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelativeLayoutLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_login);
    }
    public void finishActivity(View v){
        finish();
    }
}