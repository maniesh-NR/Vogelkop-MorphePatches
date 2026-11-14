package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class z3l implements jnf {
    public final BrowserActivity a;

    static {
        int i = BrowserActivity.E1;
    }

    public z3l(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    public final void a(x3l x3lVar) {
        p6l p6lVar;
        int i = y3l.a[x3lVar.ordinal()];
        if (i == -1) {
            p6lVar = null;
        } else if (i == 1) {
            p6lVar = p6l.a;
        } else {
            if (i != 2) {
                h9o.p();
                return;
            }
            p6lVar = p6l.b;
        }
        this.a.g1(p6lVar);
    }
}
