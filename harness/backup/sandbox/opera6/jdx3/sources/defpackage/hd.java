package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.news.newsfeed.internal.NewsPushTrackEventsUploaderWorker;
import com.opera.android.settings.SettingsManager;
import com.opera.android.webapps.ShortcutHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hd implements fv, ann, ubk, hh4 {
    public static hd h;
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public hd(int i, float f, sxf sxfVar) {
        this.a = (byte) 8;
        this.c = sxfVar;
        this.d = new q0g(i);
        this.e = new p0g(f);
        this.g = new o5c(i);
    }

    public hd(a5l a5lVar, String str, p6l p6lVar, n6k n6kVar) {
        this.a = (byte) 11;
        this.g = a5lVar;
        this.c = str;
        this.d = p6lVar;
        this.e = n6kVar;
        this.f = new rml(Unit.a, a5lVar.a).a(new d7k((Object) a5lVar, (Object) this, (byte) 13)).m(a5lVar.g);
    }

    public hd(Context context, umi umiVar, byte b) {
        this.a = b;
        byte b2 = 0;
        switch (b) {
            case 6:
                this.c = umiVar;
                this.d = new y55();
                this.e = new shf(context, lkk.DOMAINS);
                this.f = new qie((byte) 19);
                this.g = new mgh((byte) 0);
                break;
            case 7:
                this.c = umiVar;
                this.d = new n9a((byte) 20);
                this.e = new shf(context, lkk.REQUESTS);
                this.f = new qie((byte) 19);
                this.g = new mgh((byte) 0);
                break;
            default:
                this.e = new Object();
                this.f = context.getApplicationContext();
                this.g = umiVar;
                fse fseVar = new fse(this, b2);
                Lazy.e(fseVar, umiVar);
                this.c = fseVar;
                fse fseVar2 = new fse(this, (byte) 1);
                Lazy.e(fseVar2, umiVar);
                this.d = fseVar2;
                kqd kqdVar = new kqd((Object) this, (byte) 9);
                y0a y0aVar = new y0a(this, (byte) 27);
                nml nmlVarE = umiVar.e(kqdVar);
                nmlVarE.b(umiVar.f(new lw0(y0aVar, (byte) 1)));
                nmlVarE.a(null);
                break;
        }
    }

    public hd(Context context, umi umiVar, xbf xbfVar) {
        this.a = (byte) 9;
        this.e = new se3(this, (byte) 3);
        this.c = context.getApplicationContext();
        this.d = xbfVar;
        ko7 ko7Var = new ko7(this, umiVar);
        this.f = ko7Var;
        this.g = new we7(this, new ve7(this, (byte) 2), (byte) 7);
        String[] strArr = OperaApplication.K;
        nrl nrlVar = ((OperaApplication) context.getApplicationContext()).m().a.g;
        if (nrlVar.a) {
            ko7Var.h();
        } else {
            nrlVar.d(new pjg(this, (byte) 1));
        }
    }

    public hd(SettingsManager settingsManager, qln qlnVar, ga6 ga6Var, gb3 gb3Var, String str) {
        this.a = (byte) 2;
        this.c = settingsManager;
        this.d = qlnVar;
        this.e = ga6Var;
        this.f = gb3Var;
        this.g = str;
        this.b = true;
        qlnVar.l(str, 2, new up7(this, (byte) 1));
    }

    public hd(dx3 dx3Var, umi umiVar, String str) {
        this.a = (byte) 1;
        this.c = dx3Var;
        this.d = umiVar;
        this.e = str;
    }

    public hd(fe5 fe5Var, iv7 iv7Var, ky1 ky1Var, x5f x5fVar, ysj ysjVar, jv3 jv3Var) {
        this.a = (byte) 3;
        this.c = iv7Var;
        this.d = ysjVar;
        this.e = jv3Var;
        iy1 iy1VarA = ky1Var.a(fe5Var, new xl6(x5fVar, (byte) 1), new xm5(this));
        this.f = iy1VarA;
        this.g = iy1VarA.m;
    }

    public hd(ldk ldkVar, tcl tclVar) {
        oml omlVar;
        this.a = (byte) 10;
        this.g = ldkVar;
        final byte b = 1;
        this.c = new CountDownLatch(1);
        final byte b2 = 0;
        Runnable runnable = new Runnable(this) { // from class: jdk
            public final /* synthetic */ hd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                hd hdVar = this.b;
                switch (b3) {
                    case 0:
                        try {
                            try {
                                hdVar.f = ((ldk) hdVar.g).a();
                                ((oml) hdVar.e).a(null, null);
                                ((CountDownLatch) hdVar.c).countDown();
                                synchronized (((ldk) hdVar.g).d) {
                                    ldk ldkVar2 = (ldk) hdVar.g;
                                    ldkVar2.i = false;
                                    ldkVar2.h = 3;
                                    ldkVar2.e();
                                }
                                return;
                            } catch (IOException | RuntimeException e) {
                                boolean z = true;
                                try {
                                    if (((ldk) hdVar.g).c() == 2) {
                                        z = false;
                                    }
                                } catch (Throwable unused) {
                                }
                                synchronized (y55.h) {
                                    vk2 vk2Var = y55.i;
                                    if (vk2Var != null) {
                                        vk2Var.run(e);
                                    }
                                    ((oml) hdVar.e).a(null, null);
                                    ((CountDownLatch) hdVar.c).countDown();
                                    synchronized (((ldk) hdVar.g).d) {
                                        ldk ldkVar3 = (ldk) hdVar.g;
                                        ldkVar3.i = z;
                                        ldkVar3.h = 3;
                                        ldkVar3.e();
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ((oml) hdVar.e).a(null, null);
                            ((CountDownLatch) hdVar.c).countDown();
                            synchronized (((ldk) hdVar.g).d) {
                                ldk ldkVar4 = (ldk) hdVar.g;
                                ldkVar4.i = false;
                                ldkVar4.h = 3;
                                ldkVar4.e();
                                throw th;
                            }
                        }
                    default:
                        hdVar.f();
                        return;
                }
            }
        };
        boolean z = ldkVar.c;
        tcl tclVar2 = ldkVar.a;
        if (z) {
            tclVar2.getClass();
            umi umiVar = (umi) tclVar2;
            omlVar = new oml(new nml(umiVar, new qj(runnable, (byte) 5), umiVar.c));
        } else {
            omlVar = new oml(tclVar2.c(runnable));
        }
        this.d = omlVar;
        this.e = new oml(tclVar.d(new Runnable(this) { // from class: jdk
            public final /* synthetic */ hd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                hd hdVar = this.b;
                switch (b3) {
                    case 0:
                        try {
                            try {
                                hdVar.f = ((ldk) hdVar.g).a();
                                ((oml) hdVar.e).a(null, null);
                                ((CountDownLatch) hdVar.c).countDown();
                                synchronized (((ldk) hdVar.g).d) {
                                    ldk ldkVar2 = (ldk) hdVar.g;
                                    ldkVar2.i = false;
                                    ldkVar2.h = 3;
                                    ldkVar2.e();
                                }
                                return;
                            } catch (IOException | RuntimeException e) {
                                boolean z2 = true;
                                try {
                                    if (((ldk) hdVar.g).c() == 2) {
                                        z2 = false;
                                    }
                                } catch (Throwable unused) {
                                }
                                synchronized (y55.h) {
                                    vk2 vk2Var = y55.i;
                                    if (vk2Var != null) {
                                        vk2Var.run(e);
                                    }
                                    ((oml) hdVar.e).a(null, null);
                                    ((CountDownLatch) hdVar.c).countDown();
                                    synchronized (((ldk) hdVar.g).d) {
                                        ldk ldkVar3 = (ldk) hdVar.g;
                                        ldkVar3.i = z2;
                                        ldkVar3.h = 3;
                                        ldkVar3.e();
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ((oml) hdVar.e).a(null, null);
                            ((CountDownLatch) hdVar.c).countDown();
                            synchronized (((ldk) hdVar.g).d) {
                                ldk ldkVar4 = (ldk) hdVar.g;
                                ldkVar4.i = false;
                                ldkVar4.h = 3;
                                ldkVar4.e();
                                throw th;
                            }
                        }
                    default:
                        hdVar.f();
                        return;
                }
            }
        }));
    }

    public hd(tcc tccVar, fd fdVar, va2 va2Var, jf jfVar) {
        this.a = (byte) 0;
        this.c = fdVar;
        this.d = va2Var;
        this.e = jfVar;
        this.f = new ArrayList();
        this.g = new c4(this, (byte) 5);
        oup.l0(tccVar, (Function1) null, new z3((Object) this, (byte) 4), (Function1) null, (Function1) null, 13);
        aib.C(fdVar, tccVar, new yc(this, (byte) 1));
    }

    public hd(v31 v31Var) {
        this.a = (byte) 4;
        this.c = v31Var;
    }

    public static hse h(mse mseVar, String str) {
        ArrayList arrayList = (ArrayList) mseVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hse hseVar = (hse) obj;
            if (TextUtils.equals(hseVar.a, str)) {
                return hseVar;
            }
        }
        return null;
    }

    public static SharedPreferences j(Context context) {
        return context.getSharedPreferences("news_push_tracker", 0);
    }

    public static hd o(Context context) {
        hd hdVar = h;
        if (hdVar != null) {
            return hdVar;
        }
        hd hdVar2 = new hd(context, vml.d, (byte) 5);
        h = hdVar2;
        return hdVar2;
    }

    public static void q(b8e b8eVar, h7h h7hVar) {
        if (!b8eVar.a.n) {
            a8b.b("visitSubtreeIf called on an unattached node");
        }
        dfe dfeVar = new dfe(new b8e[16]);
        b8e b8eVar2 = b8eVar.a;
        b8e b8eVar3 = b8eVar2.f;
        if (b8eVar3 == null) {
            ui6.h(dfeVar, b8eVar2);
        } else {
            dfeVar.c(b8eVar3);
        }
        while (true) {
            int i = dfeVar.c;
            if (i == 0) {
                return;
            }
            b8e b8eVar4 = (b8e) dfeVar.l(i - 1);
            if ((b8eVar4.d & 32) != 0) {
                for (b8e b8eVar5 = b8eVar4; b8eVar5 != null && b8eVar5.n; b8eVar5 = b8eVar5.f) {
                    if ((b8eVar5.c & 32) != 0) {
                        b8e b8eVarU = b8eVar5;
                        dfe dfeVar2 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof e8e) {
                                if (((e8e) b8eVarU).B().x(h7hVar)) {
                                    break;
                                }
                            } else if ((b8eVarU.c & 32) != 0 && (b8eVarU instanceof i17)) {
                                int i2 = 0;
                                for (b8e b8eVar6 = ((i17) b8eVarU).p; b8eVar6 != null; b8eVar6 = b8eVar6.f) {
                                    if ((b8eVar6.c & 32) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            b8eVarU = b8eVar6;
                                        } else {
                                            if (dfeVar2 == null) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar2.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar2.c(b8eVar6);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar2);
                        }
                    }
                }
            }
            ui6.h(dfeVar, b8eVar4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, dx3] */
    @Override // defpackage.fv
    public final void a(String str, jv jvVar) {
        ?? r2 = (dx3) this.c;
        String str2 = (String) this.e;
        Bitmap bitmap = (Bitmap) this.f;
        if (bitmap == null) {
            this.g = new hv((Object) this, (Object) str, (Object) jvVar, (byte) 0);
            return;
        }
        Uri uri = Uri.parse(BrowserUtils.getRendererUrl(str2));
        ShortcutHelper.a(r2, (umi) this.d, str, new Uri.Builder().scheme("ofa").authority("ui").path("/ai_search").appendQueryParameter("q", wqm.m(uri, "q")).appendQueryParameter("s", wqm.m(uri, "s")).build(), false, bitmap, false, 0, 0, 2147483648L, 2147483648L, r2.getString(2132017532), BrowserUtils.getDisplayString(str2));
        jvVar.run();
    }

    @Override // defpackage.fv
    public final void b(bi biVar) {
        this.b = true;
        biVar.l(BrowserUtils.getDisplayString((String) this.e));
        int iRound = Math.round(((dx3) this.c).getResources().getDimension(2131167804));
        new rml(Unit.a, (umi) this.d).a(new gv((Object) this, iRound, (byte) 0)).t(new z3((Object) this, (byte) 12)).l();
    }

    @Override // defpackage.fv
    public final void c() {
        this.b = false;
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = true;
        ((p1j) this.f).cancel(false);
    }

    @Override // defpackage.ann
    public final void d() {
        if (this.b) {
            g();
            ((qln) this.d).l((String) this.g, 0, new up7(this, (byte) 0));
        }
    }

    @Override // defpackage.ann
    public final void e() {
        g();
    }

    public final void f() {
        ldk ldkVar = (ldk) this.g;
        if (this.b) {
            return;
        }
        this.b = true;
        ldkVar.d(this.f);
        if (ldkVar.g != null) {
            while (!ldkVar.g.isEmpty()) {
                ((Runnable) ldkVar.g.poll()).run();
            }
            ldkVar.g = null;
        }
    }

    public final void g() {
        if (this.b) {
            this.b = false;
            ((gb3) this.f).invoke();
        }
    }

    @Override // defpackage.ubk
    public final void i(r rVar) {
        switch (this.a) {
            case 6:
                ((shf) this.e).N(rVar);
                break;
            default:
                ((shf) this.e).N(rVar);
                break;
        }
    }

    public final boolean k() {
        Iterable<jx1> iterable = (Iterable) ((qde) this.g).g();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (jx1 jx1Var : iterable) {
                if (jx1Var != null) {
                    if (jx1Var instanceof sx1) {
                        return true;
                    }
                    if ((jx1Var instanceof px1) || (jx1Var instanceof rx1) || (jx1Var instanceof fz1)) {
                    }
                }
                h9o.p();
            }
        }
        return false;
    }

    @Override // defpackage.ubk
    public final void m(r rVar) {
        switch (this.a) {
            case 6:
                ((shf) this.e).f(rVar);
                break;
            default:
                ((shf) this.e).f(rVar);
                break;
        }
    }

    @Override // defpackage.ubk
    public final void n(long j, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 6:
                new rml(Unit.a, (umi) obj).a(new h5f(this, j, z)).m((qie) this.f);
                break;
            default:
                new rml(Unit.a, (umi) obj).a(new h5f(this, j, z, (byte) 0)).m((qie) this.f);
                break;
        }
    }

    public final void p() {
        if (this.b) {
            return;
        }
        this.b = true;
        v31 v31Var = (v31) this.c;
        d8e d8eVar = new d8e(this, (byte) 0);
        dee deeVar = v31Var.p0;
        if (deeVar.e(d8eVar)) {
            return;
        }
        deeVar.a(d8eVar);
    }

    public final void r(String str, boolean z) {
        if (this.b) {
            n9a n9aVar = (n9a) this.d;
            w56 w56VarO = n9a.o();
            new bk0(n9aVar, w56VarO).b(str, new xsf((byte) 1, z));
            if (((mgh) this.g).c(w56VarO)) {
                return;
            }
            new rml(Unit.a, (umi) this.c).a(new o5f((Object) this, (byte) 18)).m((qie) this.f);
        }
    }

    public final void s(gse gseVar) {
        if (gseVar == null) {
            return;
        }
        ta7 ta7Var = new ta7((Context) this.f, (umi) this.g);
        String string = ta7Var.s().getString("user_id", null);
        String[] strArr = aik.a;
        if (string == null) {
            string = "";
        }
        yla ylaVarR = ta7Var.r();
        String string2 = ylaVarR != null ? ylaVarR.a.toString() : null;
        synchronized (this.e) {
            hse hseVarH = h((mse) ((fse) this.d).get(), string);
            if (hseVarH == null) {
                hseVarH = new hse(string, string2);
                ((mse) ((fse) this.d).get()).e(hseVarH);
            }
            nse nseVar = hseVarH.c;
            ((ArrayList) nseVar.b).add(gseVar);
            nseVar.a();
            ((mse) ((fse) this.d).get()).g();
        }
        NewsPushTrackEventsUploaderWorker.d((Context) this.f);
    }

    @Override // defpackage.ubk
    public final void setEnabled(boolean z) {
        switch (this.a) {
            case 6:
                this.b = z;
                break;
            default:
                this.b = z;
                break;
        }
    }

    public final void t(Function1 function1) {
        n9a n9aVar = (n9a) this.d;
        w56 w56VarO = n9a.o();
        function1.invoke(new bk0(n9aVar, w56VarO));
        if (((mgh) this.g).c(w56VarO)) {
            return;
        }
        new rml(Unit.a, (umi) this.c).a(new o5f((Object) this, (byte) 18)).m((qie) this.f);
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        g();
    }

    public final void v(Function1 function1) {
        y55 y55Var = (y55) this.d;
        u56 u56VarW = y55.w();
        function1.invoke(new zj0(y55Var, u56VarW));
        if (((mgh) this.g).c(u56VarW)) {
            return;
        }
        new rml(Unit.a, (umi) this.c).a(new o5f((Object) this, (byte) 16)).m((qie) this.f);
    }

    public final void w() {
        int i = 0;
        this.b = false;
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gd gdVar = (gd) obj;
            sc scVar = gdVar.c;
            jf jfVarE = ((fd) this.c).e(gdVar.b);
            if (jfVarE == null) {
                jfVarE = (jf) this.e;
            }
            ((qc) scVar.a).b(scVar.i(jfVarE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(List list) {
        og ogVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        sc g3fVar;
        hd hdVar = this;
        ArrayList arrayList = (ArrayList) hdVar.f;
        boolean zIsEmpty = arrayList.isEmpty();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ogVar = og.a;
            if (i >= size) {
                break;
            }
            Object obj6 = arrayList.get(i);
            i++;
            xf8.G0(((gd) obj6).a, ogVar);
        }
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pc pcVar = (pc) it.next();
            kze kzeVar = new kze(ogVar);
            tah tahVar = (tah) ((va2) hdVar.d).b;
            v1f v1fVar = (v1f) tahVar.e;
            ViewGroup viewGroup = (ViewGroup) tahVar.h;
            int iOrdinal = pcVar.ordinal();
            if (iOrdinal == 7) {
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131558564, viewGroup, false);
                viewGroup.addView(viewInflate);
                if (viewInflate == 0) {
                    t3p.q("rootView");
                    return;
                } else {
                    hdVar = this;
                    g3fVar = new g3f(new pjn((TabCountButton) viewInflate), kzeVar, pcVar, hdVar, (k6l) tahVar.b);
                }
            } else if (iOrdinal == 8) {
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131558558, viewGroup, false);
                viewGroup.addView(viewInflate2);
                if (viewInflate2 == 0) {
                    t3p.q("rootView");
                    return;
                } else {
                    hdVar = this;
                    g3fVar = new g3f(new i3j((StylingImageButton) viewInflate2), kzeVar, pcVar, hdVar, v1fVar.c);
                }
            } else if (iOrdinal == 12) {
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(2131558558, viewGroup, false);
                viewGroup.addView(viewInflate3);
                if (viewInflate3 == 0) {
                    t3p.q("rootView");
                    return;
                } else {
                    hdVar = this;
                    g3fVar = new g3f(new i3j((StylingImageButton) viewInflate3), kzeVar, pcVar, hdVar, v1fVar.a(8));
                }
            } else if (iOrdinal != 14) {
                View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(2131558558, viewGroup, false);
                viewGroup.addView(viewInflate4);
                if (viewInflate4 == 0) {
                    t3p.q("rootView");
                    return;
                }
                g3fVar = new tc(new i3j((StylingImageButton) viewInflate4), pcVar, hdVar);
            } else {
                View viewInflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(2131558558, viewGroup, false);
                viewGroup.addView(viewInflate5);
                if (viewInflate5 == 0) {
                    t3p.q("rootView");
                    return;
                } else {
                    g3fVar = new g3f(new i3j((StylingImageButton) viewInflate5), kzeVar, pcVar, hdVar, v1fVar.a(1));
                    hdVar = this;
                }
            }
            arrayList.add(new gd(kzeVar, pcVar, g3fVar));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj7 = arrayList.get(i2);
            i2++;
            xf8.G0(((gd) obj7).a, ng.a);
        }
        fd fdVar = (fd) hdVar.c;
        int size3 = arrayList.size();
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= size3) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i3);
            i3++;
            if (((gd) obj2).b == pc.j) {
                break;
            }
        }
        boolean z = obj2 != null;
        int size4 = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                obj3 = null;
                break;
            }
            obj3 = arrayList.get(i4);
            i4++;
            if (((gd) obj3).b == pc.g) {
                break;
            }
        }
        boolean z2 = obj3 != null;
        int size5 = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size5) {
                obj4 = null;
                break;
            }
            obj4 = arrayList.get(i5);
            i5++;
            if (((gd) obj4).b == pc.m) {
                break;
            }
        }
        boolean z3 = obj4 != null;
        int size6 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size6) {
                obj5 = null;
                break;
            }
            obj5 = arrayList.get(i6);
            i6++;
            if (((gd) obj5).b == pc.h) {
                break;
            }
        }
        boolean z4 = obj5 != null;
        int size7 = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size7) {
                break;
            }
            Object obj8 = arrayList.get(i7);
            i7++;
            if (((gd) obj8).b == pc.e) {
                obj = obj8;
                break;
            }
        }
        yk5 yk5Var = new yk5(z, z2, z3, z4, obj != null);
        if (!yk5Var.equals(fdVar.b)) {
            fdVar.b = yk5Var;
            fdVar.c();
        }
        if (zIsEmpty) {
            hdVar.w();
        } else {
            if (hdVar.b) {
                return;
            }
            hdVar.b = true;
            vml.c((c4) hdVar.g);
        }
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        if (!((ga6) this.e).p()) {
            g();
            return;
        }
        SettingsManager settingsManager = (SettingsManager) this.c;
        settingsManager.a.e((String) this.g, settingsManager.c.getString("wallpaper_current", null));
        g();
    }
}
