package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ono extends puo {
    public static final ono f = new ono((byte) 0);

    @Override // defpackage.puo
    public final void c(boolean z) {
        Iterator it = Collections.unmodifiableCollection(xqo.c.a).iterator();
        while (it.hasNext()) {
            yp ypVar = ((uio) it.next()).e;
            if (ypVar.b.get() != null) {
                qii.p.m(ypVar.g(), "setState", z ? "foregrounded" : "backgrounded", ypVar.a);
            }
        }
    }

    @Override // defpackage.puo
    public final boolean d() {
        Iterator it = Collections.unmodifiableCollection(xqo.c.b).iterator();
        while (it.hasNext()) {
            View view = (View) ((uio) it.next()).d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
