package ads_mobile_sdk;

import ads_mobile_sdk.el2;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.fm0;
import ads_mobile_sdk.gs3;
import ads_mobile_sdk.hr;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.jl2;
import ads_mobile_sdk.k92;
import ads_mobile_sdk.qb1;
import ads_mobile_sdk.r11;
import ads_mobile_sdk.th3;
import ads_mobile_sdk.ul0;
import ads_mobile_sdk.x7;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import defpackage.bjp;
import defpackage.glo;
import defpackage.p3p;
import defpackage.xq9;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.RandomAccess;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class el2 implements glo {
    public final Context a;
    public final ExecutorService b;
    public final s11 c;
    public final String d;
    public final int e;
    public final String f;
    public final th3 g;
    public final ql2 h;

    public el2(Context context, ExecutorService executorService, l7 l7Var, s11 s11Var, th3 th3Var, ql2 ql2Var) {
        int i;
        this.a = context;
        this.b = executorService;
        this.c = s11Var;
        this.g = th3Var;
        this.h = ql2Var;
        this.d = l7Var.D();
        int i_getNumber$2 = p3p._getNumber$2(l7Var.C());
        if (i_getNumber$2 != 0) {
            i = 2;
            if (i_getNumber$2 != 1) {
                i = i_getNumber$2 != 2 ? i_getNumber$2 != 3 ? 0 : 4 : 3;
            }
        } else {
            i = 1;
        }
        this.e = i != 0 ? i : 1;
        this.f = l7Var.J().t();
    }

    @Override // defpackage.glo
    public final ef9 a() {
        int i;
        fl0 fl0Var = fl0.EVENT_ID_ORCAS_FETCHER_FETCH_PROGRAM;
        bjp bjpVarO = v7.o();
        byte[] bArrB = gs3.b();
        final byte b = 0;
        fr frVarA = hr.a(0, bArrB.length, bArrB);
        bjpVarO.b$1();
        ((v7) bjpVarO.b).a(frVarA);
        long j = Build.VERSION.SDK_INT;
        bjpVarO.b$1();
        v7 v7Var = (v7) bjpVarO.b;
        final byte b2 = 2;
        v7Var.bitField0_ |= 2;
        v7Var.apiLevel_ = j;
        String str = Build.MODEL;
        bjpVarO.b$1();
        ((v7) bjpVarO.b).d(str);
        Context context = this.a;
        String packageName = context.getPackageName();
        bjpVarO.b$1();
        ((v7) bjpVarO.b).b(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        bjpVarO.b$1();
        v7 v7Var2 = (v7) bjpVarO.b;
        v7Var2.bitField0_ |= 16;
        v7Var2.appVersionCode_ = i;
        bjpVarO.b$1();
        ((v7) bjpVarO.b).c(this.d);
        bjpVarO.b$1();
        v7 v7Var3 = (v7) bjpVarO.b;
        v7Var3.getClass();
        v7Var3.osType_ = p3p.a(2);
        v7Var3.bitField0_ |= 64;
        bjpVarO.b$1();
        v7 v7Var4 = (v7) bjpVarO.b;
        v7Var4.getClass();
        v7Var4.hostType_ = p3p._getNumber$5(this.e);
        v7Var4.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
        final byte b3 = 1;
        f7 f7VarI = g7.i(ef9.h(this.c.a(Uri.parse(this.f).buildUpon().appendQueryParameter("aspq", b8h.b(true).c(((v7) bjpVarO.a()).a())).build().toString(), false, new byte[0], null)), new xq9(this) { // from class: cyo
            public final /* synthetic */ el2 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                byte b4 = b;
                el2 el2Var = this.b;
                switch (b4) {
                    case 0:
                        r11 r11Var = (r11) obj;
                        th3 th3Var = el2Var.g;
                        if (r11Var.a != 200) {
                            fl0 fl0Var2 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20002, -1L, null, new String(gs3.b(), StandardCharsets.UTF_8));
                            dyo dyoVarS = fm0.s();
                            dyoVarS.b(7);
                            return (fm0) dyoVarS.a();
                        }
                        try {
                            String str2 = new String(r11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS2 = fm0.s();
                                dyoVarS2.b(8);
                                return (fm0) dyoVarS2.a();
                            }
                            x7 x7VarA = x7.a(b8h.c(str2, true), ul0.b());
                            if (!x7VarA.p().r() || !x7VarA.p().s()) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS3 = fm0.s();
                                dyoVarS3.b(8);
                                return (fm0) dyoVarS3.a();
                            }
                            if (!el2Var.h.a(x7VarA)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                dyo dyoVarS4 = fm0.s();
                                dyoVarS4.b(12);
                                return (fm0) dyoVarS4.a();
                            }
                            dyo dyoVarS5 = fm0.s();
                            n3p n3pVarT = jl2.t();
                            k92 k92VarQ = x7VarA.p().q();
                            n3pVarT.b$1();
                            ((jl2) n3pVarT.b).a(k92VarQ);
                            gip gipVarO = x7VarA.o();
                            n3pVarT.b$1();
                            jl2 jl2Var = (jl2) n3pVarT.b;
                            RandomAccess randomAccess = jl2Var.activeExperimentIds_;
                            if (!((j) randomAccess).a) {
                                qb1 qb1Var = (qb1) randomAccess;
                                jl2Var.activeExperimentIds_ = qb1Var.a(qb1Var.c << 1);
                            }
                            iu0.a(gipVarO, jl2Var.activeExperimentIds_);
                            jl2 jl2Var2 = (jl2) n3pVarT.a();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(jl2Var2);
                            hr hrVarP = x7VarA.p().p();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(hrVarP);
                            dyoVarS5.b(2);
                            return (fm0) dyoVarS5.a();
                        } catch (Throwable th) {
                            fl0 fl0Var3 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20004, -1L, th, null);
                            dyo dyoVarS6 = fm0.s();
                            dyoVarS6.b(6);
                            return (fm0) dyoVarS6.a();
                        }
                    case 1:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        dyo dyoVarS7 = fm0.s();
                        dyoVarS7.b(13);
                        return (fm0) dyoVarS7.a();
                    default:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        dyo dyoVarS8 = fm0.s();
                        dyoVarS8.b(13);
                        return (fm0) dyoVarS8.a();
                }
            }
        }, this.b);
        xq9 xq9Var = new xq9(this) { // from class: cyo
            public final /* synthetic */ el2 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                byte b4 = b3;
                el2 el2Var = this.b;
                switch (b4) {
                    case 0:
                        r11 r11Var = (r11) obj;
                        th3 th3Var = el2Var.g;
                        if (r11Var.a != 200) {
                            fl0 fl0Var2 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20002, -1L, null, new String(gs3.b(), StandardCharsets.UTF_8));
                            dyo dyoVarS = fm0.s();
                            dyoVarS.b(7);
                            return (fm0) dyoVarS.a();
                        }
                        try {
                            String str2 = new String(r11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS2 = fm0.s();
                                dyoVarS2.b(8);
                                return (fm0) dyoVarS2.a();
                            }
                            x7 x7VarA = x7.a(b8h.c(str2, true), ul0.b());
                            if (!x7VarA.p().r() || !x7VarA.p().s()) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS3 = fm0.s();
                                dyoVarS3.b(8);
                                return (fm0) dyoVarS3.a();
                            }
                            if (!el2Var.h.a(x7VarA)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                dyo dyoVarS4 = fm0.s();
                                dyoVarS4.b(12);
                                return (fm0) dyoVarS4.a();
                            }
                            dyo dyoVarS5 = fm0.s();
                            n3p n3pVarT = jl2.t();
                            k92 k92VarQ = x7VarA.p().q();
                            n3pVarT.b$1();
                            ((jl2) n3pVarT.b).a(k92VarQ);
                            gip gipVarO = x7VarA.o();
                            n3pVarT.b$1();
                            jl2 jl2Var = (jl2) n3pVarT.b;
                            RandomAccess randomAccess = jl2Var.activeExperimentIds_;
                            if (!((j) randomAccess).a) {
                                qb1 qb1Var = (qb1) randomAccess;
                                jl2Var.activeExperimentIds_ = qb1Var.a(qb1Var.c << 1);
                            }
                            iu0.a(gipVarO, jl2Var.activeExperimentIds_);
                            jl2 jl2Var2 = (jl2) n3pVarT.a();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(jl2Var2);
                            hr hrVarP = x7VarA.p().p();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(hrVarP);
                            dyoVarS5.b(2);
                            return (fm0) dyoVarS5.a();
                        } catch (Throwable th) {
                            fl0 fl0Var3 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20004, -1L, th, null);
                            dyo dyoVarS6 = fm0.s();
                            dyoVarS6.b(6);
                            return (fm0) dyoVarS6.a();
                        }
                    case 1:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        dyo dyoVarS7 = fm0.s();
                        dyoVarS7.b(13);
                        return (fm0) dyoVarS7.a();
                    default:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        dyo dyoVarS8 = fm0.s();
                        dyoVarS8.b(13);
                        return (fm0) dyoVarS8.a();
                }
            }
        };
        m97 m97Var = m97.a;
        ef9 ef9VarI = o3.i(o3.i(f7VarI, UnknownHostException.class, xq9Var, m97Var), SocketException.class, new xq9(this) { // from class: cyo
            public final /* synthetic */ el2 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                byte b4 = b2;
                el2 el2Var = this.b;
                switch (b4) {
                    case 0:
                        r11 r11Var = (r11) obj;
                        th3 th3Var = el2Var.g;
                        if (r11Var.a != 200) {
                            fl0 fl0Var2 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20002, -1L, null, new String(gs3.b(), StandardCharsets.UTF_8));
                            dyo dyoVarS = fm0.s();
                            dyoVarS.b(7);
                            return (fm0) dyoVarS.a();
                        }
                        try {
                            String str2 = new String(r11Var.b);
                            if (TextUtils.isEmpty(str2)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS2 = fm0.s();
                                dyoVarS2.b(8);
                                return (fm0) dyoVarS2.a();
                            }
                            x7 x7VarA = x7.a(b8h.c(str2, true), ul0.b());
                            if (!x7VarA.p().r() || !x7VarA.p().s()) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                                dyo dyoVarS3 = fm0.s();
                                dyoVarS3.b(8);
                                return (fm0) dyoVarS3.a();
                            }
                            if (!el2Var.h.a(x7VarA)) {
                                th3Var.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                dyo dyoVarS4 = fm0.s();
                                dyoVarS4.b(12);
                                return (fm0) dyoVarS4.a();
                            }
                            dyo dyoVarS5 = fm0.s();
                            n3p n3pVarT = jl2.t();
                            k92 k92VarQ = x7VarA.p().q();
                            n3pVarT.b$1();
                            ((jl2) n3pVarT.b).a(k92VarQ);
                            gip gipVarO = x7VarA.o();
                            n3pVarT.b$1();
                            jl2 jl2Var = (jl2) n3pVarT.b;
                            RandomAccess randomAccess = jl2Var.activeExperimentIds_;
                            if (!((j) randomAccess).a) {
                                qb1 qb1Var = (qb1) randomAccess;
                                jl2Var.activeExperimentIds_ = qb1Var.a(qb1Var.c << 1);
                            }
                            iu0.a(gipVarO, jl2Var.activeExperimentIds_);
                            jl2 jl2Var2 = (jl2) n3pVarT.a();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(jl2Var2);
                            hr hrVarP = x7VarA.p().p();
                            dyoVarS5.b$1();
                            ((fm0) dyoVarS5.b).a(hrVarP);
                            dyoVarS5.b(2);
                            return (fm0) dyoVarS5.a();
                        } catch (Throwable th) {
                            fl0 fl0Var3 = fl0.EVENT_ID_UNSPECIFIED;
                            th3Var.a.a(20004, -1L, th, null);
                            dyo dyoVarS6 = fm0.s();
                            dyoVarS6.b(6);
                            return (fm0) dyoVarS6.a();
                        }
                    case 1:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
                        dyo dyoVarS7 = fm0.s();
                        dyoVarS7.b(13);
                        return (fm0) dyoVarS7.a();
                    default:
                        el2Var.g.b(fl0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
                        dyo dyoVarS8 = fm0.s();
                        dyoVarS8.b(13);
                        return (fm0) dyoVarS8.a();
                }
            }
        }, m97Var);
        this.g.a(fl0Var, ef9VarI);
        return ef9VarI;
    }
}
