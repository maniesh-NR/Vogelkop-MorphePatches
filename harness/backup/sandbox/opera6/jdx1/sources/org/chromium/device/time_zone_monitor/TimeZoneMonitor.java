package org.chromium.device.time_zone_monitor;

import android.content.IntentFilter;
import defpackage.t8;
import defpackage.up1;

/* loaded from: classes.dex */
public final class TimeZoneMonitor {
    public final up1 a;
    public long b;

    public TimeZoneMonitor(long j) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        up1 up1Var = new up1(this, (byte) 20);
        this.a = up1Var;
        this.b = j;
        t8.Q(t8.a, up1Var, intentFilter);
    }

    public static TimeZoneMonitor getInstance(long j) {
        return new TimeZoneMonitor(j);
    }

    public final void stop() {
        t8.a.unregisterReceiver(this.a);
        this.b = 0L;
    }
}
