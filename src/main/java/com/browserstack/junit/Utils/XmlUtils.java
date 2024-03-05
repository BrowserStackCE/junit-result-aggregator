package com.browserstack.junit.Utils;

import com.browserstack.junit.Entities.Testsuites;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import java.io.File;
import java.io.IOException;

/**
 * Utility class to Serialize & Deserialize Junit XML files
 *
 * @author venkatesh
 * @since 2024-03-04
 */
public class XmlUtils {

    /**
     * @param file-File to be De-Serialized
     * @return A instance of a TestSuites class from the de-serialized xml
     * @throws IOException
     */
    public Testsuites deserializeXml(File file) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        xmlMapper.registerModule(new JaxbAnnotationModule());
        Testsuites xmldata = xmlMapper.readValue(file, Testsuites.class);
        return xmldata;
    }

    /**
     * @param file-File    to Serialize the aggregated xmls to
     * @param xmldata-Data to be serailized to xml
     * @throws IOException
     */
    public void serializeXml(File file, Testsuites xmldata) throws IOException {
        Testsuites suites = null;
        XmlMapper mapper = new XmlMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.registerModule(new JaxbAnnotationModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        final ObjectWriter writer = mapper.writer().withRootName("testsuites");
        writer.writeValue(file, xmldata);

    }
}
