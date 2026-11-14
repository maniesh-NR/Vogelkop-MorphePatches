package com.opera.android;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.opera.android.settings.SettingsManager;
import defpackage.b59;
import defpackage.bg1;
import defpackage.bj0;
import defpackage.gh2;
import defpackage.ich;
import defpackage.io7;
import defpackage.jch;
import defpackage.kp0;
import defpackage.ks3;
import defpackage.lch;
import defpackage.lp0;
import defpackage.lpe;
import defpackage.mch;
import defpackage.nch;
import defpackage.nn;
import defpackage.no7;
import defpackage.oml;
import defpackage.pjg;
import defpackage.pyn;
import defpackage.q2g;
import defpackage.qd0;
import defpackage.qwn;
import defpackage.rwn;
import defpackage.s6e;
import defpackage.tz5;
import defpackage.umi;
import defpackage.vvf;
import defpackage.vwn;
import defpackage.x56;
import defpackage.x5f;
import defpackage.yu0;
import defpackage.zpa;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class PushedContentHandler {
    public static PushedContentHandler p;
    public boolean a;
    public boolean b;
    public boolean c;
    public final b59 e;
    public final Context f;
    public final umi g;
    public final SettingsManager h;
    public final vwn i;
    public final x5f j;
    public final x5f k;
    public final lpe l;
    public ivg n;
    public Request o;
    public final SparseArray d = new SparseArray();
    public ArrayList m = new ArrayList(1);

    public class Request {
        public final long a = SystemClock.elapsedRealtime();
        public oml b;
        public int c;
        public long d;

        public Request() {
        }

        public final void a() {
            long jMty95z0W = N.Mty95z0W(this);
            this.d = jMty95z0W;
            if (jMty95z0W != 0) {
                oml omlVar = new oml(PushedContentHandler.this.g.d(new pjg(this, (byte) 13)));
                this.b = omlVar;
                omlVar.b(null, 30L, TimeUnit.SECONDS, null);
            }
        }

        public final void onCompleted(boolean z) {
            long j = this.d;
            if (j != 0) {
                N.MBqsUtXh(j);
                this.d = 0L;
            }
            oml omlVar = this.b;
            if (omlVar != null) {
                omlVar.cancel(false);
                this.b = null;
            }
            PushedContentHandler.this.g.d(new gh2((byte) 9, this, z)).a(null);
        }
    }

    public PushedContentHandler(Context context, umi umiVar, SettingsManager settingsManager, vwn vwnVar, lpe lpeVar, x5f x5fVar, x5f x5fVar2) {
        this.e = w1h.l(context, umiVar, "pushed-content-versions", new bg1[0]);
        this.f = context;
        this.g = umiVar;
        this.h = settingsManager;
        this.i = vwnVar;
        this.l = lpeVar;
        this.j = x5fVar;
        this.k = x5fVar2;
        p = this;
    }

    public static void nativeChannelUpdate(int i, int i2, @NonNull byte[] bArr) {
        io7 io7Var = null;
        if (p == null) {
            ks3.B("PushedContentHandler called by native before it was instantiated", null);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((SharedPreferences) p.e.get()).edit().putLong("last-data", jCurrentTimeMillis).putLong("last-success", jCurrentTimeMillis).apply();
        mch mchVar = (mch) p.d.get(i);
        if (mchVar != null) {
            sa2 sa2VarC = mchVar.c();
            int i3 = 0;
            if (i2 != (sa2VarC != null ? sa2VarC.b : ((SharedPreferences) p.e.get()).getInt(String.valueOf(i), 0))) {
                io7[] io7VarArrValues = io7.values();
                int length = io7VarArrValues.length;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    io7 io7Var2 = io7VarArrValues[i3];
                    if (io7Var2.a == i) {
                        io7Var = io7Var2;
                        break;
                    }
                    i3++;
                }
                if (io7Var == null) {
                    return;
                }
                mchVar.a(io7Var, i2, new nch(bArr), new jch(i, i2));
            }
        }
    }

    public final void a() {
        ivg ivgVar = this.n;
        if (ivgVar == null) {
            EnumSet enumSetAllOf = EnumSet.allOf(io7.class);
            enumSetAllOf.removeIf(new nn((byte) 11));
            s6e s6eVarB = s6e.b(this.f);
            vq8 vq8Var = s6eVarB.b;
            if (!TextUtils.isEmpty(vq8Var != null ? (String) vq8Var.h : s6eVarB.c)) {
                enumSetAllOf.remove(io7.e);
            }
            ivg ivgVar2 = new ivg(enumSetAllOf, this.d);
            this.n = ivgVar2;
            ivgVar = ivgVar2;
        }
        ich ichVar = new ich(this, (byte) 0);
        if (((EnumSet) ivgVar.b).isEmpty()) {
            ichVar.run();
        } else {
            ((ArrayList) ivgVar.c).add(ichVar);
        }
    }

    public final void b(boolean z, lch lchVar) {
        if (lchVar != null) {
            this.m.add(lchVar);
        }
        if (!this.a || z) {
            this.a = true;
            if (z) {
                Request request = this.o;
                if (request != null) {
                    long j = request.d;
                    if (j != 0) {
                        N.MBqsUtXh(j);
                        request.d = 0L;
                    }
                    oml omlVar = request.b;
                    if (omlVar != null) {
                        omlVar.cancel(false);
                        request.b = null;
                    }
                }
                ks3 ks3Var = this.l.B;
                d3k d3kVar = (d3k) ks3Var.i;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                ks3Var.i = null;
                ((ArrayList) ks3Var.h).clear();
            }
            ((SharedPreferences) this.e.get()).edit().remove("timer").apply();
            a();
        }
    }

    public final int c(io7 io7Var, mch mchVar) {
        int i;
        mchVar.e(this);
        sa2 sa2VarC = mchVar.c();
        if (sa2VarC != null) {
            i = sa2VarC.b;
        } else {
            i = ((SharedPreferences) this.e.get()).getInt(String.valueOf((int) io7Var.a), 0);
        }
        N.MHNIDaRM(io7Var.a, i);
        return i;
    }

    public final void d(boolean z, boolean z2) {
        boolean zB = true;
        if (this.a) {
            this.a = false;
            ArrayList arrayList = this.m;
            this.m = new ArrayList(1);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((lch) obj).m(z);
            }
        }
        vwn vwnVar = this.i;
        if (!z) {
            vwnVar.getClass();
        } else if (vwnVar.a()) {
            Context context = vwnVar.b;
            qwn qwnVar = (qwn) ((rwn) no7.n(context, io7.j, rwn.k)).i();
            HashSet hashSet = pyn.a;
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                zB = vwn.b(currentWebViewPackage, qwnVar);
            } else if (!vwn.b(r9n.u(context, "com.android.chrome", 0L), qwnVar) && !vwn.b(r9n.u(context, "com.google.android.webview", 0L), qwnVar) && !vwn.b(r9n.u(context, "com.android.webview", 0L), qwnVar)) {
                zB = false;
            }
            SharedPreferences.Editor editorPutInt = ((SharedPreferences) vwnVar.a.get()).edit().putInt("wv.crash.count", tz5.a());
            if (zB) {
                vwnVar.c(yu0.c);
            } else {
                editorPutInt.remove("wv.disabled");
                vwnVar.c(yu0.d);
            }
            editorPutInt.apply();
        }
        if (z && z2) {
            cak.a(4);
        }
    }

    public final void e(long j, boolean z) {
        hf0 hf0Var;
        this.o = null;
        long jCurrentTimeMillis = System.currentTimeMillis() + (z ? 21600000L : 300000L);
        b59 b59Var = this.e;
        SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
        if (jCurrentTimeMillis > sharedPreferences.getLong("timer", 0L)) {
            sharedPreferences.edit().putLong("timer", jCurrentTimeMillis).apply();
        }
        x5f x5fVar = this.j;
        int i = 0;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            lp0 lp0Var = new lp0(2443, -1, 3);
            lp0Var.r(0, 1, z);
            lp0Var.p(2, 1, j);
            if (!z) {
                Context context = x5fVar.c;
                bj0 bj0VarD = zpa.D();
                ui6.u(context, bj0VarD);
                lp0Var.q(1, 1, bj0VarD);
            }
            qd0 qd0VarB = x56VarF.B(zpaVar);
            kp0 kp0Var = (kp0) qd0VarB.n(25);
            if (kp0Var == null) {
                qd0VarB.q(25, 1, new kp0(2443, 1, 1));
                kp0Var = (kp0) qd0VarB.n(25);
            }
            List list = (List) kp0Var.n(0);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                kp0Var.q(0, 1, arrayList);
                hf0Var = new hf0(kp0Var, 0, arrayList);
            } else {
                hf0Var = new hf0(kp0Var, 0, list);
            }
            hf0Var.add(lp0Var);
            x5fVar.U0(x56VarF);
        }
        x5fVar.K0(2, z);
        SharedPreferences sharedPreferences2 = (SharedPreferences) b59Var.get();
        boolean z2 = !sharedPreferences2.contains("version");
        if (!z) {
            d(false, z2);
            return;
        }
        am2.x(sharedPreferences2.edit().putInt("version", 2), "last-success");
        this.h.V(0, "news_is_blocked_by_personalization_change");
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                this.l.a(new vvf(this, new gh2((byte) 8, this, z2), (byte) 5));
                return;
            } else {
                ((mch) sparseArray.valueAt(i)).f();
                i++;
            }
        }
    }

    public final void f(io7 io7Var, mch mchVar) {
        this.d.put(io7Var.a, mchVar);
        ivg ivgVar = this.n;
        if (ivgVar != null && ((EnumSet) ivgVar.b).contains(io7Var)) {
            mchVar.b(new q2g(ivgVar, io7Var, (byte) 17));
        }
        if (this.b) {
            c(io7Var, mchVar);
            b(true, null);
        }
    }

    public final void g(io7 io7Var) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.e.get()).edit();
        byte b = io7Var.a;
        editorEdit.remove(String.valueOf((int) b)).apply();
        if (this.b) {
            N.MHNIDaRM(b, 0);
        }
    }
}
