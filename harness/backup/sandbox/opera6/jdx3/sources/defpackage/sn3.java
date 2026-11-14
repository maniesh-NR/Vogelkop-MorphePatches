package defpackage;

import ads_mobile_sdk.rh3;
import com.leanplum.core.BuildConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class sn3 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sn3(byte b, int i, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ sn3(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ sn3(Integer num, boolean z) {
        this.a = (byte) 0;
        this.b = z;
        this.c = num;
    }

    public /* synthetic */ sn3(boolean z, ue5 ue5Var, int i) {
        this.a = (byte) 3;
        this.b = z;
        this.c = ue5Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) throws oye {
        String str;
        rh3 rh3Var;
        uo uoVar;
        boolean zH;
        byte b = this.a;
        fza fzaVar = m3c.S;
        z7e z7eVar = z7e.b;
        mq mqVarA = null;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj3;
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x62 x62Var = new x62(4.0f, true, new t40((byte) 19));
                    sd3 sd3Var = rbe.l;
                    c8e c8eVarZ = a26.Z(z7eVar, 8.0f, 0.0f, 2);
                    o9i o9iVarA = m9i.a(x62Var, sd3Var, vt9Var2, 54);
                    int iHashCode = Long.hashCode(vt9Var2.T);
                    oag oagVarL = vt9Var2.l();
                    c8e c8eVarP = qyn.P(vt9Var2, c8eVarZ);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(fzaVar);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, o9iVarA, ujp.f);
                    y4h.o(vt9Var2, oagVarL, ujp.e);
                    y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var2);
                    y4h.o(vt9Var2, c8eVarP, ujp.d);
                    wta.b(iza.a(z ? (dl7) tk7.c.getValue() : (dl7) tk7.b.getValue(), vt9Var2), (String) null, (c8e) null, 0L, vt9Var2, 56, 12);
                    if (z) {
                        str = num + "x";
                    } else {
                        str = BuildConfig.BUILD_NUMBER;
                    }
                    ijl.b(str, (c8e) null, 0L, 0L, ki9.i, 0L, (bgl) null, (pel) null, 0L, 0, false, 1, 0, ((wam) vt9Var2.j(abm.a)).n, vt9Var2, 1572864, 24576, 114622);
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                cs5.i((dil) obj3, z, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 2:
                pqh pqhVar = (pqh) obj3;
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext coroutineContext2 = (CoroutineContext.Element) obj2;
                if (!(coroutineContext2 instanceof wv5)) {
                    return coroutineContext.plus(coroutineContext2);
                }
                if (((CoroutineContext) pqhVar.a).get(coroutineContext2.getKey()) != null) {
                    pqhVar.a = ((CoroutineContext) pqhVar.a).minusKey(coroutineContext2.getKey());
                    return coroutineContext.plus(new rh3());
                }
                if (z) {
                    rh3Var = new rh3();
                } else {
                    rh3Var = (wv5) coroutineContext2;
                }
                return coroutineContext.plus(rh3Var);
            case 3:
                ((Integer) obj2).getClass();
                lk8.b(z, (ue5) obj3, (ih5) obj, aoh.m(49));
                return Unit.a;
            case 4:
                lmf lmfVar = (lmf) obj3;
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k1g.a(lmfVar.b, z ? null : lmfVar.c, (c8e) null, false, (hv4) null, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 5:
                pmf pmfVar = (pmf) obj3;
                vt9 vt9Var5 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = vt9Var5;
                if (vt9Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rih.b(pmfVar.b, z ? null : pmfVar.c, (c8e) null, false, (qih) null, vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 6:
                emf emfVar = (tc2) obj3;
                vt9 vt9Var7 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var8 = vt9Var7;
                if (vt9Var8.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o9i o9iVarA2 = m9i.a(b72.a, rbe.l, vt9Var8, 48);
                    int iHashCode2 = Long.hashCode(vt9Var8.T);
                    oag oagVarL2 = vt9Var8.l();
                    c8e c8eVarP2 = qyn.P(vt9Var8, z7eVar);
                    bh5.To.getClass();
                    vt9Var8.a0();
                    if (vt9Var8.S) {
                        vt9Var8.k(fzaVar);
                    } else {
                        vt9Var8.j0();
                    }
                    ah5 ah5Var = ujp.f;
                    y4h.o(vt9Var8, o9iVarA2, ah5Var);
                    ah5 ah5Var2 = ujp.e;
                    y4h.o(vt9Var8, oagVarL2, ah5Var2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    ah5 ah5Var3 = ujp.g;
                    y4h.o(vt9Var8, numValueOf, ah5Var3);
                    y4h.m(vt9Var8);
                    ah5 ah5Var4 = ujp.d;
                    y4h.o(vt9Var8, c8eVarP2, ah5Var4);
                    vt9Var8.W(321938379);
                    vt9Var8.p(false);
                    tfd tfdVarC = nr3.c(rbe.b, false);
                    int iHashCode3 = Long.hashCode(vt9Var8.T);
                    oag oagVarL3 = vt9Var8.l();
                    c8e c8eVarP3 = qyn.P(vt9Var8, z7eVar);
                    vt9Var8.a0();
                    if (vt9Var8.S) {
                        vt9Var8.k(fzaVar);
                    } else {
                        vt9Var8.j0();
                    }
                    y4h.o(vt9Var8, tfdVarC, ah5Var);
                    y4h.o(vt9Var8, oagVarL3, ah5Var2);
                    u35.j(iHashCode3, vt9Var8, ah5Var3, vt9Var8);
                    y4h.o(vt9Var8, c8eVarP3, ah5Var4);
                    if (Intrinsics.a(emfVar, fmf.b)) {
                        vt9Var8.W(-1866808511);
                        vt9Var8.p(false);
                    } else if (emfVar instanceof emf) {
                        vt9Var8.W(-2036408143);
                        vt9Var8.W(-2035926186);
                        vt9Var8.p(false);
                        c8e c8eVarH = mpj.h(z7eVar, 24.0f);
                        hyf hyfVar = emfVar.b;
                        vt9Var8.W(-1866781267);
                        unf unfVar = pof.a;
                        long jW = pof.a(vt9Var8).a.w();
                        vt9Var8.p(false);
                        wta.b(hyfVar, (String) null, c8eVarH, jW, vt9Var8, 56, 0);
                        vt9Var8 = vt9Var8;
                        vt9Var8.p(false);
                    } else {
                        if (!(emfVar instanceof gmf)) {
                            throw fki.m(vt9Var8, -1866808565, false);
                        }
                        vt9Var8.W(-1866758797);
                        gmf gmfVar = (gmf) emfVar;
                        mof.a(gmfVar.b, (c8e) null, z ? null : gmfVar.c, false, vt9Var8, 0);
                        vt9Var8.p(false);
                    }
                    vt9Var8.p(true);
                    vt9Var8.p(true);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                jym.a((String) obj3, z, (ih5) obj, aoh.m(1));
                return Unit.a;
            default:
                plj pljVar = (plj) obj3;
                yz yzVar = (yz) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                pljVar.t = null;
                if (zBooleanValue || z) {
                    wy wyVar = pljVar.o;
                    if (pljVar.p.a() && (uoVar = pljVar.r) != null) {
                        dl dlVar = uoVar.b;
                        if (yzVar.d(iq.c)) {
                            n43 n43Var = pljVar.q;
                            zH = !(n43Var instanceof mq) ? true : wyVar.f.H(dlVar, (mq) n43Var, yzVar, z);
                        } else {
                            zH = false;
                        }
                        if (zH) {
                            dl dlVar2 = uoVar.b;
                            bz bzVar = uoVar.a;
                            yl ylVar = wyVar.l;
                            List list = l08.a;
                            if (yzVar instanceof nq) {
                                mqVarA = ((nq) yzVar).a(dlVar2, ylVar, pljVar, pljVar, list);
                                mqVarA.e = bzVar.i();
                            }
                            if (mqVarA != null) {
                                pljVar.s0(mqVarA);
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
