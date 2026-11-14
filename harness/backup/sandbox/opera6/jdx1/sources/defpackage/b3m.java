package defpackage;

import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b3m {
    public final cfe a;
    public final b3m b;
    public final String c;
    public final t0g d = hyg.k(c());
    public final t0g e = hyg.k((Object) null);
    public final t0g f = hyg.k(new v2m(c(), c()));
    public final r0g g = new r0g(0);
    public final r0g h = new r0g(Long.MIN_VALUE);
    public final t0g i;
    public final puj j;
    public final puj k;
    public final t0g l;

    public b3m(cfe cfeVar, b3m b3mVar, String str) {
        this.a = cfeVar;
        this.b = b3mVar;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.i = hyg.k(bool);
        this.j = new puj();
        this.k = new puj();
        this.l = hyg.k(bool);
        luj.b(new n2m(this, (byte) 1));
        cfeVar.getClass();
    }

    public final void a(Object obj, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var.f(obj) : vt9Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(this) ? 32 : 16;
        }
        byte b = 0;
        if (!vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            vt9Var.Q();
        } else if (g()) {
            vt9Var.W(467722849);
            vt9Var.p(false);
        } else {
            vt9Var.W(466062241);
            k(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = luj.b(new n2m(this, b));
                vt9Var.g0(objK);
            }
            if (((Boolean) ((iak) objK).getValue()).booleanValue()) {
                vt9Var.W(466470356);
                Object objK2 = vt9Var.K();
                if (objK2 == zpaVar) {
                    objK2 = rm5.p(h.a, vt9Var);
                    vt9Var.g0(objK2);
                }
                nx5 nx5Var = (nx5) objK2;
                boolean zH = vt9Var.h(nx5Var) | (i3 == 32);
                Object objK3 = vt9Var.K();
                if (zH || objK3 == zpaVar) {
                    objK3 = new gil(nx5Var, this, (byte) 9);
                    vt9Var.g0(objK3);
                }
                rm5.a(nx5Var, this, (Function1) objK3, vt9Var);
                vt9Var.p(false);
            } else {
                vt9Var.W(467712929);
                vt9Var.p(false);
            }
            vt9Var.p(false);
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(this, obj, i, (byte) 11);
        }
    }

    public final long b() {
        puj pujVar = this.j;
        int size = pujVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((w2m) pujVar.get(i)).j.h());
        }
        puj pujVar2 = this.k;
        int size2 = pujVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((b3m) pujVar2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return this.a.b.getValue();
    }

    public final boolean d() {
        puj pujVar = this.j;
        int size = pujVar.size();
        for (int i = 0; i < size; i++) {
            ((w2m) pujVar.get(i)).getClass();
        }
        puj pujVar2 = this.k;
        int size2 = pujVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((b3m) pujVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        b3m b3mVar = this.b;
        return b3mVar != null ? b3mVar.e() : this.g.h();
    }

    public final u2m f() {
        return (u2m) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        r0g r0gVar = this.h;
        long jH = r0gVar.h();
        cfe cfeVar = this.a;
        if (jH == Long.MIN_VALUE) {
            r0gVar.i(j);
            cfeVar.a.setValue(Boolean.TRUE);
        } else if (!((Boolean) cfeVar.a.getValue()).booleanValue()) {
            cfeVar.a.setValue(Boolean.TRUE);
        }
        this.i.setValue(Boolean.FALSE);
        puj pujVar = this.j;
        int size = pujVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            w2m w2mVar = (w2m) pujVar.get(i);
            t0g t0gVar = w2mVar.e;
            t0g t0gVar2 = w2mVar.e;
            if (!((Boolean) t0gVar.getValue()).booleanValue()) {
                long jE = z ? w2mVar.b().e() : j;
                w2mVar.d(w2mVar.b().g(jE));
                w2mVar.i = w2mVar.b().c(jE);
                if (w2mVar.b().d(jE)) {
                    t0gVar2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) t0gVar2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        puj pujVar2 = this.k;
        int size2 = pujVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b3m b3mVar = (b3m) pujVar2.get(i2);
            if (!Intrinsics.a(b3mVar.d.getValue(), b3mVar.c())) {
                b3mVar.h(j, z);
            }
            if (!Intrinsics.a(b3mVar.d.getValue(), b3mVar.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.i(Long.MIN_VALUE);
        cfe cfeVar = this.a;
        if (cfeVar != null) {
            cfeVar.b.setValue(this.d.getValue());
        }
        if (this.b == null) {
            this.g.i(0L);
        }
        cfeVar.a.setValue(Boolean.FALSE);
        puj pujVar = this.k;
        int size = pujVar.size();
        for (int i = 0; i < size; i++) {
            ((b3m) pujVar.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.h.i(Long.MIN_VALUE);
        cfe cfeVar = this.a;
        cfeVar.a.setValue(Boolean.FALSE);
        boolean zG = g();
        t0g t0gVar = this.d;
        if (!zG || !Intrinsics.a(c(), obj) || !Intrinsics.a(t0gVar.getValue(), obj2)) {
            if (!Intrinsics.a(c(), obj)) {
                cfeVar.b.setValue(obj);
            }
            t0gVar.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new v2m(obj, obj2));
        }
        puj pujVar = this.k;
        int size = pujVar.size();
        for (int i = 0; i < size; i++) {
            b3m b3mVar = (b3m) pujVar.get(i);
            if (b3mVar.g()) {
                b3mVar.j(b3mVar.c(), b3mVar.d.getValue());
            }
        }
        puj pujVar2 = this.j;
        int size2 = pujVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((w2m) pujVar2.get(i2)).c();
        }
    }

    public final void k(Object obj) {
        t0g t0gVar = this.d;
        if (Intrinsics.a(t0gVar.getValue(), obj)) {
            return;
        }
        this.f.setValue(new v2m(t0gVar.getValue(), obj));
        if (!Intrinsics.a(c(), t0gVar.getValue())) {
            this.a.b.setValue(t0gVar.getValue());
        }
        t0gVar.setValue(obj);
        if (this.h.h() == Long.MIN_VALUE) {
            this.i.setValue(Boolean.TRUE);
        }
        puj pujVar = this.j;
        int size = pujVar.size();
        for (int i = 0; i < size; i++) {
            ((w2m) pujVar.get(i)).f.i(-2.0f);
        }
    }

    public final String toString() {
        puj pujVar = this.j;
        int size = pujVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((w2m) pujVar.get(i)) + ", ";
        }
        return str;
    }
}
