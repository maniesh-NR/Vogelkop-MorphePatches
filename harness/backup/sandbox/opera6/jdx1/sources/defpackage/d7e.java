package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d7e implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ pej c;
    public final /* synthetic */ j7e d;
    public final /* synthetic */ cd1 e;
    public final /* synthetic */ nx5 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ c8e h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ paj k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ ue5 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ ue5 p;

    public d7e(long j, Function0 function0, pej pejVar, j7e j7eVar, cd1 cd1Var, nx5 nx5Var, Function1 function1, c8e c8eVar, float f, boolean z, paj pajVar, long j2, long j3, ue5 ue5Var, Function2 function2, ue5 ue5Var2) {
        this.a = j;
        this.b = function0;
        this.c = pejVar;
        this.d = j7eVar;
        this.e = cd1Var;
        this.f = nx5Var;
        this.g = function1;
        this.h = c8eVar;
        this.i = f;
        this.j = z;
        this.k = pajVar;
        this.l = j2;
        this.m = j3;
        this.n = ue5Var;
        this.o = function2;
        this.p = ue5Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Number) obj2).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            c8e c8eVarF = wxe.F(mpj.c);
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = new uvc((byte) 28);
                vt9Var.g0(objK);
            }
            c8e c8eVarA = h0j.a(c8eVarF, false, (Function1) objK);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarA);
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
            pej pejVar = this.c;
            boolean z = ((qej) ((i37) pejVar.d.j).getValue()) != qej.a;
            this.d.getClass();
            long j = this.a;
            Function0 function0 = this.b;
            i7e.c(j, function0, z, vt9Var, 0);
            i7e.b(this.e, this.f, function0, this.g, this.h, pejVar, this.i, this.j, this.k, this.l, this.m, 0.0f, this.n, this.o, this.p, vt9Var, 70);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
