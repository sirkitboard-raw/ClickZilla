package aditya.clickzilla;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import aditya.clickzilla.R;

public class SecondActivity extends Activity {
	int counter;
	Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
	    counter = getIntent().getIntExtra("clicks",0);
	    toast = Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            counter = 0;
	        toast.setText("Counter Reset");
	        toast.show();
        }
        return super.onOptionsItemSelected(item);
    }

	public void incrementClicks(View view) {
		counter++;
		toast.setText("Number of clicks : "+counter);
		toast.show();
	}
}
