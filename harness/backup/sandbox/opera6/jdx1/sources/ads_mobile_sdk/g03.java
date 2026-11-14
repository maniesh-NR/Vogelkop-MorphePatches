package ads_mobile_sdk;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g03 {
    public static final g03 d;
    public WeakReference a;
    public boolean b;
    public boolean c;

    static {
        g03 g03Var = new g03();
        g03Var.b = false;
        g03Var.c = false;
        d = g03Var;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) != (this.c || this.b)) {
            Iterator it = Collections.unmodifiableCollection(r6.c.a).iterator();
            while (it.hasNext()) {
                s6 s6Var = ((q6) it.next()).d;
                boolean z3 = z2 || z;
                if (s6Var.b.get() != null) {
                    bw2.a$1.a((WebView) s6Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
                }
            }
        }
    }
}
