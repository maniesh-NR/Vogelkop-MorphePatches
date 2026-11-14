package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e8l {
    public final b2l a;
    public int b;
    public final pde c = new pde(f8l.c);
    public boolean d;
    public final q6l e;
    public final qlk f;
    public final /* synthetic */ j8l g;

    public e8l(j8l j8lVar, b2l b2lVar, int i) {
        this.g = j8lVar;
        this.a = b2lVar;
        this.b = i;
        q6l q6lVar = new q6l(this, (byte) 1);
        this.e = q6lVar;
        this.f = new qlk(this, (byte) 27);
        j8lVar.c.put(b2lVar, this);
        ((d7l) b2lVar).F(q6lVar);
        c();
    }

    public final boolean a() {
        return (((d7l) this.a).m || this.b <= 0 || Intrinsics.a(this.c.g(), g8l.c)) ? false : true;
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.g.c;
        b2l b2lVar = this.a;
        linkedHashMap.remove(b2lVar);
        ((d7l) b2lVar).H(this.e);
        vml.a(this.f);
        this.c.r(g8l.c);
    }

    public final void c() {
        if (this.d) {
            return;
        }
        if (!a()) {
            b();
            return;
        }
        vml.a(this.f);
        this.b--;
        this.d = true;
        this.g.a.b(this.a, new qv3(this, (byte) 1));
    }
}
