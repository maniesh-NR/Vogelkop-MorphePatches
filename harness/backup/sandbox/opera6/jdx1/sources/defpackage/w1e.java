package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class w1e implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mk8 b;
    public final /* synthetic */ e2e c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ c8e f;

    public /* synthetic */ w1e(c8e c8eVar, e2e e2eVar, mk8 mk8Var, Function1 function1, Function1 function12) {
        this.f = c8eVar;
        this.c = e2eVar;
        this.b = mk8Var;
        this.d = function1;
        this.e = function12;
    }

    public /* synthetic */ w1e(mk8 mk8Var, e2e e2eVar, Function1 function1, Function1 function12, c8e c8eVar, int i) {
        this.b = mk8Var;
        this.c = e2eVar;
        this.d = function1;
        this.e = function12;
        this.f = c8eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    public final Object invoke(Object obj, Object obj2) throws oye {
        ?? r8;
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x62 x62Var = new x62(12.0f, true, new t40((byte) 19));
                    c8e c8eVarX = a26.X(this.f, 16.0f);
                    db5 db5VarA = cb5.a(x62Var, rbe.n, vt9Var, 6);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
                    bh5.To.getClass();
                    vt9Var.a0();
                    boolean z = vt9Var.S;
                    fza fzaVar = m3c.S;
                    if (z) {
                        vt9Var.k(fzaVar);
                    } else {
                        vt9Var.j0();
                    }
                    ah5 ah5Var = ujp.f;
                    y4h.o(vt9Var, db5VarA, ah5Var);
                    ah5 ah5Var2 = ujp.e;
                    y4h.o(vt9Var, oagVarL, ah5Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ah5 ah5Var3 = ujp.g;
                    y4h.o(vt9Var, numValueOf, ah5Var3);
                    y4h.m(vt9Var);
                    ah5 ah5Var4 = ujp.d;
                    y4h.o(vt9Var, c8eVarP, ah5Var4);
                    sd3 sd3Var = rbe.l;
                    o9i o9iVarA = m9i.a(new x62(12.0f, true, new t40((byte) 19)), sd3Var, vt9Var, 54);
                    int iHashCode2 = Long.hashCode(vt9Var.T);
                    oag oagVarL2 = vt9Var.l();
                    z7e z7eVar = z7e.b;
                    c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(fzaVar);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ah5Var);
                    y4h.o(vt9Var, oagVarL2, ah5Var2);
                    u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP2, ah5Var4);
                    mk8 mk8Var = this.b;
                    long j = mk8Var.a;
                    long j2 = mk8Var.b;
                    e2e e2eVar = this.c;
                    uup.g(e2eVar, j, j2, vt9Var, 0);
                    if (1.0f <= 0.0d) {
                        y7b.a("invalid weight; must be greater than zero");
                    }
                    g4c g4cVar = new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    v1e v1eVar = e2eVar.a;
                    int i = e2eVar.b;
                    String str = v1eVar.e;
                    hp7 hp7Var = abm.a;
                    ijl.b(str, g4cVar, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, ((wam) vt9Var.j(hp7Var)).j, vt9Var, 0, 24960, 110588);
                    if (v1eVar.p != null) {
                        vt9Var.W(1465762922);
                        Function1 function1 = this.d;
                        boolean zF = vt9Var.f(function1) | vt9Var.f(e2eVar);
                        Object objK = vt9Var.K();
                        if (zF || objK == hh5.a) {
                            objK = new x1e(function1, e2eVar, (byte) 0);
                            vt9Var.g0(objK);
                        }
                        long jB = u95.b(mk8Var.b, 0.6f);
                        u8i u8iVar = v8i.a;
                        h9g h9gVar = new h9g(50.0f);
                        f03.a((Function0) objK, mpj.h(sfe.C(z7eVar, jB, new u8i(h9gVar, h9gVar, h9gVar, h9gVar)), 40.0f), false, (pta) null, (paj) null, gyg.P(-1732262788, new a7b(mk8Var, (byte) 13), vt9Var), vt9Var, 1572864, 60);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(1466473101);
                        vt9Var.p(false);
                    }
                    vt9Var.p(true);
                    ijl.b(v1eVar.f, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
                    o9i o9iVarA2 = m9i.a(new x62(12.0f, true, new t40((byte) 19)), sd3Var, vt9Var, 54);
                    int iHashCode3 = Long.hashCode(vt9Var.T);
                    oag oagVarL3 = vt9Var.l();
                    c8e c8eVarP3 = qyn.P(vt9Var, z7eVar);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(fzaVar);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA2, ah5Var);
                    y4h.o(vt9Var, oagVarL3, ah5Var2);
                    u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP3, ah5Var4);
                    if (1.0f <= 0.0d) {
                        y7b.a("invalid weight; must be greater than zero");
                    }
                    vtp.h(e2eVar, mk8Var, this.e, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), vt9Var, 0);
                    if (v1eVar.d == s1e.c) {
                        vt9Var.W(675207292);
                        Iterator it = v1eVar.h.iterator();
                        while (it.hasNext()) {
                            z4o.a((n01) it.next(), false, null, vt9Var, 48);
                        }
                        r8 = 0;
                        vt9Var.p(false);
                    } else {
                        r8 = 0;
                        vt9Var.W(675368740);
                        vt9Var.p(false);
                    }
                    if (i > 0) {
                        vt9Var.W(675411272);
                        vtp.b(i, vt9Var, r8);
                        vt9Var.p(r8);
                    } else {
                        vt9Var.W(675468932);
                        vt9Var.p(r8);
                    }
                    vt9Var.p(true);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vtp.i(this.b, this.c, this.d, this.e, this.f, (ih5) obj, aoh.m(24577));
                break;
        }
        return Unit.a;
    }
}
