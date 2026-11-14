package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n5c implements vfd {
    public final j5c a;
    public final ikk b;
    public final k5c c;
    public final jde d;

    public n5c(j5c j5cVar, ikk ikkVar) {
        this.a = j5cVar;
        this.b = ikkVar;
        this.c = (k5c) j5cVar.b.invoke();
        xbb.a();
        this.d = new jde();
    }

    @Override // defpackage.vfd
    public final ufd A(int i, int i2, Map map, z3 z3Var, Function1 function1) {
        return this.b.A(i, i2, map, z3Var, function1);
    }

    @Override // defpackage.shb
    public final boolean F() {
        return this.b.F();
    }

    @Override // defpackage.n27
    public final int M(float f) {
        return this.b.M(f);
    }

    @Override // defpackage.n27
    public final float Q(long j) {
        return this.b.Q(j);
    }

    public final List a(int i) {
        jde jdeVar = this.d;
        List list = (List) jdeVar.e(i);
        if (list != null) {
            return list;
        }
        k5c k5cVar = this.c;
        Object objD = k5cVar.d(i);
        List listI = this.b.i(objD, this.a.a(i, objD, k5cVar.b(i)));
        jdeVar.i(i, listI);
        return listI;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.b.b();
    }

    @Override // defpackage.vfd
    public final ufd b0(int i, int i2, Map map, Function1 function1) {
        return this.b.b0(i, i2, map, function1);
    }

    @Override // defpackage.shb
    public final d2c getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.n27
    public final long j(float f) {
        return this.b.j(f);
    }

    @Override // defpackage.n27
    public final float j0(int i) {
        return this.b.j0(i);
    }

    @Override // defpackage.n27
    public final long k(long j) {
        return this.b.k(j);
    }

    @Override // defpackage.n27
    public final float k0(float f) {
        return this.b.k0(f);
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.b.n0();
    }

    @Override // defpackage.n27
    public final float o(long j) {
        return this.b.o(j);
    }

    @Override // defpackage.n27
    public final float o0(float f) {
        return this.b.o0(f);
    }

    @Override // defpackage.n27
    public final int t0(long j) {
        return this.b.t0(j);
    }

    @Override // defpackage.n27
    public final long u(float f) {
        return this.b.u(f);
    }

    @Override // defpackage.n27
    public final long y0(long j) {
        return this.b.y0(j);
    }
}
