import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 문자열연습 {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
		Elements elems=doc.select("td.title div.tit3");
		//System.out.println(elems);
		for(int i=0;i<elems.size();i++)
		{
			Element e=elems.get(i);
			System.out.println(e.text());
		}
	}

}
