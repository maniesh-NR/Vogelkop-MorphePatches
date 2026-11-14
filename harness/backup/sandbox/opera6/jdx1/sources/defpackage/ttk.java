package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ttk implements Function2 {
    public final /* synthetic */ c8e a;
    public final /* synthetic */ paj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ go3 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lde g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ float j;
    public final /* synthetic */ ue5 k;

    public ttk(c8e c8eVar, paj pajVar, long j, float f, go3 go3Var, boolean z, lde ldeVar, boolean z2, Function0 function0, float f2, ue5 ue5Var) {
        this.a = c8eVar;
        this.b = pajVar;
        this.c = j;
        this.d = f;
        this.e = go3Var;
        this.f = z;
        this.g = ldeVar;
        this.h = z2;
        this.i = function0;
        this.j = f2;
        this.k = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            mga mgaVar = xdb.a;
            c8e c8eVarM = wyh.m(sgb.X(utk.c(this.a.d(r0e.b), this.b, utk.d(this.c, this.d, vt9Var), this.e, ((n27) vt9Var.j(mi5.h)).o0(this.j)), this.f, this.g, n5i.a(7, 0.0f, false), this.h, null, this.i));
            tfd tfdVarC = nr3.c(rbe.b, true);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarM);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r(0, this.k, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
