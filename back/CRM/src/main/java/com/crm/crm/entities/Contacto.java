package com.crm.crm.entities;

public class Contacto {

	private int idContacto;
	private String name;
	private int tel;
	private String title;
	private String owner;
	private int priority;
	private String description;
	private String category;
	private String avatar;
	private String status;

	public Contacto() {
		super();
	}

	public Contacto(int idContacto, String name, int tel, String title, String owner, int priority, String description,
			String category, String avatar, String status) {

		this.idContacto = idContacto;
		this.name = name;
		this.tel = tel;
		this.title = title;
		this.owner = owner;
		this.priority = priority;
		this.description = description;
		this.category = category;
		this.avatar = avatar;
		this.status = status;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String contactMode) {
		this.category = contactMode;
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
