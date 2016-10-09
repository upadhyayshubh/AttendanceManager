package com.shubh.attendancemaster;



import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends Activity {

	
	TextView tva1,tva2,tvsubv1,tva3,tva4,tva5,tvsubv2,tvsubv3,tvsubv4,tvsubv5,tvovpe,comment,tva6,tvsubv6,tva7,tvsubv7;
	String record;
	float tp1,ovpe=0;
	float count=0,tattend=0,tbunk=0;
	int min;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view);
		
		tva1=(TextView)findViewById(R.id.tva1id);
		tvsubv1=(TextView)findViewById(R.id.tvsubv1id);
		
		tva2=(TextView)findViewById(R.id.tva2id);
		tvsubv2=(TextView)findViewById(R.id.tvsubv2id);
		
		tva3=(TextView)findViewById(R.id.tva3id);
		tvsubv3=(TextView)findViewById(R.id.tvsubv3id);
		
		tva4=(TextView)findViewById(R.id.tva4id);
		tvsubv4=(TextView)findViewById(R.id.tvsubv4id);
		
		tva5=(TextView)findViewById(R.id.tva5id);
		tvsubv5=(TextView)findViewById(R.id.tvsubv5id);
		
		tva6=(TextView)findViewById(R.id.tva6id);
		tvsubv6=(TextView)findViewById(R.id.tvsubv6id);
		
		tva7=(TextView)findViewById(R.id.tva7id);
		tvsubv7=(TextView)findViewById(R.id.tvsubv7id);
		
		
		tvovpe=(TextView)findViewById(R.id.tvovpeid);
		comment=(TextView)findViewById(R.id.commentid);
		
		
		SharedPreferences sp=getSharedPreferences("user", MODE_PRIVATE);
		
		String subject1=sp.getString("SUB1", "SUBJECT NAME");
		int attend1=sp.getInt("ATTEND1", 0);
		int bunk1=sp.getInt("BUNK1", 0);
		min=sp.getInt("MINATTEND", 75);
		
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		
		if(attend1==0&&bunk1==0){
			tvsubv1.setText(subject1);
			tva1.setText("0.0%");
		}
		else if(attend1!=0||bunk1!=0){
			tp1=((float)attend1*100/(bunk1+attend1));
			
			count=count+1;
			tvsubv1.setText(subject1);	
			record=String.valueOf(tp1);
			tva1.setText(record+"%");
		}
		
		
		subject1=sp.getString("SUB2", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND2", 0);
		bunk1=sp.getInt("BUNK2", 0);
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		
		if(attend1==0&&bunk1==0){
			tvsubv2.setText(subject1);
			tva2.setText("0.0%");
		}
		
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
		
		count=count+1;
		tvsubv2.setText(subject1);	
		record=String.valueOf(tp1);
		tva2.setText(record+"%");
		}
		
		
		subject1=sp.getString("SUB3", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND3", 0);
		bunk1=sp.getInt("BUNK3", 0);
		
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		if(attend1==0&&bunk1==0){
			tvsubv3.setText(subject1);
			tva3.setText("0.0%");
		}
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
		
		count=count+1;
		tvsubv3.setText(subject1);	
		record=String.valueOf(tp1);
		tva3.setText(record+"%");
		}
		
		
		subject1=sp.getString("SUB4", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND4", 0);
		bunk1=sp.getInt("BUNK4", 0);
		
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		if(attend1==0&&bunk1==0){
			tvsubv4.setText(subject1);
			tva4.setText("0.0%");
		}
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
		
		count=count+1;
		tvsubv4.setText(subject1);	
		record=String.valueOf(tp1);
		tva4.setText(record+"%");
		}
		
		
		
		subject1=sp.getString("SUB5", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND5", 0);
		bunk1=sp.getInt("BUNK5", 0);
		
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		if(attend1==0&&bunk1==0){
			tvsubv5.setText(subject1);
			tva5.setText("0.0%");
		}
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
	
		count=count+1;
		tvsubv5.setText(subject1);	
		record=String.valueOf(tp1);
		tva5.setText(record+"%");
		}
		
		
		subject1=sp.getString("SUB6", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND6", 0);
		bunk1=sp.getInt("BUNK6", 0);
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		
		if(attend1==0&&bunk1==0){
			tvsubv6.setText(subject1);
			tva6.setText("0.0%");
		}
		
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
		
		count=count+1;
		tvsubv6.setText(subject1);	
		record=String.valueOf(tp1);
		tva6.setText(record+"%");
		}
		
		
		subject1=sp.getString("SUB7", "SUBJECT NAME");
		attend1=sp.getInt("ATTEND7", 0);
		bunk1=sp.getInt("BUNK7", 0);
		tattend=tattend+attend1;
		tbunk=tbunk+bunk1;
		
		if(attend1==0&&bunk1==0){
			tvsubv7.setText(subject1);
			tva7.setText("0.0%");
		}
		
		else if(attend1!=0||bunk1!=0){
		tp1=((float)attend1*100/(bunk1+attend1));
		
		count=count+1;
		tvsubv7.setText(subject1);	
		record=String.valueOf(tp1);
		tva7.setText(record+"%");
		}
		
	
		
		 if(tattend!=0||tbunk!=0){
			 ovpe=(tattend*100/(tbunk+tattend));
			 
			 if(ovpe<min){
				record=String.valueOf(ovpe);
				String cmnt="(You Must Attend Some More Classes to achieve " +min +"% Attendance)";
				comment.setText(cmnt);
				tvovpe.setText(record+"%");	
			}
		 else if(ovpe>=min){
			 
				record=String.valueOf(ovpe);
			comment.setText("(You Are In Safe Zone - You Can Bunk Some Classes If You Want)");
			tvovpe.setText(record+"%");	
		 	}
		 }	
		
	}
	
}
