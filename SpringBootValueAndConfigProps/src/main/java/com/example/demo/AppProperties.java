package com.example.demo;
import java.util.Arrays;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties {
	
    private String username;

    private String password;
        
    private String[] tableValues;
        
    private Map<String, Integer> valuesMap;
        
    private Integer value1;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
	
    public String[] getTableValues() {
        return tableValues;
    }

    public Map<String, Integer> getValuesMap() {
        return valuesMap;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTableValues(String[] tableValues) {
        this.tableValues = tableValues;
    }

    public void setValuesMap(Map<String, Integer> valuesMap) {
        this.valuesMap = valuesMap;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

	@Override
	public String toString() {
		return "AppProperties [username=" + username + ", password=" + password + ", tableValues="
				+ Arrays.toString(tableValues) + ", valuesMap=" + valuesMap + ", value1=" + value1 + "]";
	}
    
    

}