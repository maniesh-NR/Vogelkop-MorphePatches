package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p48 extends ozb implements Function1 {
    public final /* synthetic */ s48 i;
    public final /* synthetic */ p2m j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ ifg m;
    public final /* synthetic */ long n;
    public final /* synthetic */ k48 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p48(s48 s48Var, p2m p2mVar, long j, long j2, long j3, ifg ifgVar, long j4, k48 k48Var) {
        super(1);
        this.i = s48Var;
        this.j = p2mVar;
        this.k = j2;
        this.l = j3;
        this.m = ifgVar;
        this.n = j4;
        this.o = k48Var;
    }

    public final Object invoke(Object obj) {
        p1d p1dVar = (p1d) obj;
        s48 s48Var = this.i;
        ndj ndjVar = s48Var.v;
        p2m p2mVar = this.j;
        long j = p2mVar != null ? ((ybb) p2mVar.getValue()).a : 0L;
        ndjVar.b();
        ndjVar.b();
        long jC = ybb.c(j, 0L);
        if (ndjVar.b()) {
            ndjVar.i = jC;
        }
        rz0 rz0Var = s48Var.z;
        long jC2 = ybb.c(rz0Var != null ? rz0Var.a(this.k, this.l, d2c.a) : 0L, jC);
        long j2 = this.n;
        long j3 = ((((int) (jC2 >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
        ifg ifgVar = this.m;
        p1dVar.d(ifgVar);
        ifgVar.d0(ybb.c(j3, ifgVar.e), 0.0f, this.o);
        return Unit.a;
    }
}
