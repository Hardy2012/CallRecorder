package com.Hardy.Callrecoder.ActivityPackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CallRecorderActivity extends Activity {
	private Button startButton, stopButton, rcdFileButton, anotherButton,
			aboutButton;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		startButton = (Button) findViewById(R.id.button1);
		stopButton = (Button) findViewById(R.id.button2);
		rcdFileButton = (Button) findViewById(R.id.button3);
		anotherButton = (Button) findViewById(R.id.button4);
		aboutButton = (Button) findViewById(R.id.button5);

		startButton.setOnClickListener(new buttonOnClickListener());
		stopButton.setOnClickListener(new buttonOnClickListener());
		rcdFileButton.setOnClickListener(new buttonOnClickListener());
		anotherButton.setOnClickListener(new buttonOnClickListener());
		aboutButton.setOnClickListener(new buttonOnClickListener());
	}

	private class buttonOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if (v == startButton) {
				
			} else if (v == stopButton) {

			} else if (v == rcdFileButton) {

			} else if (v == anotherButton) {

			} else if (v == aboutButton) {

			}
		}

	}
}