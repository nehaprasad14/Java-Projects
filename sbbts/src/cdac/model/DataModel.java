package cdac.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataModel
{
	
	String lastClick;
	String chapter;
	String topic;
	String subtopic;
	String section;
	String userId;
	
	public String getUserId() {
		System.out.println("getuserid");
		return userId;
	}
	public void setUserId(String userId) {
		System.out.println("setuserid");
		this.userId = userId;
	}
	public String getLastClick() {
		return lastClick;
	}
	public void setLastClick(String lastClick) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
		this.lastClick = strDate;
	}
	public String getChapter() {
		System.out.println("getchapter");
		return chapter;
	}
	public void setChapter(String chapter) {
		System.out.println("setchapter");
		this.chapter = chapter;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubtopic() {
		return subtopic;
	}
	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

}
