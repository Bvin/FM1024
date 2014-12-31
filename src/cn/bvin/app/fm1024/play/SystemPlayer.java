package cn.bvin.app.fm1024.play;

import android.media.MediaPlayer;

public class SystemPlayer
{
  private static SystemPlayer _instance;
  private int currPlayState = 30583;
  private MediaPlayer mPlayer = new MediaPlayer();
  private String mSource;

  public static SystemPlayer getInstance()
  {
    if (_instance == null)
      _instance = new SystemPlayer();
    return _instance;
  }

  public void play()
  {
    if ((this.mSource == null) || (this.mSource.equalsIgnoreCase("")))
      return;
    try
    {
      this.mPlayer.stop();
      this.mPlayer.setDataSource(this.mSource);
      this.mPlayer.prepare();
      this.mPlayer.setLooping(true);
      this.mPlayer.start();
      this.currPlayState = 4096;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void setSource(String paramString)
  {
    if ((paramString == null) || (paramString.equalsIgnoreCase("")))
      return;
    this.mSource = paramString;
  }

  public void stop()
  {
    if (this.currPlayState != 4096)
      return;
    try
    {
      this.mPlayer.stop();
      this.currPlayState = 0;
      return;
    }
    catch (Exception localException)
    {
    }
  }
}
