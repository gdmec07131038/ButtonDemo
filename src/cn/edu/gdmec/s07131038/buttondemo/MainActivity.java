package cn.edu.gdmec.s07131038.buttondemo;

import android.location.GpsStatus.Listener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
public class MainActivity extends Activity implements Listener {
	TextView myTextView;
	EditText myEditText;
	Button myBtn;
	ImageButton myImageBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myTextView=(TextView) findViewById(R.id.textView1);
		myEditText=(EditText) findViewById(R.id.editText1);
		myTextView.setText("welcome");
		myEditText.setText("asdfghj");
		myBtn=(Button) findViewById(R.id.button1);
		myBtn.setOnClickListener(buttonlistener);
		
		myImageBtn=(ImageButton) findViewById(R.id.imageButton1);
		
		
	}
	Button.OnClickListener buttonlistener=new Button.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			myTextView.setText("clicked");
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onGpsStatusChanged(int event) {
		// TODO Auto-generated method stub
		
	}

}
