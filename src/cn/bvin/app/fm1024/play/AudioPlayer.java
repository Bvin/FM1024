package cn.bvin.app.fm1024.play;

import android.media.AudioTrack;

public class AudioPlayer {

	private AudioTrack mAudioTrack;
	private boolean mIsPlaying;

	public boolean isPlaying() {

		AudioTrack localAudioTrack = this.mAudioTrack;
		boolean bool = false;
		if (localAudioTrack != null) {
			mIsPlaying = localAudioTrack.getPlayState() == AudioTrack.PLAYSTATE_PLAYING;
			bool  = mIsPlaying;
		}
		return bool;
	}

	public void pause() {
		AudioTrack localAudioTrack = this.mAudioTrack;
		if (localAudioTrack != null)
			localAudioTrack.pause();
		this.mIsPlaying = false;
	}

	public void prepare() {
		this.mIsPlaying = false;
	}

	public void release() {
		releaseAudiotrack();
	}

	private void releaseAudiotrack()
	  {
	    try
	    {
	      AudioTrack localAudioTrack = this.mAudioTrack;
	      if (localAudioTrack != null)
	      {
	        localAudioTrack.pause();
	        localAudioTrack.flush();
	        localAudioTrack.stop();
	        localAudioTrack.release();
	        this.mAudioTrack = null;
	      }
	      return;
	    }
	    finally
	    {
	    }
	  }
	
	public void reset() {
		releaseAudiotrack();
		this.mIsPlaying = false;
	}

	public void seekTo(int paramInt) {
		if (paramInt >= 0) {
		}
	}

	public void stop() {
		releaseAudiotrack();
		this.mIsPlaying = false;
		this.mAudioTrack.stop();
	}
}
