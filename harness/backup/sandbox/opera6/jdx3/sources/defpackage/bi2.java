package defpackage;

import J.N;
import android.hardware.camera2.CameraCaptureSession;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.blocklist.bridge.BlockListRepositoryBridge;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.chromium.base.Callback;
import org.chromium.mojo.system.impl.WatcherImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class bi2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        hf4 hf4Var = (hf4) this.b;
        zd4 zd4Var = (zd4) this.c;
        synchronized (hf4Var.a) {
            hf4Var.c.remove(zd4Var);
            if (hf4Var.c.isEmpty()) {
                hf4Var.e.getClass();
                hf4Var.e.b((Object) null);
                hf4Var.e = null;
                hf4Var.d = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.opera.android.RootView] */
    @Override // java.lang.Runnable
    public final void run() {
        ih4 crkVar;
        byte b = 4;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (this.a) {
            case 0:
                ((fi2) this.b).run((String) this.c);
                return;
            case 1:
                ((kyk) this.b).run((lv5) this.c);
                return;
            case 2:
                li2 li2Var = (li2) this.b;
                ei2 ei2Var = (ei2) this.c;
                li2Var.i = null;
                if (!ei2Var.b) {
                    li2Var.r();
                    return;
                }
                q02 q02Var = new q02(li2Var, (byte) 17);
                ji2 ji2Var = new ji2(li2Var, b3);
                db dbVar = li2Var.a.b;
                if (dbVar.f()) {
                    crkVar = new crk(dbVar.g(true, q02Var, ji2Var), b);
                } else {
                    ji2Var.run("Not signed in");
                    crkVar = bf9.A;
                }
                li2Var.i = crkVar;
                return;
            case 3:
                ((yi2) ((tw2) this.b).b).i((String) this.c);
                return;
            case 4:
                tw2 tw2Var = (tw2) this.b;
                pzh pzhVar = (pzh) this.c;
                ((yi2) tw2Var.b).i("Error: " + pzhVar.d);
                return;
            case 5:
                N.MFIUe29u((CreditCard) this.b, (String) this.c);
                return;
            case 6:
                ((AutofillManager) this.b).g((Address) this.c);
                return;
            case 7:
                AutofillManager autofillManager = (AutofillManager) this.b;
                l25 l25Var = (l25) this.c;
                nrl nrlVar = autofillManager.a;
                if (!nrlVar.a) {
                    nrlVar.d(new bi2(autofillManager, l25Var, (byte) 7));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                N.M_nAabU4(arrayList);
                l25Var.run(arrayList);
                return;
            case 8:
                pr prVar = (pr) this.b;
                Object objApply = ((li8) this.c).apply(prVar.f);
                prVar.f = objApply;
                w03 w03Var = new w03(prVar, objApply, (byte) 1);
                szk szkVar = (szk) prVar.c;
                if (szkVar.a.getLooper().getThread().isAlive()) {
                    szkVar.c(w03Var);
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((p43) this.b).a.run((q43) this.c);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                p43 p43Var = (p43) this.b;
                Runnable runnable = (Runnable) this.c;
                if (p43Var.e) {
                    return;
                }
                runnable.run();
                return;
            case 11:
                th3 th3Var = (th3) this.b;
                k8e k8eVar = (k8e) this.c;
                if (th3Var.e) {
                    return;
                }
                th3Var.l(k8eVar.a);
                return;
            case 12:
                th3 th3Var2 = (th3) this.b;
                lc6 lc6Var = (lc6) this.c;
                if (th3Var2.e) {
                    return;
                }
                zv5.a.getClass();
                WatcherImpl watcherImpl = new WatcherImpl();
                watcherImpl.a = N.MXGgOw9k();
                watcherImpl.a(lc6Var, yv5.b, new va2(th3Var2, (byte) 15));
                return;
            case 13:
                ((BlockListRepositoryBridge) this.b).c.forEach(new pv1((zie) this.c, b3));
                return;
            case 14:
                ks3 ks3Var = (ks3) this.b;
                HashMap map = (HashMap) this.c;
                ks3Var.getClass();
                hvj hvjVar = new hvj(ks3Var);
                try {
                    hvjVar.h(new URL("https://crashstats-collector.opera.com/collector/submit"));
                    hvjVar.m(map);
                    hvjVar.l();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    xvg.l(hvjVar);
                    throw th;
                }
                xvg.l(hvjVar);
                return;
            case 15:
                ((hom) ((esg) this.b).c).F(new vy((bn7) this.c, b3));
                return;
            case 16:
                BrowserActivity browserActivity = (BrowserActivity) this.b;
                p6l p6lVar = (p6l) this.c;
                v9l v9lVar = (v9l) browserActivity.v0.get();
                tcc lifecycle = v9lVar.a.getLifecycle();
                umi umiVar = v9lVar.d;
                on7 on7Var = pn7.b;
                long jX0 = cs5.x0(200, un7.d);
                eek eekVar = new eek((Object) v9lVar, (Object) p6lVar, (byte) 11);
                final km5 km5Var = new km5();
                km5Var.c = eekVar;
                q65 q65Var = new q65(new dnb(km5Var, (byte) 9), b);
                q65Var.B0(umiVar, pn7.f(jX0), TimeUnit.MILLISECONDS);
                km5Var.d = q65Var;
                oup.l0(lifecycle, (Function1) null, new Function1() { // from class: wcc
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        km5 km5Var2 = km5Var;
                        switch (b4) {
                            case 0:
                                km5Var2.cancel();
                                break;
                            default:
                                km5Var2.cancel();
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function1() { // from class: wcc
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        km5 km5Var2 = km5Var;
                        switch (b4) {
                            case 0:
                                km5Var2.cancel();
                                break;
                            default:
                                km5Var2.cancel();
                                break;
                        }
                        return Unit.a;
                    }
                }, (Function1) null, 9);
                km5 km5Var2 = v9lVar.w;
                if (km5Var2 != null) {
                    km5Var2.cancel();
                }
                v9lVar.w = km5Var;
                ((c8l) ((BrowserActivity) v9lVar.s.c).w0.get()).b(v9lVar.h.A(), new u9l(km5Var, v9lVar, p6lVar));
                return;
            case 17:
                d7l d7lVar = (d7l) this.b;
                BrowserActivity browserActivity2 = (BrowserActivity) this.c;
                if (d7lVar == null || d7lVar.m) {
                    return;
                }
                int i = BrowserActivity.E1;
                browserActivity2.o1(1);
                k6l k6lVar = browserActivity2.V;
                (k6lVar != null ? k6lVar : null).C(d7lVar, 3);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                BrowserActivity browserActivity3 = (BrowserActivity) this.b;
                bi2 bi2Var = (bi2) this.c;
                int i2 = BrowserActivity.E1;
                b2l b2lVarW0 = browserActivity3.w0();
                if (b2lVarW0 != null) {
                    ((c8l) browserActivity3.w0.get()).b(b2lVarW0, new rv3(bi2Var, bi2Var, b2));
                    return;
                }
                return;
            case 19:
                BrowserActivity browserActivity4 = (BrowserActivity) this.b;
                dnb dnbVar = (dnb) this.c;
                int i3 = BrowserActivity.E1;
                browserActivity4.o1(1);
                dnbVar.run();
                return;
            case SizeUtil.textSize0 /* 20 */:
                tw3 tw3Var = (tw3) this.b;
                bk5 bk5Var = (bk5) this.c;
                BrowserActivity browserActivity5 = tw3Var.b;
                ?? r4 = browserActivity5.Q;
                k6l k6lVar2 = r4 != 0 ? r4 : null;
                qim qimVar = browserActivity5.o;
                Objects.requireNonNull(qimVar);
                he heVar = new he(bk5Var, (byte) 2);
                x79 x79Var = new x79();
                x79Var.a = k6lVar2;
                x79Var.b = qimVar;
                x79Var.c = browserActivity5;
                x79Var.d = heVar;
                new t77((ndc) browserActivity5, bk5Var, x79Var);
                return;
            case 21:
                BrowserFragment browserFragment = (BrowserFragment) this.b;
                ((d7l) ((b2l) this.c)).H(browserFragment.s);
                browserFragment.h0(false);
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((Callback) this.b).c(this.c);
                return;
            case 23:
                ((lg4) this.b).a.onCaptureSequenceAborted((CameraCaptureSession) this.c, -1);
                return;
            case SizeUtil.textSize2 /* 24 */:
                af4 af4Var = (af4) this.b;
                Set<td4> set = (Set) this.c;
                p12 p12Var = af4Var.a;
                xug.i();
                synchronized (p12Var.b) {
                    for (td4 td4Var : set) {
                        Set setKeySet = ((HashMap) p12Var.g).keySet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : setKeySet) {
                            if (((td4) obj).a.equals(td4Var.a)) {
                                arrayList2.add(obj);
                            }
                        }
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            ((HashMap) p12Var.g).remove((td4) obj2);
                        }
                    }
                }
                return;
            case 25:
                ((zd4) this.b).g().b().p((f7f) this.c);
                return;
            case 26:
                ((xd4) this.b).b().k((k9) this.c);
                return;
            case 27:
                a();
                return;
            case 28:
                ((qp5) this.b).accept((um2) this.c);
                return;
            default:
                wg4 wg4Var = (wg4) this.b;
                l94 l94Var = (l94) this.c;
                tah tahVar = wg4Var.g;
                if (!((AtomicBoolean) tahVar.k).getAndSet(true)) {
                    tc4 tc4Var = (tc4) tahVar.f;
                    tc4Var.getClass();
                    tc4Var.g = false;
                    synchronized (tc4Var.b) {
                        tc4Var.c = null;
                        tc4Var.d = l08.a;
                        tc4Var.f = false;
                        tc4Var.e.clear();
                    }
                    xf2 xf2Var = (xf2) tahVar.g;
                    if (((AtomicBoolean) xf2Var.h).compareAndSet(true, false)) {
                        d3k d3kVar = (d3k) xf2Var.i;
                        if (d3kVar != null) {
                            d3kVar.k((CancellationException) null);
                        }
                        xf2Var.i = null;
                    }
                    if (((zyk) tahVar.c).isInitialized()) {
                        qe4 qe4Var = (qe4) ((zyk) tahVar.c).getValue();
                        synchronized (qe4Var.c) {
                            if (qe4Var.d) {
                                throw new IllegalStateException("Check failed.");
                            }
                            ((ve4) ((m7h) qe4Var.a.e).get()).b();
                            qe4Var.d = true;
                        }
                    }
                }
                if (wg4Var.f != null) {
                    bd4 bd4Var = wg4Var.d;
                    if (bd4Var instanceof bd4) {
                        bd4 bd4Var2 = bd4Var;
                        synchronized (bd4Var2.a) {
                            if (!bd4Var2.b.isShutdown()) {
                                bd4Var2.b.shutdown();
                            }
                        }
                    }
                    wg4Var.f.quit();
                }
                l94Var.b((Object) null);
                return;
        }
    }
}
