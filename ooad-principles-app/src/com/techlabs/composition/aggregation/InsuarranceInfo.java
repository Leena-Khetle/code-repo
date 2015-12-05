package com.techlabs.composition.aggregation;

public class InsuarranceInfo {
	
	private String policyId;
	private String policyname;
	
	//refactor: making method arguments final
	public InsuarranceInfo(final String id,final String name){
		this.policyId=id;
		this.policyname=name;
	}

	public String getPolicyId(){
		return policyId;
	}
	
	public String getPolicyName(){
		return policyname;
	}
	
	//refactor: making method arguments final
	public void setPolicyId(final String id){
		this.policyId=id;
	}
	
	public void setPolicyName(String name){
		this.policyname=name;
	}
	
	
}
