package org.sky.ormframework.core.xml.impl;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.sky.ormframework.core.xml.XmlParsing;
import org.sky.ormframework.core.xml.XmlReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author yangcong
 *
 * 用于读取和转换xml
 */
public class XmlReaderAndParsing implements XmlReader, XmlParsing {

    private Document document;

    @Override
    public void readerXml(InputStream inputStream) throws IOException, DocumentException {
        this.document = new SAXReader().read(inputStream);
    }

    @Override
    public void readerXml(File file) throws IOException, DocumentException {
        this.document = new SAXReader().read(file);
    }

    @Override
    public void readerXml(String xmlPath) throws IOException, DocumentException {
        this.document = new SAXReader().read(xmlPath);
    }
}
