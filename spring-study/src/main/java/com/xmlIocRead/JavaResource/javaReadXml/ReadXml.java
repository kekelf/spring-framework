package com.xmlIocRead.JavaResource.javaReadXml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javassist.ClassPath;
import javassist.LoaderClassPath;

/***
 * java按照指定的格式解析XML 
 *
 */
public class ReadXml {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		System.out.println(ClassLoader.getSystemResource("config/bean.xml").getFile());
		String path = ClassLoader.getSystemResource("config/bean.xml").getFile().toString();
		File file = new File(path);
		System.out.println(file.exists());
		Document doc = reader.read(file);
		// 读取指定标签
		Iterator<Element> eleit = doc.getRootElement().elementIterator("bean");
		Element element = eleit.next();
		Attribute attribute = element.attribute("id");
		System.out.println(attribute.getName());
//		System.out.println(element.elementIterator().next().attribute("name").getValue());
		System.out.println(element.element("property").attribute("name").getValue());
	}

}
