package com.test.toy.etc;

import org.apache.catalina.tribes.util.Arrays;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		String url = "https://movie.naver.com/movie/running/current.naver";
		
		Document doc = Jsoup.connect(url).get();
		
		Elements list = doc.select("#content .lst_detail_t1 > li");
		
		//System.out.println(list.size());
		
		
		
		EtcDAO dao = new EtcDAO();
		
		for (Element item : list) {
			
			//item == <li>
			
			//영화 제목
			String title = item.select(".tit > a").text(); //<li> 태그 이하에서만 검색해라
			//System.out.println(title);
			
			//개요
			String category = item.select(".info_txt1 dd:nth-child(2) .link_txt").text();
			//System.out.println(category);
			
			
			String dd = item.select(".info_txt1 dd:nth-child(2)").text();			
			//드라마, 코미디 | 69분 | 2001.04.28 개봉
			
			String[] temp = dd.split("\\|");
			
			//{다큐멘터리 ,  86분 ,  2022.06.23 개봉}
			
			//상영 시간
			String time = "";
			
			//개봉일
			String rdate = "";
			
			
			if (temp.length == 3) {
				
				time = temp[1].replace("분", "").trim();
				rdate = temp[2].replace(" 개봉", "").trim();
				
			} else if (temp.length == 2) {
				
				time = temp[0].replace("분", "").trim();
				rdate = temp[1].replace(" 개봉", "").trim();
				
			}
			
			//감독
			String director = item.select(".info_txt1 dd:nth-child(4) span").text();
			//System.out.println(director);
			
			//출연
			String actor = item.select(".info_txt1 dd:last-child span").text();
			//System.out.println(actor);
			
			//포스터
			String poster = item.select(".thumb img").attr("src");
			//System.out.println(poster);
			
			
			MovieDTO dto = new MovieDTO();
			
			dto.setTitle(title);
			dto.setCategory(category);
			dto.setTime(time);
			dto.setRdate(rdate);
			dto.setDirector(director);
			dto.setActor(actor);
			dto.setPoster(poster);
			
			System.out.println(dao.addMovie(dto));
			
		}
		
		
	}
	
}






















