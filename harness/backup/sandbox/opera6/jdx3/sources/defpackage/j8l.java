package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j8l {
    public final c8l a;
    public final k6l b;
    public final LinkedHashMap c = new LinkedHashMap();

    static {
        new ikc(g8l.c);
    }

    public j8l(tcc tccVar, c8l c8lVar, k6l k6lVar) {
        this.a = c8lVar;
        this.b = k6lVar;
        q6l q6lVar = new q6l(this, (byte) 2);
        i8l i8lVar = new i8l(this);
        aib.C(k6lVar.w, tccVar, q6lVar);
        aib.C(k6lVar, tccVar, i8lVar);
        vml.d(new d8l(this, (byte) 0), 1000L);
    }

    public final void a(int i, int i2) {
        b2l b2lVarR = this.b.r(i);
        if (b2lVarR != null && ((e8l) this.c.get(b2lVarR)) == null) {
            new e8l(this, b2lVarR, i2);
        }
    }
}
