package jp.co.mrs.domain.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class ReservableRoom implements Serializable {
	// 複合主キーを扱うためのアノテーション
	@EmbeddedId
	private ReservableRoomId reservableRoomId;
	
	// MeetingRoomとの多対１の設定
	@ManyToOne
	//　外部キーとしてroom_idを指定
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	@MapsId("roomId")
	private MeetingRoom meetingRoom;
	
	public ReservableRoom(ReservableRoomId reservableRoomId) {
		this.reservableRoomId = reservableRoomId;
	}
	
	public ReservableRoom() {
	}

	public ReservableRoomId getReservableRoomId() {
		return reservableRoomId;
	}

	public void setReservableRoomId(ReservableRoomId reservableRoomId) {
		this.reservableRoomId = reservableRoomId;
	}

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
}
