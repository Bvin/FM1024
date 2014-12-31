package cn.bvin.app.fm1024.model;

import com.google.gson.annotations.SerializedName;

public class MediaInfo {
	public String id;
	public Object[] original;
	public Object replay;
	public Object slidereplay;
	
	@SerializedName("transcode")
	public Transcode[] transCode;
	
	/**下载地址*/
    public String download;
    
    /**比特率，支持集中比特率*/
    @SerializedName("transbitrate")
    public int[] transBitrate;
    
    /**下载次数*/
    @SerializedName("downloadnum")
    public String downloadNum;
    
    public String seekStartTime;
    public String seekEndTime;
    
    @SerializedName("bitrates_url")
    public Bitrate[] bitrates;
    
    public Host host;
    
    public class Transcode{
    	
    	/**hls(Http Live Streaming)直播传输协议地址*/
    	public String hls;
    	
    	/**http地址*/
    	public String http;
    }
    
    public class Bitrate{
    	public String path;
    	public int bitrate;
    }
    
    public class Host{
    	/**直播主机*/
    	public String live;
    	/**点播主机vod(Video On Demand)*/
    	public String od;
    }
    
}
