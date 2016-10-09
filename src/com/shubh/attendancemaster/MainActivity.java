package com.shubh.attendancemaster;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

	TextView tvattendm1,tvbunkm1,subm1,tvsubm2,tvattendm2,tvbunkm2,tvsubm3,tvattendm3,tvbunkm3,tvsubm4,tvattendm4,tvbunkm4,tvsubm5,tvattendm5,tvbunkm5,tvsubm6,tvattendm6,tvbunkm6,tvsubm7,tvattendm7,tvbunkm7;
	Button attendm1,bunkm1,attendm2,bunkm2,attendm3,bunkm3,attendm4,bunkm4,attendm5,bunkm5,attendm6,bunkm6,attendm7,bunkm7;
	String record;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		subm1=(TextView)findViewById(R.id.sub1id);
		tvattendm1=(TextView)findViewById(R.id.tvadd1id);
		tvbunkm1=(TextView)findViewById(R.id.tvbunk1id);
		attendm1=(Button)findViewById(R.id.add1id);
		bunkm1=(Button)findViewById(R.id.bunk1id);
		
		tvsubm2=(TextView)findViewById(R.id.tvsubm2);
		tvattendm2=(TextView)findViewById(R.id.tvattendm2id);
		tvbunkm2=(TextView)findViewById(R.id.tvbunkm2id);
		attendm2=(Button)findViewById(R.id.attendm2id);
		bunkm2=(Button)findViewById(R.id.bunkm2id);
		
		tvsubm3=(TextView)findViewById(R.id.tvsubm3);
		tvattendm3=(TextView)findViewById(R.id.tvattendm3id);
		tvbunkm3=(TextView)findViewById(R.id.tvbunkm3id);
		attendm3=(Button)findViewById(R.id.attendm3id);
		bunkm3=(Button)findViewById(R.id.bunkm3id);
		
		tvsubm4=(TextView)findViewById(R.id.tvsubm4);
		tvattendm4=(TextView)findViewById(R.id.tvattendm4id);
		tvbunkm4=(TextView)findViewById(R.id.tvbunkm4id);
		attendm4=(Button)findViewById(R.id.attendm4id);
		bunkm4=(Button)findViewById(R.id.bunkm4id);
		
		tvsubm5=(TextView)findViewById(R.id.tvsubm5);
		tvattendm5=(TextView)findViewById(R.id.tvattendm5id);
		tvbunkm5=(TextView)findViewById(R.id.tvbunkm5id);
		attendm5=(Button)findViewById(R.id.attendm5id);
		bunkm5=(Button)findViewById(R.id.bunkm5id);
		
		tvsubm6=(TextView)findViewById(R.id.tvsubm6);
		tvattendm6=(TextView)findViewById(R.id.tvattendm6id);
		tvbunkm6=(TextView)findViewById(R.id.tvbunkm6id);
		attendm6=(Button)findViewById(R.id.attendm6id);
		bunkm6=(Button)findViewById(R.id.bunkm6id);
		
		tvsubm7=(TextView)findViewById(R.id.tvsubm7);
		tvattendm7=(TextView)findViewById(R.id.tvattendm7id);
		tvbunkm7=(TextView)findViewById(R.id.tvbunkm7id);
		attendm7=(Button)findViewById(R.id.attendm7id);
		bunkm7=(Button)findViewById(R.id.bunkm7id);
		
		SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
		
		String subject=sp.getString("SUB1", "SUBJECT NAME");
		int attend=sp.getInt("ATTEND1", 0);
		int bunk=sp.getInt("BUNK1", 0);
		
		tvattendm1.setText(String.valueOf(attend));
		tvbunkm1.setText(String.valueOf(bunk));
		subm1.setText(subject);
		
		 subject=sp.getString("SUB2", "SUBJECT NAME");
		 attend=sp.getInt("ATTEND2", 0);
		 bunk=sp.getInt("BUNK2", 0);
		 
		    tvattendm2.setText(String.valueOf(attend));
			tvbunkm2.setText(String.valueOf(bunk));
			tvsubm2.setText(subject);
			
			subject=sp.getString("SUB3", "SUBJECT NAME");
			 attend=sp.getInt("ATTEND3", 0);
			 bunk=sp.getInt("BUNK3", 0);
			 
			    tvattendm3.setText(String.valueOf(attend));
				tvbunkm3.setText(String.valueOf(bunk));
				tvsubm3.setText(subject);
				
				 subject=sp.getString("SUB4", "SUBJECT NAME");
				 attend=sp.getInt("ATTEND4", 0);
				 bunk=sp.getInt("BUNK4", 0);
				 
				    tvattendm4.setText(String.valueOf(attend));
					tvbunkm4.setText(String.valueOf(bunk));
					tvsubm4.setText(subject);
					
					subject=sp.getString("SUB5", "SUBJECT NAME");
					 attend=sp.getInt("ATTEND5", 0);
					 bunk=sp.getInt("BUNK5", 0);
					 
					    tvattendm5.setText(String.valueOf(attend));
						tvbunkm5.setText(String.valueOf(bunk));
						tvsubm5.setText(subject);
						
						subject=sp.getString("SUB6", "SUBJECT NAME");
						 attend=sp.getInt("ATTEND6", 0);
						 bunk=sp.getInt("BUNK6", 0);
						 
						    tvattendm6.setText(String.valueOf(attend));
							tvbunkm6.setText(String.valueOf(bunk));
							tvsubm6.setText(subject);
							
					subject=sp.getString("SUB7", "SUBJECT NAME");
					 attend=sp.getInt("ATTEND7", 0);
					 bunk=sp.getInt("BUNK7", 0);
							 
				   tvattendm7.setText(String.valueOf(attend));
					tvbunkm7.setText(String.valueOf(bunk));
					tvsubm7.setText(subject);		
		
		attendm1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND1", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND1", attend);
				ed.commit();
		
				tvattendm1.setText(String.valueOf(attend));
			}
		});
		
		bunkm1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK1", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK1", bunk);
				ed.commit();
				
				tvbunkm1.setText(String.valueOf(bunk));
				
			}
		});
		
		attendm2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND2", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND2", attend);
				ed.commit();
		
				tvattendm2.setText(String.valueOf(attend));
			}
		});
		
		bunkm2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK2", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK2", bunk);
				ed.commit();
				
				tvbunkm2.setText(String.valueOf(bunk));
				
			}
		});
		
