package cn.bvin.app.fm1024.model;

import com.google.gson.annotations.SerializedName;

public class JsonResponces {
	
	@SerializedName("errorno")
	public String errorCode;//错误吗
	
	@SerializedName("errormsg")
	public String errorMsg;//错误信息
	
	@SerializedName("expiredtime")
	public int expiredTime;//到期时间
	
}
