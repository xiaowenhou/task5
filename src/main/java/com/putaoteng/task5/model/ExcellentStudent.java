package com.putaoteng.task5.model;

public class ExcellentStudent extends BasicVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2690278164008798463L;
	
	private long id;
	private String name;
	private String imgUrl;
	private String profession;
	private String desire;
	private long createAt;
	private long updateAt;
	
	public ExcellentStudent() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getDesire() {
		return desire;
	}
	public void setDesire(String desire) {
		this.desire = desire;
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
		return "ExcellentStudent [id=" + id + ", name=" + name + ", imgUrl=" + imgUrl + ", profession=" + profession
				+ ", desire=" + desire + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
}
