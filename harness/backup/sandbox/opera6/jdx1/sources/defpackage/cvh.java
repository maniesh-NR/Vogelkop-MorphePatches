package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cvh extends evh implements gb6 {
    public final fxi f;

    public cvh(oj9 oj9Var, h1b h1bVar, fxi fxiVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(oj9Var, h1bVar, fxiVar, arrayList, arrayList2, arrayList3);
        this.f = fxiVar;
    }

    @Override // defpackage.gb6
    public final boolean P() {
        return this.f.i();
    }

    @Override // defpackage.gb6
    public final long S() {
        return this.f.d;
    }

    @Override // defpackage.gb6
    public final long V(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // defpackage.gb6
    public final long a(long j, long j2) {
        return this.f.e(j, j2);
    }

    @Override // defpackage.evh
    public final gb6 c() {
        return this;
    }

    @Override // defpackage.gb6
    public final long getTimeUs(long j) {
        return this.f.g(j);
    }

    @Override // defpackage.gb6
    public final long k(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // defpackage.gb6
    public final long m(long j, long j2) {
        fxi fxiVar = this.f;
        if (fxiVar.f != null) {
            return -9223372036854775807L;
        }
        long jB = fxiVar.b(j, j2) + fxiVar.c(j, j2);
        return (fxiVar.e(jB, j) + fxiVar.g(jB)) - fxiVar.i;
    }

    @Override // defpackage.gb6
    public final bjh n(long j) {
        return this.f.h(this, j);
    }

    @Override // defpackage.gb6
    public final long r(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // defpackage.gb6
    public final long z(long j) {
        return this.f.d(j);
    }
}
