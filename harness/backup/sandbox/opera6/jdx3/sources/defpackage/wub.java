package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.tech.NdefFormatable;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.MessageDisplayController;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.OperaConfigBundleSheet;
import com.leanplum.messagetemplates.UtilsKt;
import com.opera.ad.mraid.MRAIDView;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.PageDotIndicator;
import com.opera.android.settings.SettingsManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.chromium.base.TraceEvent;
import org.chromium.content_public.browser.MediaSession;

/* loaded from: classes.dex */
public final class wub implements hti, kkd, hsd, hc2, bwe, MessageDisplayController, vm, vwf, qc6, InstallReferrerStateListener, elf, s87, sth, zqb {
    public static wub b;
    public Object a;

    public wub(byte b2) {
        switch (b2) {
            case 28:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public wub(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new qfb((Object) parcelFileDescriptor, (byte) 19);
    }

    public wub(BrowserActivity browserActivity, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, bvl bvlVar) {
        this.a = statusBarDrawingFrameLayout;
        q9n.f(statusBarDrawingFrameLayout, new lzb(this, (byte) 10));
        bvlVar.F().j(browserActivity, new iwa(new rkc((Object) this, (byte) 11), (byte) 7));
    }

    public wub(d4d d4dVar, int i) {
        this.a = new p8f[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((p8f[]) this.a)[i2] = new p8f(d4dVar);
        }
    }

    public /* synthetic */ wub(Object obj) {
        this.a = obj;
    }

    public wub(rpb rpbVar) {
        this.a = rpbVar;
        if (rpbVar instanceof rpb) {
            return;
        }
        j9h.t(rpbVar, " is not supported.", "Only binary and string formats are supported, ");
        throw null;
    }

    public static wub D() {
        wub wubVar = b;
        if (wubVar != null) {
            return wubVar;
        }
        wub wubVar2 = new wub();
        N(TraceEvent.n("NotificationManagerProxyImpl()", (String) null), new yqd(wubVar2, (byte) 22));
        b = wubVar2;
        return wubVar2;
    }

    public static void N(TraceEvent traceEvent, Runnable runnable) {
        try {
            try {
                runnable.run();
                if (traceEvent != null) {
                    traceEvent.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final void A(String str) {
        N(TraceEvent.n("NotificationManagerProxyImpl.deleteNotificationChannel", (String) null), new m2f(this, str, (byte) 1));
    }

    public final void B(String str) {
        s14 s14Var;
        pyl pylVar = ((dvc) this.a).r;
        hu5 hu5Var = new hu5((Object) this, (Object) str, (byte) 22);
        int i = pylVar.b + 1;
        pylVar.b = i;
        ArrayList arrayList = new ArrayList((ArrayList) ((x77) pylVar.c).c);
        if (TextUtils.isEmpty(str) || (s14Var = (s14) pylVar.d) == null) {
            pylVar.f = null;
            hu5Var.run(arrayList);
            return;
        }
        pylVar.f = hu5Var;
        so4 so4Var = new so4((Object) pylVar, i, (Object) arrayList, (byte) 4);
        Uri.Builder builder = (Uri.Builder) s14Var.d;
        String string = builder.appendQueryParameter(Constants.Keys.COUNTRY, (String) s14Var.e).appendQueryParameter("language", (String) s14Var.f).appendQueryParameter("query", str).toString();
        builder.clearQuery();
        ((ywh) s14Var.c).a(new z7(string), new k82(s14Var, so4Var));
    }

    @Override // defpackage.vm
    public final void C(cm cmVar) {
        mpf mpfVar = (mpf) this.a;
        mpfVar.a("showAd: onAdFailedToShow, error=" + cmVar);
        if (mpfVar.c != null) {
            mpfVar.c.onAdFailedToShow(rm5.q(cmVar.b, cmVar.c));
        }
        vt1 vt1Var = mpfVar.d;
        if (vt1Var != null) {
            vt1Var.P();
            mpfVar.d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    public final jnf E(Class cls) throws ClassNotFoundException {
        jnf next;
        Iterator it = ((HashSet) this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (cls.isAssignableFrom(((jnf) next).getClass())) {
                break;
            }
        }
        jnf jnfVar = next instanceof jnf ? next : null;
        if (jnfVar != null) {
            return jnfVar;
        }
        throw new ClassNotFoundException("Navigation class not registered");
    }

    public final List F() {
        TraceEvent traceEventN = TraceEvent.n("NotificationManagerProxyImpl.getNotificationChannels", (String) null);
        try {
            List<NotificationChannel> notificationChannels = ((l2f) this.a).b.getNotificationChannels();
            if (traceEventN != null) {
                traceEventN.close();
            }
            return notificationChannels;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void G() {
        int i;
        int i2 = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i2 >= p8fVarArr.length) {
                return;
            }
            int[] iArr = (int[]) p8fVarArr[i2].b;
            int i3 = 256;
            for (int i4 = 1; i4 < 256; i4 <<= 1) {
                for (int i5 = 0; i5 < 256; i5 = i + i4) {
                    i3--;
                    int i6 = cqp.h[i3] * (-1);
                    i = i5;
                    while (i < i5 + i4) {
                        int i7 = iArr[i];
                        int i8 = i + i4;
                        iArr[i] = iArr[i8] + i7;
                        int i9 = i7 - iArr[i8];
                        iArr[i8] = i9;
                        iArr[i8] = hyg.j(i6 * i9);
                        i++;
                    }
                }
            }
            for (int i10 = 0; i10 < 256; i10++) {
                iArr[i10] = hyg.j(iArr[i10] * 41978);
            }
            i2++;
        }
    }

    public final void H(i16 i16Var) {
        if (i16Var == null || ((Notification) i16Var.b) == null) {
            return;
        }
        N(TraceEvent.n("NotificationManagerProxyImpl.notify(notification)", (String) null), new hpd(this, i16Var, (byte) 20));
    }

    public final void I() {
        int i;
        int i2 = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i2 >= p8fVarArr.length) {
                return;
            }
            int[] iArr = (int[]) p8fVarArr[i2].b;
            int i3 = 0;
            for (int i4 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL; i4 > 0; i4 >>>= 1) {
                for (int i5 = 0; i5 < 256; i5 = i + i4) {
                    i3++;
                    int i6 = cqp.h[i3];
                    i = i5;
                    while (i < i5 + i4) {
                        int iJ = hyg.j(i6 * iArr[r10]);
                        iArr[i + i4] = iArr[i] - iJ;
                        iArr[i] = iArr[i] + iJ;
                        i++;
                    }
                }
            }
            i2++;
        }
    }

    public final void J(wub wubVar) {
        int i = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i >= p8fVarArr.length) {
                return;
            }
            p8f p8fVar = p8fVarArr[i];
            p8f p8fVar2 = ((p8f[]) wubVar.a)[i];
            int[] iArr = (int[]) p8fVar.b;
            int[] iArr2 = (int[]) p8fVar2.b;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                int i4 = i3 + 4095;
                iArr[i2] = i4 >> 13;
                iArr2[i2] = i3 - (i4 & (-8192));
            }
            i++;
        }
    }

    public final void K() {
        int i = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i >= p8fVarArr.length) {
                return;
            }
            int[] iArr = (int[]) p8fVarArr[i].b;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                iArr[i2] = i3 - (((4194304 + i3) >> 23) * 8380417);
            }
            i++;
        }
    }

