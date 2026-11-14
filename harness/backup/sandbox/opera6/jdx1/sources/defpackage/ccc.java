package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ccc implements dr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ccc(List list, Object obj, Function1 function1, Object obj2, byte b) {
        this.a = b;
        this.b = list;
        this.c = obj;
        this.d = function1;
        this.e = obj2;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Function2 function2;
        long j;
        yza yzaVarX;
        int i2;
        byte b = this.a;
        Object obj5 = this.e;
        zpa zpaVar = hh5.a;
        z7e z7eVar = z7e.b;
        g1b g1bVar = this.b;
        ldh ldhVar = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                y4c y4cVar = (y4c) obj;
                int iIntValue = ((Number) obj2).intValue();
                ih5 ih5Var = (ih5) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((vt9) ih5Var).f(y4cVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((vt9) ih5Var).d(iIntValue) ? 32 : 16;
                }
                int i3 = i;
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
                    w27 w27Var = (w27) g1bVar.get(iIntValue);
                    vt9Var.W(242361366);
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, z7eVar);
                    bh5.To.getClass();
                    vt9Var.a0();
                    boolean z2 = vt9Var.S;
                    Function0 function0 = m3c.S;
                    if (z2) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    Function2 function22 = ujp.f;
                    y4h.o(vt9Var, db5VarA, function22);
                    ah5 ah5Var = ujp.e;
                    y4h.o(vt9Var, oagVarL, ah5Var);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ah5 ah5Var2 = ujp.g;
                    y4h.o(vt9Var, numValueOf, ah5Var2);
                    y4h.m(vt9Var);
                    ah5 ah5Var3 = ujp.d;
                    y4h.o(vt9Var, c8eVarP, ah5Var3);
                    boolean zContainsKey = ((ruj) obj6).containsKey(Integer.valueOf(iIntValue));
                    vt9Var.W(-2827952);
                    c8e c8eVarE = mpj.e(mpj.a, 64.0f, 2);
                    boolean zG = vt9Var.g(zContainsKey) | ((((i3 & 112) ^ 48) > 32 && vt9Var.d(iIntValue)) || (i3 & 48) == 32) | vt9Var.f(ldhVar) | vt9Var.f(w27Var);
                    Object objK = vt9Var.K();
                    if (zG || objK == zpaVar) {
                        objK = new bcc(zContainsKey, (ruj) obj6, iIntValue, this.d, w27Var);
                        z = zContainsKey;
                        vt9Var.g0(objK);
                    } else {
                        z = zContainsKey;
                    }
                    c8e c8eVarQ = jpo.q(c8eVarE, false, (String) null, (Function0) objK, 15);
                    if (z) {
                        vt9Var.W(-1590156428);
                        function2 = function22;
                        c8eVarQ = sfe.C(c8eVarQ, ((sa5) vt9Var.j(ua5.a)).a, kfo.i);
                        vt9Var.p(false);
                    } else {
                        function2 = function22;
                        vt9Var.W(-1590033110);
                        vt9Var.p(false);
                    }
                    vt9Var.p(false);
                    c8e c8eVarY = a26.Y(c8eVarQ, 24.0f, 16.0f);
                    o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 48);
                    int iHashCode2 = Long.hashCode(vt9Var.T);
                    oag oagVarL2 = vt9Var.l();
                    c8e c8eVarP2 = qyn.P(vt9Var, c8eVarY);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, function2);
                    y4h.o(vt9Var, oagVarL2, ah5Var);
                    u35.j(iHashCode2, vt9Var, ah5Var2, vt9Var);
                    y4h.o(vt9Var, c8eVarP2, ah5Var3);
                    if (z) {
                        vt9Var.W(878193609);
                        j = ((sa5) vt9Var.j(ua5.a)).b;
                        vt9Var.p(false);
                        yzaVarX = scd.F();
                    } else {
                        vt9Var.W(878194921);
                        j = ((sa5) vt9Var.j(ua5.a)).q;
                        vt9Var.p(false);
                        yzaVarX = na2.x();
                    }
                    long j2 = j;
                    wta.a(yzaVarX, null, null, j2, vt9Var, 48, 4);
                    ocp.c(vt9Var, mpj.h(z7eVar, 16.0f));
                    ijl.b(w27Var.a, null, j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).h, vt9Var, 0, 0, 131066);
                    vt9Var.p(true);
                    xf8.e(z, null, o48.d(null, 15).a(o48.e(null, 3)), o48.j().a(o48.f(null, 3)), null, gyg.P(151237068, new acc((jbg) obj5, w27Var), vt9Var), vt9Var, 1600518, 18);
                    vt9Var.p(true);
                    vt9Var.p(false);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                y4c y4cVar2 = (y4c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ih5 ih5Var2 = (ih5) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ldh ldhVar2 = ldhVar;
                String str = (String) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((vt9) ih5Var2).f(y4cVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((vt9) ih5Var2).d(iIntValue3) ? 32 : 16;
                }
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(i2 & 1, (i2 & 147) != 146)) {
                    c2i c2iVar = (c2i) g1bVar.get(iIntValue3);
                    vt9Var2.W(-1514359992);
                    boolean zA = Intrinsics.a(str, c2iVar.j);
                    boolean z3 = str == null;
                    c8e c8eVarZ = a26.Z(z7eVar, 16.0f, 0.0f, 2);
                    boolean zF = vt9Var2.f(ldhVar2) | vt9Var2.h(c2iVar);
                    Object objK2 = vt9Var2.K();
                    if (zF || objK2 == zpaVar) {
                        objK2 = new m91(ldhVar2, c2iVar, (byte) 10);
                        vt9Var2.g0(objK2);
                    }
                    jym.b(c2iVar, (ldh) obj5, f03.O(c8eVarZ, (Function1) objK2), zA, z3, vt9Var2, 8);
                    vt9Var2.p(false);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}
