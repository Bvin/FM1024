package cn.bvin.app.fm1024.model;

import com.google.gson.annotations.SerializedName;

public class Channel {
	
	public String id;//频道id
	public String name;//频道名称
	public String type;//频道类型
	
	@SerializedName("updatetime")
	public String updateTime;//更新时间
	
	/**分类名称categoryName*/
	@SerializedName("cname")
	public String cateName;
	
	@SerializedName("catid")
	public String catId;
	
	public String cid;//分类id,categoryId
	public String pic;//图片地址
	
	/**频道说明*/
	@SerializedName("desc")
	public String desc;
	
	/**播放时长*/
	public double duration;
	
	public Object[] broadcasters;//广播
	
	/**来源*/
	public String source;
	
	/**直播频道*/
	@SerializedName("livechannel")
	public String liveChannel;
	
	@SerializedName("liveprogram")
	public String liveProgram;
	
	/**媒体信息*/
	@SerializedName("mediainfo")
	public MediaInfo mediaInfo;
	
	/**项目Id*/
	@SerializedName("programid")
	public String programId;
	
	public String weight;
	
	/**背景图片*/
	@SerializedName("backgroundpic")
	public String backgroundPic;
	
	/**父分类背景图片*/
	@SerializedName("parentbackgroundpic")
	public String parentBackgroundPic;
	
	/**子分类*/
	@SerializedName("subtype")
	public String subType;
	
	@SerializedName("dimensionid")
	public String dimensionId;
	
	/**父分类id*/
	@SerializedName("parentid")
	public String parentId;
	
	/**父分类类型*/
	@SerializedName("parenttype")
	public String parentType;
	
	/**父分类名称*/
	@SerializedName("parentname")
	public String parentName;
	
	/**父分类显示名称*/
	@SerializedName("parentdisplayname")
	public String parentDisplayName;
	
	/**发布时间*/
	@SerializedName("publishtime")
	public String publishTime;
	
	/**收听次数*/
	@SerializedName("listennum")
	public String listenNum;
	
	/**父分类封面*/
	@SerializedName("parentcover")
	public String parentCover;
	
	/**父分类标语*/
	@SerializedName("parentoutline")
	public String parentOutline;
	
	public int sequence;
	
	public Object[] script;
	
	/**频道状态*/
	@SerializedName("channelstatus")
	public String channelStatus;
	
	/**分享链接*/
	@SerializedName("share_link")
	public String shareLink;
}
