package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n9l {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final /* synthetic */ r9l c;

    public n9l(r9l r9lVar) {
        this.c = r9lVar;
    }

    public final void a() {
        boolean z = !this.a.isEmpty();
        boolean z2 = this.b;
        if (z2 == z) {
            return;
        }
        g4l g4lVar = this.c.D;
        if (z2) {
            g4l.e(g4lVar);
            this.b = false;
        } else {
            g4l.a(g4lVar, null, 3);
            this.b = true;
        }
    }
}
