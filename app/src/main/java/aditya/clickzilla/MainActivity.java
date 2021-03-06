package aditya.clickzilla;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	public int counter;
	Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	    toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
	    counter = 0;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
	public void launchNext(View view) {
		Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
		intent.putExtra("clicks",counter);
		startActivity(intent);
		finish();
	}
}
