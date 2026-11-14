package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class ij9 {
    public final int a;
    public final int b;
    public final Notification c;

    public ij9(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ij9.class != obj.getClass()) {
            return false;
        }
        ij9 ij9Var = (ij9) obj;
        if (this.a == ij9Var.a && this.b == ij9Var.b) {
            return this.c.equals(ij9Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
