package com.sist;

import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class TwitterMain {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
		TwitterStream ts= new TwitterStreamFactory().getInstance();
		TwitterListener list=new TwitterListener();
		FilterQuery fq=new FilterQuery();
		String[] data={"문재인","안철수","박원순","김무성"};
		fq.track(data);
		ts.addListener(list);
		ts.filter(fq);
	}

}
