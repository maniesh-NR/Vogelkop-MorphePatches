package defpackage;

import ads_mobile_sdk.gw0;
import ads_mobile_sdk.lq;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Path;
import android.net.Uri;
import android.os.SystemClock;
import androidx.webkit.WebViewStartUpResult;
import java.util.List;

/* loaded from: classes.dex */
public final class cpj implements w7e, t55, zln, WebViewStartUpResult, djp, ee5 {
    public static cpj b;
    public final /* synthetic */ byte a;

    public /* synthetic */ cpj(byte b2) {
        this.a = b2;
    }

    public cpj(pa paVar) {
        this.a = (byte) 5;
    }

    public static Path f(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public final Object a(int i) {
        Object obj = null;
        switch (this.a) {
            case 14:
                lq lqVar = lq.UNKNOWN;
                if (i == 0) {
                    obj = lqVar;
                } else if (i == 1) {
                    obj = lq.COLLECTED_BIDDING_SIGNAL;
                }
                return obj != null ? obj : lqVar;
            default:
                switch (i) {
                    case 0:
                        obj = gw0.FORMAT_UNKNOWN;
                        break;
                    case 1:
                        obj = gw0.FORMAT_BANNER;
                        break;
                    case 2:
                        obj = gw0.FORMAT_INTERSTITIAL;
                        break;
                    case 3:
                        obj = gw0.FORMAT_REWARDED;
                        break;
                    case 4:
                        obj = gw0.FORMAT_REWARDED_INTERSTITIAL;
                        break;
                    case 5:
                        obj = gw0.FORMAT_APP_OPEN;
                        break;
                    case 6:
                        obj = gw0.FORMAT_NATIVE;
                        break;
                    case 7:
                        obj = gw0.FORMAT_ICON;
                        break;
                    case 8:
                        obj = gw0.FORMAT_SWIPEABLE_INTERSTITIAL;
                        break;
                }
                return obj == null ? gw0.UNRECOGNIZED : obj;
        }
    }

    public final wjh b(Context context) {
        wjh wjhVar;
        wjh wjhVar2 = wjh.j;
        if (wjhVar2 != null) {
            return wjhVar2;
        }
        synchronized (this) {
            wjhVar = wjh.j;
            if (wjhVar == null) {
                wjhVar = new wjh(context.getApplicationContext());
                wjh.j = wjhVar;
            }
        }
        return wjhVar;
    }

    public final void c(xq3 xq3Var, hjm hjmVar) {
        if (pk5.n == xq3Var) {
            pk5.n = null;
        }
    }

    public final long d() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gmo
            if (r0 == 0) goto L13
            r0 = r7
            gmo r0 = (defpackage.gmo) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            gmo r0 = new gmo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)
            goto L48
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r7)
            wjh r5 = r5.b(r6)
            cv6 r6 = bb7.a
            mr6 r6 = mr6.b
            hmo r7 = new hmo
            r2 = 0
            r7.<init>(r2, r3, r5)
            r0.v = r4
            java.lang.Object r7 = defpackage.na2.Z(r6, r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpj.e(android.content.Context, nt5):java.lang.Object");
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public final List getNonUiThreadBlockingStartUpLocations() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public final Long getTotalTimeInUiThreadMillis() {
        return null;
    }

    @Override // androidx.webkit.WebViewStartUpResult
    public final List getUiThreadBlockingStartUpLocations() {
        return null;
    }

    public final void j() {
    }

    public final Object r(x79 x79Var) {
        return new atp((k3e) x79Var.a(k3e.class));
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new nhk(d5oVar.r(Uri.class, AssetFileDescriptor.class), (byte) 0);
    }
}
