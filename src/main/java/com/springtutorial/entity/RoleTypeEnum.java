package com.springtutorial.entity;

public enum RoleTypeEnum {
	
	USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN");
	
	String userProfileType;
	
	private RoleTypeEnum(String userProfileType){
        this.userProfileType = userProfileType;
    }
	
	public String getUserProfileType(){
        return userProfileType;
    }

}
