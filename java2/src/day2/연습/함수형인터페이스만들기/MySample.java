package day2.연습.함수형인터페이스만들기;


/**
 * kmdb API 키 
 * ServiceKey : API 서비스 인증키 
 * releaseDts : 개봉일 시작 
 * releaseDte : 개봉일 종료 
 */
interface ApiUrlBuilder {
	String getUrl (String url, String serviceKey, String releaseDts, String releaseDte);
}

public class MySample {
	public static void main(String[] args) {
		
		// url : 요청 api 주소, key : SecretKey, startDate : 개봉시작일자 endDate : 개봉종료일자
		String url = "http://api.acorn.co.kr/movie";
		String mykey = "key";
		String startDate = "20240101";
		String endDate = "20240130";
		
		//1. 이름있는 클래스
		class ApiUrlBuilderImp implements ApiUrlBuilder{

			@Override
			public String getUrl(String url, String serviceKey, String releaseDts, String releaseDte) {
				StringBuilder sb = new StringBuilder(url);
				sb.append("?ServiceKey=" + serviceKey);
				sb.append("&releaseDts=" + releaseDts);
				sb.append("&releaseDte=" + releaseDte);
				
				return sb.toString();		
			}
			
		}
		
		//2. 익명 클래스
		ApiUrlBuilder builder2 = new ApiUrlBuilder() {
			
			@Override
			public String getUrl(String url, String serviceKey, String releaseDts, String releaseDte) {
				StringBuilder sb = new StringBuilder(url);
				sb.append("?ServiceKey=" + serviceKey);
				sb.append("&releaseDts=" + releaseDts);
				sb.append("&releaseDte=" + releaseDte);
				
				return sb.toString();
			}
		};
				
		//3. 람다식 
		ApiUrlBuilder builder3 = (url_, serviceKey, releaseDts, releaseDte) -> {
			StringBuilder sb = new StringBuilder(url_);
			sb.append("?ServiceKey=" + serviceKey);
			sb.append("&releaseDts=" + releaseDts);
			sb.append("&releaseDte=" + releaseDte);
			
			return sb.toString();
		}; 

		
		
		ApiUrlBuilderImp builder1 = new ApiUrlBuilderImp();
		
		String result1 = builder1.getUrl(url, mykey, startDate, endDate);
		String result2 = builder2.getUrl(url, mykey, startDate, endDate);
		String result3 = builder3.getUrl(url, mykey, startDate, endDate); 		
		
		//출력
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
