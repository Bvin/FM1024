package cn.bvin.app.fm1024.model;

import com.google.gson.annotations.SerializedName;

public class JsonChannels extends JsonListResponces{

	@SerializedName("data")
	public Channel[] data;
}
