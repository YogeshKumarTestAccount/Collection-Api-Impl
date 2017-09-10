package com.charter.hashmap;

public class ReturnIntHashCode {

	private int id;
	private String name;

	public ReturnIntHashCode(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
	
		int hashcode = 0;
        hashcode = id%10;;
        hashcode += name.hashCode();
		System.out.println("HashCode Called"+hashcode);
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equal Called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReturnIntHashCode other = (ReturnIntHashCode) obj;
		if (id != other.id)
			return false;
		if (name != other.name)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ReturnIntHashCode [id=" + id + ", name=" + name + "]";
	}

}
