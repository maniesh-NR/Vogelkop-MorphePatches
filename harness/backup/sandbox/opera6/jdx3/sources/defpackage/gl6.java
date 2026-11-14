package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.ResultReceiver;
import android.os.StrictMode;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.bookmarks.BookmarksImporterBridge;
import com.opera.android.downloads.DownloadProvider;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class gl6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gl6(dv6 dv6Var, dp2 dp2Var, bxl bxlVar, jn2 jn2Var) {
        this.a = (byte) 3;
        this.b = dv6Var;
        this.c = dp2Var;
        this.d = jn2Var;
    }

    public /* synthetic */ gl6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ gl6(v18 v18Var, int i, String str, Throwable th) {
        this.a = (byte) 16;
        this.b = v18Var;
        this.c = str;
        this.d = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        byte b = 5;
        byte b2 = 12;
        byte b3 = 2;
        Long lValueOf = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        lValueOf = null;
        lValueOf = null;
        lValueOf = null;
        lValueOf = null;
        byte b4 = 0;
        switch (this.a) {
            case 0:
                xd5 xd5Var = (WelcomeActivity) this.b;
                tzn tznVar = (tzn) this.c;
                Lazy lazy = (Lazy) this.d;
                String[] strArr = OperaApplication.K;
                if (!((OperaApplication) xd5Var.getApplication()).J().J() || !xd5Var.getLifecycle().i.d(qcc.e)) {
                    tznVar.invoke();
                    return;
                }
                tcc lifecycle = xd5Var.getLifecycle();
                SettingsManager settingsManagerJ = ((OperaApplication) xd5Var.getApplication()).J();
                x5f x5fVar = ((OperaApplication) xd5Var.getApplication()).L().c;
                x5f x5fVar2 = ((OperaApplication) xd5Var.getApplication()).L().d;
                rqd rqdVar = z7f.k;
                lifecycle.a(new ju2(settingsManagerJ, x5fVar, x5fVar2, lazy, (y7f) ipe.E(xd5Var).i(), v1.u(xd5Var).v(), tznVar));
                return;
            case 1:
                mm6 mm6Var = (mm6) this.b;
                eej eejVar = (eej) this.c;
                jm6 jm6Var = (jm6) this.d;
                mm6Var.getClass();
                bpd bpdVar = new bpd((byte) 11, mm6Var, jm6Var.b, false);
                yl6 yl6VarA = mm6Var.a();
                SharedPreferences sharedPreferences = (SharedPreferences) yl6VarA.c.get();
                nej nejVar = eejVar.a;
                im6 im6Var = new im6(bpdVar, yl6VarA, sharedPreferences, b4);
                nejVar.getClass();
                nejVar.b(im6Var, ijm.b);
                return;
            case 2:
                f3j f3jVar = (f3j) this.b;
                tc2 tc2Var = (tc2) this.c;
                Runnable runnable = (Runnable) this.d;
                if (!tc2Var.equals(hqc.b)) {
                    if (tc2Var instanceof kqc) {
                        lValueOf = Long.valueOf(((kqc) tc2Var).b);
                    } else if (!(tc2Var instanceof iqc) && !(tc2Var instanceof jqc) && !(tc2Var instanceof mqc) && !(tc2Var instanceof lqc)) {
                        h9o.p();
                        return;
                    }
                }
                if (lValueOf != null) {
                    Uri.Builder builderAppendPath = f3jVar.a.buildUpon().appendPath("events").appendPath(String.valueOf(lValueOf.longValue()));
                    builderAppendPath.appendQueryParameter("utm_source", "ofa").appendQueryParameter("utm_medium", "owner").appendQueryParameter("utm_campaign", "mini-modes");
                    string = builderAppendPath.build().toString();
                } else {
                    string = f3jVar.a.buildUpon().appendQueryParameter("utm_source", "ofa").appendQueryParameter("utm_medium", "owner").appendQueryParameter("utm_campaign", "mini-modes").build().toString();
                }
                vx3 vx3VarA = ay3.a(string, lqm.x, false);
                vx3VarA.b = 2;
                o18.t(vx3VarA, true, vx3VarA);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                dv6 dv6Var = (dv6) this.b;
                dp2 dp2Var = (dp2) this.c;
                String str = dp2Var.a;
                jn2 jn2Var = (jn2) this.d;
                dv6Var.getClass();
                Logger logger = dv6.f;
                try {
                    o5m o5mVarA = dv6Var.c.a(str);
                    if (o5mVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        dv6Var.e.o(new a32(dv6Var, dp2Var, ((vp4) o5mVarA).a(jn2Var), b));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                c cVar = (c) this.d;
                viewGroup.endViewTransition(view);
                ((f) cVar.c).a.c(cVar);
                return;
            case 5:
                c0 c0Var = (c0) this.b;
                c0 c0Var2 = (c0) this.c;
                g gVar = (g) this.d;
                Fragment fragment = c0Var.c;
                Fragment fragment2 = c0Var2.c;
                boolean z = gVar.o;
                fn9 fn9Var = an9.a;
                if (z) {
                    fragment2.getEnterTransitionCallback();
                    return;
                } else {
                    fragment.getEnterTransitionCallback();
                    return;
                }
            case 6:
                ow6 ow6Var = (ow6) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Runnable runnable3 = (Runnable) this.d;
                if (ow6Var.j) {
                    runnable2.run();
                    return;
                } else {
                    runnable3.run();
                    return;
                }
            case 7:
                sf7 sf7Var = (sf7) this.b;
                Context context = (Context) this.c;
                umi umiVar = (umi) this.d;
                rf7 rf7Var = sf7Var.a;
                if (Build.VERSION.SDK_INT < 30 || x1p.o != null || ru9.c(context).a.getBoolean("download.access_after_upgrade.all_access", false)) {
                    return;
                }
                new ua7(rf7Var, umiVar, context.getApplicationContext());
                return;
            case 8:
                fp1 fp1Var = (dx3) this.b;
                yi4.R(fp1Var, (sz4) this.c, fp1Var, (Callback) this.d);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                jg7 jg7Var = (jg7) this.b;
                re7 re7Var = (re7) this.c;
                Context context2 = (Context) this.d;
                Uri uriG = re7Var.g();
                if (uriG != null) {
                    String strH = rf7.h(re7Var);
                    if ("file".equals(uriG.getScheme())) {
                        String[] strArr2 = aik.a;
                        uriG = DownloadProvider.b(context2, uriG, strH == null ? "" : strH);
                    }
                    jg7Var.f(uriG, strH);
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                am7 am7Var = (am7) this.b;
                ((bm7) this.c).d(am7Var.a, am7Var.b, (Exception) this.d);
                return;
            case 11:
                am7 am7Var2 = (am7) this.b;
                ((bm7) this.c).j(am7Var2.a, am7Var2.b, (ix5) this.d);
                return;
            case 12:
                en7 en7Var = (en7) this.b;
                Runnable runnable4 = (Runnable) this.c;
                Runnable runnable5 = (Runnable) this.d;
                if (en7Var.f) {
                    runnable4.run();
                    return;
                } else {
                    runnable5.run();
                    return;
                }
            case 13:
                jo7 jo7Var = (jo7) this.b;
                byte[] bArr = (byte[]) this.c;
                jch jchVar = (jch) this.d;
                try {
                    jo7Var.d(bArr);
                    jo7Var.g(jchVar, true);
                    return;
                } catch (Throwable unused) {
                    jo7Var.g(jchVar, false);
                    return;
                }
            case 14:
                c61 c61Var = (c61) this.b;
                o0g o0gVar = (o0g) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    vh9 vh9VarV = cs5.v(c61Var.a);
                    if (vh9VarV == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    uh9 uh9Var = (wx7) ((tx7) vh9VarV).c;
                    synchronized (uh9Var.c) {
                        try {
                            uh9Var.e = threadPoolExecutor;
                        } finally {
                        }
                    }
                    ((wx7) ((tx7) vh9VarV).c).a(new zx7(o0gVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    o0gVar.t0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 15:
                f28 f28Var = (f28) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                Runnable runnable6 = (Runnable) this.d;
                if (f28Var.E != 8) {
                    arrayList.isEmpty();
                    if ((f28Var.e instanceof e28) && !f28Var.B && b77.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        boolean z2 = f28Var.r;
                        MediaCodec mediaCodec = f28Var.d;
                        if (z2) {
                            mediaCodec.stop();
                        } else {
                            mediaCodec.flush();
                        }
                        f28Var.A = true;
                    } else {
                        f28Var.d.stop();
                    }
                }
                runnable6.run();
                int i = f28Var.E;
                if (i == 7) {
                    f28Var.d();
                    return;
                }
                if (!f28Var.A) {
                    f28Var.f();
                }
                f28Var.g(1);
                if (i == 5 || i == 6) {
                    f28Var.g.execute(new z18(f28Var, f28Var.p.O(), (byte) 1));
                    if (i == 6) {
                        f28Var.g.execute(new z18(f28Var, f28Var.p.O(), (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((v18) this.b).b(new lv0((String) this.c, (Throwable) this.d));
                return;
            case 17:
                b28 b28Var = (b28) this.b;
                v6f v6fVar = (v6f) this.c;
                Executor executor = (Executor) this.d;
                LinkedHashMap linkedHashMap = b28Var.a;
                v6fVar.getClass();
                executor.getClass();
                linkedHashMap.put(v6fVar, executor);
                executor.execute(new cn7(v6fVar, b28Var.b, (byte) 12));
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                d28 d28Var = (d28) this.b;
                Executor executor2 = (Executor) this.c;
                v18 v18Var = (v18) this.d;
                if (d28Var.l.E != 8) {
                    try {
                        Objects.requireNonNull(v18Var);
                        executor2.execute(new c28(v18Var, (byte) 0));
                        return;
                    } catch (RejectedExecutionException unused2) {
                        return;
                    }
                }
                return;
            case 19:
                ((s28) this.b).c((File) this.c, (SecretKeySpec) this.d);
                return;
            case SizeUtil.textSize0 /* 20 */:
                v38 v38Var = (v38) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    v38Var.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult((Object) null);
                }
            case 21:
                Context context3 = (Context) this.b;
                qi8 qi8Var = (qi8) this.c;
                fjg fjgVar = (fjg) this.d;
                dkd dkdVarB = dkd.b(context3);
                if (dkdVarB == null) {
                    w7d.K("MediaMetricsService unavailable.");
                    return;
                }
                el6 el6Var = qi8Var.t;
                el6Var.getClass();
                el6Var.f.a(dkdVarB);
                LogSessionId logSessionIdD = dkdVarB.d();
                synchronized (fjgVar) {
                    ejg ejgVar = fjgVar.b;
                    ejgVar.getClass();
                    ejgVar.a(logSessionIdD);
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                zhj.a(new f8m((String) this.c, (s14) this.d), 4099).c(((cd9) this.b).requireContext());
                return;
            case 23:
                h2b h2bVar = (h2b) this.b;
                Context context4 = (Context) this.c;
                Uri uri = (Uri) this.d;
                rlj rljVarE = dd7.e(context4, uri);
                if (rljVarE.g() == null) {
                    h2bVar.f("");
                    return;
                }
                File file = new File(s29.e(context4), rljVarE.g());
                try {
                    try {
                        inputStreamOpenInputStream = context4.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            s29.k(inputStreamOpenInputStream, file);
                            N.Mb0tu6VP(new BookmarksImporterBridge(new eq6(h2bVar)), file.getAbsolutePath());
                        }
                    } finally {
                        xvg.l(inputStreamOpenInputStream);
                    }
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    h2bVar.f(message != null ? message : "");
                }
                return;
            case SizeUtil.textSize2 /* 24 */:
                vzk vzkVar = (vzk) this.b;
                ViewGroup viewGroup2 = (ViewGroup) this.c;
                ResultReceiver resultReceiver = (ResultReceiver) this.d;
                if (vzkVar.R(viewGroup2)) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        InputMethodManager inputMethodManagerK = vzkVar.K();
                        if (inputMethodManagerK != null) {
                            inputMethodManagerK.showSoftInput(viewGroup2, 0, resultReceiver);
                        }
                        return;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    }
                }
                return;
            case 25:
                Context context5 = (Context) this.b;
                x5f x5fVar3 = (x5f) this.c;
                wsf wsfVar = (wsf) this.d;
                boolean zIsEmpty = vtp.L(context5).getAll().isEmpty();
                vtp.n = true;
                if (zIsEmpty) {
                    new khg(context5, new g9(context5, x5fVar3, wsfVar, (byte) 17));
                    return;
                } else {
                    cak.a(2);
                    ks3.I(34, vtp.G(1, context5));
                    return;
                }
            case 26:
                fnb fnbVar = (fnb) this.b;
                String str3 = (String) this.c;
                qnb qnbVar = (qnb) this.d;
                lni.h("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str3 + " running callback");
                try {
                    pnb pnbVar = ((nnb) fnbVar).m;
                    try {
                        qnbVar.run();
                    } catch (Throwable th2) {
                        pnbVar.b(new s21("Exception received from UploadDataProvider", th2));
                    }
                    Trace.endSection();
                    return;
                } finally {
                }
            case 27:
                pnb pnbVar2 = (pnb) this.b;
                String str4 = (String) this.c;
                qqm qqmVar = (qqm) this.d;
                String string2 = URI.create(pnbVar2.m).resolve(str4).toString();
                pnbVar2.p = string2;
                pnbVar2.e.add(string2);
                pnbVar2.f(2, 3, new zr9(pnbVar2, qqmVar, b2));
                return;
            case 28:
                mnb mnbVar = (mnb) this.b;
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.c;
                CronetException cronetException = (CronetException) this.d;
                pnb pnbVar3 = mnbVar.d;
                try {
                    mnbVar.a.onFailed(pnbVar3, urlResponseInfo, cronetException);
                } catch (Exception unused3) {
                    pnbVar3.y = true;
                }
                mnbVar.d.c("maybeReportMetrics", new dnb(mnbVar, b3));
                pnbVar3.s.e.decrementAndGet();
                return;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                l94 l94Var = (l94) this.c;
                i51 i51Var = (i51) this.d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    i51Var.invoke();
                    l94Var.b((Object) null);
                    return;
                } catch (Throwable th3) {
                    l94Var.d(th3);
                    return;
                }
        }
    }
}
