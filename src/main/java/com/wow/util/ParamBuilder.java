package com.wow.util;

import com.wow.domain.Field;
import com.wow.domain.Region;

public class ParamBuilder {
	
	private StringBuilder param = new StringBuilder();
	
	public ParamBuilder addParam(String source,String... params) {
		param.append(source);
		for (int i = 0; i < params.length; i++) {
			param.append(String.format("/%s", params[i]));
		} 
		return this;
	}
	
	
	public ParamBuilder addFields(Region region,Field... args) {
		param.append("?");
		param.append("fields=");
		for (int i = 0; i < args.length; i++) {
			param.append(args[i]);
			param.append("+");
		}
		param.append("&");
		param.append("locale=").append(region.toString());
		return this;
	}

	public StringBuilder getParam() {
		return param;
	}

	public void setParam(StringBuilder param) {
		this.param = param;
	}
	
	@Override
	public String toString() {
		return param.toString();
	}

}
