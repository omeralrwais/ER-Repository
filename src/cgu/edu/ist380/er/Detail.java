package cgu.edu.ist380.er;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Detail extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
		
		Button mainNext = (Button) findViewById(R.id.back);
	       
	       mainNext.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	               Intent i = new Intent();
	               i.setClassName("cgu.edu.ist380.er", "cgu.edu.ist380.er.ListClass");
	               startActivity(i);
	           }
	       });
	       
	       
	    Button mainNext2 = (Button) findViewById(R.id.close);
	       
	       mainNext2.setOnClickListener(new OnClickListener() {
	    	   @Override
	           public void onClick(View v) {
	               // TODO Auto-generated method stub
	               finish();
	               System.exit(0);
	    		   //Intent i = new Intent(AccountActivity.this, HomeActivity.class);
                   //startActivity(i);
	           }
	       }
	    		   );
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
