package com.example.appbox;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setViewContent(R.layout.splash); 
        ourSong = MediaPlayer.create(Splash.this, R.raw.raining);  	
		ourSong.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				Intent openStartingPoint = new Intent ("com.example.appbox.MENU");
				startActivity(openStartingPoint);
			}
		}
	}; 
	timer.start();
		
	}

	private void setViewContent(int splash) {
		// TODO Auto-generated method stub
		
	}

}
