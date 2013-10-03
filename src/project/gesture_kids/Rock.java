package project.gesture_kids;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class Rock extends Activity {
	protected MediaPlayer mp;
	protected int length=0;
	
    /** Called when the activity is first created. */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) 
        {
            if(mp != null)
            {
                mp.stop();
                mp.release();
                Intent i1= new Intent(getApplicationContext(), Poem.class);
	        		startActivity(i1);
                return true; 
            }
            
        }
        
        return super.onKeyDown(keyCode, event);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rock);   
         Button buttonr=(Button)findViewById(R.id.buttonr);
    
         if(mp==null)
			{
			mp=MediaPlayer.create(Rock.this, R.raw.r2);
			
			mp.start();
			
			mp.setOnCompletionListener(new OnCompletionListener()
			{
				 public void onCompletion(MediaPlayer arg0) 
              {
             	 mp.release();
              }
			});
		
			}
		else
		{
			  mp.stop(); 
    	   		length=0;
    	   		mp=MediaPlayer.create(Rock.this, R.raw.r2);                                 
            mp.start();
           
            mp.setOnCompletionListener(new OnCompletionListener()
                {
                      public void onCompletion(MediaPlayer arg0) 
                      {
                     	 mp.release();
                      }
                }) ;
		}
         
        buttonr.setOnClickListener(new Button.OnClickListener()
         {
         	public void onClick(View v)
         	{		
        		mp.stop();
	               
	               
	               mp.setOnCompletionListener(new OnCompletionListener()
	                   {
	                         public void onCompletion(MediaPlayer arg0) 
	                         {
	                        	 mp.release();
	                         }
	                   }) ;
	               mp=null;
	               length=0;
	               
	               Intent i1= new Intent(getApplicationContext(), Poem.class);
 	        		startActivity(i1);
         	}
         });
         

        		
        
    }
}