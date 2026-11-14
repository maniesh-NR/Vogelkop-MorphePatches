package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.TabInfo;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class qlk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qlk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ck8 ck8Var;
        smj[] smjVarArrM;
        byte b = this.a;
        byte b2 = 12;
        final byte b3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((slk) obj).b(null);
                return;
            case 1:
                ((hz) obj).a(new fx1("Timeout"));
                return;
            case 2:
                ((tmk) obj).l();
                return;
            case 3:
                wmk wmkVar = (wmk) obj;
                String str = wmkVar.e;
                if (str == null || (ck8Var = wmkVar.d) == null || !ck8Var.e) {
                    return;
                }
                slk slkVar = wmkVar.b;
                new r62(slkVar.h, new mmk(slkVar, str, ck8Var.c, new zzh(wmkVar, b2), (byte) 2), (byte) 1);
                return;
            case 4:
                kok kokVar = (kok) obj;
                kokVar.r = true;
                if (kokVar.q) {
                    kokVar.a.B0(kokVar.m);
                    return;
                }
                return;
            case 5:
                ipk ipkVar = (ipk) obj;
                xbf xbfVar = ipkVar.a;
                w6j w6jVar = (w6j) xbfVar.e;
                final xbf xbfVar2 = new xbf(new jpk(xbfVar, objArr8 == true ? 1 : 0));
                qfb qfbVar = (qfb) w6jVar.a;
                final Object[] objArr9 = objArr7 == true ? 1 : 0;
                final d1h d1hVar = new d1h(new Date().getTime(), new Callback() { // from class: uok
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = objArr9;
                        xbf xbfVar3 = xbfVar2;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                xbfVar3.c = list;
                                xbfVar3.B();
                                break;
                            case 1:
                                xbfVar3.d = list;
                                xbfVar3.B();
                                break;
                            case 2:
                                xbfVar3.e = list;
                                xbfVar3.B();
                                break;
                            default:
                                xbfVar3.f = list;
                                xbfVar3.B();
                                break;
                        }
                    }
                }, objArr6 == true ? 1 : 0);
                Date date = (Date) ((kw3) qfbVar.b).get();
                final Object[] objArr10 = objArr5 == true ? 1 : 0;
                N.MmbDGwJs(1000, date.getTime(), new Callback() { // from class: c1h
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = objArr10;
                        d1h d1hVar2 = d1hVar;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                d1hVar2.c = list;
                                d1hVar2.b();
                                break;
                            default:
                                d1hVar2.d = list;
                                d1hVar2.b();
                                break;
                        }
                    }
                });
                N.MSaDng7I(1000, date.getTime(), new Callback() { // from class: c1h
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = b3;
                        d1h d1hVar2 = d1hVar;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                d1hVar2.c = list;
                                d1hVar2.b();
                                break;
                            default:
                                d1hVar2.d = list;
                                d1hVar2.b();
                                break;
                        }
                    }
                });
                dcl dclVar = (dcl) w6jVar.b;
                final d1h d1hVar2 = new d1h(new Date().getTime(), new Callback() { // from class: uok
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = b3;
                        xbf xbfVar3 = xbfVar2;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                xbfVar3.c = list;
                                xbfVar3.B();
                                break;
                            case 1:
                                xbfVar3.d = list;
                                xbfVar3.B();
                                break;
                            case 2:
                                xbfVar3.e = list;
                                xbfVar3.B();
                                break;
                            default:
                                xbfVar3.f = list;
                                xbfVar3.B();
                                break;
                        }
                    }
                }, b3);
                Date date2 = (Date) ((kw3) dclVar.a).get();
                final Object[] objArr11 = objArr4 == true ? 1 : 0;
                N.MmbDGwJs(1000, date2.getTime(), new Callback() { // from class: fam
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = objArr11;
                        d1h d1hVar3 = d1hVar2;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                d1hVar3.c = list;
                                d1hVar3.b();
                                break;
                            default:
                                d1hVar3.d = list;
                                d1hVar3.b();
                                break;
                        }
                    }
                });
                N.MSaDng7I(1000, date2.getTime(), new Callback() { // from class: fam
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b4 = b3;
                        d1h d1hVar3 = d1hVar2;
                        List list = (List) obj2;
                        switch (b4) {
                            case 0:
                                d1hVar3.c = list;
                                d1hVar3.b();
                                break;
                            default:
                                d1hVar3.d = list;
                                d1hVar3.b();
                                break;
                        }
                    }
                });
                vi5 vi5Var = (vi5) w6jVar.c;
                final byte b4 = 2;
                ((glh) ((tw2) vi5Var.d).b).f(new iu2(new o8f(new p8f((Object) new qhd(new Date().getTime(), vi5Var), (Object) new Callback() { // from class: uok
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b42 = b4;
                        xbf xbfVar3 = xbfVar2;
                        List list = (List) obj2;
                        switch (b42) {
                            case 0:
                                xbfVar3.c = list;
                                xbfVar3.B();
                                break;
                            case 1:
                                xbfVar3.d = list;
                                xbfVar3.B();
                                break;
                            case 2:
                                xbfVar3.e = list;
                                xbfVar3.B();
                                break;
                            default:
                                xbfVar3.f = list;
                                xbfVar3.B();
                                break;
                        }
                    }
                }, vi5Var.e, (byte) (objArr3 == true ? 1 : 0)), objArr2 == true ? 1 : 0), b2));
                d7h d7hVar = (d7h) w6jVar.d;
                final byte b5 = 3;
                Callback callback = new Callback() { // from class: uok
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b42 = b5;
                        xbf xbfVar3 = xbfVar2;
                        List list = (List) obj2;
                        switch (b42) {
                            case 0:
                                xbfVar3.c = list;
                                xbfVar3.B();
                                break;
                            case 1:
                                xbfVar3.d = list;
                                xbfVar3.B();
                                break;
                            case 2:
                                xbfVar3.e = list;
                                xbfVar3.B();
                                break;
                            default:
                                xbfVar3.f = list;
                                xbfVar3.B();
                                break;
                        }
                    }
                };
                List list = (List) ((jjg) d7hVar.c).get();
                list.removeIf(new nn(b2));
                final van vanVar = new van(new Date().getTime(), new rzj(d7hVar, callback, list), nb6.J(new zlb(list, new b10((byte) 27), (byte) 1)), (txi) ((u7k) ((txi) d7hVar.b).b).a);
                Date dateS = ipk.S();
                final Object[] objArr12 = objArr == true ? 1 : 0;
                N.MmbDGwJs(1000, dateS.getTime(), new Callback() { // from class: uan
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b6 = objArr12;
                        van vanVar2 = vanVar;
                        List list2 = (List) obj2;
                        switch (b6) {
                            case 0:
                                vanVar2.c = list2;
                                vanVar2.b();
                                break;
                            default:
                                vanVar2.d = list2;
                                vanVar2.b();
                                break;
                        }
                    }
                });
                N.MSaDng7I(1000, dateS.getTime(), new Callback() { // from class: uan
                    @Override // com.opera.api.Callback
                    public final void run(Object obj2) {
                        byte b6 = b3;
                        van vanVar2 = vanVar;
                        List list2 = (List) obj2;
                        switch (b6) {
                            case 0:
                                vanVar2.c = list2;
                                vanVar2.b();
                                break;
                            default:
                                vanVar2.d = list2;
                                vanVar2.b();
                                break;
                        }
                    }
                });
                vk vkVar = (vk) w6jVar.e;
                if (N.MphJ2uhp()) {
                    xbfVar2.g = vkVar.a;
                    xbfVar2.B();
                } else {
                    xbfVar2.g = Collections.EMPTY_LIST;
                    xbfVar2.B();
                }
                if (ipkVar.l) {
                    xbf xbfVar3 = ipkVar.k;
                    boolean zBooleanValue = ((Boolean) ((jjg) xbfVar3.d).get()).booleanValue();
                    if (zBooleanValue) {
                        xbfVar3.i(new w8d(b3, xbfVar3, zBooleanValue));
                    }
                    ipkVar.l = false;
                    return;
                }
                return;
            case 6:
                eyi eyiVar = (eyi) obj;
                eyiVar.b = false;
                mrk mrkVar = (mrk) eyiVar.d;
                mrkVar.b.removeCallbacks((qlk) eyiVar.c);
                mrkVar.b.removeView((CoordinatorLayout) mrkVar.y.a);
                return;
            case 7:
                ((s0b) obj).a();
                return;
            case 8:
                fn7 fn7Var = (fn7) ((ghf) obj).d;
                if (fn7Var != null) {
                    Iterator it = fn7Var.values().iterator();
                    while (it.hasNext()) {
                        ((ntk) it.next()).c();
                    }
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((a32) obj).k();
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((n9k) obj).a = true;
                return;
            case 11:
                ((hu5) obj).run(Boolean.TRUE);
                return;
            case 12:
                ((dxk) obj).R();
                return;
            case 13:
                axk axkVar = (axk) obj;
                axkVar.c.H(axkVar);
                axkVar.a.run();
                return;
            case 14:
                mxk mxkVar = (mxk) obj;
                dxk dxkVar = mxkVar.a;
                dxkVar.h.d(new qlk(dxkVar, b2)).a(null);
                mxkVar.R(false);
                return;
            case 15:
                zxk zxkVar = (zxk) obj;
                zxkVar.j = null;
                zxkVar.h = true;
                zxkVar.b();
                return;
            case 16:
                gyk gykVar = (gyk) obj;
                nr8 nr8Var = gykVar.b;
                hk6 hk6Var = gyk.e;
                if (nr8Var.c(hk6Var.d, p6l.a) == null) {
                    nr8Var.a(new mzj(gykVar.a.getString(hk6Var.a), hk6Var.d, (Bitmap) null, 4));
                    return;
                }
                return;
            case 17:
                wv1 wv1Var = (wv1) ((fyk) obj).c;
                hq8 hq8VarC = ((nr8) wv1Var.b.get()).c(gyk.e.d, p6l.a);
                if (hq8VarC != null) {
                    ((e) ((nr8) wv1Var.b.get())).getClass();
                    long jE = hq8VarC.e();
                    i7f i7fVar = FavoritesBridge.a;
                    N.Mw8yLl_M(jE);
                    return;
                }
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                ((jyk) obj).c(Boolean.TRUE);
                return;
            case 19:
                r72 r72Var = (r72) obj;
                r72Var.c = ((myk) r72Var.d).a.o(new zzh(r72Var, (byte) 23));
                return;
            case SizeUtil.textSize0 /* 20 */:
                jyk jykVar = (jyk) obj;
                if (jykVar.a) {
                    return;
                }
                jykVar.c(Boolean.TRUE);
                return;
            case 21:
                ((jyk) obj).c(Boolean.TRUE);
                return;
            case SizeUtil.textSize1 /* 22 */:
                View view = ((izk) obj).a;
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                    return;
                }
                return;
            case 23:
                c0l c0lVar = (c0l) obj;
                HashMap mapD = s9g.h.c.D();
                try {
                    n9h n9hVar = rmj.a;
                    synchronized (n9hVar.c) {
                        smjVarArrM = n9hVar.m();
                    }
                    int iA = qbd.a(smjVarArrM.length);
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (smj smjVar : smjVarArrM) {
                        linkedHashMap.put(BrowserUtils.a(smjVar.b), smjVar);
                    }
                    kag kagVar = kag.ASK;
                    ydj ydjVar = c0lVar.b;
                    if (ydjVar.a.a.getInt("notification_permision_storage.version", -1) == 1) {
                        c0lVar.b(mapD, linkedHashMap);
                        return;
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        smj smjVar2 = (smj) entry.getValue();
                        jag jagVar = (jag) mapD.get(str2);
                        kag kagVarA = jagVar != null ? jagVar.a(lag.b, kagVar) : null;
                        if (kagVarA == null || kagVarA == kagVar) {
                            n9h n9hVar2 = rmj.a;
                            String str3 = smjVar2.a;
                            synchronized (n9hVar2.c) {
                                ((wub) n9hVar2.b).A(str3);
                            }
                        } else if (smjVar2.c && kagVarA == kag.DENIED) {
                            n9h n9hVar3 = rmj.a;
                            String str4 = smjVar2.a;
                            synchronized (n9hVar3.c) {
                                ((wub) n9hVar3.b).A(str4);
                            }
                        }
                    }
                    c0lVar.b(mapD, linkedHashMap);
                    nv6 nv6VarB = ydjVar.a.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putInt("notification_permision_storage.version", 1);
                    nv6VarB.w();
                    return;
                } catch (Exception e) {
                    ks3.D(e);
                    return;
                }
            case SizeUtil.textSize2 /* 24 */:
                xz2 xz2Var = (xz2) obj;
                ((View) xz2Var.d).getViewTreeObserver().removeOnDrawListener(xz2Var);
                ((h3l) xz2Var.c).run();
                return;
            case 25:
                b5l b5lVar = (b5l) obj;
                k6l k6lVar = b5lVar.b;
                LinkedHashSet<b2l> linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = b5lVar.e;
                Iterator it2 = linkedHashSet2.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    String str5 = ((u4l) b5lVar.d.invoke()).a(iIntValue).b;
                    if (str5 == null || str5.length() == 0) {
                        s3l s3lVar = u3l.a;
                        ArrayList arrayListP = exg.p(k6lVar, new r3l(iIntValue), y6l.a);
                        if (arrayListP.size() == 1) {
                            linkedHashSet.add(CollectionsKt.K(arrayListP));
                        }
                    }
                }
                linkedHashSet2.clear();
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                h6l h6lVar = h6l.d;
                k6lVar.h(h6lVar);
                try {
                    for (b2l b2lVar : linkedHashSet) {
                        ((d7l) b2lVar).s(TabInfo.a(((d7l) b2lVar).j.a(), 0L, 0, 0, 7));
                    }
                    return;
                } finally {
                    k6lVar.n(h6lVar);
                }
            case 26:
                c5l c5lVar = (c5l) obj;
                c5lVar.v = false;
                c5lVar.u = false;
                return;
            case 27:
                ((e8l) obj).c();
                return;
            case 28:
                g4l.e(((r9l) obj).D);
                return;
            default:
                gal galVar = (gal) obj;
                galVar.c();
                galVar.a(0L);
                return;
        }
    }
}
