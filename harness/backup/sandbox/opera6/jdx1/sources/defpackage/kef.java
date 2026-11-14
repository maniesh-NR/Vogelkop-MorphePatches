package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class kef implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ eef c;
    public final /* synthetic */ float d;
    public final /* synthetic */ agm e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Map g;
    public final /* synthetic */ fef h;

    public /* synthetic */ kef(fef fefVar, float f, eef eefVar, agm agmVar, long j, Map map, Function0 function0) {
        this.h = fefVar;
        this.d = f;
        this.c = eefVar;
        this.e = agmVar;
        this.f = j;
        this.g = map;
        this.b = function0;
    }

    public /* synthetic */ kef(Function0 function0, eef eefVar, float f, agm agmVar, long j, Map map, fef fefVar, int i) {
        this.b = function0;
        this.c = eefVar;
        this.d = f;
        this.e = agmVar;
        this.f = j;
        this.g = map;
        this.h = fefVar;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        fef fefVar;
        Object u95Var;
        float f;
        srj srjVar;
        Object bffVar;
        afe afeVar;
        switch (this.a) {
            case 0:
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fef fefVar2 = this.h;
                    long j = fefVar2.e;
                    long j2 = fefVar2.d;
                    float f2 = fefVar2.h;
                    float fB = kh7.b(j);
                    float fB2 = kh7.b(j2);
                    float f3 = this.d;
                    float fG = yi4.G(fB, fB2, f3);
                    float fG2 = yi4.G(kh7.a(fefVar2.e), kh7.a(j2), f3);
                    float fG3 = yi4.G(2.0f, fefVar2.a, f3);
                    unf unfVar = pof.a;
                    double d = f3;
                    long jE0 = cs5.e0(pof.a(vt9Var).a.o(), pof.a(vt9Var).a.j(), (float) Math.pow(d, 3.0d));
                    float fPow = (float) Math.pow(d, 3.0d);
                    hh7 hh7Var = new hh7(yi4.G(fefVar2.c, fefVar2.b, f3));
                    srj srjVar2 = new srj(hh7Var, hh7Var, hh7Var, hh7Var);
                    aln alnVar = this.c.a;
                    Context context = (Context) vt9Var.j(j41.b);
                    long j3 = this.f;
                    o2c o2cVar = new o2c(false, (int) (j3 >> 32), (int) (j3 & 4294967295L), false);
                    boolean zG = vt9Var.g(((Boolean) vt9Var.j(rof.b)).booleanValue()) | vt9Var.f(alnVar.getId()) | vt9Var.f(o2cVar);
                    Object objK = vt9Var.K();
                    zpa zpaVar = hh5.a;
                    if (zG || objK == zpaVar) {
                        objK = alnVar.c(context, o2cVar);
                        vt9Var.g0(objK);
                    }
                    xkn xknVar = (xkn) objK;
                    boolean zF = vt9Var.f(xknVar);
                    Object objK2 = vt9Var.K();
                    if (zF || objK2 == zpaVar) {
                        fefVar = fefVar2;
                        u95Var = new u95(cs5.c(xknVar.f));
                        vt9Var.g0(u95Var);
                    } else {
                        u95Var = objK2;
                        fefVar = fefVar2;
                    }
                    long j4 = ((u95) u95Var).a;
                    Integer num = alnVar instanceof ill ? 2131233223 : null;
                    boolean zF2 = vt9Var.f(xknVar);
                    Object objK3 = vt9Var.K();
                    fef fefVar3 = fefVar;
                    Map map = this.g;
                    if (zF2 || objK3 == zpaVar) {
                        yg3 yg3Var = (yg3) map.get(xknVar);
                        f = fPow;
                        if (yg3Var != null) {
                            srjVar = srjVar2;
                            bffVar = new dff(yg3Var, j4, false);
                        } else {
                            srjVar = srjVar2;
                            bffVar = xknVar.c == null ? new bff(j4, num) : new eff(j4);
                        }
                        objK3 = hyg.k(bffVar);
                        vt9Var.g0(objK3);
                    } else {
                        f = fPow;
                        srjVar = srjVar2;
                    }
                    afe afeVar2 = (afe) objK3;
                    boolean zH = vt9Var.h(xknVar) | vt9Var.h(map);
                    agm agmVar = this.e;
                    boolean zH2 = zH | vt9Var.h(agmVar) | vt9Var.f(afeVar2) | vt9Var.e(j4) | vt9Var.f(num) | vt9Var.h(o2cVar);
                    Object objK4 = vt9Var.K();
                    if (zH2 || objK4 == zpaVar) {
                        afeVar = afeVar2;
                        objK4 = new aff(xknVar, map, agmVar, o2cVar, afeVar, j4, num, (mt5) null);
                        vt9Var.g0(objK4);
                    } else {
                        afeVar = afeVar2;
                    }
                    rm5.e(vt9Var, xknVar, (Function2) objK4);
                    z7e z7eVar = z7e.b;
                    srj srjVar3 = srjVar;
                    c8e c8eVarQ = jpo.q(x1p.j(lcp.j(mpj.i(z7eVar, fG, fG2), fG3, jE0, srjVar3), srjVar3), false, (String) null, this.b, 15);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarQ);
                    bh5.To.getClass();
                    vt9Var.a0();
                    boolean z = vt9Var.S;
                    Function0 function0 = m3c.S;
                    if (z) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    ah5 ah5Var = ujp.f;
                    y4h.o(vt9Var, tfdVarC, ah5Var);
                    ah5 ah5Var2 = ujp.e;
                    y4h.o(vt9Var, oagVarL, ah5Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ah5 ah5Var3 = ujp.g;
                    y4h.o(vt9Var, numValueOf, ah5Var3);
                    y4h.m(vt9Var);
                    ah5 ah5Var4 = ujp.d;
                    y4h.o(vt9Var, c8eVarP, ah5Var4);
                    phj.q((fff) afeVar.getValue(), mpj.i(z7eVar, fG, fG2), vt9Var, 48);
                    c8e c8eVarO = y9m.o(z7eVar, f);
                    float f4 = fefVar3.f;
                    c8e c8eVarB0 = a26.b0(c8eVarO, f4, fefVar3.g, f4, 0.0f, 8);
                    db5 db5VarA = cb5.a(new x62(fefVar3.i, true, new t40((byte) 19)), rbe.n, vt9Var, 0);
                    int iHashCode2 = Long.hashCode(vt9Var.T);
                    oag oagVarL2 = vt9Var.l();
                    c8e c8eVarP2 = qyn.P(vt9Var, c8eVarB0);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ah5Var);
                    y4h.o(vt9Var, oagVarL2, ah5Var2);
                    u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP2, ah5Var4);
                    i39 i39Var = mpj.a;
                    nr3.a(sfe.C(mpj.c(i39Var, f2), pof.a(vt9Var).a.y(), v8i.a(f2)), vt9Var, 0);
                    o9i o9iVarA = m9i.a(b72.f, rbe.k, vt9Var, 6);
                    int iHashCode3 = Long.hashCode(vt9Var.T);
                    oag oagVarL3 = vt9Var.l();
                    c8e c8eVarP3 = qyn.P(vt9Var, i39Var);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ah5Var);
                    y4h.o(vt9Var, oagVarL3, ah5Var2);
                    u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP3, ah5Var4);
                    vt9Var.W(-368009737);
                    for (int i = 0; i < 4; i++) {
                        c8e c8eVarH = mpj.h(z7eVar, f2);
                        unf unfVar2 = pof.a;
                        nr3.a(sfe.C(c8eVarH, pof.a(vt9Var).a.y(), v8i.a), vt9Var, 0);
                    }
                    vt9Var.p(false);
                    vt9Var.p(true);
                    vt9Var.p(true);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fr3.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (ih5) obj, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
