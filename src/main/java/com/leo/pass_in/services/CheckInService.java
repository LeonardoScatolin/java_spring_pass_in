package com.leo.pass_in.services;

import com.leo.pass_in.domain.attendee.Attendee;
import com.leo.pass_in.domain.checkin.CheckIn;
import com.leo.pass_in.domain.checkin.exceptions.CheckInAlreadyExistsException;
import com.leo.pass_in.repositories.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CheckInService {

    @Autowired
    CheckInRepository checkInRepository;

    public void registerCheckIn(Attendee attendee) {
        verifyCheckInExists(attendee.getId());
        CheckIn newCheckIn = new CheckIn();
        newCheckIn.setAttendee(attendee);
        newCheckIn.setCreatedAt(LocalDateTime.now());
        checkInRepository.save(newCheckIn);
    }

    private void verifyCheckInExists(String attendeeId) {
        Optional<CheckIn> isCheckedIn = getCheckIn(attendeeId);
        if (isCheckedIn.isPresent()) throw new CheckInAlreadyExistsException("Attendee already checked in");
    }

    public Optional<CheckIn> getCheckIn(String attendeeId) {
        return checkInRepository.findByAttendeeId(attendeeId);
    }

}
