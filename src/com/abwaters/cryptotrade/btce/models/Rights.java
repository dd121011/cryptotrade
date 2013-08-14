package com.abwaters.cryptotrade.btce.models;

// "rights":{"info":1,"trade":0,"withdraw":0}
public class Rights {
	public int info, trade, withdraw ;

	@Override
	public String toString() {
		return "Rights [info=" + info + ", trade=" + trade + ", withdraw="
				+ withdraw + "]";
	}
}
