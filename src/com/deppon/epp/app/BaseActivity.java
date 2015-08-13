package com.deppon.epp.app;

import android.app.Activity;
import com.deppon.epp.utils.Logs;


public class BaseActivity extends Activity {
	private String TAG = this.getClass().getName();
	@Override
	protected void onRestart() {
		Logs.d(TAG, "onRestart()");
		super.onRestart();
	}

	@Override
	protected void onStart() {
		Logs.d(TAG, "onStart()");
		super.onStart();
	}

	@Override
	protected void onResume() {
		Logs.d(TAG, "onResume()");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Logs.d(TAG, "onPause()");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Logs.d(TAG, "onStop()");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Logs.d(TAG, "onDestroy()");
		super.onDestroy();
	}
}
