package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Magnifier;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.live_score.LiveCommentaryService;
import com.opera.android.live_score.LivescoreSheetContentWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import org.chromium.device.nfc.NfcDelegate;

/* loaded from: classes.dex */
public final class qfb implements ekg, nj8, btj, qld, hsd, ubk, s87, oeb, cn, fie, m82, hvh {
    public final /* synthetic */ byte a;
    public final Object b;

    public qfb(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new mxb();
                break;
            case SizeUtil.textSize1 /* 22 */:
                this.b = new short[Constants.Crypt.KEY_LENGTH];
                break;
            case 27:
                this.b = new qie((byte) 12);
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public qfb(Context context) {
        this.a = (byte) 0;
        this.b = new v61(context);
    }

    public qfb(OmniBoxRoot omniBoxRoot, wub wubVar, bp bpVar) {
        this.a = (byte) 16;
        this.b = new EnumMap(vaf.class);
        for (vaf vafVar : vaf.values()) {
            int i = vafVar.a;
            WeakHashMap weakHashMap = r5n.a;
            OmniButtonView omniButtonView = (OmniButtonView) ((View) m5n.f(omniBoxRoot, i));
            omniButtonView.c(wubVar);
            omniButtonView.j = bpVar;
            ((EnumMap) this.b).put((EnumMap) vafVar, (vaf) omniButtonView);
        }
    }

    public /* synthetic */ qfb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qfb(String str, b[] bVarArr) {
        this.a = (byte) 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bVarArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (b bVar : bVarArr) {
                arrayList.add(bVar);
            }
        }
        c cVar = new c(linkedHashMap);
        d dVar = hsb.a;
        boolean zContainsKey = cVar.containsKey("jsonrpc");
        boolean zContainsKey2 = cVar.containsKey("id");
        if (!zContainsKey || (!zContainsKey2 && dVar != null)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (dVar != null) {
            }
            cVar = new c(rbd.e(new c(linkedHashMap2), cVar));
        }
        this.b = cVar;
    }

    public qfb(kw3 kw3Var, kw3 kw3Var2, qii qiiVar) {
        this.a = (byte) 24;
        this.b = kw3Var2;
    }

    public qfb(qsh qshVar, yqa yqaVar) {
        this.a = (byte) 28;
        this.b = yqaVar;
        Objects.requireNonNull(qshVar);
    }

