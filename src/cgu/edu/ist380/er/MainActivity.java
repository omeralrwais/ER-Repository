package cgu.edu.ist380.er;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button mainNext = (Button) findViewById(R.id.finder);
	       
	       mainNext.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	               Intent i = new Intent();
	               i.setClassName("cgu.edu.ist380.er", "cgu.edu.ist380.er.ListClass");
	               startActivity(i);
	           }
	       });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
