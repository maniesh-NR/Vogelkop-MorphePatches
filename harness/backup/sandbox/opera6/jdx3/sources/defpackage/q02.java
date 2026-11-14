package defpackage;

import J.N;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import org.chromium.base.TraceEvent;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class q02 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 26;
        Object obj = this.b;
        switch (b) {
            case 0:
                r02 r02Var = (r02) obj;
                r02Var.c = null;
                r02Var.i();
                r02Var.b.clear();
                return;
            case 1:
                ((fka) obj).n(new sw7(Unit.a));
                return;
            case 2:
                ((fka) obj).n(new sw7(Unit.a));
                return;
            case 3:
                ((fka) obj).n(new sw7(Unit.a));
                return;
            case 4:
                ((gka) obj).n(new sw7(Unit.a));
                return;
            case 5:
                ((gka) obj).n(new sw7(Unit.a));
                return;
            case 6:
                ((gka) obj).n(new sw7(Unit.a));
                return;
            case 7:
                z5i.f0(((b22) obj).v);
                return;
            case 8:
                ((q2) obj).invoke();
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                z5i.f0(((t42) obj).v);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((qdc) obj).e(occ.ON_DESTROY);
                return;
            case 11:
                xqe xqeVar = (xqe) ((tw2) obj).b;
                long jCurrentTimeMillis = System.currentTimeMillis() - 259200000;
                if (xqeVar.g == null) {
                    xqeVar.a.i();
                }
                List list = xqeVar.g;
                list.size();
                final ArrayList arrayList = new ArrayList();
                final long j = jCurrentTimeMillis / 1000;
                if (sfe.A0(list, new srg() { // from class: vqe
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
                    
                        if (((defpackage.msh) r0.get(0)).p < r1) goto L13;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
                    
                        r1.add(r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
                    
                        return true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
                    
                        if (((defpackage.msh) r7).p < r1) goto L13;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean apply(java.lang.Object r7) {
                        /*
                            r6 = this;
                            oqe r7 = (defpackage.oqe) r7
                            boolean r0 = r7 instanceof defpackage.msh
                            long r1 = r2
                            r3 = 0
                            if (r0 == 0) goto L13
                            r0 = r7
                            msh r0 = (defpackage.msh) r0
                            long r4 = r0.p
                            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                            if (r0 >= 0) goto L35
                            goto L2e
                        L13:
                            boolean r0 = r7 instanceof defpackage.ere
                            if (r0 == 0) goto L35
                            r0 = r7
                            ere r0 = (defpackage.ere) r0
                            java.util.List r0 = r0.f
                            boolean r4 = r0.isEmpty()
                            if (r4 != 0) goto L35
                            java.lang.Object r0 = r0.get(r3)
                            msh r0 = (defpackage.msh) r0
                            long r4 = r0.p
                            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                            if (r0 >= 0) goto L35
                        L2e:
                            java.util.ArrayList r6 = r1
                            r6.add(r7)
                            r6 = 1
                            return r6
                        L35:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqe.apply(java.lang.Object):boolean");
                    }
                })) {
                    xqeVar.o(list);
                    xqeVar.l(arrayList);
                    list.size();
                    xqeVar.k(true);
                    return;
                }
                return;
            case 12:
                xe2 xe2Var = (xe2) obj;
                synchronized (xe2Var.a) {
                    if (xe2Var.m) {
                        return;
                    }
                    long j2 = xe2Var.l - 1;
                    xe2Var.l = j2;
                    if (j2 > 0) {
                        return;
                    }
                    if (j2 >= 0) {
                        xe2Var.a();
                        return;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (xe2Var.a) {
                        try {
                            xe2Var.n = illegalStateException;
                        } finally {
                        }
                    }
                    return;
                }
            case 13:
                tn tnVar = (tn) obj;
                ((Context) tnVar.b).unregisterReceiver((qf2) tnVar.c);
                return;
            case 14:
                qf2 qf2Var = (qf2) obj;
                if (((tn) qf2Var.d).a) {
                    ((mi8) qf2Var.b).a.V0(3, false);
                    return;
                }
                return;
            case 15:
                sgb.k(((hh2) obj).a, (CancellationException) null);
                return;
            case 16:
                ((ijc) obj).i(-1, new t40((byte) 26));
                return;
            case 17:
                li2 li2Var = (li2) obj;
                li2Var.i = null;
                li2Var.r();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                Drawable drawable = (Drawable) obj;
                if (drawable.isVisible()) {
                    ((Animatable) drawable).start();
                    return;
                }
                return;
            case 19:
                ((tl2) obj).b.invoke();
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((wl2) obj).a.invoke();
                return;
            case 21:
                rn9 rn9Var = (rn9) obj;
                bxk bxkVar = (bxk) rn9Var.c;
                TraceEvent.h("WebContentsAccessibilityImpl.AutoDisableAccessibilityHandler.onDisabled", (String) null);
                WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) bxkVar.b;
                j8 j8Var = webContentsAccessibilityImpl.A;
                boolean z = webContentsAccessibilityImpl.M == 0;
                j8Var.getClass();
                TraceEvent.h("AccessibilityHistogramRecorder.onDisabledCalled", (String) null);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = j8Var.h;
                if (z) {
                    ioh.z(jElapsedRealtime - j3, "Accessibility.Android.AutoDisableV2.EnabledTime.Initial");
                    ioh.t("Accessibility.Android.AutoDisableV2.DisableCalled.Initial", true);
                } else {
                    ioh.z(jElapsedRealtime - j3, "Accessibility.Android.AutoDisableV2.EnabledTime.Successive");
                    ioh.t("Accessibility.Android.AutoDisableV2.DisableCalled.Successive", true);
                }
                j8Var.i = jElapsedRealtime;
                ioh.z(jElapsedRealtime - j8Var.h, "Accessibility.Android.Usage.NativeInit");
                j8Var.h = -1L;
                TraceEvent.k("AccessibilityHistogramRecorder.onDisabledCalled");
                N.MOP_btw0(webContentsAccessibilityImpl.e);
                webContentsAccessibilityImpl.F.u();
                webContentsAccessibilityImpl.D.clear();
                webContentsAccessibilityImpl.L = true;
                TraceEvent.k("WebContentsAccessibilityImpl.AutoDisableAccessibilityHandler.onDisabled");
                rn9Var.b = false;
                return;
            case SizeUtil.textSize1 /* 22 */:
                r9i r9iVarF = ((b4g) obj).f();
                if (r9iVarF != null) {
                    o66 o66Var = (o66) r9iVarF.d;
                    if (o66Var.j()) {
                        o66Var.f.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                lq2 lq2Var = (lq2) obj;
                huh huhVar = lq2Var.e.b;
                if (huhVar.a(huhVar.a) == lq2Var.a && huhVar.a(huhVar.b) == lq2Var.b) {
                    return;
                }
                lq2Var.d.run();
                return;
            case SizeUtil.textSize2 /* 24 */:
                pt1 pt1Var = (pt1) obj;
                i iVarM = ((RecyclerView) pt1Var.f).M(0);
                if (iVarM != null) {
                    ((OperaMaterialButton) pt1Var.d).setOnClickListener(new gf((Object) iVarM, (byte) 15));
                    return;
                }
                return;
            case 25:
                mr2 mr2Var = (mr2) obj;
                mr2Var.s.c(new ab(mr2Var, b2));
                return;
            case 26:
                ((kr2) obj).a(false);
                return;
            case 27:
                ((as2) obj).b(new rw7(jd6.a));
                return;
            case 28:
                wr2 wr2Var = (wr2) obj;
                AutofillManager autofillManager = wr2Var.s;
                bv1 bv1Var = wr2Var.r;
                Objects.requireNonNull(bv1Var);
                autofillManager.d(new ab(bv1Var, (byte) 27));
                return;
            default:
                ((ot2) obj).b.e(new o5g(), false);
                return;
        }
    }
}
