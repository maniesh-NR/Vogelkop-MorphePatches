package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import defpackage.puo;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m6 extends puo {
    public static final m6 d = new m6((byte) 1);

    @Override // defpackage.puo
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(r6.c.a).iterator();
        while (it.hasNext()) {
            s6 s6Var = ((q6) it.next()).d;
            if (s6Var.b.get() != null) {
                bw2.a$1.a((WebView) s6Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", s6Var.a);
            }
        }
    }

    @Override // defpackage.puo
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(r6.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((q6) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
