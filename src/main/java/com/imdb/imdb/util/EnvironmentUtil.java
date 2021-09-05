package com.imdb.imdb.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.google.common.io.Resources;

@Component
public class EnvironmentUtil {
	private Properties prop;
	private URL url = Resources.getResource("application.properties");
    private File file = new File(url.getPath());
    private InputStream inputStream;
    
	
	public EnvironmentUtil() {
		this.prop = new Properties();
	}
	
	public String getProperty(String key) throws IOException {
		String resultKey;
        inputStream = new FileInputStream(this.file);
        
        if (inputStream != null) {
            prop.load(inputStream);
        } else {
            throw new FileNotFoundException("Properties file not found");
        }
        resultKey = prop.getProperty(key);
        
		return resultKey;
	}

}
