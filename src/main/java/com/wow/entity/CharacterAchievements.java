package com.wow.entity;

public class CharacterAchievements {
	
	private int[] achievementsCompleted;
	private long[] achievementsCompletedTimestamp;
	private int[] criteria;
	private long[] criteriaQuantity;
	private long[] criteriaTimestamp;
	private long[] criteriaCreated;
	public int[] getAchievementsCompleted() {
		return achievementsCompleted;
	}
	public void setAchievementsCompleted(int[] achievementsCompleted) {
		this.achievementsCompleted = achievementsCompleted;
	}
	public long[] getAchievementsCompletedTimestamp() {
		return achievementsCompletedTimestamp;
	}
	public void setAchievementsCompletedTimestamp(long[] achievementsCompletedTimestamp) {
		this.achievementsCompletedTimestamp = achievementsCompletedTimestamp;
	}
	public int[] getCriteria() {
		return criteria;
	}
	public void setCriteria(int[] criteria) {
		this.criteria = criteria;
	}
	public long[] getCriteriaQuantity() {
		return criteriaQuantity;
	}
	public void setCriteriaQuantity(long[] criteriaQuantity) {
		this.criteriaQuantity = criteriaQuantity;
	}
	public long[] getCriteriaTimestamp() {
		return criteriaTimestamp;
	}
	public void setCriteriaTimestamp(long[] criteriaTimestamp) {
		this.criteriaTimestamp = criteriaTimestamp;
	}
	public long[] getCriteriaCreated() {
		return criteriaCreated;
	}
	public void setCriteriaCreated(long[] criteriaCreated) {
		this.criteriaCreated = criteriaCreated;
	}
	
	
	

}
