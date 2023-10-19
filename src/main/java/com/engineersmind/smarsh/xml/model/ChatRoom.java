package com.engineersmind.smarsh.xml.model;

import java.util.ArrayList;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ChatRoom {
	String callInitiator;
	@JsonProperty("RoomId") 
    public String roomId;
    @JsonProperty("StartTimeUtc") 
    public String startTimeUtc;
    @JsonProperty("ScreenType") 
    public String screenType;
    @JsonProperty("Participants") 
    public ArrayList<Participant> participants;
    @JsonProperty("Perspective") 
    public String perspective;
    @JsonProperty("EndTimeUtc") 
    public String endTimeUtc;
	public String getEndTimeUtc() {
		return endTimeUtc;
	}
	public void setEndTimeUtc(String endTimeUtc) {
		this.endTimeUtc = endTimeUtc;
	}
	public String getPerspective() {
		return perspective;
	}
	public void setPerspective(String perspective) {
		this.perspective = perspective;
	}
	public String getCallInitiator() {
		return callInitiator;
	}
	public void setCallInitiator(String callInitiator) {
		this.callInitiator = callInitiator;
	}
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getStartTimeUtc() {
		return startTimeUtc;
	}
	public void setStartTimeUtc(String startTimeUtc) {
		this.startTimeUtc = startTimeUtc;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public ArrayList<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(ArrayList<Participant> participants) {
		this.participants = participants;
	}
}
