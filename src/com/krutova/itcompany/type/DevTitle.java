package com.krutova.itcompany.type;

public enum DevTitle {
	JUNIORSE("Junior Software Engineer"),
	SE("Software Engineer"),
	SENIORSE("Senior Software Engineer"),
	LEADSE("Lead Software Engineer");
	
	private String description;
	
	private DevTitle(String description) {
        this.description = description;
    }

    public String getDescription() {
		return description;
	}
}
