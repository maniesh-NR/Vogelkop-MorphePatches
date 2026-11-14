package defpackage;

import J.N;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.GpuWorkarounds;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.custom_views.BestHorizontalFitLayout;
import com.opera.android.history.f;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import com.opera.android.import_data.ImportChromeDataActivity;
import com.opera.android.startup.InitialStartupService;
import com.opera.android.startup.WelcomeActivity;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public final /* synthetic */ class ld9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        wva wvaVar = (wva) this.b;
        synchronized (wvaVar.w) {
            wvaVar.y = null;
            qya qyaVar = wvaVar.x;
            if (qyaVar != null) {
                wvaVar.x = null;
                wvaVar.e(qyaVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((od9) this.b).g0();
                return;
            case 1:
                hu5 hu5Var = (hu5) this.b;
                if (hu5Var != null) {
                    hu5Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                uh9 uh9Var = (uh9) this.b;
                synchronized (uh9Var.c) {
                    if (uh9Var.g == null) {
                        return;
                    }
                    try {
                        ni9 ni9VarC = uh9Var.c();
                        int i2 = ni9VarC.f;
                        if (i2 == 2) {
                            synchronized (uh9Var.c) {
                            }
                        }
                        if (i2 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = ham.a(uh9Var.a, new ni9[]{ni9VarC}, 0);
                            MappedByteBuffer mappedByteBufferF = ynh.f(uh9Var.a, ni9VarC.a);
                            if (mappedByteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                cyd cydVar = new cyd(typefaceA, qyn.c0(mappedByteBufferF));
                                Trace.endSection();
                                synchronized (uh9Var.c) {
                                    o0g o0gVar = uh9Var.g;
                                    if (o0gVar != null) {
                                        o0gVar.u0(cydVar);
                                    }
                                }
                                uh9Var.b();
                                return;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (uh9Var.c) {
                            o0g o0gVar2 = uh9Var.g;
                            if (o0gVar2 != null) {
                                o0gVar2.t0(th2);
                            }
                            uh9Var.b();
                            return;
                        }
                    }
                }
            case 3:
                ti9 ti9Var = (ti9) this.b;
                na2.B(ti9Var.a, (CoroutineContext) null, (rx5) null, new rf4((byte) 5, (mt5) null, ti9Var), 3);
                return;
            case 4:
                Fragment.e0((Fragment) this.b);
                return;
            case 5:
                nrl nrlVar = (nrl) this.b;
                v6d v6dVar = (v6d) nrlVar.b;
                if (v6dVar != null && nrlVar.a && v6dVar.b == t6d.c) {
                    v6dVar.b(t6d.d);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = ((w) this.b).o;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((am9) obj).getClass();
                }
                return;
            case 7:
                ((mn9) this.b).f();
                return;
            case 8:
                qt6 qt6Var = (qt6) this.b;
                qt6Var.e = null;
                ChromiumContent chromiumContent = (ChromiumContent) qt6Var.c;
                if (chromiumContent.h()) {
                    return;
                }
                long j = chromiumContent.n;
                if (j != 0) {
                    N.MCqZ2U3N(j);
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ContentViewRenderView contentViewRenderView = ((FullscreenWebActivity) ((wy3) this.b).e).u;
                if (contentViewRenderView != null) {
                    contentViewRenderView.setVisibility(0);
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                py9 py9Var = (py9) this.b;
                xf8.G0(py9Var.f, py9Var.a());
                py9Var.f();
                return;
            case 11:
                ((ez9) this.b).n();
                return;
            case 12:
                ((h0a) this.b).b.get();
                return;
            case 13:
                x0a x0aVar = (x0a) ((ks3) this.b).f;
                if (x0aVar != null) {
                    ((View) x0aVar.e.e).Q(2);
                    return;
                }
                return;
            case 14:
                c1a c1aVar = (c1a) this.b;
                b1a b1aVar = (b1a) c1aVar.h;
                b1aVar.e.delete(((d7l) b1aVar.d.b.o).j.getId());
                b1aVar.c.V(we0.c, b1aVar.W());
                String str = ((k1a) ((l1a) c1aVar.b).i()).e;
                String strC = a26.C(BrowserUtils.getRendererUrl(((d7l) ((k6l) c1aVar.e).o).j.getUrl()));
                StringBuffer stringBuffer = new StringBuffer(str.length());
                Matcher matcher = eti.c.matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(!strGroup.equals(Constants.Keys.LOCALE) ? !strGroup.equals("returnUrl") ? "" : strC : vsi.b()));
                }
                matcher.appendTail(stringBuffer);
                String string = stringBuffer.toString();
                if (string != null) {
                    ((xt3) c1aVar.f).run(string);
                    return;
                }
                return;
            case 15:
                try {
                    File[] fileArrListFiles = new File(((GpuWorkarounds) this.b).a.getDir("webview", 0), "GPUCache").listFiles(new ltp((byte) 2));
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        while (i < length) {
                            fileArrListFiles[i].delete();
                            i++;
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 16:
                ((j5m) this.b).d(new a5m(6));
                return;
            case 17:
                ((v8a) this.b).b();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                BestHorizontalFitLayout bestHorizontalFitLayout = ((a9a) this.b).c;
                bestHorizontalFitLayout.setVisibility(4);
                bestHorizontalFitLayout.setAlpha(1.0f);
                return;
            case 19:
                x77 x77Var = (x77) this.b;
                ((AtomicReference) x77Var.c).set(((Function0) x77Var.b).invoke());
                ((CountDownLatch) x77Var.d).countDown();
                return;
            case SizeUtil.textSize0 /* 20 */:
                qde qdeVar = ((f) this.b).f.l.g;
                ArrayList arrayList2 = qdeVar.l;
                arrayList2.clear();
                qdeVar.r(CollectionsKt.k0(arrayList2));
                return;
            case 21:
                ((xm5) this.b).B();
                return;
            case SizeUtil.textSize1 /* 22 */:
                a();
                return;
            case 23:
                jwa jwaVar = (jwa) this.b;
                jwaVar.d++;
                jwaVar.a();
                jwaVar.b();
                return;
            case SizeUtil.textSize2 /* 24 */:
                owa owaVar = (owa) this.b;
                nxa nxaVar = (nxa) owaVar.e.getValue();
                vml.a(owaVar.f);
                owaVar.c.b(nxaVar);
                return;
            case 25:
                ImportChromeBookmarksActivity importChromeBookmarksActivity = (ImportChromeBookmarksActivity) this.b;
                int i3 = ImportChromeBookmarksActivity.b0;
                importChromeBookmarksActivity.E0(nl3.f.a);
                return;
            case 26:
                ImportChromeDataActivity importChromeDataActivity = (ImportChromeDataActivity) this.b;
                int i4 = ImportChromeDataActivity.d0;
                importChromeDataActivity.S0(j2b.d, nl3.f.a);
                return;
            case 27:
                ((x79) this.b).O();
                return;
            case 28:
                InitialStartupService initialStartupService = (InitialStartupService) this.b;
                int i5 = InitialStartupService.b;
                int i6 = WelcomeActivity.w;
                Intent intent = new Intent(initialStartupService, (Class<?>) WelcomeActivity.class);
                intent.setAction("com.opera.android.startup.INSTALL_COMPLETE_NOTIFICATION");
                yhe yheVarF = yhe.f(initialStartupService, 0, intent, 0, false);
                ua7 ua7VarT = zi4.t("installation", new cm((String) null, 2131364377, (byte) 5));
                ua7VarT.N(yheVarF);
                ua7VarT.S(2131231676);
                ua7VarT.P(initialStartupService.getString(2132021631, initialStartupService.getString(2132017591)));
                String[] strArr = OperaApplication.K;
                x5f x5fVar = ((OperaApplication) initialStartupService.getApplicationContext()).L().c;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    am2.f(zpaVar, x56VarF).b.p(26, 1, 1L);
                    x5fVar.U0(x56VarF);
                }
                aib.t().H(ua7VarT.l());
                initialStartupService.stopSelf();
                return;
            default:
                ((ot2) ((jt2) ((wub) ((p12) this.b).e).E(jt2.class))).d();
                return;
        }
    }
}
