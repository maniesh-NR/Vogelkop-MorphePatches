package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.mediation.Adapter;
import defpackage.cek;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class q61 {
    public final Adapter a;

    public q61(Adapter adapter) {
        this.a = adapter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(ads_mobile_sdk.q61 r5, ads_mobile_sdk.oa r6) {
        /*
            flp r5 = r6.p$1()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = k95.o(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r5.next()
            ads_mobile_sdk.qa r0 = (ads_mobile_sdk.qa) r0
            java.lang.String r1 = r0.p()
            int r2 = r1.hashCode()
            switch(r2) {
                case -1396342996: goto L6d;
                case -1052618729: goto L62;
                case -239580146: goto L57;
                case 604727084: goto L4c;
                case 1167692200: goto L41;
                case 1778294298: goto L36;
                case 1911491517: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L78
        L2b:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L7a
        L36:
            java.lang.String r2 = "app_open_ad"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L7a
        L41:
            java.lang.String r2 = "app_open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L7a
        L4c:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L7a
        L57:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L7a
        L62:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L7a
        L6d:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER
            goto L7a
        L78:
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.UNKNOWN
        L7a:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map r0 = r0.o()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.putString(r4, r3)
            goto L8b
        La7:
            com.google.android.gms.ads.mediation.MediationConfiguration r0 = new com.google.android.gms.ads.mediation.MediationConfiguration
            r0.<init>(r1, r2)
            r6.add(r0)
            goto L13
        Lb1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q61.a(ads_mobile_sdk.q61, ads_mobile_sdk.oa):java.util.ArrayList");
    }

    public final Object a(Context context, oa oaVar, cek cekVar) {
        if (!Intrinsics.a(Looper.getMainLooper(), Looper.myLooper())) {
            qp2.n("Check failed.");
            return null;
        }
        nh4 nh4Var = new nh4(1, hib.b(cekVar));
        nh4Var.s();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            this.a.initialize(context, new o01(atomicBoolean, nh4Var), a(this, oaVar));
        } catch (Throwable th) {
            if (!atomicBoolean.getAndSet(true)) {
                p0i p0iVar = t0i.b;
                nh4Var.resumeWith(new bv0(th, ae1.m, "Exception caught initializing adapter: ".concat(th.getClass().getName())));
            }
        }
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }
}
