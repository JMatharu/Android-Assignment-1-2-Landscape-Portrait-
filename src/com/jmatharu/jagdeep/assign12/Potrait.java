/*
 * Created By - Jagdeep Matharu (300710666) ->Assign 1-2
 */

package com.jmatharu.jagdeep.assign12;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Potrait extends Activity {

	Button butt;
	ImageView img1, img2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.potrait);

		DeclaringObjects();
		this.butt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				img1.setImageResource(R.drawable.superman);
				img2.setImageResource(R.drawable.iron);
			}
		});

	}

	private void DeclaringObjects() {
		// TODO Auto-generated method stub
		butt = (Button) findViewById(R.id.firstButton);
		img1 = (ImageView) findViewById(R.id.imgview1);
		img2 = (ImageView) findViewById(R.id.imgview2);
	}

}
