package com.leanplum;

/* loaded from: classes.dex */
public enum EventsUploadInterval {
    AT_MOST_5_MINUTES(5),
    AT_MOST_10_MINUTES(10),
    AT_MOST_15_MINUTES(15);

    private final int minutes;

    EventsUploadInterval(int i) {
        this.minutes = i;
    }

    public int getMinutes() {
        return this.minutes;
    }
}
