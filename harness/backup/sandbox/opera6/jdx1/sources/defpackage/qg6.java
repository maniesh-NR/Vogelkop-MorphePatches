package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class qg6 {
    public final long a;
    public final int b;
    public final int c;
    public final int d;

    public qg6(int i, int i2, int i3, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static qg6 a(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeInMillis(j);
        int i = gregorianCalendar.get(1);
        int i2 = gregorianCalendar.get(2);
        int i3 = gregorianCalendar.get(5);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.clear();
        calendar.set(i, i2, i3);
        return new qg6(i, i2, i3, calendar.getTimeInMillis());
    }
}
