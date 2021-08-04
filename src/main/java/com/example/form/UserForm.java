package com.example.form;

import javax.validation.constraints.NotBlank;

public class UserForm {

	@NotBlank(message="入力が必須な値です")
	private String name;
	@NotBlank(message="入力が必須な値です")
	private String age;
	@NotBlank(message="入力が必須な値です")
	private String comment;
	
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	public int getIntAge() {
		return Integer.parseInt(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
