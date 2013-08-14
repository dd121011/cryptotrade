package com.abwaters.cryptotrade.btce.models;

import com.google.gson.annotations.SerializedName;

public class TransactionHistoryReturn extends Results {
	@Override
	public String toString() {
		return "Info [info=" + info + "]";
	}

	@SerializedName("return")
	public TransactionHistoryReturn info ;
}
