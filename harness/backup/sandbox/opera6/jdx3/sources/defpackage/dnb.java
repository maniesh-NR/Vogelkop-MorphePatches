package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.widget.LinearLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.leanplum.utils.SizeUtil;
import com.opera.ad.mraid.MRAIDView;
import com.opera.android.custom_views.MakeOperaDefaultBanner;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class dnb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dnb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        n3d n3dVar = (n3d) this.b;
        l3d l3dVar = n3dVar.d;
        if (l3dVar == null) {
            return;
        }
        Object obj = l3dVar.a;
        int i = 0;
        if (obj != null) {
            synchronized (n3dVar) {
                ArrayList arrayList = new ArrayList(n3dVar.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((j3d) obj2).onResult(obj);
                }
            }
            return;
        }
        Throwable th = l3dVar.b;
        synchronized (n3dVar) {
            ArrayList arrayList2 = new ArrayList(n3dVar.b);
            if (arrayList2.isEmpty()) {
                izc.c("Lottie encountered an error but no failure listener was added:");
                return;
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj3 = arrayList2.get(i);
                i++;
                ((j3d) obj3).onResult(th);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zdd zddVarA;
        byte b = 22;
        boolean z = false;
        iJ = 0;
        iJ = 0;
        int iJ = 0;
        switch (this.a) {
            case 0:
                ((fnb) this.b).h++;
                return;
            case 1:
                gl6 gl6Var = (gl6) this.b;
                lni.h("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  onFailed running callback");
                try {
                    gl6Var.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                mnb mnbVar = (mnb) this.b;
                try {
                    mnbVar.d.u.P(r0.t, mnbVar.a());
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            case 3:
                onb onbVar = (onb) this.b;
                synchronized (onbVar.c) {
                    if (onbVar.d) {
                        return;
                    }
                    Runnable runnable = (Runnable) onbVar.c.pollFirst();
                    onbVar.d = runnable != null;
                    while (runnable != null) {
                        try {
                            runnable.run();
                            synchronized (onbVar.c) {
                                runnable = (Runnable) onbVar.c.pollFirst();
                                onbVar.d = runnable != null;
                            }
                        } catch (Throwable th3) {
                            synchronized (onbVar.c) {
                                onbVar.d = false;
                                try {
                                    onbVar.a.execute(onbVar.b);
                                } catch (RejectedExecutionException unused2) {
                                }
                                throw th3;
                            }
                        }
                    }
                    return;
                }
            case 4:
                ((tvb) this.b).run();
                return;
            case 5:
                p1c p1cVar = (p1c) this.b;
                if (p1cVar.r) {
                    return;
                }
                p1cVar.r = true;
                p1cVar.f();
                return;
            case 6:
                i9c i9cVar = (i9c) this.b;
                ArrayList arrayList = (ArrayList) i9cVar.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (!((h9c) obj).f) {
                        }
                    } else {
                        z = true;
                    }
                }
                if (i9cVar.b != z) {
                    i9cVar.b = z;
                    Callback callback = (Callback) i9cVar.g;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                cac cacVar = ((dac) this.b).b;
                String strA0 = oup.a0(4, vtp.G(1, cacVar.a));
                if (strA0 == null || !cacVar.b.c("UTM source", strA0)) {
                    return;
                }
                cacVar.b(Collections.singletonMap("UTM source", strA0));
                return;
            case 8:
                f1p f1pVar = (f1p) this.b;
                plk plkVarA = new rml(Unit.a, (umi) f1pVar.b).a(new nna(f1pVar, (byte) 22));
                on7 on7Var = pn7.b;
                plkVarA.q(cs5.x0(1, un7.e));
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                km5 km5Var = (km5) this.b;
                km5Var.a = true;
                ((eek) km5Var.c).invoke();
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                p12 p12Var = (p12) this.b;
                if (((wg4) p12Var.e) != null) {
                    p12Var.A();
                    cdc cdcVar = (cdc) p12Var.f;
                    HashSet<xn2> hashSet = (HashSet) p12Var.h;
                    synchronized (cdcVar.a) {
                        for (xn2 xn2Var : hashSet) {
                            if (cdcVar.b.containsKey(xn2Var)) {
                                cdcVar.l((xcc) cdcVar.b.get(xn2Var));
                            }
                        }
                    }
                    return;
                }
                return;
            case 11:
                unb unbVar = (unb) this.b;
                if (unbVar != null) {
                    unbVar.k((CancellationException) null);
                    return;
                }
                return;
            case 12:
                xd5 xd5Var = (dx3) this.b;
                ua7 ua7Var = (ua7) ((z8b) dp7.a.a).a;
                if (ua7Var != null) {
                    ua7Var.C(xd5Var);
                    return;
                }
                return;
            case 13:
                txc txcVar = (txc) this.b;
                txcVar.f = null;
                txcVar.onLocationChanged((Location) null);
                return;
            case 14:
                ((ayc) this.b).stop();
                return;
            case 15:
                ((g1d) this.b).b(2);
                return;
            case 16:
                f3d f3dVar = (f3d) this.b;
                Semaphore semaphore = f3dVar.B;
                gi5 gi5Var = f3dVar.l;
                if (gi5Var != null) {
                    try {
                        semaphore.acquire();
                        gi5Var.q(f3dVar.b.b());
                    } catch (InterruptedException unused3) {
                    } catch (Throwable th4) {
                        semaphore.release();
                        throw th4;
                    }
                    semaphore.release();
                    return;
                }
                return;
            case 17:
                a();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                MRAIDView mRAIDView = (MRAIDView) ((c5d) this.b).b;
                mRAIDView.D("mraid.setPlacementType('inline');");
                sko.w(6);
                mRAIDView.u.evaluateJavascript("mraid.logLevel = mraid.LogLevelEnum.NONE;", new z4d((byte) 0));
                mRAIDView.z();
                mRAIDView.x();
                mRAIDView.I();
                mRAIDView.D("mraid.fireReadyEvent();");
                if (mRAIDView.D) {
                    mRAIDView.J();
                    return;
                }
                return;
            case 19:
                kr0 kr0Var = kr0.b;
                m7d m7dVar = (m7d) this.b;
                wv1 wv1Var = m7dVar.c;
                byte b2 = m7dVar.e;
                if (b2 == 0) {
                    i7d i7dVar = m7dVar.d;
                    if (i7dVar != null) {
                        i7dVar.o0();
                    }
                } else if (b2 != 1) {
                    if (b2 == 2 && m7dVar.d != null) {
                        orm ormVar = (orm) wv1Var.b.get();
                        if (ormVar != null) {
                            ((x5f) ormVar).L0(kr0Var);
                        }
                        vl6 vl6Var = m7dVar.d.k;
                        if (vl6Var != null) {
                            ((OperaBottomSheetBehavior) vl6Var.b).I(3);
                        }
                    }
                } else if (m7dVar.d != null) {
                    orm ormVar2 = (orm) wv1Var.b.get();
                    if (ormVar2 != null) {
                        ((x5f) ormVar2).L0(kr0Var);
                    }
                    i7d i7dVar2 = m7dVar.d;
                    h7d h7dVar = i7dVar2.m;
                    if (h7dVar != null) {
                        q9n.A((LinearLayout) ((or2) i7dVar2.l.d).c, new zr9(i7dVar2, new y0a(h7dVar, (byte) 19), b));
                    }
                }
                m7dVar.d = null;
                return;
            case SizeUtil.textSize0 /* 20 */:
                MakeOperaDefaultBanner makeOperaDefaultBanner = (MakeOperaDefaultBanner) this.b;
                int i2 = MakeOperaDefaultBanner.h;
                makeOperaDefaultBanner.d();
                return;
            case 21:
                a9d a9dVar = (a9d) this.b;
                a9dVar.t = false;
                a9dVar.g();
                return;
            case SizeUtil.textSize1 /* 22 */:
                MaterialButton materialButton = (MaterialButton) this.b;
                int[] iArr = MaterialButton.O;
                if (materialButton.E && materialButton.G && (zddVarA = materialButton.e.a(false)) != null) {
                    iJ = (int) (zddVarA.j() * 0.11f);
                }
                materialButton.F = iJ;
                materialButton.M();
                materialButton.invalidate();
                return;
            case 23:
                ((ghd) this.b).release();
                return;
            case SizeUtil.textSize2 /* 24 */:
                MediaDrmBridge mediaDrmBridge = (MediaDrmBridge) this.b;
                UUID uuid = MediaDrmBridge.n;
                mediaDrmBridge.b();
                return;
            case 25:
                tn tnVar = (tn) this.b;
                hkd hkdVar = (hkd) tnVar.b;
                if (hkdVar.a == null) {
                    dnb dnbVar = (dnb) tnVar.d;
                    if (dnbVar != null) {
                        ((Handler) tnVar.c).removeCallbacks(dnbVar);
                        tnVar.d = null;
                    }
                    bnf bnfVar = hkdVar.d;
                    bnfVar.getClass();
                    Intent action = new Intent(t8.a, (Class<?>) ((zmf) bnf.c.get(bnfVar.b)).a).setAction("org.chromium.components.browser_ui.media.ACTION_SWIPE");
                    int i3 = bnfVar.a;
                    action.putExtra("org.chromium.components.browser_ui.media.EXTRA_NOTIFICATION_ID", i3);
                    hkdVar.a = new yhe((Object) PendingIntent.getService(t8.a, i3, action, 335544320 | c26.s(false)), (byte) 8);
                    hkdVar.b = null;
                    return;
                }
                return;
            case 26:
                i3j i3jVar = (i3j) this.b;
                i3jVar.c = null;
                jkd jkdVar = (jkd) i3jVar.d;
                if (jkdVar != null) {
                    i3jVar.N(jkdVar);
                    return;
                }
                return;
            case 27:
                g77 g77Var = (g77) this.b;
                uig uigVar = ((PlayerView) g77Var.b).k;
                if (uigVar != null) {
                    uigVar.d();
                }
                View view = (View) ((i4d) g77Var.a).b;
                if (view.isLaidOut()) {
                    view.animate().alpha(0.0f).setDuration((int) (view.getAlpha() * 150.0f)).setInterpolator(lf1.a);
                    return;
                } else {
                    view.setAlpha(0.0f);
                    return;
                }
            case 28:
                nld nldVar = ((rld) this.b).p;
                nldVar.n = false;
                if (nldVar.l) {
                    nldVar.c();
                    return;
                }
                return;
            default:
                ((fmd) this.b).n = -1;
                return;
        }
    }
}
