package com.briup.Xml.parse.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class JAXPSax {

	public void parse(String filepath) {
		// 获得SAXParserFactory工厂类对象
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			// 获取sax解析器
			SAXParser saxParser = saxParserFactory.newSAXParser();

			saxParser.parse(new File(filepath), new DefaultHandler() {
				@Override
				public void startDocument() throws SAXException {
					System.out.println("开始解析");
				}

				@Override
				public void endDocument() throws SAXException {
					System.out.println("解析结束");
				}

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if (attributes.getLength() > 0) {
						StringBuffer sb = new StringBuffer(" ");
						for (int i = 0; i < attributes.getLength(); i++) {
							System.out.println(attributes.getQName(i) + "  =  " + attributes.getValue(i));
						}
					} else {
						System.out.println("<" + qName + ">");
					}

				}

				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
				}

				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					String string = new String(ch, start, length);
					if (!"".equals(string.trim())) {
						System.out.println(string);

					}
				}

			});
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		JAXPSax sax = new JAXPSax();
		String filepath = "src/com/briup/Xml/parse/student.xml";
		sax.parse(filepath);
	}

}
