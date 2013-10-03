package project.gesture_kids;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
	

	public class Poem extends ListActivity {
	

	    @Override
	    
	    public boolean onKeyDown(int keyCode, KeyEvent event) 
	    {
	        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
	        {
	            
	                Intent i1= new Intent(getApplicationContext(), GestureMonitorActivity2.class);
		        		startActivity(i1);
	                return true; 
	            
	            
	        }
	    return super.onKeyDown(keyCode, event);
	    }
	    
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	 
	   
	        String[] poems = getResources().getStringArray(R.array.poems_array);
	        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_poem, poems));
	        
	        ListView lv = getListView();

	       
	        lv.setOnItemClickListener(new OnItemClickListener() 
	  	  {
	  	    

			public void onItemClick(AdapterView<?> parent, View view,
			 	        int position, long id) 
			 	    {
				
				// TODO Auto-generated method stub
							if(parent.getItemAtPosition(position).toString().equals("Humpty Dumpty"))
					  	      {  	Intent i1= new Intent(getApplicationContext(), Humpty.class);
					  	        		startActivity(i1);
					  	      }
							else if(parent.getItemAtPosition(position).toString().equals("Johny Johny yes Papa"))
					  	      {  	Intent i2= new Intent(getApplicationContext(), Johny.class);
					  	        		startActivity(i2);
					  	      }
				
							else if(parent.getItemAtPosition(position).toString().equals("Rock a Bye Baby"))
					  	      {  	Intent i3= new Intent(getApplicationContext(), Rock.class);
					  	        		startActivity(i3);
					  	      }
				
							else if(parent.getItemAtPosition(position).toString().equals("Twinkle Twinkle Little Star"))
					  	      {  	Intent i4= new Intent(getApplicationContext(), Twinkle.class);
					  	        		startActivity(i4);
					  	      }
				
							else if(parent.getItemAtPosition(position).toString().equals("Wee Willie Winkie"))
					  	      {  	Intent i5= new Intent(getApplicationContext(), Willie.class);
					  	        		startActivity(i5);
					  	      }
				
							
			}
	  	 
	  	  });
	        
	     
	        
	  	   

	        
	    }

	   

	    
	}



