package com.hahn.sellerrobot.util.exceptions;

public class MissingArgumentException extends Exception {
	private static final long serialVersionUID = -7708650137551857326L;
	
	public MissingArgumentException(String mss) {
		super(mss);
	}

}
