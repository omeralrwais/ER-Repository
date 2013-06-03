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

public class ListClass extends Activity {
	
	private ListView hos;
    private ArrayAdapter arrayAdapter;
    String[] hospital = { 
   "San Antonio Community Hospital – Average waiting time 53 minutes- your expected waiting time 92 minutes"
   ,"Pomona Valley Hospital Medical Center- Average waiting time 28 minutes- your expected waiting time 55 minutes "
   ,"Loma Linda University Medical Center- Average waiting time 40 minutes- your expected waiting time 65 minutes"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		hos = (ListView) findViewById(R.id.HosList);
		arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, hospital);
		hos.setAdapter(arrayAdapter);
		
		Button mainNext = (Button) findViewById(R.id.detail);
	       
	       mainNext.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	               Intent i = new Intent();
	               i.setClassName("cgu.edu.ist380.er", "cgu.edu.ist380.er.Detail");
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
