package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b57 implements cr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b57(byte b, Object obj, Function1 function1) {
        this.a = b;
        this.c = obj;
        this.b = function1;
    }

    public /* synthetic */ b57(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.b;
        Function0 function02 = (Function0) this.c;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            sfe.m(2132021652, 0, vt9Var, function0);
            scd.f(function02, mzg.q(vt9Var, 2132021715), null, false, false, smf.b, null, null, null, null, null, null, null, null, vt9Var, 196608, 0, 16348);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        c2e c2eVar = (c2e) this.b;
        Function0 function0 = (Function0) this.c;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            mkh.a(c2eVar, function0, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        adb adbVar = (adb) this.b;
        gom gomVar = (gom) this.c;
        Function0 function0 = (Function0) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).h(function0) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zH = vt9Var.h(adbVar) | vt9Var.h(gomVar) | ((iIntValue & 14) == 4);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new uef(adbVar, gomVar, function0, (byte) 1);
                vt9Var.g0(objK);
            }
            wyh.d((Function0) objK, function0, null, vt9Var, (iIntValue << 3) & 112);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            gu6 r0 = (defpackage.gu6) r0
            java.lang.Object r9 = r9.c
            d2c r9 = (defpackage.d2c) r9
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            boolean r1 = defpackage.wyh.H(r0, r10)
            jxf r2 = r0.m()
            fsf r2 = r2.e
            fsf r3 = defpackage.fsf.a
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L33
            d2c r2 = defpackage.d2c.a
            if (r9 == r2) goto L33
            if (r1 != 0) goto L32
            r1 = r5
            goto L33
        L32:
            r1 = r4
        L33:
            jxf r9 = r0.m()
            int r9 = r9.b
            r2 = 0
            if (r9 != 0) goto L3e
            r3 = r2
            goto L44
        L3e:
            float r3 = defpackage.wyh.t(r0)
            float r9 = (float) r9
            float r3 = r3 / r9
        L44:
            int r9 = (int) r3
            float r9 = (float) r9
            float r9 = r3 - r9
            n27 r6 = r0.n
            float r7 = java.lang.Math.abs(r10)
            r8 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6.o0(r8)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r7 = 2
            if (r6 < 0) goto L60
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L5f
            r4 = r5
            goto L60
        L5f:
            r4 = r7
        L60:
            if (r4 != 0) goto La7
            float r9 = java.lang.Math.abs(r9)
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L6f
            if (r1 == 0) goto Lae
            goto La9
        L6f:
            float r9 = java.lang.Math.abs(r3)
            n27 r10 = r0.n
            txf r2 = defpackage.uxf.a
            r2 = 1113587712(0x42600000, float:56.0)
            float r10 = r10.o0(r2)
            int r2 = r0.o()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r10 = java.lang.Math.min(r10, r2)
            int r0 = r0.o()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L9a
            if (r1 == 0) goto La9
            goto Lae
        L9a:
            float r9 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r12)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto La9
            goto Lae
        La7:
            if (r4 != r5) goto Lab
        La9:
            r11 = r12
            goto Lae
        Lab:
            if (r4 == r7) goto Lae
            r11 = r2
        Lae:
            java.lang.Float r9 = java.lang.Float.valueOf(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b57.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        o0f o0fVar = (o0f) this.b;
        x3i x3iVar = (x3i) this.c;
        Function0 function0 = (Function0) obj;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((vt9) ih5Var).h(function0) ? 4 : 2;
        }
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = (hfk) x3iVar.c.get();
                vt9Var.g0(objK);
            }
            coh.c((hfk) objK, o0fVar.z, function0, oup.s0(z7e.b, oup.q0(vt9Var), true, true), vt9Var, (iIntValue << 6) & 896);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.c;
        Function1 function1 = (Function1) this.b;
        ((Integer) obj3).getClass();
        vt9 vt9Var = (vt9) ((ih5) obj2);
        vt9Var.W(759876635);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            objK = luj.b(function0);
            vt9Var.g0(objK);
        }
        iak iakVar = (iak) objK;
        Object objK2 = vt9Var.K();
        if (objK2 == zpaVar) {
            y8f y8fVar = (y8f) iakVar.getValue();
            long j = y8fVar.a;
            objK2 = new cd1(y8fVar, aib.k, new y8f(4333543705419175690L), 8);
            vt9Var.g0(objK2);
        }
        cd1 cd1Var = (cd1) objK2;
        Unit unit = Unit.a;
        boolean zH = vt9Var.h(cd1Var);
        Object objK3 = vt9Var.K();
        if (zH || objK3 == zpaVar) {
            objK3 = new mz9(iakVar, cd1Var, null, (byte) 23);
            vt9Var.g0(objK3);
        }
        rm5.e(vt9Var, unit, (Function2) objK3);
        xe1 xe1Var = cd1Var.c;
        boolean zF = vt9Var.f(xe1Var);
        Object objK4 = vt9Var.K();
        if (zF || objK4 == zpaVar) {
            objK4 = new kzi(xe1Var, (byte) 0);
            vt9Var.g0(objK4);
        }
        c8e c8eVar = (c8e) function1.invoke((Function0) objK4);
        vt9Var.p(false);
        return c8eVar;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.b;
        b91 b91Var = (b91) this.c;
        rwj rwjVar = (rwj) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        lh9 lh9Var = rwjVar.f;
        ki9 ki9Var = rwjVar.c;
        if (ki9Var == null) {
            ki9Var = ki9.e;
        }
        gi9 gi9Var = rwjVar.d;
        int i = gi9Var != null ? gi9Var.a : 0;
        hi9 hi9Var = rwjVar.e;
        int i2 = hi9Var != null ? hi9Var.a : 65535;
        c91 c91Var = (c91) b91Var.b;
        sam samVarB = c91Var.e.b(lh9Var, ki9Var, i, i2);
        if (samVarB instanceof ram) {
            typeface = (Typeface) ((ram) samVarB).a;
        } else {
            ghf ghfVar = new ghf(samVarB, c91Var.j);
            c91Var.j = ghfVar;
            typeface = (Typeface) ghfVar.d;
        }
        spannable.setSpan(new bz7(typeface, (byte) 3), iIntValue, iIntValue2, 33);
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        phl phlVar = (phl) this.b;
        lde ldeVar = (lde) this.c;
        ((Integer) obj3).getClass();
        vt9 vt9Var = (vt9) ((ih5) obj2);
        vt9Var.W(-102778667);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            objK = rm5.p(h.a, vt9Var);
            vt9Var.g0(objK);
        }
        nx5 nx5Var = (nx5) objK;
        Object objK2 = vt9Var.K();
        if (objK2 == zpaVar) {
            objK2 = hyg.k((Object) null);
            vt9Var.g0(objK2);
        }
        afe afeVar = (afe) objK2;
        afe afeVarO = hyg.o(phlVar, vt9Var);
        boolean zF = vt9Var.f(ldeVar);
        Object objK3 = vt9Var.K();
        if (zF || objK3 == zpaVar) {
            objK3 = new d7k(afeVar, ldeVar, (byte) 29);
            vt9Var.g0(objK3);
        }
        rm5.b(ldeVar, (Function1) objK3, vt9Var);
        boolean zH = vt9Var.h(nx5Var) | vt9Var.f(ldeVar) | vt9Var.f(afeVarO);
        Object objK4 = vt9Var.K();
        if (zH || objK4 == zpaVar) {
            objK4 = new shl(nx5Var, afeVar, ldeVar, afeVarO);
            vt9Var.g0(objK4);
        }
        c8e c8eVarA = ruk.a(z7e.b, ldeVar, (PointerInputEventHandler) objK4);
        vt9Var.p(false);
        return c8eVarA;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        erl erlVar = (erl) this.b;
        afe afeVar = (afe) this.c;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            t0h.d((String) afeVar.getValue(), erlVar, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        g1b g1bVar = (g1b) this.b;
        Function0 function0 = (Function0) this.c;
        ih5 ih5Var = (ih5) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            xjm.a(g1bVar, function0, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b;
        boolean z;
        boolean z2;
        ?? r3;
        Function0 function0;
        byte b2 = this.a;
        byte b3 = 10;
        Function0 function02 = m3c.S;
        z7e z7eVar = z7e.b;
        zpa zpaVar = hh5.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b2) {
            case 0:
                Function1 function1 = (Function1) obj5;
                e57 e57Var = (e57) obj4;
                xvf xvfVar = (xvf) obj;
                ih5 ih5Var = (ih5) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((vt9) ih5Var).f(xvfVar) ? 4 : 2;
                }
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c8e c8eVarD = a26.W(z7eVar, xvfVar).d(mpj.c);
                    tfd tfdVarC = nr3.c(rbe.c, false);
                    int iHashCode = Long.hashCode(vt9Var.T);
                    oag oagVarL = vt9Var.l();
                    c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
                    bh5.To.getClass();
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function02);
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
                    c8e c8eVarB0 = a26.b0(a26.Z(mpj.m(oup.s0(z7eVar, oup.q0(vt9Var), true, true), 560.0f, 1), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    db5 db5VarA = cb5.a(new x62(8.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
                    int iHashCode2 = Long.hashCode(vt9Var.T);
                    oag oagVarL2 = vt9Var.l();
                    c8e c8eVarP2 = qyn.P(vt9Var, c8eVarB0);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function02);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, db5VarA, ah5Var);
                    y4h.o(vt9Var, oagVarL2, ah5Var2);
                    u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP2, ah5Var4);
                    boolean zF = vt9Var.f(function1);
                    Object objK = vt9Var.K();
                    if (zF || objK == zpaVar) {
                        objK = new y47(function1, (byte) 20);
                        vt9Var.g0(objK);
                    }
                    Function0 function03 = (Function0) objK;
                    boolean zF2 = vt9Var.f(function1);
                    Object objK2 = vt9Var.K();
                    if (zF2 || objK2 == zpaVar) {
                        objK2 = new y47(function1, (byte) 6);
                        vt9Var.g0(objK2);
                    }
                    Function0 function04 = (Function0) objK2;
                    String str = e57Var.b;
                    by5 by5Var = e57Var.f;
                    zua zuaVar = e57Var.e;
                    boolean zF3 = vt9Var.f(function1);
                    Object objK3 = vt9Var.K();
                    if (zF3 || objK3 == zpaVar) {
                        objK3 = new y47(function1, (byte) 9);
                        vt9Var.g0(objK3);
                    }
                    Function0 function05 = (Function0) objK3;
                    boolean zF4 = vt9Var.f(function1);
                    Object objK4 = vt9Var.K();
                    if (zF4 || objK4 == zpaVar) {
                        objK4 = new y47(function1, (byte) 10);
                        vt9Var.g0(objK4);
                    }
                    Function0 function06 = (Function0) objK4;
                    boolean zF5 = vt9Var.f(function1);
                    Object objK5 = vt9Var.K();
                    if (zF5 || objK5 == zpaVar) {
                        objK5 = new y47(function1, (byte) 11);
                        vt9Var.g0(objK5);
                    }
                    aib.i(function03, function04, str, function05, function06, (Function0) objK5, null, vt9Var, 0);
                    aib.h(zuaVar.a, "HAID", null, vt9Var, 48);
                    String str2 = zuaVar.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aib.h(str2, "HUID", null, vt9Var, 48);
                    sd3 sd3Var = rbe.l;
                    o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var, vt9Var, 54);
                    int iHashCode3 = Long.hashCode(vt9Var.T);
                    oag oagVarL3 = vt9Var.l();
                    c8e c8eVarP3 = qyn.P(vt9Var, z7eVar);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function02);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA, ah5Var);
                    y4h.o(vt9Var, oagVarL3, ah5Var2);
                    u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP3, ah5Var4);
                    boolean zF6 = vt9Var.f(function1);
                    Object objK6 = vt9Var.K();
                    if (zF6 || objK6 == zpaVar) {
                        objK6 = new y47(function1, (byte) 12);
                        vt9Var.g0(objK6);
                    }
                    yi4.a((Function0) objK6, (c8e) null, by5Var.c, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.c, vt9Var, 805306368, 506);
                    String str3 = by5Var.b;
                    boolean zF7 = vt9Var.f(function1);
                    Object objK7 = vt9Var.K();
                    if (zF7 || objK7 == zpaVar) {
                        objK7 = new ra(function1, (byte) 10);
                        vt9Var.g0(objK7);
                    }
                    r9h.i(str3, (Function1) objK7, (c8e) null, false, false, (ikl) null, gyg.P(-1129968902, new whf(e57Var, (byte) 19), vt9Var), (ue5) null, (ue5) null, (ue5) null, (uac) null, (rvb) null, (ovb) null, 0, 0, (paj) null, (sgl) null, vt9Var, 1572864, 8388540);
                    vt9Var.p(true);
                    aib.g("Tools", null, vt9Var, 6);
                    boolean zF8 = vt9Var.f(function1);
                    Object objK8 = vt9Var.K();
                    if (zF8 || objK8 == zpaVar) {
                        objK8 = new y47(function1, (byte) 13);
                        vt9Var.g0(objK8);
                    }
                    yi4.a((Function0) objK8, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.d, vt9Var, 805306368, 510);
                    o9i o9iVarA2 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var, vt9Var, 54);
                    int iHashCode4 = Long.hashCode(vt9Var.T);
                    oag oagVarL4 = vt9Var.l();
                    c8e c8eVarP4 = qyn.P(vt9Var, z7eVar);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(function02);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, o9iVarA2, ah5Var);
                    y4h.o(vt9Var, oagVarL4, ah5Var2);
                    u35.j(iHashCode4, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP4, ah5Var4);
                    boolean zF9 = vt9Var.f(function1);
                    Object objK9 = vt9Var.K();
                    if (zF9 || objK9 == zpaVar) {
                        objK9 = new y47(function1, (byte) 14);
                        vt9Var.g0(objK9);
                    }
                    yi4.a((Function0) objK9, (c8e) null, e57Var.d, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.e, vt9Var, 805306368, 506);
                    String str4 = e57Var.c;
                    boolean zF10 = vt9Var.f(function1);
                    Object objK10 = vt9Var.K();
                    if (zF10 || objK10 == zpaVar) {
                        objK10 = new ra(function1, (byte) 12);
                        vt9Var.g0(objK10);
                    }
                    r9h.i(str4, (Function1) objK10, (c8e) null, false, false, (ikl) null, (ue5) null, (ue5) null, (ue5) null, (ue5) null, (uac) null, (rvb) null, (ovb) null, 0, 0, (paj) null, (sgl) null, vt9Var, 0, 8388604);
                    vt9Var.p(true);
                    boolean zF11 = vt9Var.f(function1);
                    Object objK11 = vt9Var.K();
                    if (zF11 || objK11 == zpaVar) {
                        objK11 = new y47(function1, (byte) 21);
                        vt9Var.g0(objK11);
                    }
                    yi4.a((Function0) objK11, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.f, vt9Var, 805306368, 510);
                    aib.g("Products", null, vt9Var, 6);
                    boolean zF12 = vt9Var.f(function1);
                    Object objK12 = vt9Var.K();
                    if (zF12 || objK12 == zpaVar) {
                        objK12 = new y47(function1, (byte) 22);
                        vt9Var.g0(objK12);
                    }
                    yi4.a((Function0) objK12, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.g, vt9Var, 805306368, 510);
                    g1b g1bVar = e57Var.h;
                    boolean zF13 = vt9Var.f(function1);
                    Object objK13 = vt9Var.K();
                    if (zF13 || objK13 == zpaVar) {
                        b = 8;
                        objK13 = new ra(function1, b);
                        vt9Var.g0(objK13);
                    } else {
                        b = 8;
                    }
                    aib.f(g1bVar, (Function1) objK13, null, vt9Var, b);
                    aib.g("Missions", null, vt9Var, 6);
                    boolean zF14 = vt9Var.f(function1);
                    Object objK14 = vt9Var.K();
                    if (zF14 || objK14 == zpaVar) {
                        objK14 = new y47(function1, (byte) 0);
                        vt9Var.g0(objK14);
                    }
                    yi4.a((Function0) objK14, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.h, vt9Var, 805306368, 510);
                    boolean zF15 = vt9Var.f(function1);
                    Object objK15 = vt9Var.K();
                    if (zF15 || objK15 == zpaVar) {
                        objK15 = new y47(function1, (byte) 1);
                        vt9Var.g0(objK15);
                    }
                    yi4.a((Function0) objK15, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.i, vt9Var, 805306368, 510);
                    boolean zF16 = vt9Var.f(function1);
                    Object objK16 = vt9Var.K();
                    if (zF16 || objK16 == zpaVar) {
                        objK16 = new y47(function1, (byte) 2);
                        vt9Var.g0(objK16);
                    }
                    yi4.a((Function0) objK16, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.j, vt9Var, 805306368, 510);
                    boolean zF17 = vt9Var.f(function1);
                    Object objK17 = vt9Var.K();
                    if (zF17 || objK17 == zpaVar) {
                        objK17 = new y47(function1, (byte) 3);
                        vt9Var.g0(objK17);
                    }
                    yi4.a((Function0) objK17, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.k, vt9Var, 805306368, 510);
                    boolean zF18 = vt9Var.f(function1);
                    Object objK18 = vt9Var.K();
                    if (zF18 || objK18 == zpaVar) {
                        objK18 = new y47(function1, (byte) 4);
                        vt9Var.g0(objK18);
                    }
                    yi4.a((Function0) objK18, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.l, vt9Var, 805306368, 510);
                    boolean zF19 = vt9Var.f(function1);
                    Object objK19 = vt9Var.K();
                    if (zF19 || objK19 == zpaVar) {
                        objK19 = new y47(function1, (byte) 5);
                        vt9Var.g0(objK19);
                    }
                    yi4.a((Function0) objK19, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.m, vt9Var, 805306368, 510);
                    boolean zF20 = vt9Var.f(function1);
                    Object objK20 = vt9Var.K();
                    if (zF20 || objK20 == zpaVar) {
                        objK20 = new y47(function1, (byte) 7);
                        vt9Var.g0(objK20);
                    }
                    yi4.a((Function0) objK20, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.n, vt9Var, 805306368, 510);
                    boolean zF21 = vt9Var.f(function1);
                    Object objK21 = vt9Var.K();
                    if (zF21 || objK21 == zpaVar) {
                        objK21 = new y47(function1, (byte) 8);
                        vt9Var.g0(objK21);
                    }
                    yi4.a((Function0) objK21, (c8e) null, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.o, vt9Var, 805306368, 510);
                    Boolean bool = e57Var.g;
                    boolean zF22 = vt9Var.f(function1);
                    Object objK22 = vt9Var.K();
                    if (zF22 || objK22 == zpaVar) {
                        objK22 = new ra(function1, (byte) 9);
                        vt9Var.g0(objK22);
                    }
                    aib.b(bool, (Function1) objK22, null, vt9Var, 0);
                    aib.g("Notifications (displayed after delay)", null, vt9Var, 6);
                    p37.d(null, new x62(8.0f, true, new t40((byte) 19)), null, null, 0, 0, gyg.P(1911551583, new j04(function1, (byte) 6), vt9Var), vt9Var, 1572912, 61);
                    vt9Var.p(true);
                    vt9Var.p(true);
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
            case 1:
                hea heaVar = (hea) obj5;
                Function0 function07 = (Function0) obj4;
                ih5 ih5Var2 = (ih5) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x62 x62Var = new x62(12.0f, true, new t40((byte) 19));
                    c8e c8eVarY = a26.Y(z7eVar, 16.0f, 14.0f);
                    i39 i39Var = mpj.a;
                    c8e c8eVarD2 = c8eVarY.d(i39Var);
                    rd3 rd3Var = rbe.n;
                    db5 db5VarA2 = cb5.a(x62Var, rd3Var, vt9Var2, 6);
                    int iHashCode5 = Long.hashCode(vt9Var2.T);
                    oag oagVarL5 = vt9Var2.l();
                    c8e c8eVarP5 = qyn.P(vt9Var2, c8eVarD2);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function02);
                    } else {
                        vt9Var2.j0();
                    }
                    ah5 ah5Var5 = ujp.f;
                    y4h.o(vt9Var2, db5VarA2, ah5Var5);
                    ah5 ah5Var6 = ujp.e;
                    y4h.o(vt9Var2, oagVarL5, ah5Var6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    ah5 ah5Var7 = ujp.g;
                    y4h.o(vt9Var2, numValueOf2, ah5Var7);
                    y4h.m(vt9Var2);
                    ah5 ah5Var8 = ujp.d;
                    y4h.o(vt9Var2, c8eVarP5, ah5Var8);
                    sd3 sd3Var2 = rbe.l;
                    o9i o9iVarA3 = m9i.a(new x62(8.0f, true, new t40((byte) 19)), sd3Var2, vt9Var2, 54);
                    int iHashCode6 = Long.hashCode(vt9Var2.T);
                    oag oagVarL6 = vt9Var2.l();
                    c8e c8eVarP6 = qyn.P(vt9Var2, i39Var);
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function02);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, o9iVarA3, ah5Var5);
                    y4h.o(vt9Var2, oagVarL6, ah5Var6);
                    u35.j(iHashCode6, vt9Var2, ah5Var7, vt9Var2);
                    y4h.o(vt9Var2, c8eVarP6, ah5Var8);
                    String str5 = heaVar.c;
                    dea deaVar = heaVar.f;
                    Integer num = heaVar.e;
                    hp7 hp7Var = abm.a;
                    ikl iklVar = ((wam) vt9Var2.j(hp7Var)).l;
                    if (1.0f <= 0.0d) {
                        y7b.a("invalid weight; must be greater than zero");
                    }
                    ijl.b(str5, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var2, 0, 0, 131068);
                    y9m.h(heaVar.j, null, vt9Var2, 0);
                    vt9Var2.p(true);
                    db5 db5VarA3 = cb5.a(new x62(8.0f, true, new t40((byte) 19)), rd3Var, vt9Var2, 6);
                    int iHashCode7 = Long.hashCode(vt9Var2.T);
                    oag oagVarL7 = vt9Var2.l();
                    c8e c8eVarP7 = qyn.P(vt9Var2, i39Var);
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function02);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, db5VarA3, ah5Var5);
                    y4h.o(vt9Var2, oagVarL7, ah5Var6);
                    u35.j(iHashCode7, vt9Var2, ah5Var7, vt9Var2);
                    y4h.o(vt9Var2, c8eVarP7, ah5Var8);
                    ijl.b(heaVar.b, i39Var, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).j, vt9Var2, 48, 0, 131068);
                    o9i o9iVarA4 = m9i.a(new x62(16.0f, true, new t40((byte) 19)), sd3Var2, vt9Var2, 54);
                    int iHashCode8 = Long.hashCode(vt9Var2.T);
                    oag oagVarL8 = vt9Var2.l();
                    c8e c8eVarP8 = qyn.P(vt9Var2, z7eVar);
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(function02);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, o9iVarA4, ah5Var5);
                    y4h.o(vt9Var2, oagVarL8, ah5Var6);
                    u35.j(iHashCode8, vt9Var2, ah5Var7, vt9Var2);
                    y4h.o(vt9Var2, c8eVarP8, ah5Var8);
                    y9m.a(heaVar.d, z7eVar, vt9Var2, 48);
                    if (num != null) {
                        vt9Var2.W(1730280468);
                        z = false;
                        y9m.b(num.intValue(), vt9Var2, 0);
                        vt9Var2.p(false);
                    } else {
                        z = false;
                        vt9Var2.W(1730351582);
                        vt9Var2.p(false);
                    }
                    if (deaVar == dea.b || deaVar == dea.c) {
                        vt9Var2.W(1730411474);
                        if (1.0f <= 0.0d) {
                            y7b.a("invalid weight; must be greater than zero");
                        }
                        z2 = true;
                        r3 = 0;
                        nr3.a(new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), vt9Var2, 0);
                        function0 = function07;
                        y9m.c(function0, vt9Var2, 0);
                        vt9Var2.p(false);
                    } else {
                        vt9Var2.W(1730546014);
                        vt9Var2.p(z);
                        function0 = function07;
                        z2 = true;
                        r3 = z;
                    }
                    vt9Var2.p(z2);
                    vt9Var2.p(z2);
                    if (deaVar == dea.a) {
                        vt9Var2.W(1142376854);
                        y9m.m(function0, vt9Var2, r3);
                        vt9Var2.p(r3);
                    } else {
                        vt9Var2.W(1142440280);
                        vt9Var2.p(r3);
                    }
                    vt9Var2.p(true);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 2:
                v8c v8cVar = (x8c) obj4;
                Function1 function12 = (Function1) obj5;
                ih5 ih5Var3 = (ih5) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                vt9 vt9Var3 = (vt9) ih5Var3;
                if (vt9Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    f8c.d(v8cVar.a, function12, mpj.m(mpj.c, 560.0f, 1), vt9Var3, 8);
                } else {
                    vt9Var3.Q();
                }
                return Unit.a;
            case 3:
                Function0 function08 = (Function0) obj5;
                t1k t1kVar = (t1k) obj4;
                xvf xvfVar2 = (xvf) obj;
                ih5 ih5Var4 = (ih5) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((vt9) ih5Var4).f(xvfVar2) ? 4 : 2;
                }
                vt9 vt9Var4 = (vt9) ih5Var4;
                if (vt9Var4.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    c8e c8eVarZ = a26.Z(a26.W(mpj.c, xvfVar2), 16.0f, 0.0f, 2);
                    x62 x62Var2 = new x62(16.0f, true, new t40((byte) 19));
                    rd3 rd3Var2 = rbe.n;
                    db5 db5VarA4 = cb5.a(x62Var2, rd3Var2, vt9Var4, 6);
                    int iHashCode9 = Long.hashCode(vt9Var4.T);
                    oag oagVarL9 = vt9Var4.l();
                    c8e c8eVarP9 = qyn.P(vt9Var4, c8eVarZ);
                    bh5.To.getClass();
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function02);
                    } else {
                        vt9Var4.j0();
                    }
                    ah5 ah5Var9 = ujp.f;
                    y4h.o(vt9Var4, db5VarA4, ah5Var9);
                    ah5 ah5Var10 = ujp.e;
                    y4h.o(vt9Var4, oagVarL9, ah5Var10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode9);
                    ah5 ah5Var11 = ujp.g;
                    y4h.o(vt9Var4, numValueOf3, ah5Var11);
                    y4h.m(vt9Var4);
                    ah5 ah5Var12 = ujp.d;
                    y4h.o(vt9Var4, c8eVarP9, ah5Var12);
                    c8e c8eVarD3 = oup.s0(z7eVar, oup.q0(vt9Var4), true, true).d(new g4c(1.0f, true));
                    db5 db5VarA5 = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rd3Var2, vt9Var4, 6);
                    int iHashCode10 = Long.hashCode(vt9Var4.T);
                    oag oagVarL10 = vt9Var4.l();
                    c8e c8eVarP10 = qyn.P(vt9Var4, c8eVarD3);
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function02);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, db5VarA5, ah5Var9);
                    y4h.o(vt9Var4, oagVarL10, ah5Var10);
                    u35.j(iHashCode10, vt9Var4, ah5Var11, vt9Var4);
                    y4h.o(vt9Var4, c8eVarP10, ah5Var12);
                    i39 i39Var2 = mpj.a;
                    o9i o9iVarA5 = m9i.a(new x62(16.0f, true, new t40((byte) 19)), rbe.l, vt9Var4, 54);
                    int iHashCode11 = Long.hashCode(vt9Var4.T);
                    oag oagVarL11 = vt9Var4.l();
                    c8e c8eVarP11 = qyn.P(vt9Var4, i39Var2);
                    vt9Var4.a0();
                    if (vt9Var4.S) {
                        vt9Var4.k(function02);
                    } else {
                        vt9Var4.j0();
                    }
                    y4h.o(vt9Var4, o9iVarA5, ah5Var9);
                    y4h.o(vt9Var4, oagVarL11, ah5Var10);
                    u35.j(iHashCode11, vt9Var4, ah5Var11, vt9Var4);
                    y4h.o(vt9Var4, c8eVarP11, ah5Var12);
                    hn9.a(t1kVar.c, "Mission icon", x1p.j(mpj.h(z7eVar, 80.0f), ((acj) vt9Var4.j(ccj.a)).d), null, null, null, vt9Var4, 48, 2040);
                    ijl.b(t1kVar.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var4.j(abm.a)).f, vt9Var4, 0, 0, 131070);
                    vt9Var4.p(true);
                    vt9Var4.W(1786814855);
                    Iterator it = t1kVar.d.iterator();
                    while (it.hasNext()) {
                        r9h.b((s1k) it.next(), vt9Var4, 0);
                    }
                    vt9Var4.p(false);
                    vt9Var4.p(true);
                    yi4.a(function08, mpj.a, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, mkh.c, vt9Var4, 805306416, 508);
                    ocp.c(vt9Var4, mpj.c(z7eVar, 16.0f));
                    vt9Var4.p(true);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 4:
                f2e f2eVar = (f2e) obj5;
                Function0 function09 = (Function0) obj4;
                ih5 ih5Var5 = (ih5) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                vt9 vt9Var5 = (vt9) ih5Var5;
                if (vt9Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    boolean zF23 = vt9Var5.f(function09);
                    Object objK23 = vt9Var5.K();
                    if (zF23 || objK23 == zpaVar) {
                        objK23 = new p01(function09, (byte) 13);
                        vt9Var5.g0(objK23);
                    }
                    gyg.g(f2eVar, (Function1) objK23, mpj.a, false, vt9Var5, 3456, 0);
                } else {
                    vt9Var5.Q();
                }
                return Unit.a;
            case 5:
                mkh.j((Function1) obj5, obj4, (CoroutineContext) obj3);
                return Unit.a;
            case 6:
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                p9i p9iVar = (p9i) obj;
                ih5 ih5Var6 = (ih5) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((vt9) ih5Var6).f(p9iVar) ? 4 : 2;
                }
                vt9 vt9Var6 = (vt9) ih5Var6;
                if (vt9Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    z4o.j(str6, str7, p9iVar.a(1.0f, true), vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 7:
                Function1 function13 = (Function1) obj5;
                is5 is5Var = (is5) obj4;
                ih5 ih5Var7 = (ih5) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                vt9 vt9Var7 = (vt9) ih5Var7;
                if (vt9Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Object objK24 = vt9Var7.K();
                    if (objK24 == zpaVar) {
                        objK24 = new rs5();
                        vt9Var7.g0(objK24);
                    }
                    rs5 rs5Var = (rs5) objK24;
                    rs5Var.a.clear();
                    function13.invoke(rs5Var);
                    rs5Var.a(is5Var, vt9Var7, 0);
                } else {
                    vt9Var7.Q();
                }
                return Unit.a;
            case 8:
                zca zcaVar = (zca) obj4;
                Function1 function14 = (Function1) obj5;
                ih5 ih5Var8 = (ih5) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                vt9 vt9Var8 = (vt9) ih5Var8;
                if (vt9Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    y9m.i(zcaVar, function14, null, vt9Var8, 0);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case 9:
                shk shkVar = (shk) obj5;
                Function2 function2 = (Function2) obj4;
                ih5 ih5Var9 = (ih5) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                vt9 vt9Var9 = (vt9) ih5Var9;
                if (vt9Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    f8c.h(uyg.q(shkVar, vt9Var9), (c8e) null, ((u95) function2.invoke(vt9Var9, 0)).a, vt9Var9, 0, 2);
                } else {
                    vt9Var9.Q();
                }
                return Unit.a;
            case 10:
                g1b<l7c> g1bVar2 = (g1b) obj4;
                Function1 function15 = (Function1) obj5;
                ih5 ih5Var10 = (ih5) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                vt9 vt9Var10 = (vt9) ih5Var10;
                if (vt9Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    db5 db5VarA6 = cb5.a(new x62(8.0f, true, new t40((byte) 19)), rbe.n, vt9Var10, 6);
                    int iHashCode12 = Long.hashCode(vt9Var10.T);
                    oag oagVarL12 = vt9Var10.l();
                    c8e c8eVarP12 = qyn.P(vt9Var10, z7eVar);
                    bh5.To.getClass();
                    vt9Var10.a0();
                    if (vt9Var10.S) {
                        vt9Var10.k(function02);
                    } else {
                        vt9Var10.j0();
                    }
                    y4h.o(vt9Var10, db5VarA6, ujp.f);
                    y4h.o(vt9Var10, oagVarL12, ujp.e);
                    y4h.o(vt9Var10, Integer.valueOf(iHashCode12), ujp.g);
                    y4h.m(vt9Var10);
                    y4h.o(vt9Var10, c8eVarP12, ujp.d);
                    vt9Var10.W(-1770937707);
                    for (l7c l7cVar : g1bVar2) {
                        boolean zF24 = vt9Var10.f(function15) | vt9Var10.h(l7cVar);
                        Object objK25 = vt9Var10.K();
                        if (zF24 || objK25 == zpaVar) {
                            objK25 = new gv8(function15, l7cVar, (byte) 17);
                            vt9Var10.g0(objK25);
                        }
                        f8c.g(l7cVar, (Function0) objK25, (c8e) null, vt9Var10, 8);
                    }
                    vt9Var10.p(false);
                    vt9Var10.p(true);
                } else {
                    vt9Var10.Q();
                }
                return Unit.a;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                return c(obj, obj2, obj3);
            case 14:
                return d(obj, obj2, obj3);
            case 15:
                return e(obj, obj2, obj3);
            case 16:
                return f(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return l(obj, obj2, obj3);
            case 20:
                return o(obj, obj2, obj3);
            default:
                myn mynVar = (myn) obj5;
                ayn aynVar = (ayn) obj4;
                ih5 ih5Var11 = (ih5) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                vt9 vt9Var11 = (vt9) ih5Var11;
                if (vt9Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean z3 = mynVar.a() instanceof htc;
                    boolean zF25 = vt9Var11.f(aynVar);
                    Object objK26 = vt9Var11.K();
                    if (zF25 || objK26 == zpaVar) {
                        objK26 = new m2n(aynVar, b3);
                        vt9Var11.g0(objK26);
                    }
                    f03.a((Function0) objK26, (c8e) null, z3, (pta) null, (paj) null, qyn.c, vt9Var11, 1572864, 58);
                } else {
                    vt9Var11.Q();
                }
                return Unit.a;
        }
    }
}
