package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public abstract class ta6 implements Cloneable {
    public final int a;
    public final int b;
    public final int c;

    public ta6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public ta6(Calendar calendar) {
        this.a = calendar.get(1);
        this.b = calendar.get(2);
        this.c = calendar.get(5);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ta6 clone() {
        try {
            return (ta6) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract boolean c();

    public final boolean e(GregorianCalendar gregorianCalendar) {
        if (this.a != gregorianCalendar.get(1)) {
            return false;
        }
        if (this.b == gregorianCalendar.get(2)) {
            return this.c == gregorianCalendar.get(5);
        }
        return false;
    }
}
