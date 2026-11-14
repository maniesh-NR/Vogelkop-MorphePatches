package defpackage;

import android.content.ContextWrapper;
import android.content.res.Resources;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final /* synthetic */ class fx0 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ fx0(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ((gx0) this.b).content((wf5) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                yi4.b((Function0) this.b, (Function1) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 2:
                l0j l0jVar = (l0j) this.b;
                o41 o41Var = (o41) this.c;
                int iIntValue = ((Integer) obj).intValue();
                k0j k0jVar = (k0j) obj2;
                if (!l0jVar.b.c(k0jVar.f)) {
                    o41Var.g(iIntValue, k0jVar);
                    o41Var.g.b(Unit.a);
                }
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                vtp.d((c8e) this.b, (Function2) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                ((gs1) this.b).g0((Function0) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 5:
                z7e z7eVar = z7e.b;
                ks1 ks1Var = (ks1) this.b;
                Function1 function1 = (Function1) this.c;
                ih5 ih5Var = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    voi voiVarQ0 = oup.q0(vt9Var);
                    c8e c8eVarS0 = oup.s0(y7h.m(voiVarQ0, vt9Var), voiVarQ0, true, true);
                    db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var, 0);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarS0);
                    bh5.To.getClass();
                    Function0 function0 = m3c.S;
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function0);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ujp.f);
                    y4h.o(vt9Var, oagVarL, ujp.e);
                    y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var);
                    y4h.o(vt9Var, c8eVarP, ujp.d);
                    unf unfVar = pof.a;
                    pof.b.getClass();
                    ijl.b(((Resources) vt9Var.j(j41.c)).getString(2132017572, Arrays.copyOf(new Object[]{mzg.q(vt9Var, 2132017591)}, 1)), a26.Z(z7eVar, 24.0f, 0.0f, 2), pof.a(vt9Var).a.w(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, pof.b(vt9Var).k, vt9Var, 0, 0, 131064);
                    ocp.c(vt9Var, mpj.c(z7eVar, 20.0f));
                    vt9Var.W(2082649824);
                    ArrayList arrayList = ks1Var.a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        js1 js1Var = (js1) arrayList.get(i);
                        unf unfVar2 = pof.a;
                        pof.b.getClass();
                        c8e c8eVarZ = a26.Z(z7eVar, 8.0f, 0.0f, 2);
                        String strQ = mzg.q(vt9Var, js1Var.b);
                        boolean z = js1Var.c;
                        boolean zF = vt9Var.f(function1) | vt9Var.h(js1Var);
                        Object objK = vt9Var.K();
                        if (zF || objK == hh5.a) {
                            objK = new x2((byte) 16, js1Var, function1);
                            vt9Var.g0(objK);
                        }
                        pmf pmfVar = new pmf(z, (Function0) objK);
                        rhc rhcVarA = shc.a(vt9Var);
                        u8i u8iVar = gkf.a;
                        c26.e(strQ, c8eVarZ, null, null, false, pmfVar, null, 0, 0, rhc.a(rhcVarA, pof.a(vt9Var).a.z()), vt9Var, 0, 988);
                        i = i2;
                    }
                    vt9Var.p(false);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            case 6:
                ks1 ks1Var2 = (ks1) this.b;
                Function0 function02 = (Function0) this.c;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    scd.f(function02, mzg.q(vt9Var2, 2132021053), null, false, ks1Var2.b, smf.a, null, null, null, null, null, null, null, null, vt9Var2, 196608, 0, 16332);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 7:
                u22 u22Var = (u22) this.b;
                b22 b22Var = (b22) this.c;
                String str = (String) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (((Boolean) u22Var.get()).booleanValue()) {
                    ((uv0) b22Var.y.get()).a(1, iIntValue4, str, false);
                }
                return Unit.a;
            case 8:
                b22 b22Var2 = (b22) this.b;
                d7l d7lVar = (b2l) this.c;
                ((uv0) b22Var2.y.get()).c((List) obj, d7lVar.j.m() ? 2 : 3, (String) obj2, true, d7lVar);
                return Unit.a;
            case 9:
                as2 as2Var = (as2) this.b;
                ContextWrapper contextWrapper = (ContextWrapper) this.c;
                tjc tjcVar = (tjc) obj;
                if (((Boolean) obj2).booleanValue()) {
                    as2Var.c = new oc2(tjcVar, (byte) 2);
                    as2Var.a = kd6.c;
                    as2Var.b(new sw7(as2Var));
                    zr2 zr2Var = new zr2(as2Var, (byte) 1);
                    synchronized (e7d.a) {
                        int iA = vep.A(e7d.b);
                        if (iA == 0 || iA == 1) {
                            e7d.c.add(zr2Var);
                        } else if (iA == 2) {
                            zr2Var.onSuccess();
                        }
                    }
                } else {
                    as2Var.getClass();
                    String[] strArr = OperaApplication.K;
                    CommandLine commandLine = contextWrapper.getApplicationContext().n;
                    fsp.g(contextWrapper, commandLine != null ? commandLine : null);
                    e7d.a(contextWrapper, new zr2(as2Var, (byte) 0));
                }
                return Unit.a;
            case 10:
                ikk ikkVar = (ikk) obj;
                yo5 yo5Var = (yo5) obj2;
                return ((tfd) this.b).b(ikkVar, ikkVar.i(Unit.a, new ue5(-431986394, new fx0((ue5) this.c, new bs3(ikkVar, yo5Var.a), (byte) 11), true)), yo5Var.a);
            case 11:
                ue5 ue5Var = (ue5) this.b;
                bs3 bs3Var = (bs3) this.c;
                ih5 ih5Var3 = (ih5) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ue5Var.invoke(bs3Var, vt9Var3, 0);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                j14.a((fm4) this.b, (c8e) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                kfo.f((l01) this.b, (Function0) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                z5i.k0((uji) this.b, (HashSet) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                z5i.c((tn) this.b, (c8e) this.c, (ih5) obj, aoh.m(3073));
                return Unit.a;
            case 16:
                yf5 yf5Var = (yf5) this.b;
                xf5 xf5Var = (xf5) this.c;
                ih5 ih5Var4 = (ih5) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    yf5Var.content(xf5Var, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 17:
                xg5 xg5Var = (xg5) this.b;
                ue5 ue5Var2 = (ue5) this.c;
                ih5 ih5Var5 = (ih5) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (!vt9Var5.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    vt9Var5.Q();
                } else if (xg5Var != null) {
                    vt9Var5.W(1882688065);
                    ic4.f(xg5Var, null, gyg.P(1328194095, new bg5(ue5Var2, (byte) 0), vt9Var5), vt9Var5, 392);
                    vt9Var5.p(false);
                } else {
                    vt9Var5.W(1882787792);
                    ue5Var2.invoke(vt9Var5, 0);
                    vt9Var5.p(false);
                }
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                wyh.a((rg5) this.b, (ue5) this.c, (ih5) obj, aoh.m(9));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                ((rs5) this.b).a((is5) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                ky5.a((ey5) this.b, (Function0) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                ((rl6) this.b).a((s9i) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                ((sv6) this.b).a((amj) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 23:
                lfl lflVar = (lfl) this.b;
                xfl xflVar = (xfl) this.c;
                ih5 ih5Var6 = (ih5) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zF2 = vt9Var6.f(lflVar);
                    Object objK2 = vt9Var6.K();
                    if (zF2 || objK2 == hh5.a) {
                        objK2 = luj.b(new q2(0, lflVar, lfl.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 24));
                        vt9Var6.g0(objK2);
                    }
                    sw6.a(xflVar, (kfl) ((iak) objK2).getValue(), vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                sw6.a((xfl) this.b, (kfl) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                ((qx6) this.b).a((i8m) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                aib.c((i47) this.b, (c8e) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 27:
                j1c j1cVar = (j1c) this.b;
                lqj lqjVar = (lqj) this.c;
                int iIntValue9 = ((Integer) obj).intValue();
                if (obj2 instanceof eg5) {
                    ((dfe) j1cVar.e).c((eg5) obj2);
                } else if (!(obj2 instanceof l1i)) {
                    if (obj2 instanceof zt9) {
                        gyg.Q(lqjVar, iIntValue9, obj2);
                        j1cVar.f((zt9) obj2);
                    } else if (obj2 instanceof znh) {
                        gyg.Q(lqjVar, iIntValue9, obj2);
                        ((znh) obj2).c();
                    }
                }
                return Unit.a;
            case 28:
                ((Integer) obj2).getClass();
                iba.a((dg5) this.b, (ue5) this.c, (ih5) obj, aoh.m(49));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                y9m.h((gea) this.b, (c8e) this.c, (ih5) obj, aoh.m(1));
                return Unit.a;
        }
    }
}
