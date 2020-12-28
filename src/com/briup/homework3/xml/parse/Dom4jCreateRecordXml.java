package com.briup.homework3.xml.parse;

import java.io.FileOutputStream;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Dom4jCreateRecordXml {

	public void create(String path,Map<String, Double> map){
		//在内存中创建一个空白文档
		Document doc = DocumentHelper.createDocument();
		
		//创建根节点
		Element root = doc.addElement("records");
		
		for(String name : map.keySet()){
			//创建二级标签
			Element e2 = root.addElement("record");
			//创建三级标签name
			Element e3Name = e2.addElement("name");
			//给三级标签name添加文本内容
			e3Name.addText(name);
			
			//创建三级标签age
			Element e3price = e2.addElement("price");
			e3price.addText(map.get(name)+"");
		}
		
		//设置输出格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		
		try {
			XMLWriter write = new XMLWriter(new FileOutputStream(path),format);
			
			write.write(doc);
			write.flush();
			write.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) throws Exception {
		SAXUserParse parse = new SAXUserParse();
		Map<String, Double> map = parse.getMap();
		new Dom4jCreateRecordXml().create("src/com/briup/homework3/xml/parse/user1.xml", map);
	}
}
