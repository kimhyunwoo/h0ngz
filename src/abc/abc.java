package abc;
import java.io.*;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class abc {

	public static void main(String[] args) throws IOException {
		
		
//		예시 1. 특정 클래스 읽기
//		Document doc = Jsoup.connect("http://hangyodae.com/bbs/board.php?bo_table=news&wr_id=29").get();
//		Elements body = doc.select(".viewContents");
//		
//		for(Element e:body)
//			System.out.println(e.text());
//		
//		
//		예시2. 바디 태그만 읽기.
//		Document doc = Jsoup.connect("http://naver.com").get();
//		Elements body = doc.select("body");
//		
//		for(Element e:body)
//			System.out.println(e.text());
		
//		/* 링크 뽑아오기 */
//		Document doc = Jsoup.connect("http://naver.com").get();
//		Elements links = doc.select("a[href]");
//		
//		for(Element l:links)
//			System.out.println("link : " + l.attr("abs:href"));
//	
		
//		/* 응용하여 한국야구 순위 테이블 가져오기 */
//		Document doc = Jsoup.connect("http://kbodata.news.naver.com/m_rank/rank_team.asp").get();
//		
//		Elements rows = doc.select("table.table_board2 tbody tr");
//        String[] items =  { "순위", "팀", "경기수", "승", "패", "무", "승률", "연속",
//            "최근 10경기" };
//        
//        for (Element row : rows) {
//          Iterator<Element> iterElem = row.getElementsByTag("td").iterator();
//          StringBuilder builder = new StringBuilder();
//          for (String item : items) {
//            builder.append(item + ": " + iterElem.next().text() + "\t\t");
//          }
//          System.out.println(builder.toString());
//        }
//        
//        
        // 태그제거.
		//data = data.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");
		
	
	}

}
