package cgu.edu.ist380.er;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cgu.edu.ist380.er.db.Patient;
import cgu.edu.ist380.er.db.PatientDataSource;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
	
	private EditText fn;
	private EditText ln;
	private EditText dob;
	private RadioButton m;
	private RadioButton f;
	private EditText ph;
	private EditText add;
	private EditText city;
	private EditText zib;
	private String gender;
	
	SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd");
	
	PatientDataSource pd = new PatientDataSource(this);
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button mainNext = (Button) findViewById(R.id.find);
		Button s = (Button) findViewById(R.id.save);
	       
	       mainNext.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	               Intent i = new Intent();
	               i.setClassName("cgu.edu.ist380.er", "cgu.edu.ist380.er.Diagnose");
	               startActivity(i);
	           }
	       });
	       
	       s.setOnClickListener(new OnClickListener() {
	           public void onClick(View v) {
	        	   fn = (EditText) findViewById(R.id.fn);
	        	   ln = (EditText) findViewById(R.id.ln);
	        	   dob = (EditText) findViewById(R.id.dob);
	        	   ph = (EditText) findViewById(R.id.phone);
	        	   add = (EditText) findViewById(R.id.address);
	        	   city = (EditText) findViewById(R.id.city);
	        	   zib = (EditText) findViewById(R.id.zib);
	        	   m   =(RadioButton)findViewById(R.id.m);
	        	   f   =(RadioButton)findViewById(R.id.f);
	        	   
	        	   if(m.isChecked()==true)
	        		   gender="Male";
	        	   else gender="Female";
	        	   
	        	   String f= fn.getText().toString();;
	        	   String l= ln.getText().toString();;
	        	   String d= dob.getText().toString();;
	        	   String a= add.getText().toString();;
	        	   String c= city.getText().toString();;
	        	   int p= Integer.valueOf(ph.getText().toString());
	        	   int z= Integer.valueOf(zib.getText().toString());;
	        	   
	        	   Log.e(MainActivity.class.getName(), "db is  "+ pd);
	        	   pd.open();
	        	   Patient pp= new Patient();
	        	   pp.setFirstName(f);
	        	   pp.setLastName(l);
	        	   pp.setPhone(p);
	        	   pp.setZib(z);
	        	   pp.setAddress(a);
	        	   pp.setCity(c);
	        	   pp.setGender(gender);
	        	   try
	        	   {
	        	   Date date = format.parse(d);
	        	   pp.setDob(date);
	        	   }
	        	   catch (ParseException e)
	        	   {
	        		   e.printStackTrace(); 
	        	   }
	        	   
	        	   
	        	   pd.createPatient(pp);
	        	   
	        	   pd.close();
	        	   
	        	   
	               Intent i = new Intent();
	               i.setClassName("cgu.edu.ist380.er", "cgu.edu.ist380.er.TestDB");
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
