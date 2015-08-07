package com.dreamteam.data;

import java.sql.Date;
import java.sql.Time;

public class ScheduleDetails {
	int employeeId ;
	int roomId;
	int floorNumber;
	Date scheduleDate ;
	Time startTime ;
	Time endTime ;
	String comment ;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String toString() {
		return "ScheduleDetails [employeeId=" + employeeId + ", roomId=" + roomId + ", floorNumber=" + floorNumber
				+ ", scheduleDate=" + scheduleDate + ", startTime=" + startTime + ", endTime=" + endTime + ", comment="
				+ comment + "]";
	}
	
}
