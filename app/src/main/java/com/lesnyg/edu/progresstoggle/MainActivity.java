package com.lesnyg.edu.progresstoggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);

    }

    public void onclickwidget(View view){
        String text = toggleButton.getText()+"-"+toggleButton.isChecked();
        if(toggleButton.isChecked())
            progressBar.setVisibility(View.VISIBLE);
        else progressBar.setVisibility(View.GONE);
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
    }
}
