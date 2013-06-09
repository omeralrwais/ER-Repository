package cgu.edu.ist380.er;

import java.util.List;

import cgu.edu.ist380.er.db.Patient;
import cgu.edu.ist380.er.db.PatientDataSource;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class TestDB extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		PatientDataSource datasource = new PatientDataSource(this);
		datasource.open();
		
		   ListView listview = (ListView) findViewById(R.id.pl);
			List<Patient> medsList = datasource.getAllPatients();
			datasource.close();
			
			ArrayAdapter<Patient> adapter = new ArrayAdapter<Patient>(this,
			            android.R.layout.simple_list_item_1, medsList);
		listview.setAdapter(adapter);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
