package com.cri.snackbarexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		Button btn=findViewById(R.id.activitymainButton1);
		btn.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1) {
					Snackbar.make(p1,"Button Clicked",Snackbar.LENGTH_LONG).setAction(
						"Click Again", new View.OnClickListener(){

							@Override
							public void onClick(View p1) {
								Toast.makeText(getApplicationContext(),"Click Again Pressed"
								,Toast.LENGTH_LONG).show();
							}
							
						
					}
					).show();
				}
				
			
		});
        
    }
    
}
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
