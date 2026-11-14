package com.leanplum.internal;

import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class Clock {
    public static final long DAY_MILLIS = 86400000;
    private static Clock INSTANCE = null;
    public static final long MONTH_MILLIS = 2592000000L;
    public static final Clock SYSTEM;

    static {
        Clock clock = new Clock() { // from class: com.leanplum.internal.Clock.1
            @Override // com.leanplum.internal.Clock
            public long currentTimeMillis() {
                return System.currentTimeMillis();
            }

            @Override // com.leanplum.internal.Clock
            @NonNull
            public Date newDate() {
                return new Date();
            }
        };
        SYSTEM = clock;
        INSTANCE = clock;
    }

    public static Clock getInstance() {
        return INSTANCE;
    }

    public static void setInstance(Clock clock) {
        INSTANCE = clock;
    }

    public abstract long currentTimeMillis();

    public boolean lessThanMonthAgo(long j) {
        return currentTimeMillis() - j < MONTH_MILLIS;
    }

    @NonNull
    public abstract Date newDate();
}
