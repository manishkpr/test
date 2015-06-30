package com.example.jni_debug_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends Activity {
    private EditText etInput;
    private TextView txtTo2;
    private TextView txtTo4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Define Input EditText, TextViews
        etInput = (EditText) findViewById(R.id.etInput);
        txtTo2 =  (TextView) findViewById(R.id.resTo2);
        txtTo4 =  (TextView) findViewById(R.id.resTo4);
		
		int b = 3;
        int a = SquaredWrapper.to4(b);
        Log.i("JNIDemo", String.format("%d->%d", b,a));
	}
	
	public void cbCalculate(View view) {
        int in = 0;
        try{
            in = Integer.valueOf( etInput.getText().toString() );
        } catch(NumberFormatException e) { 
        	return ; 
        }
         
        txtTo2.setText(String.format("%d", SquaredWrapper.squared(in)));
        txtTo4.setText(String.format("%d", SquaredWrapper.to4(in)));
    }
}