    public final void A(i iVar, fr frVar, fr frVar2) {
        int top;
        int left;
        boolean zN;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.m(iVar);
        recyclerView.l(iVar);
        iVar.setIsRecyclable(false);
        xkj xkjVar = (xkj) recyclerView.M;
        xkjVar.getClass();
        int i = frVar.b;
        int i2 = frVar.c;
        View view = iVar.itemView;
        if (frVar2 == null) {
            left = view.getLeft();
            top = view.getTop();
        } else {
            int i3 = frVar2.b;
            top = frVar2.c;
            left = i3;
        }
        if (iVar.isRemoved() || (i == left && i2 == top)) {
            zN = xkjVar.n(iVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zN = xkjVar.m(iVar, i, i2, left, top);
        }
        if (zN) {
            recyclerView.j0();
        }
    }

    public final void B() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.b;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((s * 20159) >> 26)) * 3329)));
        }
    }

    @Override // defpackage.nj8
    public final void F() {
        ((lrc) this.b).g0();
    }

    @Override // defpackage.btj
    public final void I() {
        ((i7d) this.b).n.I();
    }

    @Override // defpackage.nj8
    public final void K() {
        or2 or2Var = ((lrc) this.b).B;
        if (or2Var == null) {
            or2Var = null;
        }
        ((LivescoreSheetContentWrapper) or2Var.d).e();
    }

    @Override // defpackage.nj8
    public final void U(float f) {
        int i = 255 - ((int) (f * 255.0f));
        Drawable background = ((lrc) this.b).k.getBackground();
        if (background != null) {
            background.setAlpha(i);
        }
    }

    @Override // defpackage.nj8
    public final void W() {
        or2 or2Var = ((lrc) this.b).B;
        if (or2Var == null) {
            or2Var = null;
        }
        ((LivescoreSheetContentWrapper) or2Var.d).e();
    }

    @Override // defpackage.hvh
    public final void a(k43 k43Var, boolean z) {
        uwh uwhVar = (uwh) this.b;
        uwhVar.d(k43Var, z);
        uwhVar.b.b(k43Var);
        if (z) {
            uwhVar.a(k43Var, Integer.MAX_VALUE);
        }
    }

    public final OmniButtonView b(vaf vafVar) {
        return (OmniButtonView) ((EnumMap) this.b).get(vafVar);
    }

    public final void c() {
        ppf ppfVar = (ppf) ((r9i) this.b).e;
        ppfVar.a("loadAd: onAdImpression");
        MediationNativeAdCallback mediationNativeAdCallback = ppfVar.v;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // defpackage.qld
    public final void d() {
        ((hld) this.b).c.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hsd
    public final void e(cie cieVar) {
        jsd jsdVar = (jsd) this.b;
        fro kjoVar = null;
        ero eroVar = new ero(jsdVar.getContext(), 0 == true ? 1 : 0, (byte) 1);
        jsdVar.a(eroVar);
        jsdVar.a.put(cieVar, eroVar);
        cieVar.w0 = eroVar;
        jsd.c(eroVar, cieVar);
        y46 y46Var = (y46) eroVar.v;
        y46Var.b = cieVar;
        if (y46Var.getChildCount() > 0) {
            y46Var.removeAllViews();
        }
        w06 w06Var = ((cie) y46Var.b).d;
        if (w06.i == w06Var) {
            kjoVar = new jjo(y46Var.getContext());
            ((cie) y46Var.b).getClass();
        } else if (w06.j == w06Var) {
            kjoVar = new kjo(y46Var.getContext());
        }
        y46Var.c = kjoVar;
        if (kjoVar == null) {
            return;
        }
        Context context = y46Var.getContext();
        int i = g1p.a;
        y46Var.addView(kjoVar.a(context), new FrameLayout.LayoutParams(-1, -2));
        ((fro) y46Var.c).e((cie) y46Var.b);
    }

    public final void f(boolean z) {
        nak nakVar = cs6.c;
        nakVar.getClass();
        nakVar.k((Object) null, xjc.a);
        ((LiveCommentaryService) this.b).stopSelf();
    }

    public final void g(cm cmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 17:
                mpf mpfVar = (mpf) ((ghf) obj).d;
                mpfVar.a("loadAd: onAdFailedToLoad, error=" + cmVar);
                mpfVar.a.onFailure(rm5.q(cmVar.b, cmVar.c));
                break;
            default:
                ppf ppfVar = (ppf) ((r9i) obj).e;
                ppfVar.a("loadAd: onAdFailedToLoad, error=" + cmVar);
                if (!ppfVar.y) {
                    ppfVar.t.onFailure(rm5.q(cmVar.b, cmVar.c));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hvh
    public final void h(k43 k43Var) {
        uwh uwhVar = (uwh) this.b;
        uwhVar.d(k43Var, false);
        uwhVar.b.b(k43Var);
    }

    @Override // defpackage.ubk
    public final void i(r rVar) {
        ubk[] ubkVarArr = (ubk[]) this.b;
        for (int i = 0; i < 5; i++) {
            ubkVarArr[i].i(rVar);
        }
    }

    public final void j(Notification notification, int i) {
        LiveCommentaryService liveCommentaryService = (LiveCommentaryService) this.b;
        if (Build.VERSION.SDK_INT >= 34) {
            liveCommentaryService.startForeground(i, notification, 2);
        } else {
            liveCommentaryService.startForeground(i, notification, 2);
        }
    }

    @Override // defpackage.m82
    public final void k(n82 n82Var, List list) {
        yqa yqaVar = (yqa) this.b;
        uqe uqeVar = (uqe) yqaVar.c;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oqe oqeVar = (oqe) it.next();
            if (oqeVar instanceof msh) {
                msh mshVar = (msh) oqeVar;
                ta7 ta7Var = uqeVar.v;
                String strB = mshVar.b();
                Set setO = w1h.o(ta7Var.s(), "blacklisted_news_domains", (Set) null);
                if (setO == null) {
                    setO = Collections.EMPTY_SET;
                }
                if (!setO.contains(strB)) {
                    uqeVar.r.add(mshVar);
                }
            }
            arrayList.add(oqeVar);
        }
        ((lld) yqaVar.b).j0(arrayList);
    }

    public final void l(vci vciVar, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL];
        vciVar.g(32, 32, bArr);
        vciVar.a(b);
        vciVar.o(0, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL, bArr2);
        for (int i = 0; i < 32; i++) {
            int iQ0 = sfe.q0(i << 2, bArr2);
            int i2 = (iQ0 & 1431655765) + ((iQ0 >>> 1) & 1431655765);
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 << 2;
                ((short[]) this.b)[(i << 3) + i3] = (short) (((short) ((i2 >>> i4) & 3)) - ((short) ((i2 >>> (i4 + 2)) & 3)));
            }
        }
    }

    @Override // defpackage.ubk
    public final void m(r rVar) {
        ubk[] ubkVarArr = (ubk[]) this.b;
        for (int i = 0; i < 5; i++) {
            ubkVarArr[i].m(rVar);
        }
    }

    @Override // defpackage.ubk
    public final void n(long j, boolean z) {
        ubk[] ubkVarArr = (ubk[]) this.b;
        for (int i = 0; i < 5; i++) {
            ubkVarArr[i].n(j, z);
        }
    }

    @Override // defpackage.nj8
    public final void n0(float f) {
    }

    public final void o(vci vciVar, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK];
        vciVar.g(32, 32, bArr);
        vciVar.a(b);
        vciVar.o(0, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, bArr2);
        for (int i = 0; i < 64; i++) {
            int i2 = i * 3;
            int i3 = (bArr2[i2] & 255) | ((bArr2[i2 + 1] & 255) << 8) | ((bArr2[i2 + 2] & 255) << 16);
            int i4 = (i3 & 2396745) + ((i3 >>> 1) & 2396745) + ((i3 >>> 2) & 2396745);
            for (int i5 = 0; i5 < 4; i5++) {
                int i6 = i5 * 6;
                ((short[]) this.b)[(i << 2) + i5] = (short) (((short) ((i4 >>> i6) & 7)) - ((short) ((i4 >>> (i6 + 3)) & 7)));
            }
        }
    }

    public final void onAdClicked() {
        ppf ppfVar = (ppf) ((r9i) this.b).e;
        ppfVar.a("loadAd: onAdClicked");
        MediationNativeAdCallback mediationNativeAdCallback = ppfVar.v;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    public final void onAdLoaded(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 17:
                mpf mpfVar = (mpf) ((ghf) obj2).d;
                mpfVar.a("loadAd: onAdLoaded");
                mpfVar.d = (vt1) obj;
                mpfVar.c = (MediationAppOpenAdCallback) mpfVar.a.onSuccess(mpfVar);
                break;
            default:
                bie bieVar = (bie) obj;
                r9i r9iVar = (r9i) obj2;
                ppf ppfVar = (ppf) r9iVar.e;
                ppfVar.a("loadAd: onAdLoaded");
                if (!ppfVar.y) {
                    ppfVar.w = bieVar;
                    ppfVar.x = new ksd((Context) r9iVar.c);
                    c4p c4pVarJ = bieVar.b().j();
                    String str = c4pVarJ != null ? (String) c4pVarJ.i.getValue() : null;
                    if (!TextUtils.isEmpty(str)) {
                        ppfVar.setHeadline(str);
                    }
                    qhe qheVar = (qhe) bieVar.e.getValue();
                    if (qheVar != null) {
                        ppfVar.setIcon(new fnf(qheVar));
                    }
                    String strC = bieVar.c();
                    if (!TextUtils.isEmpty(strC)) {
                        ppfVar.setBody(strC);
                    }
                    c4p c4pVarJ2 = bieVar.b().j();
                    String str2 = c4pVarJ2 != null ? (String) c4pVarJ2.n.getValue() : null;
                    if (!TextUtils.isEmpty(str2)) {
                        ppfVar.setCallToAction(str2);
                    }
                    String strF = bieVar.f();
                    if (!TextUtils.isEmpty(strF)) {
                        ppfVar.setAdvertiser(strF);
                    }
                    c4p c4pVarJ3 = bieVar.b().j();
                    Double d = c4pVarJ3 != null ? (Double) c4pVarJ3.m.getValue() : null;
                    if (d != null) {
                        ppfVar.setStarRating(d);
                    }
                    ksd ksdVar = ppfVar.x;
                    if (ksdVar != null) {
                        ppfVar.setMediaView(ksdVar);
                    }
                    ppfVar.setOverrideClickHandling(true);
                    VersionInfo version = MobileAds.getVersion();
                    VersionInfo versionInfo = new VersionInfo(24, 4, 0);
                    if (version.getMajorVersion() > versionInfo.getMajorVersion() || (version.getMajorVersion() == versionInfo.getMajorVersion() && (version.getMinorVersion() > versionInfo.getMinorVersion() || (version.getMinorVersion() == versionInfo.getMinorVersion() && version.getMicroVersion() >= versionInfo.getMicroVersion())))) {
                        ppfVar.setOverrideImpressionRecording(true);
                    }
                    ppfVar.v = (MediationNativeAdCallback) ppfVar.t.onSuccess(ppfVar);
                    break;
                } else {
                    bieVar.d();
                    break;
                }
                break;
        }
    }

    public final long p() {
        Magnifier magnifier = (Magnifier) this.b;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
    }

    public final neb q() {
        return new wve((NfcDelegate) this.b);
    }

    public final boolean r(float f) {
        if (f == 0.0f) {
            return false;
        }
        t();
        ((NestedScrollView) this.b).n((int) f);
        return true;
    }

    public final float s() {
        return -((NestedScrollView) this.b).q();
    }

    @Override // defpackage.ubk
    public final void setEnabled(boolean z) {
        ubk[] ubkVarArr = (ubk[]) this.b;
        for (int i = 0; i < 5; i++) {
            ubkVarArr[i].setEnabled(z);
        }
    }

    @Override // defpackage.qld
    public final void show(int i) {
        hld hldVar = (hld) this.b;
        hldVar.b.setProgress(i);
        hldVar.c.setVisibility(0);
    }

    public final void t() {
        ((NestedScrollView) this.b).d.abortAnimation();
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return ((c) this.b).toString();
            default:
                return super.toString();
        }
    }

    public final void u(List list) {
        LinkedHashSet linkedHashSet;
        Object next;
        mxb mxbVar = (mxb) this.b;
        LinkedHashSet<i8e> linkedHashSet2 = new LinkedHashSet();
        i72 i72Var = new i72(new tcd(list, (byte) 1));
        while (!i72Var.isEmpty()) {
            i8e i8eVar = (i8e) i72Var.removeLast();
            if (linkedHashSet2.add(i8eVar)) {
                q1i it = new r1i(i8eVar.e).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) it.b;
                    if (listIterator.hasPrevious()) {
                        i8e i8eVar2 = (i8e) listIterator.previous();
                        if (!linkedHashSet2.contains(i8eVar2)) {
                            i72Var.addLast(i8eVar2);
                        }
                    }
                }
            }
        }
        g77 g77Var = mxbVar.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) g77Var.c;
        for (i8e i8eVar3 : linkedHashSet2) {
            for (Map.Entry entry : i8eVar3.c.entrySet()) {
                String str = (String) entry.getKey();
                vab vabVar = (vab) entry.getValue();
                qc3 qc3Var = vabVar.a;
                mxb mxbVar2 = (mxb) g77Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) g77Var.b;
                if (((vab) concurrentHashMap2.get(str)) != null) {
                    n1 n1Var = mxbVar2.a;
                    String str2 = "(+) override index '" + str + "' -> '" + qc3Var + '\'';
                    n1Var.getClass();
                    tbc tbcVar = tbc.c;
                    linkedHashSet = linkedHashSet2;
                    if (((tbc) n1Var.b).compareTo(tbcVar) <= 0) {
                        n1Var.Z(tbcVar, str2);
                    }
                    Iterator it2 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((vab) ((tlj) next)).a.equals(qc3Var)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((tlj) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(qc3Var.hashCode()));
                    }
                } else {
                    linkedHashSet = linkedHashSet2;
                }
                mxbVar2.a.Y("(+) index '" + str + "' -> '" + qc3Var + '\'');
                concurrentHashMap2.put(str, vabVar);
                linkedHashSet2 = linkedHashSet;
            }
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            for (tlj tljVar : i8eVar3.b) {
                concurrentHashMap.put(Integer.valueOf(((vab) tljVar).a.hashCode()), tljVar);
            }
            linkedHashSet2 = linkedHashSet3;
        }
        c37 c37Var = mxbVar.c;
        c37Var.getClass();
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            ((Set) c37Var.a).addAll(((i8e) it3.next()).d);
        }
    }

    public final boolean v(CharSequence charSequence, xdg xdgVar) {
        String str = xdgVar.c;
        if (str.length() != 0) {
            Matcher matcher = ((qie) this.b).r(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // defpackage.m82
    public final void w(n82 n82Var) {
        ((lld) ((yqa) this.b).b).b();
    }

    public final void x(List list) {
        mxb mxbVar = (mxb) this.b;
        n1 n1Var = mxbVar.a;
        tbc tbcVar = tbc.b;
        if (((tbc) n1Var.b).compareTo(tbcVar) > 0) {
            u(list);
            return;
        }
        tpl.a.getClass();
        f9e.a.getClass();
        long jB = f9e.b();
        u(list);
        long jB2 = spl.b(jB);
        int size = ((ConcurrentHashMap) mxbVar.d.b).size();
        n1 n1Var2 = mxbVar.a;
        StringBuilder sbO = p3p.o(size, "Started ", " definitions in ");
        on7 on7Var = pn7.b;
        sbO.append(pn7.p(jB2, un7.c) / 1000.0d);
        sbO.append(" ms");
        n1Var2.Z(tbcVar, sbO.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(androidx.recyclerview.widget.i r8, fr r9, fr r10) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.b
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.e r0 = r7.M
            r1 = r0
            xkj r1 = (defpackage.xkj) r1
            if (r9 == 0) goto L28
            r1.getClass()
            int r3 = r9.b
            int r5 = r10.b
            if (r3 != r5) goto L1e
            int r0 = r9.c
            int r2 = r10.c
            if (r0 == r2) goto L28
        L1e:
            int r4 = r9.c
            int r6 = r10.c
            r2 = r8
            boolean r8 = r1.m(r2, r3, r4, r5, r6)
            goto L2d
        L28:
            r2 = r8
            boolean r8 = r1.k(r2)
        L2d:
            if (r8 == 0) goto L32
            r7.j0()
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfb.y(androidx.recyclerview.widget.i, fr, fr):void");
    }

    @Override // defpackage.btj
    public final int z(o93 o93Var, mim mimVar) {
        if (o93Var instanceof ken) {
            return ((i7d) this.b).n.z(o93Var, mimVar);
        }
        return 3;
    }
}
