package defpackage;

import J.N;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.w;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class u02 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;

    public u02(d12 d12Var, wth wthVar, l02 l02Var, c12 c12Var, ab abVar, g7m g7mVar, t22 t22Var, k62 k62Var, k62 k62Var2, pjn pjnVar, wyn wynVar, yk6 yk6Var, a52 a52Var, r2 r2Var) {
        this.a = d12Var;
        this.b = wthVar;
        this.c = l02Var;
        this.d = c12Var;
        this.e = abVar;
        this.f = g7mVar;
        this.g = t22Var;
        this.h = k62Var;
        this.i = k62Var2;
        this.j = pjnVar;
        this.k = wynVar;
        this.l = yk6Var;
        this.m = a52Var;
        this.n = r2Var;
    }

    public /* synthetic */ u02(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.j = obj10;
        this.k = obj11;
        this.l = obj12;
        this.m = obj13;
        this.n = obj14;
        this.o = obj15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u02(ndc ndcVar, kze kzeVar, hx5 hx5Var, jze jzeVar, hx5 hx5Var2, hx5 hx5Var3, hx5 hx5Var4, po7 po7Var, tsd tsdVar, tsd tsdVar2, hx5 hx5Var5, ode odeVar, String str, hx5 hx5Var6, String str2) {
        this.a = kzeVar;
        this.b = hx5Var;
        this.c = jzeVar;
        this.d = hx5Var2;
        this.e = hx5Var3;
        this.f = hx5Var4;
        this.g = po7Var;
        this.h = tsdVar;
        this.i = tsdVar2;
        this.j = hx5Var5;
        this.k = odeVar;
        this.l = str;
        this.m = hx5Var6;
        this.n = str2;
        this.o = new kze(F());
        byte b = 5;
        byte b2 = 8;
        Iterator it = Arrays.asList(kzeVar, hx5Var, jzeVar, hx5Var2, hx5Var3, hx5Var4, po7Var, tsdVar, tsdVar2, hx5Var5, odeVar, hx5Var6).iterator();
        while (it.hasNext()) {
            ((ekc) it.next()).j(ndcVar, new iwa(new rkc(this, b2), b));
        }
    }

    public static void I(tw7 tw7Var, bqb bqbVar) {
        if (tw7Var instanceof rw7) {
            bqbVar.n(new rw7(new dqb((Throwable) ((rw7) tw7Var).a)));
        } else if (tw7Var instanceof sw7) {
            bqbVar.n(new sw7(((sw7) tw7Var).a));
        } else {
            h9o.p();
        }
    }

    public static pcd O(joc jocVar) {
        qcd qcdVar;
        long j = jocVar.a;
        int iOrdinal = jocVar.b.ordinal();
        if (iOrdinal == 0) {
            qcdVar = qcd.FOOTBALL;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            qcdVar = qcd.BASKETBALL;
        }
        return new pcd(j, qcdVar);
    }

    public static void r(fka fkaVar) {
        try {
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void A(long j, gka gkaVar) {
        wth wthVar = (wth) this.b;
        q02 q02Var = new q02(gkaVar, (byte) 5);
        ((d12) wthVar.b).b("chat/" + j, q02Var);
    }

    public final void B(long j, long j2, gka gkaVar) {
        wth wthVar = (wth) this.b;
        q02 q02Var = new q02(gkaVar, (byte) 4);
        d12 d12Var = (d12) wthVar.b;
        StringBuilder sbQ = p3p.q(j, "chat/", "/item/");
        sbQ.append(j2);
        d12Var.b(sbQ.toString(), q02Var);
    }

    public final void C(long j, gka gkaVar) {
        ((wth) this.b).y(j, new t02(this, gkaVar, (byte) 2));
    }

    public final void D(sfb sfbVar, gka gkaVar) {
        wth wthVar = (wth) this.b;
        ((d12) wthVar.b).g(p3p.l(sfbVar.a, "chat/"), sfbVar.a().a.toString(), new q02(gkaVar, (byte) 6));
    }

    public final void E(tfb tfbVar, fka fkaVar) {
        wth wthVar = (wth) this.b;
        q02 q02Var = new q02(fkaVar, (byte) 1);
        d12 d12Var = (d12) wthVar.b;
        long jB = tfbVar.b();
        long jC = tfbVar.c();
        StringBuilder sbQ = p3p.q(jB, "chat/", "/item/");
        sbQ.append(jC);
        d12Var.g(sbQ.toString(), tfbVar.a().a.toString(), q02Var);
    }

    public final cla F() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        pxl pxlVar;
        hdl hdlVar;
        Boolean bool = Boolean.TRUE;
        b2g b2gVar = new b2g();
        kze kzeVar = (kze) this.a;
        if (Intrinsics.a(kzeVar.g(), bool)) {
            List list = (List) ((hx5) this.b).g();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(O(((koc) it.next()).a));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = l08.a;
            }
        } else {
            arrayList = l08.a;
        }
        pla plaVar = new pla(arrayList);
        List list3 = (List) ((hx5) this.d).g();
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(k95.o(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(O((joc) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = l08.a;
        }
        List list5 = (List) ((hx5) this.e).g();
        if (list5 != null) {
            List<kpc> list6 = list5;
            arrayList3 = new ArrayList(k95.o(list6, 10));
            for (kpc kpcVar : list6) {
                long j = kpcVar.a;
                int iOrdinal = kpcVar.b.ordinal();
                if (iOrdinal == 0) {
                    hdlVar = hdl.FOOTBALL;
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return null;
                    }
                    hdlVar = hdl.BASKETBALL;
                }
                arrayList3.add(new gdl(j, hdlVar));
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 == null) {
            arrayList3 = l08.a;
        }
        List list7 = (List) ((hx5) this.f).g();
        if (list7 != null) {
            List<spc> list8 = list7;
            arrayList4 = new ArrayList(k95.o(list8, 10));
            for (spc spcVar : list8) {
                long j2 = spcVar.a;
                int iOrdinal2 = spcVar.b.ordinal();
                if (iOrdinal2 == 0) {
                    pxlVar = pxl.FOOTBALL;
                } else {
                    if (iOrdinal2 != 1) {
                        h9o.p();
                        return null;
                    }
                    pxlVar = pxl.BASKETBALL;
                }
                arrayList4.add(new oxl(j2, pxlVar));
            }
        } else {
            arrayList4 = null;
        }
        if (arrayList4 == null) {
            arrayList4 = l08.a;
        }
        yf2 yf2Var = null;
        gla glaVar = new gla(arrayList2, arrayList3, arrayList4);
        Boolean bool2 = (Boolean) kzeVar.g();
        Object objG = ((tsd) this.h).g();
        Boolean bool3 = Boolean.TRUE;
        c2g c2gVar = new c2g(bool2, Boolean.valueOf(Intrinsics.a(objG, bool3)), Boolean.valueOf(Intrinsics.a(((tsd) this.i).g(), bool3)), (Boolean) ((jze) this.c).g());
        cj9 cj9Var = (cj9) ((po7) this.g).g();
        String str = cj9Var != null ? cj9Var.b : null;
        akc akcVar = (akc) ((hx5) this.j).g();
        if (akcVar != null && !akcVar.equals(xjc.a) && !(akcVar instanceof wjc)) {
            if (akcVar instanceof yjc) {
                yf2Var = new yf2(((yjc) akcVar).a, fla.PAUSED);
            } else {
                if (!(akcVar instanceof zjc)) {
                    h9o.p();
                    return null;
                }
                yf2Var = new yf2(((zjc) akcVar).a, fla.PLAYING);
            }
        }
        yf2 yf2Var2 = yf2Var;
        String str2 = str;
        String str3 = (String) this.l;
        qla qlaVar = qla.OFA;
        String str4 = (String) this.n;
        rla rlaVar = rla.BETA;
        return new cla(new k2h(str3, str4), b2gVar, plaVar, glaVar, new z1g(Boolean.valueOf(Intrinsics.a(((ode) this.k).g(), bool3)), (Boolean) ((hx5) this.m).g()), c2gVar, str2, yf2Var2);
    }

    public final void G(fka fkaVar) {
        ((r2) this.n).invoke(new ab(fkaVar, (byte) 13));
    }

    public final jka H(String str) {
        h52 h52Var = (h52) ((a52) this.m).a.a.get(str);
        if (h52Var == null) {
            return new kka();
        }
        boolean z = h52Var.d;
        String str2 = h52Var.g;
        String str3 = h52Var.f;
        return !z ? new lka(new saf(str3, str, str2, h52Var.h, sko.j("opera-aria://images/", str3)), (byte) 0) : new lka(new k19(str, str2, str3, h52Var.h, sko.j("opera-aria://images/", str3), h52Var.i), (byte) 1);
    }

    public final void J(String str, String str2, nka nkaVar) {
        s62 s62Var = ((t22) this.g).b;
        int iOrdinal = nkaVar.ordinal();
        if (iOrdinal == 0) {
            yt7.k("");
            return;
        }
        if (iOrdinal == 1) {
            s62Var.x.a(str, str2, f22.b);
            return;
        }
        if (iOrdinal == 2) {
            s62Var.x.a.remove(str);
        } else if (iOrdinal == 3) {
            s62Var.x.a(str, str2, f22.a);
        } else {
            h9o.p();
        }
    }

    public final void K(String str, String str2, nka nkaVar, fka fkaVar) {
        try {
            J(str, str2, nkaVar);
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void L(String str, fka fkaVar) {
        ((d12) this.a).e(str, new z3((Object) fkaVar, (byte) 28));
    }

    public final void M(String str, fka fkaVar) {
        ((d12) this.a).b(str, new q02(fkaVar, (byte) 2));
    }

    public final void N(String str, String str2, fka fkaVar) {
        ((d12) this.a).g(str, str2, new q02(fkaVar, (byte) 3));
    }

    public final void P(ArrayList arrayList, fka fkaVar) {
        try {
            ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                String host = Uri.parse(str).getHost();
                if (host == null || host.length() == 0) {
                    host = str;
                }
                String str2 = (String) N.MnEPjazD(host, true);
                if (str2.length() != 0) {
                    str = str2;
                }
                arrayList2.add(str);
            }
            fkaVar.n(new sw7(arrayList2));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void Q(fka fkaVar) {
        try {
            fkaVar.n(new sw7((ela) xf8.B(((c12) this.d).i).g()));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void a() {
        x5f x5fVar = (x5f) ((skm) ((ji) ((g7m) this.f).e).get());
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.O(zpaVar).r(19, 1, true);
        x5fVar.U0(x56VarF);
        yk6 yk6Var = (yk6) this.l;
        nv6 nv6VarB = yk6Var.f.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("ai.tos_accepted", true);
        nv6VarB.w();
        yk6Var.v.r(Boolean.valueOf(yk6Var.f.a.getBoolean("ai.tos_accepted", false)));
    }

    public final void b(fka fkaVar) {
        try {
            a();
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void c(String str, gka gkaVar) {
        try {
            qyj qyjVarF = ((k62) this.i).b.f();
            if (qyjVarF != null) {
                qyjVarF.f();
            }
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                Context context = zz1Var.a;
                axj axjVarC = new c5o(context, (byte) 3).C(str, l08.a);
                ClipData clipDataNewPlainText = ClipData.newPlainText(axjVarC, axjVarC);
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(clipDataNewPlainText);
                    if (Build.VERSION.SDK_INT < 33) {
                        Toast.makeText(context, context.getString(2132018397), 0).show();
                    }
                }
            }
            gkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            gkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void d(long j, fka fkaVar) {
        try {
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                zz1Var.a(j);
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void e(long j, String str, mha mhaVar) {
        v5n v5nVar;
        v5n v5nVar2;
        v5n v5nVar3;
        if (!(mhaVar instanceof kha)) {
            if (!(mhaVar instanceof jha)) {
                if (mhaVar instanceof nha) {
                    yt7.k("");
                    return;
                } else {
                    h9o.p();
                    return;
                }
            }
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var == null || (v5nVar = zz1Var.j) == null) {
                return;
            }
            v5nVar.a(j, str, Uri.parse(((jha) mhaVar).a));
            return;
        }
        int iOrdinal = ((kha) mhaVar).a.ordinal();
        if (iOrdinal == 0) {
            yt7.k("");
            return;
        }
        if (iOrdinal == 1) {
            zz1 zz1Var2 = (zz1) this.o;
            if (zz1Var2 == null || (v5nVar2 = zz1Var2.j) == null) {
                return;
            }
            v5nVar2.b(j, str);
            return;
        }
        if (iOrdinal != 2) {
            h9o.p();
            return;
        }
        zz1 zz1Var3 = (zz1) this.o;
        if (zz1Var3 == null || (v5nVar3 = zz1Var3.j) == null) {
            return;
        }
        v5nVar3.c(j, str);
    }

    public final void f(long j, String str, mha mhaVar, fka fkaVar) {
        try {
            e(j, str, mhaVar);
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void g(fka fkaVar) {
        ((wyn) this.k).a(new ab(fkaVar, (byte) 12));
    }

    public final void h(nx8 nx8Var, fka fkaVar) {
        int iOrdinal = nx8Var.a.ordinal();
        if (iOrdinal == 0) {
            fkaVar.n(new rw7(new dqb(new UnsupportedOperationException(""))));
            return;
        }
        if (iOrdinal == 1) {
            fkaVar.n(new sw7(new yha("", null)));
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                zz1Var.d.a(new rxh(2132022205), 2500);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            h9o.p();
            return;
        }
        zz1 zz1Var2 = (zz1) this.o;
        if (zz1Var2 != null) {
            t02 t02Var = new t02(fkaVar, (byte) 4);
            zz1Var2.e.run(new gx0(new q3(t02Var, zz1Var2, (byte) 14), new pa((Object) t02Var, (byte) 22)));
        }
    }

    public final void i(String str, aia aiaVar) {
        s62 s62Var = (s62) ((pjn) this.j).b;
        pjn pjnVar = new pjn(this, (byte) 11);
        int iOrdinal = aiaVar.ordinal();
        if (iOrdinal == 0) {
            yt7.k("");
            return;
        }
        byte b = 4;
        byte b2 = 2;
        if (iOrdinal == 1) {
            p12 p12Var = s62Var.d;
            boolean zM = s62Var.b.e().m();
            Context context = (Context) p12Var.a;
            k12 k12Var = new k12(pjnVar, (byte) 0);
            SimpleUrlLoader.a(str, "User-Agent: " + cqp.i0(), null).b(zM, new eb(context, k12Var, b2), new wa(k12Var, b));
            return;
        }
        if (iOrdinal == 2) {
            WebContentsWrapper webContentsWrapper = s62Var.b;
            p12 p12Var2 = s62Var.d;
            boolean zM2 = webContentsWrapper.e().m();
            WebContents webContentsE = webContentsWrapper.e();
            z77 z77Var = (z77) ((yv3) p12Var2.c).get();
            s12 s12Var = new s12(zM2, new sxh(2132017607, new Object[]{((Context) p12Var2.a).getString(2132017424)}), new i51(p12Var2, str, pjnVar, webContentsE, (byte) 3));
            z77Var.getClass();
            z77Var.b(s12Var, ijm.b);
            return;
        }
        if (iOrdinal == 3) {
            N.M8vd_RmR(s62Var.b.e(), str, "");
            return;
        }
        if (iOrdinal != 4) {
            h9o.p();
            return;
        }
        p12 p12Var3 = s62Var.d;
        boolean zM3 = s62Var.b.e().m();
        Context context2 = (Context) p12Var3.a;
        wx wxVar = new wx((Object) pjnVar, (Object) context2, (byte) 8);
        SimpleUrlLoader.a(str, "User-Agent: " + cqp.i0(), null).b(zM3, new eb(context2, wxVar, b2), new wa(wxVar, b));
    }

    public final void j(String str, aia aiaVar, fka fkaVar) {
        try {
            i(str, aiaVar);
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void k(fka fkaVar) {
        try {
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                zz1Var.k.e(new tca(sca.b), false);
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void l(bia biaVar, fka fkaVar) {
        vz1 vz1Var;
        try {
            int iOrdinal = biaVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    vz1Var = vz1.b;
                } else if (iOrdinal == 2) {
                    vz1Var = vz1.c;
                } else if (iOrdinal == 3) {
                    vz1Var = vz1.d;
                } else if (iOrdinal == 4) {
                    vz1Var = vz1.e;
                } else if (iOrdinal == 5) {
                    vz1Var = vz1.f;
                } else {
                    h9o.p();
                }
                zz1 zz1Var = (zz1) this.o;
                if (zz1Var != null) {
                    zz1Var.f(vz1Var);
                }
            } else {
                yt7.k("");
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void m(String str, fka fkaVar) {
        zz1 zz1Var;
        try {
            h52 h52Var = (h52) ((a52) this.m).a.a.get(str);
            if (h52Var != null) {
                String str2 = h52Var.h;
                if (!Intrinsics.a(str2, "application/vnd.opera.x-page-context") && (zz1Var = (zz1) this.o) != null) {
                    zz1Var.c(h52Var.f, str2);
                }
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void n(ArrayList arrayList, String str, fka fkaVar) {
        try {
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                zz1Var.e(str, arrayList);
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void o(fka fkaVar) {
        try {
            qyj qyjVarF = ((k62) this.h).b.f();
            if (qyjVarF != null) {
                qyjVarF.m();
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void p(qka qkaVar, gka gkaVar) {
        try {
            if (!(qkaVar instanceof gia)) {
                if (!(qkaVar instanceof hia) && !(qkaVar instanceof rka)) {
                    throw new oye();
                }
                throw new UnsupportedOperationException("");
            }
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                zz1Var.g(((gia) qkaVar).a);
            }
            gkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            gkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void q(String str, fka fkaVar) {
        try {
            zz1 zz1Var = (zz1) this.o;
            if (zz1Var != null) {
                Context context = zz1Var.a;
                new ghf(new i4d(new u5f(new c5o(context, (byte) 3).C(str, l08.a).toString(), (byte) 11))).I(context);
            }
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void s(String str, fka fkaVar) {
        qyj qyjVarF = ((k62) this.h).b.f();
        if (qyjVarF == null) {
            fkaVar.n(new sw7(new jia(new kia())));
            return;
        }
        q3 q3Var = new q3(str, fkaVar, (byte) 16);
        qyjVarF.f();
        qyjVarF.m();
        qyjVarF.l("ONE_SHOT_OUTPUT", str, true, q3Var);
    }

    public final void t(fka fkaVar) {
        qyj qyjVarF = ((k62) this.h).b.f();
        if (qyjVarF == null) {
            fkaVar.n(new rw7(new cqb(999, "")));
        } else {
            qyjVarF.m();
            fkaVar.n(new sw7(Unit.a));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void u(String str, String str2) throws e22 {
        qyj qyjVarF = ((k62) this.h).b.f();
        if (qyjVarF != null) {
            d22 d22Var = qyjVarF.o;
            if (str.equals(d22Var != null ? d22Var.a : null)) {
                return;
            }
            qyjVarF.f();
            qyjVarF.m();
            if (str2 != null && str2.length() != 0) {
                qyjVarF.l(str, str2, true, new bli((byte) 28));
                return;
            }
            d22 d22Var2 = (d22) qyjVarF.c.a.get(str);
            if (d22Var2 == null) {
                throw new e22("");
            }
            qyjVarF.f();
            qyjVarF.m();
            qyjVarF.o = d22Var2;
            d22Var2.c.j(qyjVarF.a, new t7d(new tmi(qyjVarF, d22Var2, new tji((Object) d22Var2, (byte) 27), (byte) 7), (byte) 13));
        }
    }

    public final void v(oka okaVar) {
        if0 if0Var;
        if0 if0Var2;
        f02 f02Var;
        a02 a02Var;
        b02 b02Var;
        boolean z;
        if0 if0Var3;
        if0 if0Var4;
        if0 if0Var5;
        if0 if0Var6;
        if0 if0Var7;
        g7m g7mVar = (g7m) this.f;
        ji jiVar = (ji) g7mVar.e;
        ji jiVar2 = (ji) g7mVar.d;
        byte b = 4;
        if (okaVar instanceof mja) {
            switch (((mja) okaVar).a.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 8:
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                case 19:
                case SizeUtil.textSize0 /* 20 */:
                case 21:
                case SizeUtil.textSize1 /* 22 */:
                case 23:
                case SizeUtil.textSize2 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 29:
                case 30:
                case 31:
                case 32:
                    break;
                case 3:
                    orm ormVar = (orm) jiVar2.get();
                    String str = ((nv0) g7mVar.h).a;
                    x5f x5fVar = (x5f) ormVar;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        new ck0(zpaVar, x56VarF);
                        i60 i60VarM = zpa.m();
                        x56VarF.T().put(str, i60VarM);
                        i60VarM.p(6, 1, 1L);
                        x5fVar.U0(x56VarF);
                        break;
                    }
                    break;
                case 4:
                    orm ormVar2 = (orm) jiVar2.get();
                    String str2 = ((nv0) g7mVar.h).a;
                    x5f x5fVar2 = (x5f) ormVar2;
                    if (x5fVar2.h) {
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF2 = zpa.F();
                        new ck0(zpaVar2, x56VarF2);
                        i60 i60VarM2 = zpa.m();
                        x56VarF2.T().put(str2, i60VarM2);
                        i60VarM2.p(7, 1, 1L);
                        x5fVar2.U0(x56VarF2);
                        break;
                    }
                    break;
                case 5:
                    g7mVar.j = new s6h(orn.PROMPT_SUMMARIZE, l08.a, false);
                    break;
                case 6:
                    g7mVar.j = new s6h(orn.PROMPT_TELL_ME_MORE, l08.a, false);
                    break;
                case 7:
                    g7mVar.d();
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    g7mVar.f(x70.m);
                    break;
                case 11:
                    g7mVar.b(d80.b);
                    break;
                case 12:
                    g7mVar.b(d80.c);
                    break;
                case 13:
                    orm ormVar3 = (orm) jiVar2.get();
                    String str3 = ((nv0) g7mVar.h).a;
                    x5f x5fVar3 = (x5f) ormVar3;
                    if (x5fVar3.h) {
                        zpa zpaVar3 = x5fVar3.d;
                        x56 x56VarF3 = zpa.F();
                        new ck0(zpaVar3, x56VarF3);
                        i60 i60VarM3 = zpa.m();
                        x56VarF3.T().put(str3, i60VarM3);
                        i60VarM3.p(9, 1, 1L);
                        x5fVar3.U0(x56VarF3);
                        break;
                    }
                    break;
                case 14:
                    orm ormVar4 = (orm) jiVar2.get();
                    String str4 = ((nv0) g7mVar.h).a;
                    x5f x5fVar4 = (x5f) ormVar4;
                    if (x5fVar4.h) {
                        zpa zpaVar4 = x5fVar4.d;
                        x56 x56VarF4 = zpa.F();
                        new ck0(zpaVar4, x56VarF4);
                        i60 i60VarM4 = zpa.m();
                        x56VarF4.T().put(str4, i60VarM4);
                        i60VarM4.p(10, 1, 1L);
                        x5fVar4.U0(x56VarF4);
                        break;
                    }
                    break;
                case 15:
                    orm ormVar5 = (orm) jiVar2.get();
                    String str5 = ((nv0) g7mVar.h).a;
                    x5f x5fVar5 = (x5f) ormVar5;
                    if (x5fVar5.h) {
                        zpa zpaVar5 = x5fVar5.d;
                        x56 x56VarF5 = zpa.F();
                        new ck0(zpaVar5, x56VarF5);
                        i60 i60VarM5 = zpa.m();
                        x56VarF5.T().put(str5, i60VarM5);
                        y60 y60VarP = zpa.p();
                        Map map = (Map) i60VarM5.n(11);
                        if (map == null || map.isEmpty()) {
                            HashMap map2 = new HashMap();
                            i60VarM5.q(11, 1, map2);
                            if0Var4 = new if0(i60VarM5, 11, map2);
                        } else {
                            if0Var4 = new if0(i60VarM5, 11, map);
                        }
                        if0Var4.put("unknown", y60VarP);
                        y60VarP.p(0, 1, 1L);
                        x5fVar5.U0(x56VarF5);
                        break;
                    }
                    break;
                case 16:
                    orm ormVar6 = (orm) jiVar2.get();
                    String str6 = ((nv0) g7mVar.h).a;
                    x5f x5fVar6 = (x5f) ormVar6;
                    if (x5fVar6.h) {
                        zpa zpaVar6 = x5fVar6.d;
                        x56 x56VarF6 = zpa.F();
                        new ck0(zpaVar6, x56VarF6);
                        i60 i60VarM6 = zpa.m();
                        x56VarF6.T().put(str6, i60VarM6);
                        y60 y60VarP2 = zpa.p();
                        Map map3 = (Map) i60VarM6.n(11);
                        if (map3 == null || map3.isEmpty()) {
                            HashMap map4 = new HashMap();
                            i60VarM6.q(11, 1, map4);
                            if0Var5 = new if0(i60VarM6, 11, map4);
                        } else {
                            if0Var5 = new if0(i60VarM6, 11, map3);
                        }
                        if0Var5.put("unknown", y60VarP2);
                        y60VarP2.p(1, 1, 1L);
                        x5fVar6.U0(x56VarF6);
                        break;
                    }
                    break;
                case 17:
                    orm ormVar7 = (orm) jiVar2.get();
                    String str7 = ((nv0) g7mVar.h).a;
                    x5f x5fVar7 = (x5f) ormVar7;
                    if (x5fVar7.h) {
                        zpa zpaVar7 = x5fVar7.d;
                        x56 x56VarF7 = zpa.F();
                        new ck0(zpaVar7, x56VarF7);
                        i60 i60VarM7 = zpa.m();
                        x56VarF7.T().put(str7, i60VarM7);
                        y60 y60VarP3 = zpa.p();
                        Map map5 = (Map) i60VarM7.n(11);
                        if (map5 == null || map5.isEmpty()) {
                            HashMap map6 = new HashMap();
                            i60VarM7.q(11, 1, map6);
                            if0Var6 = new if0(i60VarM7, 11, map6);
                        } else {
                            if0Var6 = new if0(i60VarM7, 11, map5);
                        }
                        if0Var6.put("unknown", y60VarP3);
                        y60VarP3.p(3, 1, 1L);
                        x5fVar7.U0(x56VarF7);
                        break;
                    }
                    break;
                case SizeUtil.textSize0_1 /* 18 */:
                    orm ormVar8 = (orm) jiVar2.get();
                    String str8 = ((nv0) g7mVar.h).a;
                    x5f x5fVar8 = (x5f) ormVar8;
                    if (x5fVar8.h) {
                        zpa zpaVar8 = x5fVar8.d;
                        x56 x56VarF8 = zpa.F();
                        new ck0(zpaVar8, x56VarF8);
                        i60 i60VarM8 = zpa.m();
                        x56VarF8.T().put(str8, i60VarM8);
                        y60 y60VarP4 = zpa.p();
                        Map map7 = (Map) i60VarM8.n(11);
                        if (map7 == null || map7.isEmpty()) {
                            HashMap map8 = new HashMap();
                            i60VarM8.q(11, 1, map8);
                            if0Var7 = new if0(i60VarM8, 11, map8);
                        } else {
                            if0Var7 = new if0(i60VarM8, 11, map7);
                        }
                        if0Var7.put("unknown", y60VarP4);
                        y60VarP4.p(4, 1, 1L);
                        x5fVar8.U0(x56VarF8);
                        break;
                    }
                    break;
                case 28:
                    g7mVar.c(l60.i);
                    break;
                default:
                    h9o.p();
                    break;
            }
            return;
        }
        if (okaVar instanceof uia) {
            uia uiaVar = (uia) okaVar;
            String str9 = uiaVar.a;
            String str10 = uiaVar.b;
            int iOrdinal = uiaVar.c.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    z = true;
                } else {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return;
                    }
                    z = false;
                }
                if (z) {
                    g7mVar.j = new s6h(orn.CONVERSATION_CHIP, l08.a, false);
                }
                skm skmVar = (skm) jiVar.get();
                String str11 = ((nv0) g7mVar.h).a;
                x5f x5fVar9 = (x5f) skmVar;
                zpa zpaVar9 = x5fVar9.d;
                x56 x56VarF9 = zpa.F();
                i60 i60VarM9 = zpa.m();
                xa0 xa0Var = new xa0(2443, -1, 3);
                if (!z) {
                    xa0Var.e(1);
                } else if (z) {
                    xa0Var.e(2);
                }
                xa0Var.q(0, 1, str10);
                Map map9 = (Map) i60VarM9.n(4);
                if (map9 == null || map9.isEmpty()) {
                    HashMap map10 = new HashMap();
                    i60VarM9.q(4, 1, map10);
                    if0Var3 = new if0(i60VarM9, 4, map10);
                } else {
                    if0Var3 = new if0(i60VarM9, 4, map9);
                }
                if0Var3.put(str9, xa0Var);
                x56VarF9.T().put(str11, i60VarM9);
                x5fVar9.U0(x56VarF9);
                return;
            }
            return;
        }
        if (okaVar instanceof xia) {
            int i = (int) ((xia) okaVar).a;
            uv0 uv0Var = (uv0) ((zv3) g7mVar.f).get();
            x5f x5fVar10 = uv0Var.c;
            eri eriVar = (eri) uv0Var.e.invoke();
            if (i > 0) {
                String strL = eriVar.l();
                n60 n60Var = new n60(2443, -1, 3);
                n60Var.p(2, 1, i);
                x5fVar10.v(strL, n60Var);
                return;
            }
            return;
        }
        p60 p60Var = null;
        if (okaVar instanceof fja) {
            String str12 = ((fja) okaVar).a;
            skm skmVar2 = (skm) jiVar.get();
            String str13 = ((nv0) g7mVar.h).a;
            x5f x5fVar11 = (x5f) skmVar2;
            zpa zpaVar10 = x5fVar11.d;
            x56 x56VarF10 = zpa.F();
            i60 i60VarM10 = zpa.m();
            i60VarM10.e(0);
            x56VarF10.T().put(str13, i60VarM10);
            x5fVar11.U0(x56VarF10);
            s6h s6hVar = (s6h) g7mVar.j;
            if (s6hVar != null) {
                skm skmVar3 = (skm) jiVar.get();
                String str14 = ((nv0) g7mVar.h).a;
                String str15 = ((orn) s6hVar.a).a;
                List list = (List) s6hVar.b;
                u9d u9dVar = new u9d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str16 = "other";
                    switch (((o29) it.next()).ordinal()) {
                        case 0:
                            str16 = "audio";
                            break;
                        case 1:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        case 11:
                        case 13:
                        case 14:
                            break;
                        case 2:
                        case 3:
                        case 4:
                            str16 = "video";
                            break;
                        case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                            str16 = "image";
                            break;
                        case 12:
                            str16 = "document";
                            break;
                        default:
                            h9o.p();
                            return;
                    }
                    Object obj = u9dVar.get(str16);
                    if (obj == null) {
                        obj = 0;
                        u9dVar.put(str16, obj);
                    }
                    u9dVar.put(str16, Integer.valueOf(((Number) obj).intValue() + 1));
                }
                u9d u9dVarG = u9dVar.g();
                x5f x5fVar12 = (x5f) skmVar3;
                zpa zpaVar11 = x5fVar12.d;
                x56 x56VarF11 = zpa.F();
                new ck0(zpaVar11, x56VarF11);
                jkc jkcVar = new jkc(str15, u9dVarG, (byte) 18);
                i60 i60VarM11 = zpa.m();
                x56VarF11.T().put(str14, i60VarM11);
                jkcVar.invoke(new j60(zpaVar11, i60VarM11));
                x5fVar12.U0(x56VarF11);
                g7mVar.j = null;
            }
            skm skmVar4 = (skm) jiVar.get();
            String str17 = ((nv0) g7mVar.h).a;
            x5f x5fVar13 = (x5f) skmVar4;
            zpa zpaVar12 = x5fVar13.d;
            x56 x56VarF12 = zpa.F();
            i60 i60VarM12 = zpa.m();
            u60 u60Var = new u60(2443, -1, 2);
            u60Var.e(0);
            ((if0) i60VarM12.x()).put(str12, u60Var);
            x56VarF12.T().put(str17, i60VarM12);
            x5fVar13.U0(x56VarF12);
            if (g7mVar.a) {
                return;
            }
            g7mVar.d();
            return;
        }
        if (okaVar instanceof wia) {
            return;
        }
        if (okaVar instanceof eja) {
            eja ejaVar = (eja) okaVar;
            switch (ejaVar.b.ordinal()) {
                case 0:
                case 7:
                    break;
                case 1:
                    p60Var = p60.g;
                    break;
                case 2:
                    p60Var = p60.e;
                    break;
                case 3:
                    p60Var = p60.f;
                    break;
                case 4:
                    p60Var = p60.b;
                    break;
                case 5:
                    p60Var = p60.c;
                    break;
                case 6:
                    p60Var = p60.d;
                    break;
                case 8:
                    p60Var = p60.h;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    p60Var = p60.i;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    p60Var = p60.j;
                    break;
                default:
                    h9o.p();
                    return;
            }
            if (p60Var != null) {
                g7mVar.e(ejaVar.a, p60Var);
                return;
            }
            return;
        }
        if (okaVar instanceof yia) {
            yia yiaVar = (yia) okaVar;
            int iOrdinal2 = yiaVar.a.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    a02Var = a02.a;
                } else if (iOrdinal2 == 2) {
                    a02Var = a02.c;
                } else {
                    if (iOrdinal2 != 3) {
                        h9o.p();
                        return;
                    }
                    a02Var = a02.b;
                }
                int iOrdinal3 = yiaVar.b.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        b02Var = b02.b;
                    } else if (iOrdinal3 == 2) {
                        b02Var = b02.c;
                    } else if (iOrdinal3 == 3) {
                        b02Var = b02.d;
                    } else {
                        if (iOrdinal3 != 4) {
                            h9o.p();
                            return;
                        }
                        b02Var = b02.a;
                    }
                    g7mVar.i = new c02(a02Var, b02Var);
                    return;
                }
                return;
            }
            return;
        }
        if (okaVar instanceof bja) {
            g7mVar.f(x70.c);
            return;
        }
        if (okaVar instanceof sia) {
            sia siaVar = (sia) okaVar;
            String str18 = siaVar.b;
            String str19 = siaVar.d;
            String str20 = siaVar.e;
            int iOrdinal4 = siaVar.a.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 == 1) {
                    f02Var = f02.a;
                } else if (iOrdinal4 == 2) {
                    f02Var = f02.b;
                } else if (iOrdinal4 == 3) {
                    f02Var = f02.c;
                } else if (iOrdinal4 == 4) {
                    f02Var = f02.d;
                } else {
                    if (iOrdinal4 != 5) {
                        h9o.p();
                        return;
                    }
                    f02Var = f02.e;
                }
                f02 f02Var2 = f02Var;
                long j = siaVar.c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) g7mVar.b;
                Object arrayList = linkedHashMap.get(str18);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str18, arrayList);
                }
                List list2 = (List) arrayList;
                String str21 = str20 != null ? str20 : "unknown";
                e02 e02Var = new e02(str18, str19, f02Var2, j);
                if (f02Var2 == f02.d) {
                    g7mVar.k(str21, list2);
                    list2.clear();
                    return;
                }
                if (f02Var2 != f02.e) {
                    list2.add(e02Var);
                    return;
                }
                g7mVar.k(str21, list2);
                x5f x5fVar14 = (x5f) ((orm) jiVar2.get());
                if (x5fVar14.h) {
                    zpa zpaVar13 = x5fVar14.d;
                    x56 x56VarF13 = zpa.F();
                    new ck0(zpaVar13, x56VarF13).c().a(str19, new ivd(str21, j, b));
                    x5fVar14.U0(x56VarF13);
                }
                list2.clear();
                return;
            }
            return;
        }
        if ((okaVar instanceof ija) || (okaVar instanceof lja) || (okaVar instanceof kja)) {
            return;
        }
        if (okaVar instanceof hja) {
            orm ormVar9 = (orm) jiVar2.get();
            String str22 = ((nv0) g7mVar.h).a;
            x5f x5fVar15 = (x5f) ormVar9;
            if (x5fVar15.h) {
                zpa zpaVar14 = x5fVar15.d;
                x56 x56VarF14 = zpa.F();
                new ck0(zpaVar14, x56VarF14);
                i60 i60VarM13 = zpa.m();
                x56VarF14.T().put(str22, i60VarM13);
                y60 y60VarP5 = zpa.p();
                Map map11 = (Map) i60VarM13.n(11);
                if (map11 == null || map11.isEmpty()) {
                    HashMap map12 = new HashMap();
                    i60VarM13.q(11, 1, map12);
                    if0Var2 = new if0(i60VarM13, 11, map12);
                } else {
                    if0Var2 = new if0(i60VarM13, 11, map11);
                }
                if0Var2.put("unknown", y60VarP5);
                y60VarP5.p(5, 1, 1L);
                x5fVar15.U0(x56VarF14);
                return;
            }
            return;
        }
        if (!(okaVar instanceof gja)) {
            if (okaVar instanceof pka) {
                return;
            }
            h9o.p();
            return;
        }
        orm ormVar10 = (orm) jiVar2.get();
        String str23 = ((nv0) g7mVar.h).a;
        x5f x5fVar16 = (x5f) ormVar10;
        if (x5fVar16.h) {
            zpa zpaVar15 = x5fVar16.d;
            x56 x56VarF15 = zpa.F();
            new ck0(zpaVar15, x56VarF15);
            i60 i60VarM14 = zpa.m();
            x56VarF15.T().put(str23, i60VarM14);
            y60 y60VarP6 = zpa.p();
            Map map13 = (Map) i60VarM14.n(11);
            if (map13 == null || map13.isEmpty()) {
                HashMap map14 = new HashMap();
                i60VarM14.q(11, 1, map14);
                if0Var = new if0(i60VarM14, 11, map14);
            } else {
                if0Var = new if0(i60VarM14, 11, map13);
            }
            if0Var.put("unknown", y60VarP6);
            y60VarP6.p(6, 1, 1L);
            x5fVar16.U0(x56VarF15);
        }
    }

    public final void w(oka okaVar, fka fkaVar) {
        try {
            v(okaVar);
            fkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            fkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void x(gka gkaVar) {
        l02 l02Var = (l02) this.c;
        ((ghj) l02Var.d.getValue()).a(new wx((Object) l02Var, (Object) new t02(gkaVar, (byte) 0), (byte) 7));
    }

    public final void y(tja tjaVar, gka gkaVar) {
        zz1 zz1Var = (zz1) this.o;
        if (zz1Var == null) {
            gkaVar.n(new sw7(new qja(new sja(rja.UNKNOWN))));
            return;
        }
        esk eskVar = zz1Var.g;
        g7m g7mVar = zz1Var.h;
        ndc ndcVar = zz1Var.b;
        int iOrdinal = tjaVar.ordinal();
        if (iOrdinal == 0) {
            gkaVar.n(new rw7(new dqb(new UnsupportedOperationException(""))));
            return;
        }
        final byte b = 1;
        if (iOrdinal == 1) {
            final byte b2 = 0;
            final s02 s02Var = new s02(this, gkaVar, (byte) 0);
            esk eskVar2 = zz1Var.c;
            if (((db) eskVar.get()).d()) {
                g7mVar.f(x70.g);
                xih.w((w) eskVar2.get(), (db) eskVar.get(), null, true);
                ((w) eskVar2.get()).i0("FinishAccountSetupAuthPortalFragment_request", ndcVar, new mm9() { // from class: uz1
                    public final void X(Bundle bundle, String str) {
                        byte b3 = b2;
                        s02 s02Var2 = s02Var;
                        switch (b3) {
                            case 0:
                                s02Var2.invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
                                break;
                            default:
                                s02Var2.invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
                                break;
                        }
                    }
                });
                return;
            } else {
                xih.t((w) eskVar2.get(), false, null);
                g7mVar.f(x70.f);
                ((w) eskVar2.get()).i0("SyncAuthPortalFragment_request", ndcVar, new mm9() { // from class: uz1
                    public final void X(Bundle bundle, String str) {
                        byte b3 = b;
                        s02 s02Var2 = s02Var;
                        switch (b3) {
                            case 0:
                                s02Var2.invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
                                break;
                            default:
                                s02Var2.invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
                                break;
                        }
                    }
                });
                return;
            }
        }
        if (iOrdinal == 2) {
            s02 s02Var2 = new s02(this, gkaVar, (byte) 1);
            g7mVar.f(x70.k);
            if (((db) eskVar.get()).k((Activity) zz1Var.a, "google", new wx((Object) zz1Var, (Object) s02Var2, (byte) 6), new ab(s02Var2, (byte) 11))) {
                return;
            }
            s02Var2.invoke(Boolean.FALSE);
            return;
        }
        if (iOrdinal != 3) {
            h9o.p();
            return;
        }
        z3 z3Var = new z3((Object) gkaVar, (byte) 29);
        k42 k42Var = zz1Var.i;
        k42Var.d.j(ndcVar, new pb(new q3(z3Var, zz1Var, (byte) 15), (byte) 10));
        k42Var.e = true;
        if (k42Var.d.g() == null && k42Var.e && !k42Var.f) {
            k42Var.f = true;
            ((OperaAccessTokenProvider) k42Var.c.getValue()).b(new j42(k42Var));
        }
    }

    public final void z(gka gkaVar) {
        l02 l02Var = (l02) this.c;
        t02 t02Var = new t02(gkaVar, (byte) 1);
        String str = l02Var.e;
        zyk zykVar = l02Var.d;
        if (str == null) {
            t02Var.invoke(l02Var.a());
        } else {
            ((ghj) zykVar.getValue()).b(str);
            ((ghj) zykVar.getValue()).a(new su((Object) t02Var, (Object) str, (Object) l02Var, (byte) 5));
        }
    }
}
