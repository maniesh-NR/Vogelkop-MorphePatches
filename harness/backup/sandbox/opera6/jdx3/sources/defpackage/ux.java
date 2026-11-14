package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class ux {
    public final sx a = new sx(this, (byte) 0);
    public final qx b = new qx(this);
    public final vzk c;
    public il d;
    public dl e;
    public i3j f;
    public w7h g;
    public uwh h;
    public boolean i;
    public boolean j;
    public byte k;
    public String l;

    public ux(vzk vzkVar) {
        this.c = vzkVar;
        vzkVar.h(new rx(this, (byte) 0));
    }

    public final void a(int i) {
        int iMax;
        uwh uwhVar;
        if (this.j || this.k != 0) {
            return;
        }
        il ilVar = this.d;
        if (ilVar == null) {
            ilVar = ((cy) this.c.a).c().h;
            this.d = ilVar;
        }
        if (ilVar == null) {
            iMax = 1;
        } else {
            iMax = Math.max(this.i ? ilVar.d : ilVar.c, 1);
        }
        if (i >= iMax || this.e == null || this.g == null || (uwhVar = this.h) == null) {
            return;
        }
        if (uwhVar.b()) {
            this.k = (byte) 1;
            this.g.a(this.e).e(this.a, new m43(this.e, null, 1, Collections.EMPTY_LIST));
            return;
        }
        this.k = (byte) 2;
        uwh uwhVar2 = this.h;
        h7f h7fVar = uwhVar2.k;
        qx qxVar = this.b;
        h7fVar.b(qxVar);
        if (uwhVar2.b()) {
            ux uxVar = qxVar.a;
            uxVar.h.k.c(uxVar.b);
            uxVar.k = (byte) 0;
            i3j i3jVar = uxVar.f;
            if (i3jVar != null) {
                uxVar.a(i3jVar.z());
            }
        }
    }

    public final void b(dl dlVar, boolean z) {
        i3j i3jVar;
        if ((dlVar instanceof hl) || (dlVar instanceof kl)) {
            return;
        }
        if (this.g.r.contains(dlVar.c)) {
            return;
        }
        boolean z2 = this.e == null;
        this.e = dlVar;
        if ((z2 || z) && (i3jVar = this.f) != null) {
            a(i3jVar.z());
        }
    }
}
