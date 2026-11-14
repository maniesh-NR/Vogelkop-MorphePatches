package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.opera.android.webapps.WebappActivity;

/* loaded from: classes.dex */
public final class iwl extends uuj {
    public long d;

    public final void h(WebappActivity webappActivity, ViewGroup viewGroup, int i) {
        super.h(webappActivity, viewGroup, i);
        this.d = SystemClock.uptimeMillis();
    }

    public final int j() {
        return 2131559471;
    }

    public final long k() {
        return Math.max(0L, (this.d + 2000) - SystemClock.uptimeMillis());
    }

    public final void n(String str) {
    }
}
