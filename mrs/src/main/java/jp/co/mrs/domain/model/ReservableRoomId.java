package jp.co.mrs.domain.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Embeddable;

// roomId と reserveDateによる複合クラス
@Embeddable
public class ReservableRoomId implements Serializable {
	
	private Integer roomId;
	
	private LocalDate reserveDate;
	
	public ReservableRoomId(Integer roomId, LocalDate reservedDate) {
		this.roomId = roomId;
		this.reserveDate = reservedDate;
	}
	
	public ReservableRoomId() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reserveDate == null) ? 0 : reserveDate.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		ReservableRoomId other = (ReservableRoomId) obj;
		if (reserveDate == null) {
			if (other.reserveDate != null) return false;
		} else if (!reserveDate.equals(other.reserveDate)) {
			return false;
		}
		
		if (roomId == null) {
			if (other.roomId != null) return false;
		} else if (!roomId.equals(other.roomId)) {
			return false;
		}
		return true;
	}
	
	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public LocalDate getReserveDate() {
		return reserveDate;
	}

	public void setReserveDate(LocalDate reserveDate) {
		this.reserveDate = reserveDate;
	}
}
