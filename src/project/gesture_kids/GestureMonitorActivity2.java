package project.gesture_kids;

import java.util.ArrayList; 

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
 
public class GestureMonitorActivity2 extends ListActivity {
	
 
 /** Called when the activity is first created. */


	    @Override
	    
	    public boolean onKeyDown(int keyCode, KeyEvent event) 
	    {
	        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
	        {
	        
	       

	        	    this.finish();
	        	    Intent intent = new Intent(Intent.ACTION_MAIN);
	        	    intent.addCategory(Intent.CATEGORY_HOME);
	        	    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	        	    startActivity(intent);

	               return true; 
	        	}   
	           
	    return super.onKeyDown(keyCode, event);
	    }
	    
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	 
	        String[] kids = getResources().getStringArray(R.array.kids_array);
	        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_item, kids));
	        
	        ListView lv = getListView();

	       
	        lv.setOnItemClickListener(new OnItemClickListener() 
	  	  {
	  	    

			public void onItemClick(AdapterView<?> parent, View view,
			 	        int position, long id) 
			 	    {
				
				// TODO Auto-generated method stub
							if(parent.getItemAtPosition(position).toString().equals("Learn Alphabet"))
					  	      {  	Intent i1= new Intent(getApplicationContext(), List.class);
					  	        		startActivity(i1);
					  	      }
							else if(parent.getItemAtPosition(position).toString().equals("Poems"))
					  	      {  	Intent i2= new Intent(getApplicationContext(), Poem.class);
					  	        		startActivity(i2);
					  	      }
				
						
				
							
				
							
			}
	  	 
	  	  });
	        
	     
	        
	  	   

	        
	    }

	   

	    
 }

 
