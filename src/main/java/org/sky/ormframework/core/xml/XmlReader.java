package org.sky.ormframework.core.xml;

import org.dom4j.DocumentException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ycsky
 *
 * xml读取
 */
public interface XmlReader {

    public void readerXml(InputStream inputStream) throws IOException, DocumentException;

    public void readerXml(File file) throws IOException, DocumentException ;

    public void readerXml(String xmlPath) throws IOException, DocumentException ;
}
