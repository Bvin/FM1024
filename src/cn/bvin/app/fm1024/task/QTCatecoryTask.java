package cn.bvin.app.fm1024.task;

import cn.bvin.lib.manager.RequestManager;
import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

public class QTCatecoryTask extends AsyncTaskLoader<String>{

	String url;
	
	public QTCatecoryTask(Context context, String url) {
		super(context);
		this.url = url;
	}

	
	
	@Override
	protected void onStartLoading() {
		super.onStartLoading();
		forceLoad();
		Log.e("QTCatecoryTask", "onStartLoading");
	}



	@Override
	protected void onStopLoading() {
		super.onStopLoading();
		Log.e("QTCatecoryTask", "onStopLoading");
	}



	@Override
	public String loadInBackground() {
		String retsult = RequestManager.getStringResponse(url);
		Log.e(url, retsult);
		return retsult;
	}
}
