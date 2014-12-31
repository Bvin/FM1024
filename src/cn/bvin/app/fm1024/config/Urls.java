package cn.bvin.app.fm1024.config;

public class Urls {
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_CHANNEL_LIST_SIZE = 30;//默认频道列表一次加载30条
	
	public static final String URL_SEPARATOR = "/";
	
	public static final String QT_API_DOMAN = "http://api2.qingting.fm";
	public static final String QT_API_VERSION = "v5";
	public static final String QT_API_PATH = "media";
	
	public static final int QT_WOMAN_CATEGORI = 3330;//女性
	public static final int QT_WOMAN_HEALTH_CATEGORI = 3334;//女性健康
	public static final int QT_JOKE_CATEGORI = 3260;//搞笑
	public static final int QT_HEALTH_CATEGORI = 539;//健康
	public static final int QT_HEALTH_WOMAN_CATEGORI = 693;//女性健康
	public static final int QT_HEALTH_MEN_CATEGORI = 1547;//男性健康
	
	public static final String QT_WOMAN_CHANEL = "/v5/media/categories/693/channels/order/recommend/curpage/1/pagesize/10";
	public static final String QT_MEN_CHANEL = "/v5/media/categories/1547/channels/order/recommend/curpage/1/pagesize/10";
	
	public static String getQTWomenCateUrl(int curpage) {
		return QT_API_DOMAN+"/v5/media/categories/"+QT_WOMAN_CATEGORI
				+"/channels/order/recommend/curpage/"+curpage+"/pagesize/"+DEFAULT_PAGE_SIZE;
	}
	
	public static String getQTManCateUrl(int curpage) {
		return QT_API_DOMAN+"/v5/media/categories/"+QT_HEALTH_MEN_CATEGORI
				+"/channels/order/recommend/curpage/"+curpage+"/pagesize/"+DEFAULT_PAGE_SIZE;
	}
	
	public static final String QT_CHANNELS = "/v5/media/channels/74044/programs/curpage/1/pagesize/30 ";

	public static String getQTManCateUrl(int channelId,int curPage,int pageSize) {
		return QT_API_DOMAN+QT_API_PATH+"/channels/"+channelId+"/programs/"+curPage+"/pagesize/"+pageSize;
	}
	
	public static String getCategorie(int categoryId,String order) {
		StringBuilder sb = new StringBuilder();
		sb.append(QT_API_DOMAN).append(URL_SEPARATOR);//蜻蜓FM域名
		sb.append(QT_API_VERSION).append(URL_SEPARATOR);//蜻蜓API版本
		sb.append(QT_API_PATH).append(URL_SEPARATOR);//蜻蜓URL路径
		if (categoryId>0) {
			sb.append("categories").append(URL_SEPARATOR)
			.append(categoryId);//添加分类id
			
		}
		
		return  sb.toString(); 
	}
	
	public static String getChannel(int channelId,int curpage, int pagesize) {
		StringBuilder sb = new StringBuilder();
		sb.append(QT_API_DOMAN).append(URL_SEPARATOR);//蜻蜓FM域名
		sb.append(QT_API_VERSION).append(URL_SEPARATOR);//蜻蜓API版本
		sb.append(QT_API_PATH).append(URL_SEPARATOR);//蜻蜓URL路径
		if (channelId>0) {
			sb.append("channels").append(URL_SEPARATOR)
			.append(channelId).append(URL_SEPARATOR)
			.append("programs").append(URL_SEPARATOR)
			.append("curpage").append(URL_SEPARATOR)
			.append(curpage<1?1:curpage).append(URL_SEPARATOR)//页码小于1，就默认1
			.append("pagesize").append(URL_SEPARATOR)
			.append(pagesize<1?DEFAULT_CHANNEL_LIST_SIZE:pagesize);//一页显示多少条，1，就默认30条
		}
		
		return  sb.toString(); 
	}
	
}
