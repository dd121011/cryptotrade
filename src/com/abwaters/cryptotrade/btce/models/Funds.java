package com.abwaters.cryptotrade.btce.models;

// "funds":{"usd":0,"btc":0,"ltc":0,"nmc":0,"rur":0,"eur":0,"nvc":0,"trc":0,"ppc":0,"ftc":0,"cnc":0}
public class Funds {
	public double usd, btc, ltc, nmc, rur, eur, nvc, trc, ppc, ftc, cnc ;

	@Override
	public String toString() {
		return "Funds [usd=" + usd + ", btc=" + btc + ", ltc=" + ltc + ", nmc="
				+ nmc + ", rur=" + rur + ", eur=" + eur + ", nvc=" + nvc
				+ ", trc=" + trc + ", ppc=" + ppc + ", ftc=" + ftc + ", cnc="
				+ cnc + "]";
	}
}
