package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.webkit.WebView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import com.leanplum.internal.ResourceQualifiers;
import java.io.File;

/* loaded from: classes.dex */
public final class uto implements jrp, uwn, cpp, ph {
    public final /* synthetic */ byte a;
    public final Object b;

    public uto() {
        this.a = (byte) 1;
        this.b = new Rect();
    }

    public uto(Context context) {
        this.a = (byte) 2;
        h61 h61Var = new h61(context, false);
        this.b = vlo.b(new bxk((Object) vlo.b(new mcj(h61Var, vlo.b(flo.a), new rgh(h61Var, cjp.a))), (byte) 16));
    }

    public /* synthetic */ uto(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r6, android.view.View r7, int r8, int r9, java.lang.Integer r10) {
        /*
            r5 = this;
            java.lang.Object r5 = r5.b
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r0 = 0
            if (r7 == 0) goto L71
            int r1 = r7.getVisibility()
            if (r1 != 0) goto L71
            if (r6 == 0) goto L15
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L71
        L15:
            boolean r6 = r7.isShown()
            if (r6 == 0) goto L71
            boolean r6 = r7.getGlobalVisibleRect(r5)
            if (r6 == 0) goto L71
            int r6 = r5.height()
            long r1 = (long) r6
            int r5 = r5.width()
            long r5 = (long) r5
            long r1 = r1 * r5
            int r5 = r7.getHeight()
            long r5 = (long) r5
            int r7 = r7.getWidth()
            long r3 = (long) r7
            long r5 = r5 * r3
            r3 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L71
            r7 = 1
            if (r10 == 0) goto L50
            int r3 = r10.intValue()
            if (r3 <= 0) goto L50
            int r5 = r10.intValue()
            long r5 = (long) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L71
            goto L70
        L50:
            r3 = 100
            long r1 = r1 * r3
            if (r9 <= 0) goto L6a
            long r9 = (long) r9
            long r9 = r9 * r5
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 > 0) goto L5d
            r9 = r7
            goto L5e
        L5d:
            r9 = r0
        L5e:
            if (r9 == 0) goto L63
            if (r9 != 0) goto L71
            goto L70
        L63:
            long r8 = (long) r8
            long r8 = r8 * r5
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L71
            goto L70
        L6a:
            long r8 = (long) r8
            long r8 = r8 * r5
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L71
        L70:
            return r7
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uto.a(android.view.View, android.view.View, int, int, java.lang.Integer):boolean");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r4 = (ProxyBillingActivityV2) this.b;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r4.l;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = ohVar.a;
        if (i2 != -1 || i != 0) {
            zzc.zzo("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        r4.finish();
    }

    @Override // defpackage.uwn
    public final void onPostMessage(WebView webView, jun junVar, Uri uri, boolean z, xmb xmbVar) {
        ((plk) this.b).w(junVar.b(), "4");
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        String string;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                Context context = ((h61) ((z4k) obj).b).a;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL).metaData;
                    if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                        return null;
                    }
                    return new File(context.getExternalFilesDir(null), string);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 4:
            default:
                return ((n0c) obj).a;
            case 5:
                return new erp(((n0c) ((uto) obj).b).a);
        }
    }
}
