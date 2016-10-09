package com.shubh.attendancemaster;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends Activity
{

	EditText edbunk1,edadd1,edsub1,edbunke2,edattende2,edsube2,edbunke3,edattende3,edsube3,edbunke4,edattende4,edsube4,edbunke5,edattende5,edsube5,edreqattend,edbunke6,edattende6,edsube6,edbunke7,edattende7,edsube7;
	//Button update1;
	String record,sub1="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit1);
		
		edadd1=(EditText)findViewById(R.id.edattende1id);
		edsub1=(EditText)findViewById(R.id.edsube1id);
		edbunk1=(EditText)findViewById(R.id.edbunke1id);
		
		edattende2=(EditText)findViewById(R.id.edattende2id);
		edsube2=(EditText)findViewById(R.id.edsube2id);
		edbunke2=(EditText)findViewById(R.id.edbunke2id);
		
		edattende3=(EditText)findViewById(R.id.edattende3id);
		edsube3=(EditText)findViewById(R.id.edsube3id);
		edbunke3=(EditText)findViewById(R.id.edbunke3id);
		
		edattende4=(EditText)findViewById(R.id.edattende4id);
		edsube4=(EditText)findViewById(R.id.edsube4id);
		edbunke4=(EditText)findViewById(R.id.edbunke4id);
		
		edattende5=(EditText)findViewById(R.id.edattende5id);
		edsube5=(EditText)findViewById(R.id.edsube5id);
		edbunke5=(EditText)findViewById(R.id.edbunke5id);
		
		edattende6=(EditText)findViewById(R.id.edattende6id);
		edsube6=(EditText)findViewById(R.id.edsube6id);
		edbunke6=(EditText)findViewById(R.id.edbunke6id);
		
		edattende7=(EditText)findViewById(R.id.edattende7id);
		edsube7=(EditText)findViewById(R.id.edsube7id);
		edbunke7=(EditText)findViewById(R.id.edbunke7id);
		
		edreqattend=(EditText)findViewById(R.id.edreqattendeid);
		
		SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
		
		int reqattend=sp.getInt("MINATTEND", 75);
		String subject=sp.getString("SUB1", "SUBJECT NAME");
		int attend=sp.getInt("ATTEND1", 0);
		int bunk=sp.getInt("BUNK1", 0);
		
		record=String.valueOf(reqattend);
		edreqattend.setText(record);
		
		edsub1.setText(subject);
		record=String.valueOf(attend);
		edadd1.setText(record);
		
		record=String.valueOf(bunk);
		edbunk1.setText(record);
		
		subject=sp.getString("SUB2", "SUBJECT NAME");
		attend=sp.getInt("ATTEND2", 0);
		bunk=sp.getInt("BUNK2", 0);
		
		edsube2.setText(subject);
		record=String.valueOf(attend);
		edattende2.setText(record);
		
		record=String.valueOf(bunk);
		edbunke2.setText(record);
		
		subject=sp.getString("SUB3", "SUBJECT NAME");
		attend=sp.getInt("ATTEND3", 0);
		bunk=sp.getInt("BUNK3", 0);
		
		edsube3.setText(subject);
		record=String.valueOf(attend);
		edattende3.setText(record);
		
		record=String.valueOf(bunk);
		edbunke3.setText(record);
		
		subject=sp.getString("SUB4", "SUBJECT NAME");
		attend=sp.getInt("ATTEND4", 0);
		bunk=sp.getInt("BUNK4", 0);
		
		edsube4.setText(subject);
		record=String.valueOf(attend);
		edattende4.setText(record);
		
		record=String.valueOf(bunk);
		edbunke4.setText(record);
		
		subject=sp.getString("SUB5", "SUBJECT NAME");
		attend=sp.getInt("ATTEND5", 0);
		bunk=sp.getInt("BUNK5", 0);
		
		edsube5.setText(subject);
		record=String.valueOf(attend);
		edattende5.setText(record);
		
		record=String.valueOf(bunk);
		edbunke5.setText(record);
		
		subject=sp.getString("SUB6", "SUBJECT NAME");
		attend=sp.getInt("ATTEND6", 0);
		bunk=sp.getInt("BUNK6", 0);
		
		edsube6.setText(subject);
		record=String.valueOf(attend);
		edattende6.setText(record);
		
		record=String.valueOf(bunk);
		edbunke6.setText(record);
		
		subject=sp.getString("SUB7", "SUBJECT NAME");
		attend=sp.getInt("ATTEND7", 0);
		bunk=sp.getInt("BUNK7", 0);
		
		edsube7.setText(subject);
		record=String.valueOf(attend);
		edattende7.setText(record);
		
		record=String.valueOf(bunk);
		edbunke7.setText(record);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		getMenuInflater().inflate(R.menu.emenu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		int attend1=0,bunk1=0,min=0,correct1=1,correct2=1,correct3=1,correct4=1,correct5=1,correct6=1,correct7=1;
		
		try{
		if(item.getItemId()==R.id.updateid){
			
			SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
			
			 sub1=edsub1.getText().toString();
			String attendstring=edadd1.getText().toString();
			String bunkstring=edbunk1.getText().toString();
			
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
				
				 attend1=Integer.parseInt(attendstring);
				
				if(attendstring.length()>4){
			 correct1=0;
				}
				
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);

				if(bunkstring.length()>4){
			 correct1=0;
				}
			}
			 
			
			Editor ed=sp.edit();
			ed.putInt("ATTEND1", attend1);
			ed.putInt("BUNK1", bunk1);
			ed.putString("SUB1", sub1);
			
			
			
			
			sub1=edsube2.getText().toString();
			attendstring=edattende2.getText().toString();
			bunkstring=edbunke2.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			 
			}
			ed.putInt("ATTEND2", attend1);
			ed.putInt("BUNK2", bunk1);
			ed.putString("SUB2", sub1);
			
			sub1=edsube3.getText().toString();
			attendstring=edattende3.getText().toString();
			bunkstring=edbunke3.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			}
			
			ed.putInt("ATTEND3", attend1);
			ed.putInt("BUNK3", bunk1);
			ed.putString("SUB3", sub1);
			
			sub1=edsube4.getText().toString();
			attendstring=edattende4.getText().toString();
			bunkstring=edbunke4.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			}
			ed.putInt("ATTEND4", attend1);
			ed.putInt("BUNK4", bunk1);
			ed.putString("SUB4", sub1);
			
			sub1=edsube5.getText().toString();
			attendstring=edattende5.getText().toString();
			bunkstring=edbunke5.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			}
			ed.putInt("ATTEND5", attend1);
			ed.putInt("BUNK5", bunk1);
			ed.putString("SUB5", sub1);
			
			sub1=edsube6.getText().toString();
			attendstring=edattende6.getText().toString();
			bunkstring=edbunke6.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			}
			
			ed.putInt("ATTEND6", attend1);
			ed.putInt("BUNK6", bunk1);
			ed.putString("SUB6", sub1);
			
			
			sub1=edsube7.getText().toString();
			attendstring=edattende7.getText().toString();
			bunkstring=edbunke7.getText().toString();	
			
			if(sub1.isEmpty()){
				sub1="No Name";
			}
			if(attendstring.isEmpty()){
				attend1=0;
			}
			else if(attendstring.isEmpty()==false){
			 attend1=Integer.parseInt(attendstring);

				if(attendstring.length()>4){
			 correct1=0;
				}
			}
			
			if(bunkstring.isEmpty()){
				bunk1=0;
			}
			else if(bunkstring.isEmpty()==false){
			 bunk1=Integer.parseInt(bunkstring);
			 if(bunkstring.length()>4){
				 correct1=0;
					}
			}
			
			ed.putInt("ATTEND7", attend1);
			ed.putInt("BUNK7", bunk1);
			ed.putString("SUB7", sub1);
			
			
			
			String Minattend=edreqattend.getText().toString();
			
			if(Minattend.isEmpty()){
				min=0;
			}
			else if(Minattend.isEmpty()==false){
			 min=Integer.parseInt(Minattend);
				if(Minattend.length()>2){
			 correct1=0;
				}
			}
			ed.putInt("MINATTEND", min);
			
			
			if(correct1==1)
			{
			ed.commit();
			
			Intent in2=new Intent(EditActivity.this, MainActivity.class);
			in2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			in2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
			in2.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			
			
			startActivity(in2);		
			}
			
			else if(correct1==0){
				Toast.makeText(EditActivity.this, "Input Size Exceeds Allowed Limit", Toast.LENGTH_LONG).show();
			}
			}
		
		}
		 catch(Exception e){
			 Toast.makeText(EditActivity.this, "Please Enter A Valid Input - you have either entered a wrong input or the size of input exceeeds maximum allowed limit ", Toast.LENGTH_LONG).show();
		 }
		return super.onOptionsItemSelected(item);
	}
	
	
}
