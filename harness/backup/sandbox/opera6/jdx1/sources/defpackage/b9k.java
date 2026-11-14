package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class b9k {
    public static final long a;
    public static final Regex b;
    public static final Regex c;

    static {
        on7 on7Var = pn7.b;
        a = cs5.x0(1000, un7.d);
        b = new Regex("<tos>(.*?)</tos>");
        c = new Regex("<privacy>(.*?)</privacy>");
    }

    public static final void a(Function0 function0, Function0 function02, Function0 function03, t9k t9kVar, boolean z, ih5 ih5Var, int i) {
        int i2;
        mt5 mt5Var;
        afe afeVar;
        boolean z2;
        mt5 mt5Var2;
        cd1 cd1Var;
        Object obj;
        u36 u36Var;
        Function0 function04 = function0;
        Function0 function05 = function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-235993572);
        int i3 = i | (vt9Var.h(function04) ? 4 : 2) | (vt9Var.h(function05) ? 32 : 16) | (vt9Var.h(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(t9kVar) ? 2048 : 1024) | (vt9Var.g(z) ? 16384 : 8192) | 1769472;
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            boolean zA = Intrinsics.a(t9kVar, s9k.a);
            boolean z3 = t9kVar instanceof q9k;
            Object objK = vt9Var.K();
            Object obj2 = hh5.a;
            if (objK == obj2) {
                objK = hyg.k(false);
                vt9Var.g0(objK);
            }
            afe afeVar2 = (afe) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == obj2) {
                objK2 = hyg.k(false);
                vt9Var.g0(objK2);
            }
            afe afeVar3 = (afe) objK2;
            Object objK3 = vt9Var.K();
            if (objK3 == obj2) {
                objK3 = hyg.k(Boolean.TRUE);
                vt9Var.g0(objK3);
            }
            afe afeVar4 = (afe) objK3;
            Object objK4 = vt9Var.K();
            if (objK4 == obj2) {
                objK4 = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK4);
            }
            afe afeVar5 = (afe) objK4;
            Object objK5 = vt9Var.K();
            if (objK5 == obj2) {
                objK5 = ui6.a(1.0f);
                vt9Var.g0(objK5);
            }
            Object obj3 = (cd1) objK5;
            Unit unit = Unit.a;
            boolean zH = vt9Var.h(obj3);
            Object objK6 = vt9Var.K();
            if (zH || objK6 == obj2) {
                i2 = i3;
                objK6 = new rf4((byte) 16, null, obj3);
                vt9Var.g0(objK6);
            } else {
                i2 = i3;
            }
            rm5.e(vt9Var, unit, (Function2) objK6);
            boolean zF = vt9Var.f(afeVar2) | vt9Var.f(afeVar3);
            Object objK7 = vt9Var.K();
            if (zF || objK7 == obj2) {
                mt5Var = null;
                objK7 = new hz1(afeVar2, afeVar5, afeVar3, (mt5) null, (byte) 28);
                vt9Var.g0(objK7);
            } else {
                mt5Var = null;
            }
            rm5.e(vt9Var, unit, (Function2) objK7);
            Boolean bool = (Boolean) afeVar5.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zG = vt9Var.g(zA) | vt9Var.f(afeVar3);
            Object objK8 = vt9Var.K();
            if (zG || objK8 == obj2) {
                afeVar = afeVar3;
                objK8 = new rx0(zA, afeVar5, afeVar, mt5Var, (byte) 1);
                z2 = zA;
                mt5Var2 = mt5Var;
                vt9Var.g0(objK8);
            } else {
                afeVar = afeVar3;
                z2 = zA;
                mt5Var2 = mt5Var;
            }
            rm5.f(bool, boolValueOf, (Function2) objK8, vt9Var);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zG2 = vt9Var.g(z2);
            Object objK9 = vt9Var.K();
            if (zG2 || objK9 == obj2) {
                objK9 = new qx0(z2, afeVar4, mt5Var2, (byte) 1);
                vt9Var.g0(objK9);
            }
            rm5.e(vt9Var, boolValueOf2, (Function2) objK9);
            Object objAsList = Arrays.asList(new u95(nb6.k(vt9Var, 2131100247)), new u95(nb6.k(vt9Var, 2131100245)), new u95(nb6.k(vt9Var, 2131100246)));
            a4o a4oVar = w0h.g(vt9Var).a;
            float f = (a4oVar.a < 600 || a4oVar.b < 480) ? 300.0f : 360.0f;
            y2d y2dVar = new y2d();
            vt9Var.X(-1248473602);
            boolean z4 = z2;
            dk7 dk7Var = new dk7(3, null, (byte) 2);
            g7h g7hVar = j41.b;
            Context context = (Context) vt9Var.j(g7hVar);
            vt9Var.X(1157296644);
            boolean zF2 = vt9Var.f(y2dVar);
            Object objK10 = vt9Var.K();
            if (zF2 || objK10 == obj2) {
                objK10 = hyg.k(new x2d());
                vt9Var.g0(objK10);
            }
            vt9Var.p(false);
            afe afeVar6 = (afe) objK10;
            vt9Var.X(511388516);
            boolean zF3 = vt9Var.f(y2dVar) | vt9Var.f("__LottieInternalDefaultCacheKey__");
            Object objK11 = vt9Var.K();
            if (zF3 || objK11 == obj2) {
                vt9Var.g0(n1h.m(context, y2dVar, "__LottieInternalDefaultCacheKey__"));
            }
            vt9Var.p(false);
            rm5.f(y2dVar, "__LottieInternalDefaultCacheKey__", new cth(dk7Var, context, y2dVar, afeVar6, (mt5) null), vt9Var);
            x2d x2dVar = (x2d) afeVar6.getValue();
            vt9Var.p(false);
            Object objK12 = vt9Var.K();
            if (objK12 == obj2) {
                objK12 = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK12);
            }
            afe afeVar7 = (afe) objK12;
            p2d p2dVar = (p2d) x2dVar.getValue();
            Boolean boolValueOf3 = Boolean.valueOf(z);
            boolean zF4 = vt9Var.f(x2dVar) | ((i2 & 57344) == 16384);
            Object objK13 = vt9Var.K();
            if (zF4 || objK13 == obj2) {
                objK13 = new r8h(z, x2dVar, afeVar7, (mt5) null);
                vt9Var.g0(objK13);
            }
            rm5.f(p2dVar, boolValueOf3, (Function2) objK13, vt9Var);
            p2d p2dVar2 = (p2d) x2dVar.getValue();
            Boolean bool2 = (Boolean) afeVar7.getValue();
            boolean zBooleanValue = bool2.booleanValue();
            vt9Var.X(683659508);
            o2d[] o2dVarArr = o2d.a;
            vt9Var.X(2024497114);
            vt9Var.X(-492369756);
            Object objK14 = vt9Var.K();
            if (objK14 == obj2) {
                objK14 = new e2d();
                vt9Var.g0(objK14);
            }
            vt9Var.p(false);
            e2d e2dVar = (e2d) objK14;
            vt9Var.p(false);
            vt9Var.X(-492369756);
            Object objK15 = vt9Var.K();
            if (objK15 == obj2) {
                objK15 = hyg.k(bool2);
                vt9Var.g0(objK15);
            }
            vt9Var.p(false);
            afe afeVar8 = (afe) objK15;
            vt9Var.X(-180606834);
            Context context2 = (Context) vt9Var.j(g7hVar);
            f30 f30Var = dzm.a;
            float f2 = 1.0f / Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f);
            vt9Var.p(false);
            Object[] objArr = {p2dVar2, bool2, null, Float.valueOf(f2), 1};
            nd1 nd1Var = new nd1(zBooleanValue, e2dVar, p2dVar2, f2, afeVar8, null);
            CoroutineContext coroutineContext = vt9Var.R;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 5);
            boolean zD = vt9Var.d(objArrCopyOf.length);
            int length = objArrCopyOf.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4;
                zD |= vt9Var.f(objArrCopyOf[i5]);
                i4 = i5 + 1;
            }
            Object objK16 = vt9Var.K();
            if (zD || objK16 == obj2) {
                vt9Var.g0(new s1c(coroutineContext, nd1Var));
            }
            vt9Var.p(false);
            Object objK17 = vt9Var.K();
            if (objK17 == obj2) {
                objK17 = new u36(0.03f, 0.9f, 0.67f, 1.0f);
                vt9Var.g0(objK17);
            }
            u36 u36Var2 = (u36) objK17;
            i39 i39Var = mpj.c;
            boolean zH2 = vt9Var.h(obj3) | vt9Var.f(objAsList);
            Object objK18 = vt9Var.K();
            if (zH2 || objK18 == obj2) {
                objK18 = new d7k(obj3, objAsList, (byte) 1);
                vt9Var.g0(objK18);
            }
            c8e c8eVarD = fr3.D(i39Var, (Function1) objK18);
            WeakHashMap weakHashMap = k3o.x;
            c8e c8eVarB0 = a26.b0(a26.Z(ipe.h0(c8eVarD, fac.m(vt9Var).e), ((Resources) vt9Var.j(j41.c)).getDimension(2131167576) / ((n27) vt9Var.j(mi5.h)).b(), 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            db5 db5VarA = cb5.a(b72.c, rbe.o, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarB0);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z5 = vt9Var.S;
            Function0 function06 = m3c.S;
            if (z5) {
                vt9Var.k(function06);
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
            c8e c8eVarO = z5i.O(new g4c(1.0f, true).d(mpj.a), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1044479);
            tfd tfdVarC = nr3.c(rbe.f, false);
            float f3 = f;
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarO);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(function06);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            p2d p2dVar3 = (p2d) x2dVar.getValue();
            boolean zF5 = vt9Var.f(e2dVar);
            Object objK19 = vt9Var.K();
            if (zF5 || objK19 == obj2) {
                objK19 = new dnj(e2dVar, (byte) 15);
                vt9Var.g0(objK19);
            }
            z7e z7eVar = z7e.b;
            x1p.c(p2dVar3, (Function0) objK19, z5i.O(mpj.l(z7eVar, f3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1044479), vt9Var, 0);
            vt9Var.p(true);
            Object objK20 = vt9Var.K();
            if (objK20 == obj2) {
                objK20 = ui6.a(1.0f);
                vt9Var.g0(objK20);
            }
            Object obj4 = (cd1) objK20;
            Object objK21 = vt9Var.K();
            if (objK21 == obj2) {
                objK21 = ui6.a(0.0f);
                vt9Var.g0(objK21);
            }
            cd1 cd1Var2 = (cd1) objK21;
            Boolean bool3 = (Boolean) afeVar2.getValue();
            bool3.getClass();
            boolean zF6 = vt9Var.f(afeVar2) | vt9Var.h(obj4) | vt9Var.h(cd1Var2);
            Object objK22 = vt9Var.K();
            if (zF6 || objK22 == obj2) {
                objK22 = new r71(cd1Var2, afeVar2, obj4, u36Var2, (mt5) null, (byte) 13);
                cd1Var = cd1Var2;
                obj = obj4;
                u36Var = u36Var2;
                vt9Var.g0(objK22);
            } else {
                cd1Var = cd1Var2;
                obj = obj4;
                u36Var = u36Var2;
            }
            rm5.e(vt9Var, bool3, (Function2) objK22);
            c8e c8eVarM = mpj.m(z7eVar, 560.0f, 1);
            boolean zH3 = vt9Var.h(obj);
            Object objK23 = vt9Var.K();
            if (zH3 || objK23 == obj2) {
                objK23 = new j04(obj, (byte) 18);
                vt9Var.g0(objK23);
            }
            c8e c8eVarF = yi4.F(c8eVarM, (cr9) objK23);
            boolean zH4 = vt9Var.h(cd1Var);
            Object objK24 = vt9Var.K();
            if (zH4 || objK24 == obj2) {
                objK24 = new f7e(cd1Var, (byte) 2);
                vt9Var.g0(objK24);
            }
            function05 = function02;
            b(function05, function03, z5i.N(c8eVarF, (Function1) objK24), vt9Var, (i2 >> 3) & 126);
            boolean z6 = ((Boolean) afeVar.getValue()).booleanValue() && !z3;
            x48 x48VarD = o48.d(rm5.X(700, 2, u36Var), 8);
            e8m e8mVarX = rm5.X(700, 2, u36Var);
            Object objK25 = vt9Var.K();
            if (objK25 == obj2) {
                objK25 = new r4k((byte) 4);
                vt9Var.g0(objK25);
            }
            x48 x48VarA = x48VarD.a(o48.k(e8mVarX, (Function1) objK25)).a(o48.e(rm5.X(1500, 6, null), 2));
            function04 = function0;
            xf8.e(z6, null, x48VarA, null, null, gyg.P(892118542, new a9k((byte) 0, function04, afeVar4, z4), vt9Var), vt9Var, 1572870, 26);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hx0(function04, function05, function03, t9kVar, z, i);
        }
    }

    public static final void b(Function0 function0, Function0 function02, c8e c8eVar, ih5 ih5Var, int i) {
        Function0 function03;
        int i2;
        Function0 function04;
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1196249442);
        if ((i & 6) == 0) {
            function03 = function0;
            i2 = (vt9Var2.h(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function04 = function02;
            i2 |= vt9Var2.h(function04) ? 32 : 16;
        } else {
            function04 = function02;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var2.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var2.N(i2 & 1, (i2 & 147) != 146)) {
            String strQ = mzg.q(vt9Var2, 2132021636);
            Object objK = vt9Var2.K();
            Object obj = hh5.a;
            if (objK == obj) {
                objK = new tjl(new rwj(0L, 0L, (ki9) null, (gi9) null, (hi9) null, (lh9) null, (String) null, 0L, (ua3) null, (vil) null, (awc) null, 0L, bgl.c, (jaj) null, 61439), null, null, null);
                vt9Var2.g0(objK);
            }
            tjl tjlVar = (tjl) objK;
            boolean zF = vt9Var2.f(strQ);
            Object objK2 = vt9Var2.K();
            if (zF || objK2 == obj) {
                qf1 qf1Var = new qf1();
                qf1Var.b(c(qf1Var, c(qf1Var, strQ, b, "terms", tjlVar, function03), c, "privacy", tjlVar, function04));
                objK2 = qf1Var.h();
                vt9Var2.g0(objK2);
            }
            vt9Var = vt9Var2;
            ijl.c((sf1) objK2, c8eVar, u95.c, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, vt9Var, ((i2 >> 3) & 112) | 384, 0, 524280);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new v0a(function0, function02, c8eVar, i, (byte) 1);
        }
    }

    public static final String c(qf1 qf1Var, String str, Regex regex, String str2, tjl tjlVar, Function0 function0) {
        lv9 lv9Var = new lv9(Regex.g(regex, str));
        int i = 0;
        while (lv9Var.hasNext()) {
            MatchResult matchResult = (MatchResult) lv9Var.next();
            qf1Var.b(str.substring(i, ((a) matchResult.b()).a));
            String str3 = (String) matchResult.a().get(1);
            int iE = qf1Var.e(new nfc(str2, tjlVar, new z8k(function0)));
            try {
                qf1Var.b(str3);
                qf1Var.d(iE);
                i = ((a) matchResult.b()).b + 1;
            } catch (Throwable th) {
                qf1Var.d(iE);
                throw th;
            }
        }
        return i > 0 ? str.substring(i) : str;
    }
}