    public final void L(jnf jnfVar) {
        ((HashSet) this.a).add(jnfVar);
    }

    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor h() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((qfb) this.a).b;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            t3p.r(e);
            return null;
        }
    }

    public final void O(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            qp2.o("Failed requirement.");
        } else {
            linkedHashMap.put(str, qqb.c(str2));
        }
    }

    public final void P() {
        ((hld) this.a).e.animate().alpha(1.0f).setDuration((int) ((1.0f - r3.e.getAlpha()) * 150.0f)).setInterpolator(lf1.a);
    }

    public final void Q(short s, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i2 >= p8fVarArr.length) {
                return;
            }
            p8f p8fVar = p8fVarArr[i2];
            short s2 = (short) (s + 1);
            vci vciVar = (vci) ((iuh) p8fVar.d).c;
            byte b2 = ((d4d) p8fVar.c).e;
            if (b2 == 2) {
                i = 1;
            } else {
                if (b2 != 4) {
                    h9o.r("Wrong Dilithium Eta!");
                    return;
                }
                i = 2;
            }
            int i3 = i * 136;
            byte[] bArr2 = new byte[i3];
            vciVar.reset();
            vciVar.g(0, bArr.length, bArr);
            vciVar.g(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
            vciVar.p(0, i3, bArr2);
            for (int iA = p8f.A(p8fVar, 0, Constants.Crypt.KEY_LENGTH, bArr2, i3, b2); iA < 256; iA += p8f.A(p8fVar, iA, 256 - iA, bArr2, 136, b2)) {
                vciVar.p(0, 136, bArr2);
            }
            i2++;
            s = s2;
        }
    }

    public final void a() {
        MediaSession mediaSession;
        ard ardVar = (ard) this.a;
        k03 k03Var = ardVar.u;
        k03Var.a = -1L;
        k03Var.b = -1L;
        if (ardVar.e() || (mediaSession = ardVar.j.a) == null) {
            return;
        }
        mediaSession.f();
    }

    public final void b(int i) {
        zqd zqdVar;
        if (i < 0 || i > 21 || (zqdVar = ((ard) this.a).j) == null) {
            return;
        }
        zqdVar.a.b(i);
    }

    public final void c() {
    }

    public final void d() {
        MediaSession mediaSession;
        ard ardVar = (ard) this.a;
        k03 k03Var = ardVar.u;
        k03Var.a = -1L;
        k03Var.b = -1L;
        if (ardVar.e() || (mediaSession = ardVar.j.a) == null) {
            return;
        }
        mediaSession.g();
    }

    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        aoo y9pVar;
        lxo lxoVar = cieVar.Z;
        jsd jsdVar = (jsd) this.a;
        HashMap map = jsdVar.a;
        fjo fjoVar = (fjo) map.get(cieVar);
        if (fjoVar instanceof aoo) {
            y9pVar = (aoo) fjoVar;
        } else {
            if (njo.a.matcher((String) lxoVar.s.a()).find()) {
                y9pVar = new MRAIDView(jsdVar.getContext());
            } else {
                try {
                    y9pVar = new y9p(jsdVar.getContext(), lxoVar.p);
                } catch (UnsupportedOperationException unused) {
                    return;
                }
            }
            jsd.d(y9pVar, cieVar, new tvk(lxoVar));
        }
        upj.j(y9pVar);
        jsdVar.a(y9pVar);
        cieVar.w0 = y9pVar;
        if (!map.containsKey(cieVar)) {
            map.put(cieVar, y9pVar);
            if (y9pVar instanceof MRAIDView) {
                MRAIDView mRAIDView = (MRAIDView) y9pVar;
                String str = (String) lxoVar.s.a();
                Pattern pattern = njo.a;
                StringBuffer stringBuffer = new StringBuffer(str);
                Matcher matcher = njo.a.matcher(stringBuffer);
                if (matcher.find()) {
                    stringBuffer.replace(matcher.start(), matcher.end(), "<script src=\"https://img-odx.op-mobile.opera.com/a/js/mraid.js\"></script>");
                }
                mRAIDView.u.loadData(stringBuffer.toString(), "text/html", "UTF-8");
                return;
            }
            return;
        }
        if (y9pVar instanceof y9p) {
            y9p y9pVar2 = (y9p) y9pVar;
            dcl dclVar = y9pVar2.u;
            y9pVar2.addView(((dzo) dclVar.a).c, new FrameLayout.LayoutParams(-1, -1));
            dclVar.i();
            return;
        }
        b5d b5dVar = ((MRAIDView) y9pVar).u;
        if (b5dVar == null || !b5dVar.a) {
            return;
        }
        b5dVar.toString();
        b5dVar.onResume();
        b5dVar.a = false;
    }

    public final boolean f() throws IOException, FormatException {
        try {
            ((NdefFormatable) this.a).formatReadOnly(new NdefMessage(new NdefRecord((short) 0, null, null, null), new NdefRecord[0]));
            return true;
        } catch (FormatException unused) {
            return false;
        }
    }

    @Override // defpackage.vm
    public final void g() {
        mpf mpfVar = (mpf) this.a;
        mpfVar.a("showAd: onAdDisplayed");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = mpfVar.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    public final void i(long j) {
        zqd zqdVar = ((ard) this.a).j;
        if (zqdVar == null) {
            return;
        }
        zqdVar.a.e(j);
    }

    public final boolean j() {
        return true;
    }

    @Override // defpackage.sth
    public final b k() {
        return new c((LinkedHashMap) this.a);
    }

    public final void l() {
        MediaSession mediaSession;
        ard ardVar = (ard) this.a;
        if (ardVar.e() || (mediaSession = ardVar.j.a) == null) {
            return;
        }
        mediaSession.d();
    }

    @Override // defpackage.vwf
    public final void m() {
        ((PageDotIndicator) this.a).requestLayout();
    }

    public final void n(NdefMessage ndefMessage) throws IOException, FormatException {
        ((NdefFormatable) this.a).format(ndefMessage);
    }

    @Override // defpackage.vwf
    public final void o() {
        ((PageDotIndicator) this.a).invalidate();
    }

    @Override // defpackage.vm
    public final void onAdClicked() {
        mpf mpfVar = (mpf) this.a;
        mpfVar.a("showAd: onAdClicked");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = mpfVar.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // defpackage.vm
    public final void onAdDismissed() {
        mpf mpfVar = (mpf) this.a;
        mpfVar.a("showAd: onAdDismissed");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = mpfVar.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        vt1 vt1Var = mpfVar.d;
        if (vt1Var != null) {
            vt1Var.P();
            mpfVar.d = null;
        }
    }

    @Override // defpackage.vm
    public final void onAdOpened() {
        mpf mpfVar = (mpf) this.a;
        mpfVar.a("showAd: onAdOpened");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = mpfVar.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    public final void onInstallReferrerServiceDisconnected() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInstallReferrerSetupFinished(int r5) {
        /*
            r4 = this;
            java.lang.Object r4 = r4.a
            khg r4 = (defpackage.khg) r4
            com.android.installreferrer.api.InstallReferrerClient r0 = r4.b
            g9 r4 = r4.a
            hg0 r1 = defpackage.hg0.b
            r2 = 0
            if (r5 == 0) goto L26
            r3 = 1
            if (r5 == r3) goto L20
            r3 = 2
            if (r5 == r3) goto L1a
            r3 = 4
            if (r5 == r3) goto L20
            r4.invoke(r1, r2)
            goto L33
        L1a:
            hg0 r5 = defpackage.hg0.c
            r4.invoke(r5, r2)
            goto L33
        L20:
            hg0 r5 = defpackage.hg0.d
            r4.invoke(r5, r2)
            goto L33
        L26:
            com.android.installreferrer.api.ReferrerDetails r5 = r0.getInstallReferrer()     // Catch: android.os.RemoteException -> L2e
            r4.invoke(r1, r5)     // Catch: android.os.RemoteException -> L2e
            goto L33
        L2e:
            hg0 r5 = defpackage.hg0.e
            r4.invoke(r5, r2)
        L33:
            r0.endConnection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wub.onInstallReferrerSetupFinished(int):void");
    }

    @Override // defpackage.elf
    public final void onProgress(int i) {
        hch hchVar = (hch) this.a;
        if (i == 0) {
            hchVar.c.s(-1, 157, 236, null);
            nu5 nu5Var = hchVar.d;
            nu5Var.b.removeCallbacks(nu5Var);
            nu5Var.d = 0.8f;
            nu5Var.run();
        }
    }

    public final void p(String str) {
        if (str == null) {
            str = "";
        }
        B(str);
    }

    public final Object q(Object obj, Object obj2) {
        mhe mheVar = (mhe) this.a;
        knm knmVar = mheVar.a;
        t5h t5hVar = knmVar.a;
        List list = mheVar.b;
        Integer num = (Integer) t5hVar.q(obj, Integer.valueOf(list.indexOf((String) obj2) + (knmVar.b ? 1 : 0)));
        if (num != null) {
            return (String) list.get(num.intValue() - (knmVar.b ? 1 : 0));
        }
        return null;
    }

    public final boolean r(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.n.canScrollVertically()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.canScrollHorizontally()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.L0();
        return recyclerView.P(i, i2, 0, Integer.MAX_VALUE);
    }

    public final NdefMessage read() {
        return new NdefMessage(new NdefRecord((short) 0, null, null, null), new NdefRecord[0]);
    }

    @Override // com.leanplum.MessageDisplayController
    public final List reorderPriorityZeroMessages(List list) {
        return list;
    }

    public final float s() {
        float f;
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.n.canScrollVertically()) {
            f = recyclerView.c0;
        } else {
            if (!recyclerView.n.canScrollHorizontally()) {
                return 0.0f;
            }
            f = recyclerView.b0;
        }
        return -f;
    }

    @Override // com.leanplum.MessageDisplayController
    public final boolean shouldDisplayMessage(ActionContext actionContext) {
        if (!Leanplum.hasStarted()) {
            return false;
        }
        if (actionContext.actionName().equals(OperaConfigBundleSheet.NAME)) {
            return true;
        }
        Set<String> categories = UtilsKt.getCategories(actionContext);
        if (categories.isEmpty()) {
            return true;
        }
        h58 h58Var = xsk.g;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            xsk xskVar = (xsk) w4VarE.next();
            if (categories.contains(xskVar.a) && !((SettingsManager) this.a).i(xskVar.b)) {
                return false;
            }
        }
        return true;
    }

    public final void t() {
        ((RecyclerView) this.a).L0();
    }

    public final void u(wub wubVar) {
        int i = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i >= p8fVarArr.length) {
                return;
            }
            p8f p8fVar = p8fVarArr[i];
            p8f p8fVar2 = ((p8f[]) wubVar.a)[i];
            int[] iArr = (int[]) p8fVar.b;
            int[] iArr2 = (int[]) p8fVar2.b;
            for (int i2 = 0; i2 < 256; i2++) {
                iArr[i2] = iArr[i2] + iArr2[i2];
            }
            i++;
        }
    }

    public final void v(String str) {
        if (str == null) {
            str = "";
        }
        B(str);
    }

    public final void w() {
        int i = 0;
        while (true) {
            p8f[] p8fVarArr = (p8f[]) this.a;
            if (i >= p8fVarArr.length) {
                return;
            }
            int[] iArr = (int[]) p8fVarArr[i].b;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            i++;
        }
    }

    public final void x(NotificationChannel notificationChannel) {
        N(TraceEvent.n("NotificationManagerProxyImpl.createNotificationChannel", (String) null), new hpd(this, notificationChannel, (byte) 18));
    }

    public final void y(NotificationChannelGroup notificationChannelGroup) {
        N(TraceEvent.n("NotificationManagerProxyImpl.createNotificationChannelGroup", (String) null), new hpd(this, notificationChannelGroup, (byte) 19));
    }

    public final void z(orb orbVar) {
        ((ilm) this.a).run(orbVar.a.toString());
    }
}
