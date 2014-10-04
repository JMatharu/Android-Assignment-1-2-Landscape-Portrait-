/*
 * Created By - Jagdeep Matharu (300710666) ->Assign 1-2
 */

package com.jmatharu.jagdeep.assign12;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	protected static final Configuration Configuration = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Thread splash = new Thread() {
			public void run() {
				try {
					sleep(1);
					DisplayMetrics metrics = new DisplayMetrics();
					getWindowManager().getDefaultDisplay().getMetrics(metrics);
					double x = Math.pow(metrics.widthPixels / metrics.xdpi, 2);
					double y = Math.pow(metrics.heightPixels / metrics.ydpi, 2);
					double screenSize = Math.sqrt(x + y);
					// Log.d("debug", "Screen inches : " + screenSize);

					if (screenSize < 7.000) {
						Intent potrait = new Intent(MainActivity.this,
								Potrait.class);
						startActivity(potrait);
					} else {
						Intent landscape = new Intent(MainActivity.this,
								Landscape.class);
						startActivity(landscape);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					finish();
				}
			}
		};
		splash.start();
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
