package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k7h {
    public final g7h a;
    public final boolean b;
    public final iuj c;
    public final Function1 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public k7h(g7h g7hVar, Object obj, boolean z, iuj iujVar, Function1 function1, boolean z2) {
        this.a = g7hVar;
        this.b = z;
        this.c = iujVar;
        this.d = function1;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() throws pxb {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        mh5.b("Unexpected form of a provided value");
        t3p.v();
        return null;
    }
}
