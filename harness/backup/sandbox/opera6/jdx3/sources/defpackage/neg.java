package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class neg {
    public long a = SystemClock.uptimeMillis();
    public boolean b;
    public long c;

    public final void a() {
        if (this.b) {
            return;
        }
        this.c = (SystemClock.uptimeMillis() - this.a) + this.c;
        this.b = true;
    }
}
