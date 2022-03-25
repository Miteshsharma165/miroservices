package com.main.springboot.services;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;



@Table(value = "jobspost")
public class GetPostService {
	 
	//private UUID id;
	@PrimaryKey
	private String postName;
	private String postDate;
		
	private String shortDiscription;
	
	private String noOfPost;
	private String minimumAge;
	private String maximumAge;
	
	
	private String eligibility;
	
	private String applyOnline;
	private String notificationDownloadLink;
	private String goToOfficialWebsite;

	public GetPostService() {

	}
    
	public GetPostService(String postName, String postDate, String shortDiscription, String noOfPost,
			String minimumAge, String maximumAge, String eligibility, String applyOnline,
			String notificationDownloadLink, String goToOfficialWebsite) {
		super();
		this.postName = postName;
		this.postDate = postDate;
		this.shortDiscription = shortDiscription;
		this.noOfPost = noOfPost;
		this.minimumAge = minimumAge;
		this.maximumAge = maximumAge;
		this.eligibility = eligibility;
		this.applyOnline = applyOnline;
		this.notificationDownloadLink = notificationDownloadLink;
		this.goToOfficialWebsite = goToOfficialWebsite;

	}

	
	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
  
	public String getShortDiscription() {
		return shortDiscription;
	}

	public void setShortDiscription(String shortDiscription) {
		this.shortDiscription = shortDiscription;
	}

	public String getNoOfPost() {
		return noOfPost;
	}

	public void setNoOfPost(String noOfPost) {
		this.noOfPost = noOfPost;
	}

	public String getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(String minimumAge) {
		this.minimumAge = minimumAge;
	}

	public String getMaximumAge() {
		return maximumAge;
	}
    
	public void setMaximumAge(String maximumAge) {
		this.maximumAge = maximumAge;
	}
	
	public String getEligibility() {
		return eligibility;
	}
    
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String getApplyOnline() {
		return applyOnline;
	}

	public void setApplyOnline(String applyOnline) {
		this.applyOnline = applyOnline;
	}

	public String getNotificationDownloadLink() {
		return notificationDownloadLink;
	}

	public void setNotificationDownloadLink(String notificationDownloadLink) {
		this.notificationDownloadLink = notificationDownloadLink;
	}

	public String getGoToOfficialWebsite() {
		return goToOfficialWebsite;
	}

	public void setGoToOfficialWebsite(String goToOfficialWebsite) {
		this.goToOfficialWebsite = goToOfficialWebsite;
	}
		
}
