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

    public void onClickFrame(View v){
        Intent call = new Intent(this,example_frame_layout.class);
        startActivity(call);
    }

    public void onClickLinear(View v){
        Intent call = new Intent(this,example_linear_layout.class);
        startActivity(call);
    }

    public void onClickRelative(View v){
        Intent call = new Intent(this,example_relative_layout.class);
        startActivity(call);
    }

    public void onClickTable(View v){
        Intent call = new Intent(this,example_table_layout.class);
        startActivity(call);
    }

    public void onClickGrid(View v){
        Intent call = new Intent(this,example_grid_layout.class);
        startActivity(call);
    }
}