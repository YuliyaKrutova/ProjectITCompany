package com.krutova.itcompany.type;

public enum ContractType {
	FULLTIME("Full-time",160),
	PARTTIME("Part-time",80);
	
	private String description;
	private int countDays;
	
	private ContractType(String description,int countDays) {
        this.description = description;
        this.countDays = countDays;
    }

    public String getDescription() {
		return description;
	}

	public int getCountDays() {
		return countDays;
	}
    
}
