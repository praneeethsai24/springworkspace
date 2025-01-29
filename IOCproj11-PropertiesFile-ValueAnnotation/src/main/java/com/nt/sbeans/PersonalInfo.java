package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
@Qualifier
public class PersonalInfo {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private Integer age;
	@Value("${per.addrs}")
	private String addrs;

	@Value("951518")
	private Long pincode;

	@Value("${os.name}")
	private String osName;

	@Value("${os.version}")
	private String osVersion;

	@Value("${path}")
	private String pathData;

	
	
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", pincode=" + pincode + ", osName="
				+ osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	
	
	}
	
	
}
