package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.android.installreferrer.api.ReferrerDetails;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class g9 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ g9(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ g9(Object obj, Object obj2, Object obj3, int i, byte b, boolean z) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ g9(Function0 function0, rul rulVar, Function0 function02) {
        this.a = (byte) 22;
        this.d = function0;
        this.b = rulVar;
        this.c = function02;
    }

    public final Object invoke(Object obj, Object obj2) {
        wsf wsfVar;
        String str;
        x5f x5fVar;
        int i;
        int i2;
        i90 i90Var;
        byte b = this.a;
        byte b2 = 7;
        Object obj3 = hh5.a;
        int i3 = 0;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                fr3.b((ndc) obj6, (Function1) obj4, (Function0) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 1:
                ef efVar = (ef) obj2;
                ((fd) obj6).a.invoke((pc) obj4, efVar);
                ((jf) obj5).a.invoke((View) obj, efVar);
                return Unit.a;
            case 2:
                c8e c8eVar = (c8e) obj6;
                afe afeVar = (afe) obj4;
                ue5 ue5Var = (ue5) obj5;
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objK = vt9Var2.K();
                    Object obj7 = objK;
                    if (objK == obj3) {
                        gb1 gb1Var = new gb1(afeVar, (byte) 0);
                        vt9Var2.g0(gb1Var);
                        obj7 = gb1Var;
                    }
                    c8e c8eVarH = na2.H(c8eVar, (Function1) obj7);
                    tfd tfdVarC = nr3.c(rbe.b, true);
                    int iHashCode = Long.hashCode(vt9Var2.T);
                    oag oagVarL = vt9Var2.l();
                    c8e c8eVarP = qyn.P(vt9Var2, c8eVarH);
                    bh5.To.getClass();
                    vt9Var2.a0();
                    if (vt9Var2.S) {
                        vt9Var2.k(m3c.S);
                    } else {
                        vt9Var2.j0();
                    }
                    y4h.o(vt9Var2, tfdVarC, ujp.f);
                    y4h.o(vt9Var2, oagVarL, ujp.e);
                    y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
                    y4h.m(vt9Var2);
                    y4h.o(vt9Var2, c8eVarP, ujp.d);
                    o18.r(0, ue5Var, vt9Var2, true);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 3:
                b2l b2lVar = (b2l) obj4;
                b22 b22Var = (b22) obj5;
                String strG0 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) ((u22) obj6).get()).booleanValue()) {
                    if (strG0.length() == 0) {
                        strG0 = ((d7l) b2lVar).g0();
                    }
                    ((uv0) b22Var.y.get()).d.K(strG0, 3, zBooleanValue, 1, false, null);
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                wxe.a((j23) obj6, (Function2) obj4, (c8e) obj5, (ih5) obj, aoh.m(385));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                wxe.b((gpm) obj6, (o13) obj4, (c8e) obj5, (ih5) obj, aoh.m(385));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                jpo.e((Integer) obj6, (Function0) obj5, (c8e) obj4, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                z5i.a((g1b) obj6, (Integer) obj4, (Function0) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                kfo.a((xvf) obj6, (g1b) obj5, (Function1) obj4, (ih5) obj, aoh.m(1));
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                dg5 dg5Var = (dg5) obj6;
                xg5 xg5Var = (xg5) obj4;
                ue5 ue5Var2 = (ue5) obj5;
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    iba.a(dg5Var, gyg.P(1412352129, new fx0(xg5Var, ue5Var2, (byte) 17), vt9Var4), vt9Var4, 48);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                wyh.f((pej) obj6, (Function0) obj5, (ue5) obj4, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                mi5.a((v31) obj6, (tb1) obj4, (ue5) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                cs5.g((c8e) obj6, (dil) obj4, (ue5) obj5, (ih5) obj, aoh.m(385));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                aib.f((g1b) obj6, (Function1) obj4, (c8e) obj5, (ih5) obj, aoh.m(9));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                aib.b((Boolean) obj6, (Function1) obj4, (c8e) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                y9m.i((zca) obj6, (Function1) obj4, (c8e) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                y9m.g((hea) obj6, (Function0) obj5, (c8e) obj4, (ih5) obj, aoh.m(393));
                return Unit.a;
            case 17:
                Context context = (Context) obj6;
                x5f x5fVar2 = (x5f) obj4;
                wsf wsfVar2 = (wsf) obj5;
                hg0 hg0Var = (hg0) obj;
                ReferrerDetails referrerDetails = (ReferrerDetails) obj2;
                if (referrerDetails != null) {
                    SharedPreferences.Editor editorEdit = vtp.L(context).edit();
                    editorEdit.putLong("play_referrer_click_time", referrerDetails.getReferrerClickTimestampSeconds() * 1000).putLong("play_referrer_install_time", referrerDetails.getInstallBeginTimestampSeconds() * 1000);
                    String installReferrer = referrerDetails.getInstallReferrer();
                    if (installReferrer != null) {
                        try {
                            editorEdit.putString("install_intent_referrer", a26.B(installReferrer));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    editorEdit.apply();
                }
                String strH = vtp.H(context, false);
                String strH2 = vtp.H(context, true);
                String strN = vtp.N(vtp.L(context).getString("install_intent_referrer", null), false);
                String strJ = vtp.J(context);
                String strA = etg.a(context);
                long j = vtp.L(context).getLong("play_referrer_install_time", -1L);
                long j2 = vtp.L(context).getLong("play_referrer_click_time", -1L);
                boolean z = !strH.equals(strH2);
                zpa zpaVar = x5fVar2.d;
                x56 x56VarF = zpa.F();
                ra0 ra0VarY = x56VarF.y(zpaVar);
                i90 i90Var2 = (i90) ra0VarY.n(2);
                if (i90Var2 != null) {
                    x5fVar = x5fVar2;
                    str = "play_referrer_install_time";
                    i = 1;
                    i90Var = i90Var2;
                    i2 = 2;
                    wsfVar = wsfVar2;
                } else {
                    wsfVar = wsfVar2;
                    str = "play_referrer_install_time";
                    x5fVar = x5fVar2;
                    i = 1;
                    i2 = 2;
                    ra0VarY.q(2, 1, new i90(2443, 1, 5));
                    i90Var = (i90) ra0VarY.n(2);
                }
                i90Var.x(0, oup.a0(i, strH));
                i90Var.x(i2, oup.a0(3, strH));
                i90Var.x(i, oup.a0(4, strH));
                i90Var.x(3, oup.a0(5, strH));
                i90Var.x(4, oup.a0(2, strH));
                in0 in0VarI = x56VarF.I(zpaVar);
                in0VarI.x(3, oup.a0(4, strJ));
                in0VarI.x(4, oup.a0(1, strJ));
                in0VarI.x(5, oup.a0(3, strJ));
                in0VarI.x(6, strJ);
                in0VarI.x(7, oup.a0(4, strA));
                in0VarI.x(8, oup.a0(1, strA));
                in0VarI.x(9, oup.a0(3, strA));
                in0VarI.x(10, strA);
                in0VarI.x(11, strH);
                in0VarI.x(12, strN);
                in0VarI.x(13, oup.a0(4, strN));
                in0VarI.x(14, oup.a0(1, strN));
                if (j >= 0) {
                    in0VarI.p(37, 1, j);
                }
                if (j2 >= 0) {
                    in0VarI.p(38, 1, j2);
                }
                in0VarI.q(15, hg0Var == null ? 0 : 1, hg0Var);
                in0VarI.r(16, 1, z);
                in0VarI.x(17, oup.a0(7, strH));
                x5fVar.U0(x56VarF);
                hs3.a.getClass();
                wsfVar.a(new ai(n9a.t(context), vtp.J(context), etg.a(context), strH, Long.valueOf(vtp.L(context).getLong(str, -1L))));
                hd.j((Context) hd.o(context).f).edit().putString("npt_install_referrer", strH).apply();
                cak.a(2);
                ks3.I(34, vtp.G(1, context));
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((Integer) obj2).getClass();
                f8c.f((String) obj6, (c8e) obj4, (ue5) obj5, (ih5) obj, aoh.m(385));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                f8c.g((l7c) obj6, (Function0) obj5, (c8e) obj4, (ih5) obj, aoh.m(9));
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((Integer) obj2).getClass();
                f8c.d((b9c) obj6, (Function1) obj4, (c8e) obj5, (ih5) obj, aoh.m(9));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                p37.g((String) obj6, (String) obj4, (Function0) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                Function0 function0 = (Function0) obj5;
                rul rulVar = (rul) obj6;
                Function0 function02 = (Function0) obj4;
                vt9 vt9Var5 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = vt9Var5;
                if (vt9Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zi4.f(mzg.q(vt9Var6, 2132019670), function0, (c8e) null, (tof) null, (hyf) null, (String) null, (cec) null, rulVar, gyg.P(-1405508555, new y35(function02, (byte) 1), vt9Var6), vt9Var6, 100663296, 124);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 23:
                ue5 ue5Var3 = (ue5) obj6;
                wd9 wd9Var = (wd9) obj4;
                ue5 ue5Var4 = (ue5) obj5;
                vt9 vt9Var7 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var8 = vt9Var7;
                if (vt9Var8.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ue5Var3.invoke(wd9Var, vt9Var8, 0);
                    if (ue5Var4 == null) {
                        vt9Var8.W(-696741877);
                    } else {
                        vt9Var8.W(-1685043530);
                        ue5Var4.invoke(wd9Var, vt9Var8, 0);
                    }
                    vt9Var8.p(false);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                ((Integer) obj2).getClass();
                ic4.b((lld) obj6, (aof) obj4, (c8e) obj5, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 25:
                List list = (List) obj6;
                Function1 function1 = (Function1) obj4;
                ArrayList arrayList = (ArrayList) obj5;
                vt9 vt9Var9 = (ih5) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vt9 vt9Var10 = vt9Var9;
                if (vt9Var10.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    for (Object obj8 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            j95.n();
                            throw null;
                        }
                        rdf rdfVar = (rdf) obj8;
                        boolean zF = vt9Var10.f(function1) | vt9Var10.h(rdfVar);
                        Object objK2 = vt9Var10.K();
                        if (zF || objK2 == obj3) {
                            objK2 = new s4f(function1, rdfVar, b2);
                            vt9Var10.g0(objK2);
                        }
                        vtp.j((Function0) objK2, (String) arrayList.get(i3), (c8e) null, (ikl) null, (u8i) null, (gyi) null, rdfVar.b, 0.0f, (hyf) null, (go3) null, vt9Var10, 0, 4028);
                        i3 = i4;
                    }
                } else {
                    vt9Var10.Q();
                }
                return Unit.a;
            case 26:
                mqh mqhVar = (mqh) obj6;
                spi spiVar = (spi) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = spiVar.i(spiVar.e(fFloatValue - mqhVar.a));
                spi spiVar2 = ((qpi) obj5).a;
                mqhVar.a += spiVar.e(spiVar.h(spiVar2.d(spiVar2.k, jI, 1)));
                return Unit.a;
            case 27:
                y8k y8kVar = (y8k) obj6;
                t0g t0gVar = (t0g) obj4;
                ch5 ch5Var = (ch5) obj5;
                vt9 vt9Var11 = (ih5) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vt9 vt9Var12 = vt9Var11;
                if (vt9Var12.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rof.c(nof.a, false, gyg.P(1833708260, new px0(t0gVar, y8kVar, ch5Var, p37.c0(y8kVar.c, r9k.a, vt9Var12), (byte) 14), vt9Var12), vt9Var12, 438, 0);
                } else {
                    vt9Var12.Q();
                }
                return Unit.a;
            case 28:
                ((Integer) obj2).getClass();
                kfo.n((n01) obj6, (String) obj4, (ue5) obj5, (ih5) obj, aoh.m(385));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                ((sjl) obj6).b((Object[]) obj5, (Function1) obj4, (ih5) obj, aoh.m(1));
                return Unit.a;
        }
    }
}
