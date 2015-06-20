package project.gesture_kids;


import java.util.ArrayList;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class List extends Activity {

protected MediaPlayer mp;
GestureLibrary gestureLibrary = null;
GestureOverlayView gestureOverlayView;
private Button button1;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gesture);
    repeat();
    
    
   
}

public void repeat()
{
	 gestureOverlayView = (GestureOverlayView)findViewById(R.id.gestures);
	   
    gestureLibrary = GestureLibraries.fromRawResource(this, R.raw.gestures);
    gestureLibrary.load();
    gestureOverlayView.addOnGesturePerformedListener(gesturePerformedListener);
    
}

OnGesturePerformedListener gesturePerformedListener
= new OnGesturePerformedListener(){

public void onGesturePerformed(GestureOverlayView view, Gesture gesture) {
 // TODO Auto-generated method stub
 ArrayList<Prediction> prediction = gestureLibrary.recognize(gesture);
 if(prediction.size() > 0){
  String action = prediction.get(0).name;
  
  try{
  boolean result = action.matches("[a-zA-Z]");
  
  if(result){
	  setContentView(getResources().getIdentifier(action.toLowerCase(), "layout",getPackageName()));
	  mp=MediaPlayer.create(List.this, getResources().getIdentifier(action.toLowerCase(), "raw",getPackageName()));
		mp.start();
  }
 
  /*
	if ("a".equals(action) || "A".equals(action))
  {setContentView(R.layout.a);
  mp=MediaPlayer.create(List.this, R.raw.a);
	mp.start();
  }
	
	else if ("b".equals(action) || "B".equals(action))
	{
		setContentView(R.layout.b);
		mp=MediaPlayer.create(List.this, R.raw.b);
		mp.start();
	}
	
	else if ("c".equals(action) || "C".equals(action))
	{
		setContentView(R.layout.c);
		mp=MediaPlayer.create(List.this, R.raw.c);
		mp.start();
	}
	else if ("d".equals(action) || "D".equals(action))
	{
		setContentView(R.layout.d);
		mp=MediaPlayer.create(List.this, R.raw.d);
		mp.start();
	}
	else if ("e".equals(action) || "E".equals(action))
	{
		setContentView(R.layout.e);
		mp=MediaPlayer.create(List.this, R.raw.e);
		mp.start();
	}
	else if ("f".equals(action) || "F".equals(action))
	{
		setContentView(R.layout.f);
		mp=MediaPlayer.create(List.this, R.raw.f);
		mp.start();
	}
	else if ("g".equals(action) || "G".equals(action))
	{
		setContentView(R.layout.g);
		mp=MediaPlayer.create(List.this, R.raw.g);
		mp.start();
	}
	else if ("h".equals(action) || "H".equals(action))
	{
		setContentView(R.layout.h);
		mp=MediaPlayer.create(List.this, R.raw.h);
		mp.start();
	}
	else if ("i".equals(action) || "I".equals(action))
	{
		setContentView(R.layout.i);
		mp=MediaPlayer.create(List.this, R.raw.i);
		mp.start();
	}
	else if ("j".equals(action) || "J".equals(action))
	{
		setContentView(R.layout.j);
		mp=MediaPlayer.create(List.this, R.raw.j);
		mp.start();
	}
	else if ("k".equals(action) || "K".equals(action))
	{
		setContentView(R.layout.k);
		mp=MediaPlayer.create(List.this, R.raw.k);
		mp.start();
	}
	else if ("l".equals(action) || "L".equals(action))
	{
		setContentView(R.layout.l);
		mp=MediaPlayer.create(List.this, R.raw.l);
		mp.start();
	}
	else if ("m".equals(action) || "M".equals(action))
	{
		setContentView(R.layout.m);
		mp=MediaPlayer.create(List.this, R.raw.m);
		mp.start();
	}
	else if ("n".equals(action) || "N".equals(action))
	{
		setContentView(R.layout.n);
		mp=MediaPlayer.create(List.this, R.raw.n);
		mp.start();
	}
	else if ("o".equals(action) || "O".equals(action))
	{
		setContentView(R.layout.o);
		mp=MediaPlayer.create(List.this, R.raw.o);
		mp.start();
	}
	else if ("p".equals(action) || "P".equals(action))
	{
		setContentView(R.layout.p);
		mp=MediaPlayer.create(List.this, R.raw.p);
		mp.start();
	}
	else if ("q".equals(action) || "Q".equals(action))
	{
		setContentView(R.layout.q);
		mp=MediaPlayer.create(List.this, R.raw.q);
		mp.start();
	}
	else if ("r".equals(action) || "R".equals(action))
	{
		setContentView(R.layout.r);
		mp=MediaPlayer.create(List.this, R.raw.r);
		mp.start();
	}
	else if ("s".equals(action) || "S".equals(action))
	{
		setContentView(R.layout.s);
		mp=MediaPlayer.create(List.this, R.raw.s);
		mp.start();
	}
	else if ("t".equals(action) || "T".equals(action))
	{
		setContentView(R.layout.t);
		mp=MediaPlayer.create(List.this, R.raw.t);
		mp.start();
	}
	else if ("u".equals(action) || "U".equals(action))
	{
		setContentView(R.layout.u);
		mp=MediaPlayer.create(List.this, R.raw.u);
		mp.start();
	}
	else if ("v".equals(action) || "V".equals(action))
	{
		setContentView(R.layout.v);
		mp=MediaPlayer.create(List.this, R.raw.v);
		mp.start();
	}
	else if ("w".equals(action) || "W".equals(action))
	{
		setContentView(R.layout.w);
		mp=MediaPlayer.create(List.this, R.raw.w);
		mp.start();
	}
	else if ("x".equals(action) || "X".equals(action))
	{
		setContentView(R.layout.x);
		mp=MediaPlayer.create(List.this, R.raw.x);
		mp.start();
	}
	else if ("y".equals(action) || "Y".equals(action))
	{
		setContentView(R.layout.y);
		mp=MediaPlayer.create(List.this, R.raw.y);
		mp.start();
	}
	else if ("z".equals(action) || "Z".equals(action))
	{
		setContentView(R.layout.z);
		mp=MediaPlayer.create(List.this, R.raw.z);
		mp.start();
	}
	
	*/
  
	button1=(Button)findViewById(R.id.button1);
	button1.setOnClickListener(new Button.OnClickListener()
	{
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 setContentView(R.layout.gesture);
			 repeat();
		}
	}
	);
  }
  catch(Exception e){
	  setContentView(R.layout.gesture);
		 repeat();
 }
 }
 
}};

}
