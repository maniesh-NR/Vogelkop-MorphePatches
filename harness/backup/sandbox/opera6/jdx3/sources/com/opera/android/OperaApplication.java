package com.opera.android;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.euicc.EuiccManager;
import android.webkit.WebView;
import com.appsflyer.internal.j;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumPushService;
import com.leanplum.core.BuildConfig;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import com.opera.android.browser.obml.Platform;
import com.opera.android.crashhandler.MainProcessCrashHandler;
import com.opera.android.crashhandler.OperaCrashKeys;
import com.opera.android.settings.SettingsManager;
import com.opera.android.utilities.CryptoBridge;
import defpackage.a00;
import defpackage.a5f;
import defpackage.ag7;
import defpackage.aik;
import defpackage.atb;
import defpackage.au1;
import defpackage.axh;
import defpackage.b4m;
import defpackage.b8h;
import defpackage.ba8;
import defpackage.be7;
import defpackage.bf9;
import defpackage.bg1;
import defpackage.bvn;
import defpackage.cbk;
import defpackage.cef;
import defpackage.cjf;
import defpackage.d6j;
import defpackage.db;
import defpackage.dj9;
import defpackage.dp6;
import defpackage.du1;
import defpackage.e00;
import defpackage.e59;
import defpackage.edb;
import defpackage.ej9;
import defpackage.et3;
import defpackage.f4b;
import defpackage.fqe;
import defpackage.fs6;
import defpackage.fue;
import defpackage.g89;
import defpackage.g92;
import defpackage.gc7;
import defpackage.gen;
import defpackage.glh;
import defpackage.gmk;
import defpackage.h11;
import defpackage.hge;
import defpackage.hmc;
import defpackage.hpc;
import defpackage.hr5;
import defpackage.hs3;
import defpackage.hz;
import defpackage.hze;
import defpackage.i0i;
import defpackage.i0l;
import defpackage.i53;
import defpackage.ien;
import defpackage.ii;
import defpackage.iif;
import defpackage.in0;
import defpackage.io7;
import defpackage.ir5;
import defpackage.is3;
import defpackage.iwa;
import defpackage.iyc;
import defpackage.j4c;
import defpackage.jif;
import defpackage.jk5;
import defpackage.jlf;
import defpackage.jpc;
import defpackage.jtg;
import defpackage.jtm;
import defpackage.k3i;
import defpackage.k5o;
import defpackage.kif;
import defpackage.ks3;
import defpackage.ku5;
import defpackage.kw3;
import defpackage.l2c;
import defpackage.l45;
import defpackage.l4j;
import defpackage.ldc;
import defpackage.ldf;
import defpackage.lif;
import defpackage.lkk;
import defpackage.lpe;
import defpackage.lz6;
import defpackage.lzj;
import defpackage.m9c;
import defpackage.mdh;
import defpackage.mif;
import defpackage.n0k;
import defpackage.nif;
import defpackage.nml;
import defpackage.no7;
import defpackage.nr8;
import defpackage.nx1;
import defpackage.nzc;
import defpackage.nzk;
import defpackage.ohf;
import defpackage.oif;
import defpackage.orm;
import defpackage.oue;
import defpackage.ox3;
import defpackage.p1;
import defpackage.pch;
import defpackage.pd6;
import defpackage.pif;
import defpackage.q59;
import defpackage.q6e;
import defpackage.qe6;
import defpackage.qg2;
import defpackage.qj;
import defpackage.qsf;
import defpackage.qwe;
import defpackage.r0k;
import defpackage.r3h;
import defpackage.r65;
import defpackage.r99;
import defpackage.r9c;
import defpackage.rkc;
import defpackage.rml;
import defpackage.rog;
import defpackage.rtg;
import defpackage.ru9;
import defpackage.s28;
import defpackage.s9c;
import defpackage.sdf;
import defpackage.sf7;
import defpackage.skm;
import defpackage.sl6;
import defpackage.slk;
import defpackage.smb;
import defpackage.snc;
import defpackage.sz5;
import defpackage.t1;
import defpackage.t28;
import defpackage.t59;
import defpackage.t77;
import defpackage.tc3;
import defpackage.tjg;
import defpackage.tpk;
import defpackage.tz5;
import defpackage.u59;
import defpackage.umi;
import defpackage.v3m;
import defpackage.v59;
import defpackage.v61;
import defpackage.vk2;
import defpackage.vl9;
import defpackage.vml;
import defpackage.vu1;
import defpackage.vu2;
import defpackage.vvg;
import defpackage.vy;
import defpackage.w1;
import defpackage.wjf;
import defpackage.wmk;
import defpackage.wne;
import defpackage.wom;
import defpackage.wu5;
import defpackage.x0f;
import defpackage.x56;
import defpackage.x5f;
import defpackage.xb;
import defpackage.xnh;
import defpackage.xt8;
import defpackage.xtm;
import defpackage.xu2;
import defpackage.xv1;
import defpackage.y55;
import defpackage.ydn;
import defpackage.yen;
import defpackage.yjf;
import defpackage.ym8;
import defpackage.yv1;
import defpackage.yzb;
import defpackage.z0f;
import defpackage.z9c;
import defpackage.zpa;
import defpackage.zpe;
import defpackage.zwk;
import java.io.File;
import java.net.ProxySelector;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.CommandLine;
import org.chromium.base.PathUtils;
import org.chromium.components.cached_flags.CachedFlagUtils;
import org.chromium.ui.base.ResourceBundle;
import org.jetbrains.compose.resources.AndroidContextProvider;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/opera/android/OperaApplication;", "Landroid/app/Application;", "Lgl5;", "Lxu2;", "Lhmc;", "<init>", "()V", "vl9", "iif", "hz", "alo", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class OperaApplication extends Application implements gl5, xu2, hmc {
    public static final String[] K = {"dualaid", "dualspace", "excelliance", "gspace", "parallel_intl", "parallel_lite", "parallelspace", "virtualapp", "waxmoon"};
    public final j4c A;
    public final j4c B;
    public final j4c C;
    public final j4c D;
    public final j4c E;
    public final j4c F;
    public final j4c G;
    public final j4c H;
    public final j4c I;
    public final j4c J;
    public sl6 b;
    public tjg d;
    public final Throwable g;
    public Integer h;
    public final du1 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final CommandLine n;
    public boolean o;
    public rr3 p;
    public final xv1 r;
    public final j4c s;
    public final j4c t;
    public final t1 u;
    public final j4c v;
    public final j4c w;
    public final j4c x;
    public final j4c y;
    public final g92 z;
    public final HashMap a = new HashMap();
    public final Object c = new Object();
    public final Object e = new Object();
    public final j4c f = new j4c(new kw3(20), (byte) 1);
    public final cbk m = new cbk();
    public final zyk q = z4c.b(new et3(this, 9));

    public OperaApplication() {
        xv1 xv1Var = new xv1(this);
        this.r = xv1Var;
        this.s = xv1Var.z;
        this.t = xv1Var.i;
        this.u = xv1Var.x;
        this.v = xv1Var.F;
        this.w = xv1Var.J;
        this.x = xv1Var.P;
        this.y = xv1Var.Q;
        this.z = new g92(xv1Var.W, pif.b);
        this.A = xv1Var.i0;
        this.B = xv1Var.r0;
        this.C = xv1Var.s0;
        this.D = xv1Var.E0;
        this.E = xv1Var.F0;
        this.F = xv1Var.G0;
        this.G = xv1Var.H0;
        this.H = xv1Var.I0;
        this.I = xv1Var.W0;
        this.J = xv1Var.p1;
        du1 du1Var = null;
        try {
            du1 du1Var2 = du1.d;
            CommandLine.d((String[]) null);
            CommandLine commandLine = CommandLine.d;
            this.n = commandLine;
            commandLine.a("enable-crash-reporter", (String) null);
            if (!ocp.k()) {
                WebView.disableWebView();
            }
            du1Var = du1Var2;
        } catch (Throwable th) {
            this.g = th;
        }
        this.i = du1Var;
    }

    public final oue A() {
        return (oue) this.r.e0.get();
    }

    public final qwe B() {
        return (qwe) this.r.g0.get();
    }

    public final sdf C() {
        return (sdf) this.r.n0.get();
    }

    public final jtg D() {
        return (jtg) this.r.t0.get();
    }

    public final gmk E() {
        return (gmk) this.r.v0.get();
    }

    public final PushedContentHandler F() {
        return (PushedContentHandler) this.r.w0.get();
    }

    public final mdh G() {
        return (mdh) this.r.y0.get();
    }

    public final glh H() {
        return (glh) this.r.B0.get();
    }

    public final q6e I() {
        return (q6e) this.r.O0.get();
    }

    public final SettingsManager J() {
        return (SettingsManager) this.r.P0.get();
    }

    public final r0k K() {
        return (r0k) this.r.V0.get();
    }

    public final d6j L() {
        return (d6j) this.r.X0.get();
    }

    public final slk M() {
        return (slk) this.r.Y0.get();
    }

    public final zwk N() {
        return (zwk) this.r.a1.get();
    }

    public final v3m O() {
        return (v3m) this.r.h1.get();
    }

    public final skm P() {
        return L().d;
    }

    public final orm Q() {
        return L().c;
    }

    public final ydn R() {
        return (ydn) this.r.i1.get();
    }

    public final ien S() {
        return (ien) this.r.j1.get();
    }

    public final yen T() {
        return (yen) this.r.k1.get();
    }

    public final boolean U() {
        return this.h != null;
    }

    public final void V() throws Resources.NotFoundException {
        l45 l45Var;
        String strSubstring;
        if (this.j) {
            return;
        }
        this.j = true;
        Object obj = tz5.a;
        if (ocp.k()) {
            tz5.b.set(w1h.l(this, vml.d, "crashhandler", new bg1[]{new sz5((byte) 0)}));
        }
        boolean zK = ocp.k();
        boolean zIsIsolated = Process.isIsolated();
        ks3 ks3Var = new ks3();
        ks3Var.a = Executors.newSingleThreadExecutor(new js3((byte) 0));
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ks3Var.f = copyOnWriteArraySet;
        ks3Var.b = getApplicationContext();
        OperaCrashKeys operaCrashKeys = new OperaCrashKeys();
        ks3Var.c = operaCrashKeys;
        if (zK) {
            l45Var = new l45(this, "");
            ks3Var.h = new l45(this, "info.");
            ks3Var.i = new l45(this, "uploader.");
        } else {
            l45Var = wom.Gp;
            ks3Var.h = l45Var;
            ks3Var.i = l45Var;
        }
        operaCrashKeys.a(7, "OperaMobile");
        operaCrashKeys.a(8, "OperaMobile");
        String str = r9n.u(this, getPackageName(), 0L).versionName;
        operaCrashKeys.a(10, str);
        operaCrashKeys.a(47, "1910404306");
        if (zK) {
            strSubstring = "browser";
        } else {
            String processName = Application.getProcessName();
            if (processName.contains(":sandboxed_process")) {
                strSubstring = "renderer";
            } else if (processName.contains(":privileged_process")) {
                strSubstring = "gpu-process";
            } else {
                int iIndexOf = processName.indexOf(58);
                strSubstring = iIndexOf >= 0 ? processName.substring(iIndexOf + 1) : "other";
            }
        }
        operaCrashKeys.a(6, strSubstring);
        operaCrashKeys.a(5, "beta");
        operaCrashKeys.a(9, Long.toString(System.currentTimeMillis() / 1000));
        Resources resources = getResources();
        operaCrashKeys.a(3, resources.getString(2132021596));
        operaCrashKeys.a(2, getPackageName());
        PackageInfo packageInfoU = r9n.u(this, getPackageName(), 0L);
        operaCrashKeys.a(4, packageInfoU == null ? "<unknown>" : Long.toString(packageInfoU.firstInstallTime / 1000));
        operaCrashKeys.a(11, str);
        String string = resources.getString(2132021597);
        byte b = 17;
        if (string.equals(BuildConfig.BUILD_NUMBER)) {
            operaCrashKeys.a(16, "com.opera.browser.beta_armeabi-v7a_1910404306");
            operaCrashKeys.a(17, "1");
            operaCrashKeys.a(15, "");
        } else {
            operaCrashKeys.a(14, string);
            operaCrashKeys.a(13, "breakpad_symbols");
            operaCrashKeys.a(12, "proguard_maps_gp");
        }
        operaCrashKeys.a(1, Build.VERSION.RELEASE);
        operaCrashKeys.a(22, Build.MANUFACTURER);
        operaCrashKeys.a(23, Build.MODEL);
        operaCrashKeys.a(24, Integer.toString(Build.VERSION.SDK_INT));
        operaCrashKeys.a(21, Build.CPU_ABI);
        operaCrashKeys.a(0, "armeabi-v7a");
        hs3.a.getClass();
        operaCrashKeys.a(28, n9a.n("beta").d(this));
        String str2 = i0l.g() ? "ChromeOS" : null;
        if (str2 != null) {
            operaCrashKeys.a(33, str2);
        }
        ks3Var.g = zK ? new MainProcessCrashHandler(this, l45Var, new is3(ks3Var), ks3Var) : new n9k(ks3Var, zIsIsolated);
        ks3Var.d = zK ? new ldc(operaCrashKeys) : null;
        ks3Var.e = zK ? new v61(this) : null;
        if (zK) {
            copyOnWriteArraySet.add(new ym8(this));
        }
        ks3Var.J("<unknown>");
        ks3.k = ks3Var;
        ks3 ks3Var2 = ks3.k;
        if (!zIsIsolated) {
            Thread.setDefaultUncaughtExceptionHandler(new smb(ks3Var2, Thread.getDefaultUncaughtExceptionHandler()));
            vk2 vk2Var = new vk2(b);
            synchronized (y55.h) {
                y55.i = vk2Var;
            }
        }
        if (ocp.k()) {
            if (this.l && this.j) {
                b8h.n(this);
            }
            rog.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(android.app.Activity r28) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.OperaApplication.W(android.app.Activity):void");
    }

    public final boolean a() {
        if (J().i("eula_accepted.gdpr")) {
            sdf sdfVarC = C();
            if (sdfVarC.d.m() || (((SharedPreferences) sdfVarC.b.a.get()).getInt("pushed.sequence", 0) >= 1 && sdfVarC.a() == 0)) {
                xv1 xv1Var = this.r;
                if (((SharedPreferences) ((pch) xv1Var.x0.get()).a.a.get()).getInt("pushed.sequence", 0) == 2 && !((SharedPreferences) ((ldf) xv1Var.m0.get()).a.get()).getBoolean("need", false) && !h().e()) {
                    SettingsManager settingsManagerJ = J();
                    if ((settingsManagerJ.i("has_waited_for_startup_dependencies") || !settingsManagerJ.J()) && ru9.c(this).a.getBoolean("personalization.onboarding.completed", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (ocp.k()) {
            context = wwc.h(context, wwc.g(context));
        }
        super.attachBaseContext(context);
        if (getResources() == null) {
            System.exit(0);
            h9o.r("System.exit returned normally, while it was supposed to halt JVM.");
            return;
        }
        ResourceBundle.a = z5i.r;
        t8.a = this;
        if (ocp.k()) {
            p37.h = cjf.a;
            wbc.g.e(1);
        }
        if (ocp.k()) {
            n0k.d(this, false);
            this.l = true;
            if (this.j) {
                b8h.n(this);
            }
        }
    }

    public final db b() {
        return (db) this.r.b.get();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        try {
            return super.bindService(intent, serviceConnection, i);
        } catch (SecurityException e) {
            if (Build.VERSION.SDK_INT == 29 && "com.google.android.c2dm.intent.REGISTER".equals(intent.getAction())) {
                return false;
            }
            throw e;
        }
    }

    public final xb c() {
        return (xb) this.r.d.get();
    }

    public final e00 d() {
        return (e00) this.r.e.get();
    }

    public final j4c e() {
        no7.n(this, mv0.l, mv0.n);
        return this.r.g;
    }

    public final vu2 f() {
        return (vu2) this.r.l.get();
    }

    public final i53 g() {
        return (i53) this.r.q.get();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        SharedPreferences iifVar;
        synchronized (this.a) {
            iifVar = (SharedPreferences) this.a.get(str);
            if (iifVar == null) {
                iifVar = new iif(super.getSharedPreferences(str, i));
                this.a.put(str, iifVar);
            }
        }
        return iifVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSystemService(java.lang.String r19) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r18 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La0
            java.lang.String r0 = "display_hash"
            r1 = r19
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La2
            java.lang.Object r0 = super.getSystemService(r19)
            android.view.displayhash.DisplayHashManager r0 = (android.view.displayhash.DisplayHashManager) r0
            r0.getSupportedHashAlgorithms()     // Catch: java.lang.NullPointerException -> L1a
            return r0
        L1a:
            java.lang.Class r1 = r0.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            long r3 = defpackage.uaa.c
            sun.misc.Unsafe r5 = defpackage.uaa.a
            boolean r6 = r1.isPrimitive()
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L96
            boolean r6 = r1.isArray()
            if (r6 != 0) goto L96
            java.lang.Class<com.opera.android.utilities.HiddenApis$Helper$NeverCall> r6 = com.opera.android.utilities.HiddenApis$Helper$NeverCall.class
            java.lang.String r9 = "s"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r9)     // Catch: java.lang.Throwable -> L96
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.invoke.MethodHandles$Lookup r9 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L96
            java.lang.invoke.MethodHandle r11 = r9.unreflectGetter(r6)     // Catch: java.lang.Throwable -> L96
            long r9 = defpackage.uaa.d
            long r9 = r5.getLong(r1, r9)
            r12 = 0
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 == 0) goto L96
            int r1 = r5.getInt(r9)
            r6 = 0
        L59:
            if (r6 >= r1) goto L96
            long r12 = (long) r6
            long r14 = defpackage.uaa.f
            long r12 = r12 * r14
            long r12 = r12 + r9
            long r14 = defpackage.uaa.g
            long r14 = r14 + r12
            r12 = r9
            sun.misc.Unsafe r10 = defpackage.uaa.a
            r16 = r12
            long r12 = defpackage.uaa.b
            r10.putLong(r11, r12, r14)
            r10.putObject(r11, r3, r8)
            java.lang.invoke.MethodHandles$Lookup r9 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L77
            r9.revealDirect(r11)     // Catch: java.lang.Throwable -> L77
        L77:
            java.lang.Object r9 = r5.getObject(r11, r3)
            java.lang.invoke.MethodHandleInfo r9 = (java.lang.invoke.MethodHandleInfo) r9
            long r12 = defpackage.uaa.e
            java.lang.Object r9 = r5.getObject(r9, r12)
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.String r10 = r9.getName()
            java.lang.String r12 = "sSupportedHashAlgorithms"
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L97
            int r6 = r6 + 1
            r9 = r16
            goto L59
        L96:
            r9 = r8
        L97:
            if (r9 == 0) goto L9f
            r9.setAccessible(r7)     // Catch: java.lang.IllegalAccessException -> L9f
            r9.set(r8, r2)     // Catch: java.lang.IllegalAccessException -> L9f
        L9f:
            return r0
        La0:
            r1 = r19
        La2:
            java.lang.Object r0 = super.getSystemService(r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.OperaApplication.getSystemService(java.lang.String):java.lang.Object");
    }

    public final r65 h() {
        return (r65) this.r.t.get();
    }

    public final jk5 i() {
        return (jk5) this.r.v.get();
    }

    public final ku5 j() {
        return (ku5) this.r.w.get();
    }

    public final sl6 k() {
        sl6 sl6Var;
        synchronized (this.c) {
            sl6Var = this.b;
            if (sl6Var == null) {
                sl6Var = new sl6(this);
                this.b = sl6Var;
            }
        }
        return sl6Var;
    }

    public final gc7 l() {
        return (gc7) this.r.A.get();
    }

    public final sf7 m() {
        return (sf7) this.r.C.get();
    }

    public final ag7 n() {
        return (ag7) this.r.D.get();
    }

    public final nr8 o() {
        return (nr8) this.r.H.get();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (ocp.k()) {
            wwc.a(this, wwc.f(wwc.e(this)));
            umi umiVar = vml.d;
            Locale locale = configuration.getLocales().get(0);
            if (locale == null) {
                locale = wwc.a;
            }
            new rml(Unit.a, umiVar).a(new v2e((byte) 5, locale, this, false)).l();
        }
        nzk nzkVar = (nzk) this.r.c1.f();
        if (nzkVar != null) {
            nzkVar.a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application
    public final void onCreate() throws Resources.NotFoundException {
        t59 t59Var;
        V();
        Throwable th = this.g;
        byte b = 0;
        if (th != null) {
            ks3.D(th);
            this.h = 0;
        }
        System.setProperty("slf4j.provider", "org.slf4j.nop.NOPServiceProvider");
        super.onCreate();
        if (ocp.k()) {
            File filesDir = getFilesDir();
            byte b2 = 4;
            byte b3 = 2;
            byte b4 = 3;
            if (filesDir == null || !filesDir.isDirectory()) {
                this.h = 4;
            } else {
                try {
                    getResources().getInteger(2131492992);
                    String absolutePath = getDataDir().getAbsolutePath();
                    String[] strArr = K;
                    int i = 0;
                    while (true) {
                        if (i >= 9) {
                            String strS = r9n.s(this);
                            for (int i2 = 0; i2 < 9; i2++) {
                                if (!StringsKt.E(strS, strArr[i2], false)) {
                                }
                            }
                        } else if (StringsKt.E(absolutePath, strArr[i], false)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.h = 2;
                } catch (Resources.NotFoundException unused) {
                    this.h = 3;
                }
            }
            CryptoBridge.a = this.u;
            l2c.j = new j06((byte) 15);
            cqp.m = getApplicationContext();
            cqp.n = new ii((byte) 16);
            ProxySelector.setDefault(new wne());
            t().getClass();
            byte b5 = 1;
            Constants.disableFcmTokenAutoRefresh = true;
            Constants.allowStorageWithoutLegacyToken = true;
            Leanplum.setApplicationContext(this);
            z9c z9cVar = new z9c(this);
            LeanplumPushService.setCustomizer(new k5o(this, new w9c[]{new a36(), z9cVar}));
            LeanplumPushService.setDefaultCallbackClass(BrowserActivity.class);
            LeanplumPushService.setDeeplinkIntentCustomizer(new hr5());
            LeanplumPushService.setOnPushNotificationOpenedCallback(new yzb(z9cVar, b3));
            yjf.a.keySet().forEach(new qg2((byte) 8));
            LeanplumPushService.setDefaultNotificationTag("leanplum");
            if (!PathUtils.a.getAndSet(true)) {
                PathUtils.c = "opera";
                PathUtils.b = new FutureTask(new a94((byte) 1));
                fe2.e.r(PathUtils.b);
            }
            umi umiVar = vml.d;
            if (!pd6.b.getAndSet(true)) {
                FutureTask futureTask = new FutureTask(new ce2(getApplicationContext(), (byte) 1));
                pd6.a = futureTask;
                umiVar.getClass();
                new nml(umiVar, new qj(futureTask, (byte) 5), umiVar.c).a(null);
            }
            du1 du1Var = this.i;
            if (du1Var != null) {
                du1Var.b("startup#core");
                this.p = new rr3((byte) 3, System.currentTimeMillis(), SystemClock.uptimeMillis());
            }
            wwc.a(this, wwc.f(wwc.e(this)));
            Locale locale = wwc.a;
            new rml(Unit.a, umiVar).a(new v2e((byte) 5, locale, this, true)).l();
            h11 h11Var = h11.j;
            hs3.a.getClass();
            c30 c30Var = new c30((byte) 5, n9a.t(this), false);
            kif kifVar = new kif(this, b);
            int i3 = lif.a;
            h11Var.getClass();
            a5f.c = locale;
            a5f.d = c30Var;
            h11Var.m(lkk.ANALYTICS, kifVar, umiVar);
            axh axhVar = axh.j;
            hr5 hr5Var = new hr5();
            kif kifVar2 = new kif(this, b5);
            int i4 = mif.a;
            axhVar.getClass();
            wu5.a = hr5Var;
            axhVar.m(lkk.REQUESTS, kifVar2, umiVar);
            tc3 tc3Var = tc3.j;
            s16 s16Var = new s16();
            kif kifVar3 = new kif(this, b3);
            int i5 = nif.a;
            tc3Var.getClass();
            qsf.a = s16Var;
            tc3Var.m(lkk.BEHAVIOR, kifVar3, umiVar);
            cef cefVar = cef.j;
            String str = r9n.u(this, getPackageName(), 0L).versionName;
            String str2 = Build.VERSION.RELEASE;
            b30 b30Var = new b30(str, (byte) 3);
            kif kifVar4 = new kif(this, b4);
            int i6 = oif.a;
            cefVar.getClass();
            ir5.b = b30Var;
            cefVar.m(lkk.ONBOARDING, kifVar4, umiVar);
            a36 a36Var = new a36();
            kif kifVar5 = new kif(this, b2);
            int i7 = jif.a;
            be7 be7Var = be7.j;
            hr5.a = a36Var;
            be7 be7Var2 = be7.j;
            be7Var2.m(lkk.DOMAINS, kifVar5, umiVar);
            avj avjVar = cak.d;
            avj.g(5, new r99(this, b4));
            synchronized (ApplicationStatus.a) {
                ApplicationStatus.c = (byte) 4;
            }
            ApplicationStatus.g(new yv1());
            registerActivityLifecycleCallbacks(new zv1());
            AndroidContextProvider.a = this;
            if (U()) {
                return;
            }
            u59 u59VarC = u59.C(this);
            nx1 nx1Var = i0l.b;
            w1h.l(this, umiVar, "sys_utils", new bg1[0]);
            xv1 xv1Var = this.r;
            xv1Var.n1.get();
            xv1Var.V.get();
            w1h.l(this, umiVar, Constants.Defaults.LEANPLUM, new bg1[0]);
            he2.c.execute(new r99(this, b3));
            j4c j4cVar = xv1Var.N;
            j4cVar.getClass();
            Lazy.e(j4cVar, umiVar);
            xv1Var.t.get();
            xv1Var.n0.get();
            xv1Var.x0.get();
            xv1Var.m0.get();
            int iN = J().n("version_code");
            if (iN > 0 && iN < 1910403000 && ru9.c(this).a.getBoolean("oem.onboarding.completed", false)) {
                nv6 nv6VarB = ru9.c(this).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("personalization.onboarding.completed", true);
                nv6VarB.w();
            }
            CachedFlagUtils.a = wjf.a;
            CachedFlagUtils.b = wjf.b;
            CommandLine commandLine = this.n;
            if (commandLine == null) {
                commandLine = null;
            }
            if (!ej9.c) {
                ej9.c = true;
                ej9.b.a(new a00(commandLine, b3));
                ii iiVar = ej9.a;
                iiVar.getClass();
                Lazy.e(iiVar, umiVar);
            }
            this.r.O.get();
            if (u59VarC.L() == null) {
                long j = r9n.u(this, getPackageName(), 0L).firstInstallTime;
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str3 = r9n.u(this, getPackageName(), 0L).versionName;
                t59 t59Var2 = new t59(j, jCurrentTimeMillis, str3);
                nv6 nv6Var = (nv6) u59VarC.b;
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(j);
                jSONArray.put(jCurrentTimeMillis);
                String[] strArr2 = aik.a;
                jSONArray.put(str3 == null ? "" : str3);
                j.c((SharedPreferences) nv6Var.a, "persistent.installTime", jSONArray.toString());
                t59Var = t59Var2;
            } else {
                t59Var = null;
            }
            if (t59Var != null) {
                x5f x5fVar = L().d;
                long j2 = t59Var.a;
                String str4 = (String) t59Var.c;
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                in0 in0VarI = x56VarF.I(zpaVar);
                in0VarI.p(32, 1, j2);
                if (str4 != null) {
                    in0VarI.q(33, 1, str4);
                }
                x5fVar.U0(x56VarF);
                dj9 dj9VarT = dj9.t(getApplicationContext());
                dj9VarT.F(new v59(dj9VarT, t59Var.b, L().d, L().g));
            }
            q().getClass();
            int i8 = tz5.c().getInt("crash.count.delta.base", 0);
            int iA = tz5.a();
            int i9 = iA - i8;
            if (i9 > 0) {
                tz5.c().edit().putInt("crash.count.delta.base", iA).apply();
                this.k = true;
                x5f x5fVar2 = L().c;
                if (x5fVar2.h) {
                    zpa zpaVar2 = x5fVar2.d;
                    x56 x56VarF2 = zpa.F();
                    x56VarF2.E(zpaVar2).p(1, 1, i9);
                    x5fVar2.U0(x56VarF2);
                }
            } else {
                this.k = false;
            }
            t28 t28Var = (t28) i0i.b.d(this);
            t28Var.d = new s28(t28Var, t28Var.b, J(), this.u);
            xv1 xv1Var2 = this.r;
            j4c j4cVar2 = this.A;
            ilf.e.set(new jlf(this, new hz(this, b5)));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                mlf mlfVar = new mlf(this, umiVar, L().c);
                nzc.a = mlfVar;
                fob.e = mlfVar;
            }
            du1 du1Var2 = this.i;
            if (du1Var2 != null) {
                du1Var2.c = new n9k(L().c, J().n("version_code") != 1910404306);
            }
            if (this.p != null && J().n("version_code") != 1910404306) {
                this.p = null;
            }
            avj.g(1, new vl9(this, (byte) 20));
            registerActivityLifecycleCallbacks(new l4j());
            registerActivityLifecycleCallbacks(new jtm());
            registerActivityLifecycleCallbacks(new au1(J(), umiVar, getApplicationContext(), new ox3(this, (byte) 5), (f4b) this.r.S.get(), this.x));
            registerActivityLifecycleCallbacks(new iyc(this, umiVar, new ox3(this, (byte) 6), new ox3(this, (byte) 7), J()));
            registerActivityLifecycleCallbacks(new z0f(umiVar, L().d));
            registerActivityLifecycleCallbacks((x0f) this.r.l0.get());
            nx5 nx5Var = (nx5) this.t.get();
            new xtm(J(), xnh.t(getApplicationContext()), L().b, L().d, L().f);
            new zpe(J(), z(), L().c);
            new p1(xnh.t(getApplicationContext()), L().d);
            new tpk(xnh.t(getApplicationContext()), J(), L().c);
            new hge(s(), J(), L().c);
            new w1(xnh.t(this), (lzj) xv1Var2.T0.get(), new ox3(this, (byte) 8));
            j14.Y(new z99(((lpe) j4cVar2.get()).k, new vr((byte) 11, (mt5) null, J()), (byte) 2), nx5Var);
            new b4m(J(), (bvn) no7.n(getApplicationContext(), io7.A, bvn.k), O(), L().c);
            boolean zB = D().b();
            if (zB) {
                new edb(M(), y(), u(), L().d, (vvg) this.r.u0.get());
                new hze(this, F(), E());
                new q59(R(), M(), E());
                new rtg(L().d, M().i);
                new wmk(R(), M(), umiVar);
                new t77(M(), u());
            }
            new hze(M(), L().d, new ox3(this, b2));
            new rtg(M(), L().d);
            dp6 dp6Var = (dp6) this.v.get();
            bpd bpdVar = new bpd(dp6Var.d(), new i3j(dp6Var.b(), dp6Var.j, dp6Var.l), (byte) 12);
            qe6 qe6Var = new qe6((EuiccManager) dp6Var.t.getValue(), (byte) 3);
            x5f x5fVar3 = L().d;
            w7d.i(qbe.t(new xd6(bpdVar.G(), (byte) 5)), nx5Var, new ba8(x5fVar3, null, (byte) 0));
            na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new s3(x5fVar3, qe6Var, (mt5) null, (byte) 28), 3);
            ien ienVarS = S();
            if (zB) {
                ienVarS.p();
                ((ydn) ienVarS.c).u.b((gen) ienVarS.f);
                ienVarS.j.b.b(new vu1(ienVarS, (byte) 2));
            } else {
                ienVarS.l((Context) ienVarS.a, false);
            }
            yen yenVarT = T();
            if (zB) {
                yenVarT.p();
                ((ydn) yenVarT.c).u.b((gen) yenVarT.f);
            } else {
                yenVarT.l((Context) yenVarT.a, false);
            }
            atb atbVar = (atb) this.r.T.get();
            atbVar.c.b.b(new vu1(atbVar, (byte) 1));
            new ohf(c(), L().d);
            SettingsManager settingsManagerJ = J();
            dj9 dj9VarT2 = dj9.t(this);
            PushedContentHandler pushedContentHandlerF = F();
            j4c j4cVar3 = xv1Var2.y0;
            j4c j4cVar4 = xv1Var2.r1;
            x79 x79Var = new x79();
            x79Var.a = settingsManagerJ;
            x79Var.b = dj9VarT2;
            x79Var.c = pushedContentHandlerF;
            x79Var.d = j4cVar3;
            x79Var.e = j4cVar4;
            byte b6 = 5;
            dj9VarT2.F(new vy(x79Var, b6));
            ((k3i) this.D.get()).a().k(new hze(J(), L().d, b6));
            mt5 mt5Var = null;
            w7d.i(qbe.t(ma9.b((f99) ((zyk) ((lz6) this.J.get()).a.a).getValue(), new r3h(mt5Var, J(), (byte) 1))), nx5Var, new ba8(L().c, mt5Var, (byte) 2));
            w7d.i(qbe.t(ma9.b(((lpe) j4cVar2.get()).q, new r3h(mt5Var, J(), (byte) 0))), nx5Var, new ba8(L().c, mt5Var, (byte) 1));
            na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new r8h(((lpe) j4cVar2.get()).t, J(), (mt5) null, (byte) 13), 3);
            jpc jpcVar = (jpc) ((snc) xv1Var2.W.get()).o.getValue();
            jpcVar.getClass();
            na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new hpc(jpcVar, mt5Var, (byte) 0), 3);
            na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new hpc(jpcVar, mt5Var, (byte) 1), 3);
            na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new qmb(((lpe) j4cVar2.get()).y, L().d, (mt5) null, (byte) 12), 3);
            s9c s9cVar = new s9c(u());
            avj.g(9, s9cVar);
            Platform.e.add(s9cVar);
            if (J().i("eula_accepted.gdpr")) {
                W(null);
            }
            b8h.d(v().d).k(new iwa(new rkc((Object) this, (byte) 5), (byte) 4));
            HashSet hashSetM = w1h.m(ru9.c(this).a, "clearonexit.categories.ongoing");
            if (!hashSetM.isEmpty()) {
                z4o.z0(this, (HashSet) null);
                ks3.B("ClearOnExit never finished", hashSetM.toString());
            }
            ru9 ru9VarC = ru9.c(this);
            h11Var.C(ru9VarC.a.getString("osp.analytics_host", null), ru9VarC.a.getString("osp.analytics_key", null));
            SharedPreferences sharedPreferences = ru9VarC.a;
            axhVar.C(sharedPreferences.getString("osp.requests_host", null), sharedPreferences.getString("osp.requests_key", null));
            tc3Var.C(sharedPreferences.getString("osp.behavior_host", null), sharedPreferences.getString("osp.behavior_key", null));
            cefVar.C(sharedPreferences.getString("osp.onboarding_host", null), sharedPreferences.getString("osp.onboarding_key", null));
            be7Var2.C(sharedPreferences.getString("osp.domains_host", null), sharedPreferences.getString("osp.domains_key", null));
            if (i10 >= 35) {
                ((ActivityManager) getSystemService(ActivityManager.class)).addApplicationStartInfoCompletionListener(getMainExecutor(), new Consumer() { // from class: gif
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String[] strArr3 = OperaApplication.K;
                        x5f x5fVar4 = this.a.L().c;
                        boolean zWasForceStopped = ((ApplicationStartInfo) obj).wasForceStopped();
                        if (x5fVar4.h) {
                            zpa zpaVar3 = x5fVar4.d;
                            x56 x56VarF3 = zpa.F();
                            new ck0(zpaVar3, x56VarF3).c().b.r(25, 1, zWasForceStopped);
                            x5fVar4.U0(x56VarF3);
                        }
                    }
                });
            }
            if (this.j) {
                registerReceiver(rog.a, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            }
            Intent intent = new Intent("com.opera.android.action.APP_START");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        }
    }

    public final xt8 p() {
        return (xt8) this.r.I.get();
    }

    public final e59 q() {
        return (e59) this.r.K.get();
    }

    public final g89 r() {
        return (g89) this.r.L.get();
    }

    public final bf9 s() {
        return (bf9) this.r.M.get();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (rm5.z(this, intent, new hda((Object) null, this, (byte) 18))) {
            return;
        }
        alo.R(this, intent);
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (rm5.z(this, intent, new hda((Object) null, this, (byte) 18))) {
            return;
        }
        alo.R(this, intent);
        super.startActivity(intent, bundle);
    }

    public final r9c t() {
        return (r9c) this.r.U.get();
    }

    public final m9c u() {
        return (m9c) this.r.V.get();
    }

    public final fs6 v() {
        return ((snc) this.r.W.get()).a();
    }

    public final j4c w() {
        return ((snc) this.r.W.get()).m;
    }

    public final tjg x() {
        tjg tjgVar;
        synchronized (this.e) {
            tjgVar = this.d;
            if (tjgVar == null) {
                tjgVar = (tjg) this.r.a0.get();
                this.d = tjgVar;
            }
        }
        return tjgVar;
    }

    public final fqe y() {
        return (fqe) this.r.d0.get();
    }

    public final fue z() {
        return (fue) this.r.k0.get();
    }
}
