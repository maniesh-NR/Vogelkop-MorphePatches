package defpackage;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class oep implements View.OnClickListener {
    public final Function1 a;
    public long b = -300;

    public oep(Function1 function1) {
        this.a = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.b < 300) {
            return;
        }
        this.b = jUptimeMillis;
        this.a.invoke(view);
    }
}