attendm3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND3", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND3", attend);
				ed.commit();
		
				tvattendm3.setText(String.valueOf(attend));
			}
		});
		
		bunkm3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK3", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK3", bunk);
				ed.commit();
				
				tvbunkm3.setText(String.valueOf(bunk));
				
			}
		});
		
attendm4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND4", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND4", attend);
				ed.commit();
		
				tvattendm4.setText(String.valueOf(attend));
			}
		});
		
		bunkm4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK4", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK4", bunk);
				ed.commit();
				
				tvbunkm4.setText(String.valueOf(bunk));
				
			}
		});
		
attendm5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND5", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND5", attend);
				ed.commit();
		
				tvattendm5.setText(String.valueOf(attend));
			}
		});
		
		bunkm5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK5", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK5", bunk);
				ed.commit();
				
				tvbunkm5.setText(String.valueOf(bunk));
				
			}
		});
		
		
attendm6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND6", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND6", attend);
				ed.commit();
		
				tvattendm6.setText(String.valueOf(attend));
			}
		});
		
		bunkm6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK6", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK6", bunk);
				ed.commit();
				
				tvbunkm6.setText(String.valueOf(bunk));
				
			}
		});
		
attendm7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int attend=sp.getInt("ATTEND7", 0);
				attend=attend+1;
				
				Editor ed=sp.edit();
				ed.putInt("ATTEND7", attend);
				ed.commit();
		
				tvattendm7.setText(String.valueOf(attend));
			}
		});
		
		bunkm7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
				int bunk=sp.getInt("BUNK7", 0);
				bunk=bunk+1;
				
				Editor ed=sp.edit();
				ed.putInt("BUNK7", bunk);
				ed.commit();
				
				tvbunkm7.setText(String.valueOf(bunk));
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==R.id.viewid){
			Intent in=new Intent(MainActivity.this, ViewActivity.class);
			startActivity(in);
			
		}
		
		else if(item.getItemId()==R.id.editid){
			Intent in1=new Intent(MainActivity.this, EditActivity.class);
			startActivity(in1);
			
		}
		
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		/*Intent in6=new Intent(Intent.ACTION_MAIN);
		in6.addCategory(Intent.CATEGORY_HOME);
		in6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(in6);*/
		finish();
	}
	
	
}
