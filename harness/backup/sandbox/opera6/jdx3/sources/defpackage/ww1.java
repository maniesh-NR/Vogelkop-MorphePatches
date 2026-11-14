package defpackage;

import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes.dex */
public final class ww1 implements AppsFlyerRequestListener {
    public final /* synthetic */ l45 a;

    public ww1(l45 l45Var) {
        this.a = l45Var;
    }

    public final void onError(int i, String str) {
        this.a.M(tw1.ERROR_START, String.valueOf(i));
    }

    public final void onSuccess() {
    }
}
