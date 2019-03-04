package ch07;

interface Parseable {
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName);	// 추상메서드
}

class ParserManager {
	// 리턴타입이 Paresable인터페이스
	public static Parseable getParser(String type) {
		// 매개변수 타입에 따라 XML인스턴스 또는 HTML인스턴스를 반환
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {	// Paresable인터페이스 구현
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) { // Paresable인터페이스 구현
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- HTML parsing completed.");
	}
}


public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
		}

}
