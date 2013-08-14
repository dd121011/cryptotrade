package com.abwaters.cryptotrade.test;

import java.util.Properties;

import com.abwaters.cryptotrade.CryptoTradeException;
import com.abwaters.cryptotrade.btce.BTCE;
import com.abwaters.cryptotrade.btce.models.Info;

public class TestBTCE {
	public static void main(String[] args) throws CryptoTradeException {
		Properties p = new Properties() ;
		p.setProperty("btce.key","O07AKCXU-2EFJW1JL-UW03I38C-74JNF7F0-JEXJ83SJ") ;
		p.setProperty("btce.secret","8c161f8031822a1f9e18cff70a7169ce53ac8ee295943b5a2e0ca2632300f80c") ;
		BTCE btce = new BTCE(p) ;
		Info info = btce.getInfo() ;
		System.out.println(info) ;
		System.out.println(btce.getTransactionHistory()) ;
	}
}
