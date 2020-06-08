package com.container.beanFactoryPostProcessor;

public class SimplePostProsessor {
	private String connectionString;
	private String password;
	private String userName;
	public SimplePostProsessor() {
		System.out.println("实例化构造器SimplePostProsessor");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "SimplePostProsessor [connectionString=" + connectionString + ", password=" + password + ", userName="
				+ userName + "]";
	}
}

