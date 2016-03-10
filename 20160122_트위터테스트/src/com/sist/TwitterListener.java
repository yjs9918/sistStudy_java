package com.sist;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

public class TwitterListener implements StatusListener {

	@Override
	public void onException(Exception e) {
		// TODO Auto-generated method stub
		System.out.println(e.getMessage()); //에러잡기
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScrubGeo(long arg0, long arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStallWarning(StallWarning arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatus(Status s) {
		// TODO Auto-generated method stub
		System.out.println("@"+s.getUser().getScreenName()+"-"+s.getText()); //글을 긁어옴(루프)
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
