package com.abwaters.cryptotrade.btce.models;

// "transaction_count":0,"open_orders":0,"server_time":1376503732

public class InfoReturn {
	public Funds funds ;
	public Rights rights ;
	public int transaction_count ;
	public int open_orders ;
	public long server_time ;
	@Override
	public String toString() {
		return "InfoReturn [funds=" + funds + ", rights=" + rights
				+ ", transaction_count=" + transaction_count + ", open_orders="
				+ open_orders + ", server_time=" + server_time + "]";
	}
}
