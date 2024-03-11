package com.browserstack.junit.Utils;

import com.browserstack.jest.Entities.JestJson;
import com.browserstack.junit.Entities.Testsuites;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import java.io.File;
import java.io.IOException;

public class JsonUtils {

    /**
     * @param file-File to be De-Serialized
     * @return A instance of a TestSuites class from the de-serialized xml
     * @throws IOException
     */
    public JestJson deserializeJson(File file) throws IOException {

        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        jsonMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        JestJson jsonData = jsonMapper.readValue(file, JestJson.class);
        return jsonData;
    }
}
