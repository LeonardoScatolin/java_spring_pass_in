package com.leo.pass_in.dto.attendee;

public record AttendeeBadgeDTO(
        String name,
        String email,
        String checkInUrl,
        String eventId
) {
}
