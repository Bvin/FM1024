package cn.bvin.app.fm1024;

import cn.bvin.app.fm1024.config.Urls;
import cn.bvin.app.fm1024.play.SystemPlayer;
import cn.bvin.app.fm1024.task.QTCatecoryTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements LoaderCallbacks<String>{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getSupportLoaderManager().initLoader(0, null, this);
	}
	

	@Override
	public Loader<String> onCreateLoader(int arg0, Bundle arg1) {
		String url = Urls.getChannel(74044,1, 1);
		((TextView)findViewById(R.id.tv)).setText("请求"+url+"...");
		return new QTCatecoryTask(getApplicationContext(), url);
	}

	@Override
	public void onLoadFinished(Loader<String> arg0, String arg1) {
		SystemPlayer.getInstance().setSource(arg1);
		((TextView)findViewById(R.id.tv)).setText(arg1);
		SystemPlayer.getInstance().play();
	}

	@Override
	public void onLoaderReset(Loader<String> arg0) {
		
	}


	@Override
	protected void onDestroy() {
		SystemPlayer.getInstance().stop();
		super.onDestroy();
	}
	
}
