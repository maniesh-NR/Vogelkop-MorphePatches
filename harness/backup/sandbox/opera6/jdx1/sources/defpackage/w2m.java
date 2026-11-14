package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w2m implements iak {
    public final j8m a;
    public final t0g b;
    public final t0g c;
    public final t0g d;
    public final t0g e;
    public final p0g f;
    public boolean g;
    public final t0g h;
    public if1 i;
    public final r0g j;
    public boolean k;
    public final a2k l;
    public final /* synthetic */ b3m m;

    public w2m(b3m b3mVar, Object obj, if1 if1Var, j8m j8mVar) {
        this.m = b3mVar;
        this.a = j8mVar;
        t0g t0gVarK = hyg.k(obj);
        this.b = t0gVarK;
        Object objInvoke = null;
        t0g t0gVarK2 = hyg.k(rm5.R(0.0f, 0.0f, null, 7));
        this.c = t0gVarK2;
        this.d = hyg.k(new ecl((h49) t0gVarK2.getValue(), j8mVar, obj, t0gVarK.getValue(), if1Var));
        this.e = hyg.k(Boolean.TRUE);
        this.f = new p0g(-1.0f);
        this.h = hyg.k(obj);
        this.i = if1Var;
        this.j = new r0g(b().e());
        Float f = (Float) tan.a.get(j8mVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            if1 if1Var2 = (if1) j8mVar.a.invoke(obj);
            int iB = if1Var2.b();
            for (int i = 0; i < iB; i++) {
                if1Var2.e(fFloatValue, i);
            }
            objInvoke = this.a.b.invoke(if1Var2);
        }
        this.l = rm5.R(0.0f, 0.0f, objInvoke, 3);
    }

    public final ecl b() {
        return (ecl) this.d.getValue();
    }

    public final void c() {
        if (this.f.h() == -1.0f) {
            this.k = true;
            if (Intrinsics.a(b().c, b().d)) {
                d(b().c);
            } else {
                d(b().g(0L));
                this.i = b().c(0L);
            }
        }
    }

    public final void d(Object obj) {
        this.h.setValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [s3k] */
    public final void f(Object obj, boolean z) {
        t0g t0gVar = this.b;
        boolean zA = Intrinsics.a(null, t0gVar.getValue());
        r0g r0gVar = this.j;
        t0g t0gVar2 = this.d;
        h49 s3kVar = this.l;
        if (zA) {
            t0gVar2.setValue(new ecl(s3kVar, this.a, obj, obj, this.i.c()));
            this.g = true;
            r0gVar.i(b().e());
            return;
        }
        t0g t0gVar3 = this.c;
        if (!z || this.k || (((h49) t0gVar3.getValue()) instanceof a2k)) {
            s3kVar = (h49) t0gVar3.getValue();
        }
        b3m b3mVar = this.m;
        long jE = b3mVar.e();
        t0g t0gVar4 = b3mVar.i;
        if (jE > 0) {
            s3kVar = new s3k(s3kVar, b3mVar.e());
        }
        h49 h49Var = s3kVar;
        t0gVar2.setValue(new ecl(h49Var, this.a, obj, t0gVar.getValue(), this.i));
        r0gVar.i(b().e());
        this.g = false;
        t0gVar4.setValue(Boolean.TRUE);
        if (b3mVar.g()) {
            puj pujVar = b3mVar.j;
            int size = pujVar.size();
            for (int i = 0; i < size; i++) {
                w2m w2mVar = (w2m) pujVar.get(i);
                w2mVar.j.h();
                w2mVar.c();
            }
            t0gVar4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, h49 h49Var) {
        this.b.setValue(obj2);
        this.c.setValue(h49Var);
        if (Intrinsics.a(b().d, obj) && Intrinsics.a(b().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return this.h.getValue();
    }

    public final void h(Object obj, h49 h49Var, Object obj2, if1 if1Var) {
        if (this.g && Intrinsics.a(obj, null)) {
            return;
        }
        t0g t0gVar = this.b;
        boolean zA = Intrinsics.a(t0gVar.getValue(), obj);
        p0g p0gVar = this.f;
        if (zA && p0gVar.h() == -1.0f && (obj2 == null || obj2.equals(b().d))) {
            return;
        }
        t0gVar.setValue(obj);
        this.c.setValue(h49Var);
        Object value = obj2 == null ? p0gVar.h() == -3.0f ? obj : this.h.getValue() : obj2;
        if (obj2 != null) {
            d(value);
            if (if1Var != null) {
                this.i = if1Var;
            }
        }
        t0g t0gVar2 = this.e;
        f(value, !((Boolean) t0gVar2.getValue()).booleanValue());
        t0gVar2.setValue(Boolean.valueOf(p0gVar.h() == -3.0f));
        if (p0gVar.h() >= 0.0f) {
            d(b().g((long) (p0gVar.h() * b().e())));
        } else if (p0gVar.h() == -3.0f) {
            d(obj);
        }
        this.g = false;
        p0gVar.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.h.getValue() + ", target: " + this.b.getValue() + ", spec: " + ((h49) this.c.getValue());
    }
}
