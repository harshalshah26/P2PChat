package com.example.p2pchat579.activity;

import com.example.p2pchat579.R;
import com.example.p2pchat579.R.id;
import com.example.p2pchat579.R.layout;
import com.example.p2pchat579.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btButton, button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btButton = (Button)findViewById(R.id.bluetoothButton);
		button2 = (Button)findViewById(R.id.wifiButton);
		
		btButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				connectBluetooth();
				
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//connectWifi();
				
			}
		});
	}
	
	public void connectBluetooth()
	{
		Intent bluetoothIntent = new Intent(this,ChattingActivity.class);
		startActivity(bluetoothIntent);
	}
	
//	public void connectWifi()
//	{
//		Intent bluetoothIntent = new Intent(this,WiFiDirectActivity.class);
//		startActivity(bluetoothIntent);
//	}
//	
	
	

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
