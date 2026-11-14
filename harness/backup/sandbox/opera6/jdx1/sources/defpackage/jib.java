package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jib implements vfd, shb {
    public final /* synthetic */ shb a;
    public final d2c b;

    public jib(shb shbVar, d2c d2cVar) {
        this.a = shbVar;
        this.b = d2cVar;
    }

    @Override // defpackage.vfd
    public final ufd A(int i, int i2, Map map, z3 z3Var, Function1 function1) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            a8b.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new iib(i, i2, map, z3Var);
    }

    @Override // defpackage.shb
    public final boolean F() {
        return this.a.F();
    }

    @Override // defpackage.n27
    public final int M(float f) {
        return this.a.M(f);
    }

    @Override // defpackage.n27
    public final float Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.shb
    public final d2c getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.n27
    public final long j(float f) {
        return this.a.j(f);
    }

    @Override // defpackage.n27
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.n27
    public final long k(long j) {
        return this.a.k(j);
    }

    @Override // defpackage.n27
    public final float k0(float f) {
        return this.a.k0(f);
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.a.n0();
    }

    @Override // defpackage.n27
    public final float o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.n27
    public final float o0(float f) {
        return this.a.o0(f);
    }

    @Override // defpackage.n27
    public final int t0(long j) {
        return this.a.t0(j);
    }

    @Override // defpackage.n27
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.n27
    public final long y0(long j) {
        return this.a.y0(j);
    }
}
