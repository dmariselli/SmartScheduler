package com.projects.scheduler.model;

import lombok.Getter;

import javax.persistence.*;

@Entity @Getter
@Table(name="Schedule")
public class Schedule {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private int duration;

    private byte daysOfWeek;  // 00000000 == 0SMTWThFS

    // 00000000 == 00:00-00:00 where index 0 corresponds to Sunday, 1 to Monday, etc.
    // Get top 4 by integer / by 10000. Get bottom 4 by % 10000
    private byte[] startEnd = new byte[7];

    public int getDuration() {
        // TODO If the duration of the class varies on the day, perhaps return 0? Change to Integer and return null?
        return -1;
    }

    public int getDuration(String dayOfWeek) {
        // TODO Implement switching from String to number day of week in order to access byte[]
        // TODO Implement byte to more usable format
        return -1;
    }


}
