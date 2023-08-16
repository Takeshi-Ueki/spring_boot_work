package jp.co.mrs.domain.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;

@Convert
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {
	
	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime datetime) {
		return datetime == null ? null : Timestamp.valueOf(datetime);
	}
	
	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp value) {
		return value == null ? null : value.toLocalDateTime();
	}
}
