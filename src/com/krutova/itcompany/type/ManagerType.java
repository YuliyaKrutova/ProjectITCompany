package com.krutova.itcompany.type;

public enum ManagerType {
	RM ("Resource Manager"),
	PM ("Project Manager");
	
	private String description;
	
	private ManagerType(String description) {
        this.description = description;
    }

    public String getDescription() {
		return description;
	}
}
