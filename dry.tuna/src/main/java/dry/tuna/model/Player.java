package dry.tuna.model;

import java.io.Serializable;

public class Player implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private int gold;
	private int silver;
	private int bronze;
	private int total;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
