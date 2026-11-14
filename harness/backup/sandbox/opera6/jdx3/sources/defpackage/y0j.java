package defpackage;

import android.os.SystemClock;
import android.view.View;

/* loaded from: classes.dex */
public abstract class y0j implements View.OnClickListener {
    public final short b = 300;
    public long a = -300;

    public y0j(int i) {
    }

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.a < this.b) {
            return;
        }
        this.a = jUptimeMillis;
        a(view);
    }
}
