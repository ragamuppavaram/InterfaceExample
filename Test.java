package com.InterfaceExample2;

public class Test {
public static void main(String[] args) {
	DbConnection db = new OracleDb();
	DbConnection db1 = new MySql();
	db.connect();
	db1.connect();
}
}
