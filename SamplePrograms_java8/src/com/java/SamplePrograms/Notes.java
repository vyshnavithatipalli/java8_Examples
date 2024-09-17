package com.java.SamplePrograms;

public class Notes {
int sNnumber;
String name;
int value;
public int getsNnumber() {
	return sNnumber;
}
public void setsNnumber(int sNnumber) {
	this.sNnumber = sNnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public Notes(int sNnumber, String name, int value) {
	super();
	this.sNnumber = sNnumber;
	this.name = name;
	this.value = value;
}


}
