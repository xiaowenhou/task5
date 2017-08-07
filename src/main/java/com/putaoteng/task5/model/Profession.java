package com.putaoteng.task5.model;

public class Profession extends BasicVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3288758029719862567L;
	
	private long id;
	private String profession;
	private String introduction;
	private byte threshold;
	private byte level;
	private byte cycle;
	private int requirement;
	private String timeFirst;
	private String salaryFirst;
	private String timeSecond;
	private String salarySecond;
	private String timeThird;
	private String salaryThird;
	private int number;
	private String base;
	private long createAt;
	private long updateAt;
	
	
	public String getTimeFirst() {
		return timeFirst;
	}
	public void setTimeFirst(String timeFirst) {
		this.timeFirst = timeFirst;
	}
	public String getTimeSecond() {
		return timeSecond;
	}
	public void setTimeSecond(String timeSecond) {
		this.timeSecond = timeSecond;
	}
	public String getTimeThird() {
		return timeThird;
	}
	public void setTimeThird(String timeThird) {
		this.timeThird = timeThird;
	}

	public Profession() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public byte getThreshold() {
		return threshold;
	}
	public void setThreshold(byte threshold) {
		this.threshold = threshold;
	}
	public byte getLevel() {
		return level;
	}
	public void setLevel(byte level) {
		this.level = level;
	}
	public byte getCycle() {
		return cycle;
	}
	public void setCycle(byte cycle) {
		this.cycle = cycle;
	}
	public int getRequirement() {
		return requirement;
	}
	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}
	
	public String getSalaryFirst() {
		return salaryFirst;
	}
	public void setSalaryFirst(String salaryFirst) {
		this.salaryFirst = salaryFirst;
	}
	public String getSalarySecond() {
		return salarySecond;
	}
	public void setSalarySecond(String salarySecond) {
		this.salarySecond = salarySecond;
	}
	public String getSalaryThird() {
		return salaryThird;
	}
	public void setSalaryThird(String salaryThird) {
		this.salaryThird = salaryThird;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public long getCreateAt() {
		return createAt;
	}
	public void setCreateAt(long createAt) {
		this.createAt = createAt;
	}
	public long getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "Profession [id=" + id + ", profession=" + profession + ", introduction=" + introduction + ", threshold="
				+ threshold + ", level=" + level + ", cycle=" + cycle + ", requirement=" + requirement + ", timeFirst="
				+ timeFirst + ", salaryFirst=" + salaryFirst + ", timeSecond=" + timeSecond + ", salarySecond="
				+ salarySecond + ", timeThird=" + timeThird + ", salaryThird=" + salaryThird + ", number=" + number
				+ ", base=" + base + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
}
