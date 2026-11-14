package defpackage;

import J.N;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.tabui2.recently_closed_tabs.RecentlyClosedTabsSheetContentWrapper;
import com.opera.android.widget.RoundedImageView;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class lld implements hsd, r3b, NavigationHistory, vm, rj2, nj8, nwh, w7e, d94, pji, a5a, z8l, gb6, bcf {
    public final /* synthetic */ byte a;
    public Object b;

    public lld(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new j1d((Object) null);
                break;
            case 17:
                this.b = new yhe((byte) 14);
                break;
            case 23:
                break;
            default:
                this.b = hyg.k((Object) null);
                break;
        }
    }

    public /* synthetic */ lld(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lld(k4j k4jVar, NavigationEntry navigationEntry) {
        this.a = (byte) 25;
        this.b = navigationEntry;
    }

    public lld(msh mshVar) {
        this.a = (byte) 18;
        Objects.requireNonNull(mshVar);
        this.b = mshVar;
    }

    public lld(ylh ylhVar, pjn pjnVar) {
        this.a = (byte) 3;
        this.b = ylhVar;
    }

    public static boolean g0(HashSet hashSet, HashSet hashSet2, int... iArr) {
        if (Collections.disjoint(hashSet, sgb.i(iArr))) {
            return !Collections.disjoint(hashSet2, r2);
        }
        return false;
    }

    @Override // defpackage.r3b
    public final v3e A() {
        return ((r3b) this.b).A();
    }

    @Override // defpackage.vm
    public final void C(cm cmVar) {
        opf opfVar = (opf) this.b;
        opfVar.a("showAd: onAdFailedToShow, error=" + cmVar);
        if (opfVar.c != null) {
            opfVar.c.onAdFailedToShow(rm5.q(cmVar.b, cmVar.c));
        }
        dhb dhbVar = opfVar.d;
        if (dhbVar != null) {
            dhbVar.P();
            opfVar.d = null;
        }
    }

    @Override // defpackage.r3b
    public final mzd D() {
        return ((r3b) this.b).D();
    }

    @Override // defpackage.r3b
    public final s5e E() {
        return ((r3b) this.b).E();
    }

    @Override // defpackage.nj8
    public final void F() {
        knh knhVar = (knh) this.b;
        cqp.r0(knhVar.w, new nnh(1));
        knhVar.g0();
    }

    @Override // defpackage.r3b
    public final i2h G() {
        return ((r3b) this.b).G();
    }

    @Override // defpackage.r3b
    public final u4i H() {
        return ((r3b) this.b).H();
    }

    @Override // defpackage.r3b
    public final i5e I() {
        return ((r3b) this.b).I();
    }

    @Override // defpackage.r3b
    public final v3e J() {
        return ((r3b) this.b).J();
    }

    @Override // defpackage.nj8
    public final void K() {
        y83 y83Var = ((knh) this.b).A;
        if (y83Var == null) {
            y83Var = null;
        }
        ((RecentlyClosedTabsSheetContentWrapper) y83Var.c).e();
    }

    @Override // defpackage.r3b
    public final ab7 L() {
        return ((r3b) this.b).L();
    }

    @Override // defpackage.r3b
    public final lrh M() {
        return ((r3b) this.b).M();
    }

    @Override // defpackage.r3b
    public final r5e N() {
        return ((r3b) this.b).N();
    }

    @Override // defpackage.r3b
    public final t9f O() {
        return ((r3b) this.b).O();
    }

    public final boolean P() {
        return true;
    }

    @Override // defpackage.a5a
    public final boolean Q(int i) {
        return true;
    }

    @Override // defpackage.r3b
    public final y5e R() {
        return ((r3b) this.b).R();
    }

    public final long S() {
        return 0L;
    }

    @Override // defpackage.pji
    public final void T() {
        pii piiVar = (pii) this.b;
        xvg.l(piiVar.I);
        piiVar.I = null;
        if (piiVar.u != null) {
            piiVar.L = false;
            if (piiVar.G.a() && piiVar.u.l == 2) {
                piiVar.L0();
            }
        }
    }

    @Override // defpackage.nj8
    public final void U(float f) {
        int i = 255 - ((int) (f * 255.0f));
        Drawable background = ((knh) this.b).k.getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
    }

    public final long V(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.nj8
    public final void W() {
        y83 y83Var = ((knh) this.b).A;
        if (y83Var == null) {
            y83Var = null;
        }
        ((RecentlyClosedTabsSheetContentWrapper) y83Var.c).e();
    }

    @Override // defpackage.rj2
    public final void Y() {
        myf myfVar = (myf) this.b;
        myfVar.f = new pi2(myfVar.c, myfVar.h, myfVar.g, new vdf(myfVar, (byte) 12), new kqd((Object) myfVar, (byte) 26));
    }

    public final void Z(int i, double d) {
        i32 i32Var = (i32) this.b;
        if (d == 0.0d) {
            return;
        }
        r7h r7hVarL = i32Var.l(i);
        r7hVarL.b += d;
        i32Var.g(new r7h(r7hVarL));
    }

    public final long a(long j, long j2) {
        return j2;
    }

    public final void a0(int i, View view) {
        if (view.isLaidOut()) {
            view.animate().alpha(0.0f).translationY(((View) view.getParent()).getHeight() - view.getTop()).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 2, view, this));
        } else {
            view.setVisibility(8);
        }
    }

    public final void b() {
        switch (this.a) {
            case SizeUtil.textSize0_1 /* 18 */:
                msh mshVar = (msh) this.b;
                mshVar.A.a = false;
                km5 km5Var = mshVar.A;
                Iterator it = new HashSet((HashSet) km5Var.d).iterator();
                while (it.hasNext()) {
                    ((ssh) it.next()).b();
                }
                ((HashSet) km5Var.d).clear();
                break;
            default:
                ((RoundedImageView) this.b).setImageDrawable(null);
                break;
        }
    }

    public final void b0(int i, View view) {
        view.animate().alpha(1.0f).translationY(0.0f).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 1, view, this));
    }

    @Override // defpackage.rj2
    public final void c0() {
        ((myf) this.b).b(8);
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int d() {
        return N.MMzOlmu8((WebContents) this.b);
    }

    public final double d0(int i, double d) {
        r7h r7hVarL = ((i32) this.b).l(i);
        double d2 = r7hVarL.b;
        if (d2 <= 0.6d) {
            return 0.0d;
        }
        double d3 = d * d2;
        if (d2 - d3 < 0.6d) {
            d3 = d2 - 0.6d;
        }
        if (d3 > 0.0d) {
            Z(r7hVarL.a, -d3);
        }
        return d3;
    }

    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        jsd jsdVar = (jsd) this.b;
        ero eroVar = new ero(jsdVar.getContext(), null, (byte) 0);
        jsdVar.a(eroVar);
        jsdVar.a.put(cieVar, eroVar);
        cieVar.w0 = eroVar;
        jsd.c(eroVar, cieVar);
    }

    public final void e0(Callback callback) {
        ffd ffdVar = (ffd) ((no7) this.b).i();
        if (ffdVar.isEmpty()) {
            ((LinkedHashSet) new p1(this).b).add(callback);
        } else {
            callback.run(ffdVar);
        }
    }

    @Override // defpackage.pji
    public final void f(PageRange[] pageRangeArr) {
        pii piiVar = (pii) this.b;
        umi umiVar = piiVar.s;
        xvg.l(piiVar.I);
        piiVar.I = null;
        if (piiVar.u == null) {
            return;
        }
        nml nmlVarB = umiVar.b(new t1(piiVar.getContext().getApplicationContext(), (byte) 15));
        nmlVarB.b(umiVar.f(new mgf((Object) piiVar, (Object) pageRangeArr, (byte) 20)));
        nmlVarB.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xsd f0(bza r17, defpackage.wsd r18, apj r19, lli r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lld.f0(bza, wsd, apj, lli):xsd");
    }

    @Override // defpackage.vm
    public final void g() {
        opf opfVar = (opf) this.b;
        opfVar.a("showAd: onAdDisplayed");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = opfVar.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // defpackage.r3b
    public final il5 getConfiguration() {
        return ((r3b) this.b).getConfiguration();
    }

    @Override // defpackage.r3b
    public final Context getContext() {
        return ((r3b) this.b).getContext();
    }

    public final long getTimeUs(long j) {
        return 0L;
    }

    @Override // defpackage.z8l
    public final String getUrl() {
        return ((NavigationEntry) this.b).getUrl();
    }

    @Override // defpackage.r3b
    public final p5e h() {
        return ((r3b) this.b).h();
    }

    public final boolean h0(CharSequence charSequence, xdg xdgVar) {
        String str = xdgVar.c;
        if (str.length() != 0) {
            Matcher matcher = ((yhe) this.b).m(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final NavigationEntry i(int i) {
        return (NavigationEntry) N.MR8hjCiA((WebContents) this.b, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wsd i0(bza r9, java.lang.Object r10, vrf r11, defpackage.y55 r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lld.i0(bza, java.lang.Object, vrf, y55):wsd");
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int j() {
        return N.M_4p2AnT((WebContents) this.b);
    }

    public final void j0(List list) {
        msh mshVar = (msh) this.b;
        km5 km5Var = mshVar.A;
        km5Var.a = false;
        km5Var.c = Collections.unmodifiableList(list);
        km5 km5Var2 = mshVar.A;
        Iterator it = new HashSet((HashSet) km5Var2.d).iterator();
        while (it.hasNext()) {
            ((ssh) it.next()).a();
        }
        ((HashSet) km5Var2.d).clear();
    }

    public final long k(long j, long j2) {
        return 0L;
    }

    public final void k0(CharSequence charSequence) {
        ((PrintDocumentAdapter.WriteResultCallback) this.b).onWriteFailed(charSequence);
    }

    public final g3o l0(View view, g3o g3oVar) {
        jvj jvjVar = (jvj) this.b;
        int i = g3oVar.a.i(8).d;
        if (!jvjVar.b.isInMultiWindowMode()) {
            boolean z = ((float) i) > jvjVar.c;
            if (jvjVar.d != z) {
                jvjVar.d = z;
                jvjVar.a(z);
                return g3oVar;
            }
        } else if (jvjVar.d) {
            jvjVar.d = false;
            jvjVar.a(false);
            return g3oVar;
        }
        return g3oVar;
    }

    public final long m(long j, long j2) {
        return -9223372036854775807L;
    }

    public final rn9 m0(k5o k5oVar, v31 v31Var) {
        long j;
        boolean z;
        long jN;
        j1d j1dVar = (j1d) this.b;
        j1d j1dVar2 = new j1d(((ArrayList) k5oVar.b).size());
        ArrayList arrayList = (ArrayList) k5oVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            nmg nmgVar = (nmg) arrayList.get(i);
            long j2 = nmgVar.a;
            mmg mmgVar = (mmg) j1dVar.c(j2);
            if (mmgVar == null) {
                j = nmgVar.b;
                jN = nmgVar.d;
                z = false;
            } else {
                long j3 = mmgVar.a;
                j = j3;
                z = mmgVar.c;
                jN = v31Var.N(mmgVar.b);
            }
            long j4 = nmgVar.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            j1dVar2.g(j4, new lmg(j4, nmgVar.b, nmgVar.d, nmgVar.e, nmgVar.f, j, jN, z, nmgVar.g, nmgVar.i, nmgVar.j, nmgVar.k, nmgVar.l, nmgVar.m));
            boolean z2 = nmgVar.e;
            if (z2) {
                j1dVar.g(j2, new mmg(nmgVar.b, nmgVar.c, z2));
            } else {
                j1dVar.i(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new rn9((Object) j1dVar2, (Object) k5oVar, (byte) 20);
    }

    public final bjh n(long j) {
        return (bjh) this.b;
    }

    @Override // defpackage.nj8
    public final void n0(float f) {
    }

    @Override // defpackage.r3b
    public final b6e o() {
        return ((r3b) this.b).o();
    }

    public final void o0(hcj hcjVar) {
        b2b b2bVar;
        Context context;
        ArrayList<? extends Parcelable> arrayList = hcjVar.f;
        mcj mcjVar = (mcj) this.b;
        WindowAndroid windowAndroidK0 = (WindowAndroid) mcjVar.b;
        if (windowAndroidK0 == null || windowAndroidK0.e != null) {
            windowAndroidK0 = ((WebContents) mcjVar.a).k0();
            mcjVar.b = windowAndroidK0;
        }
        if (windowAndroidK0 == null || (b2bVar = windowAndroidK0.f) == null || (context = (Context) b2bVar.get()) == null) {
            return;
        }
        String str = hcjVar.e;
        String str2 = hcjVar.b;
        boolean z = arrayList != null && arrayList.size() > 1;
        Intent intent = new Intent(z ? "android.intent.action.SEND_MULTIPLE" : "android.intent.action.SEND");
        intent.addFlags(319291392);
        intent.putExtra("org.chromium.chrome.browser.share_origin", 0);
        intent.putExtra("org.chromium.chrome.extra.TASK_ID", ((Activity) hcjVar.a.m().get()).getTaskId());
        Uri uri = (arrayList == null || arrayList.size() <= 0 || str == null || !str.startsWith("image")) ? null : (Uri) arrayList.get(0);
        if (uri == null || z) {
            if (!TextUtils.equals(hcjVar.b(), str2)) {
                intent.putExtra("android.intent.extra.SUBJECT", str2);
            }
            intent.putExtra("android.intent.extra.TEXT", hcjVar.b());
            if (arrayList != null) {
                intent.setType(str);
                intent.addFlags(1);
                if (z) {
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                } else {
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
                }
            } else {
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TITLE", str2);
            }
        } else {
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
            ContentResolver contentResolver = t8.a.getContentResolver();
            intent.setType(contentResolver.getType(uri));
            intent.setClipData(ClipData.newUri(contentResolver, null, uri));
            if (!TextUtils.isEmpty(hcjVar.b())) {
                intent.putExtra("android.intent.extra.TEXT", hcjVar.b());
            }
        }
        new ghf(new i4d((Object) intent, (byte) 26)).I(context);
    }

    @Override // defpackage.vm
    public final void onAdClicked() {
        opf opfVar = (opf) this.b;
        opfVar.a("showAd: onAdClicked");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = opfVar.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // defpackage.vm
    public final void onAdDismissed() {
        opf opfVar = (opf) this.b;
        opfVar.a("showAd: onAdDismissed");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = opfVar.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
        dhb dhbVar = opfVar.d;
        if (dhbVar != null) {
            dhbVar.P();
            opfVar.d = null;
        }
    }

    @Override // defpackage.vm
    public final void onAdOpened() {
        opf opfVar = (opf) this.b;
        opfVar.a("showAd: onAdOpened");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = opfVar.c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    public final void onSuccess() {
    }

    @Override // defpackage.r3b
    public final x3e p() {
        return ((r3b) this.b).p();
    }

    public final void p0() {
        hld hldVar = (hld) this.b;
        int alpha = (int) ((1.0f - hldVar.j.getAlpha()) * 150.0f);
        b0(alpha, hldVar.j);
        b0(alpha, hldVar.k);
        b0(alpha, hldVar.s);
        b0(alpha, hldVar.f);
        b0(alpha, hldVar.g);
    }

    @Override // defpackage.a5a
    public final z4a q(int i) {
        int size = ((ArrayList) ((vxi) this.b).e).size();
        return size == 1 ? z4a.d : i == 0 ? z4a.a : i == size - 1 ? z4a.b : z4a.c;
    }

    public final long r(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.r3b
    public final a4e s() {
        return ((r3b) this.b).s();
    }

    @Override // defpackage.r3b
    public final u3e t() {
        return ((r3b) this.b).t();
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            case 19:
                return super.toString() + "{fragment=" + ((lwh) this.b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final boolean v(int i) {
        return N.M5JRnMU2((WebContents) this.b, i);
    }

    public final v7e w(d5o d5oVar) {
        return new fc2((Resources) this.b, d5oVar.r(Uri.class, AssetFileDescriptor.class));
    }

    @Override // defpackage.r3b
    public final a2e x() {
        return ((r3b) this.b).x();
    }

    @Override // defpackage.r3b
    public final m3i y() {
        return ((r3b) this.b).y();
    }

    public final long z(long j) {
        return 1L;
    }
}
