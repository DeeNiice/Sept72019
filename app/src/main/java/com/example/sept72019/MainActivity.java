package com.example.sept72019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sept72019", "onCreate has executed..");
    }

    protected void onStart(){
        super.onStart();
        Log.d("sept72019", "onStart has executed..");
    }

    protected void onResume(){
        super.onResume();
        Log.d("sept72019", "onResume has executed..");
    }

    protected void onPause(){
        super.onPause();
        Log.d("sept72019", "onPause has executed..");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("sept72019", "onDestroy has executed..");
    }

    protected void onStop(){
        super.onStop();
        Log.d("sept72019", "onStop has executed..");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("sept72019", "onRestart has executed..");
    }

    public void displayMsg(View v){
      // Toast toast= Toast.makeText(this, "Button was clicked...", Toast.LENGTH_LONG);
       //toast.show();
        //IBAHIN MO onclick sa activity_main
       Snackbar sbar= Snackbar.make(v,"Button was clicked...", Snackbar.LENGTH_LONG);
    }

}
