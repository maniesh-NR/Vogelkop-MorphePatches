package defpackage;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s8p {
    public static final s8p d;
    public WeakReference a;
    public boolean b;
    public boolean c;

    static {
        s8p s8pVar = new s8p();
        s8pVar.b = false;
        s8pVar.c = false;
        d = s8pVar;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) != (this.c || this.b)) {
            Iterator it = Collections.unmodifiableCollection(xqo.c.a).iterator();
            while (it.hasNext()) {
                yp ypVar = ((uio) it.next()).e;
                boolean z3 = z2 || z;
                if (ypVar.b.get() != null) {
                    qii.p.m(ypVar.g(), "setDeviceLockState", z3 ? "locked" : "unlocked");
                }
            }
        }
    }
}
