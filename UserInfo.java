package jp.co.agrex.biofeedbacker;

import android.app.Application;

public class UserInfo extends Application {
	String _userName;
	int _userAge;
	String _userGender;

	public void init() {
		_userName = "Guest";
		_userAge = 0;
		_userGender = "";
	}

}