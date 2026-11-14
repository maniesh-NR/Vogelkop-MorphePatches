package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import defpackage.kyo;

/* loaded from: classes.dex */
public final class qu1 extends nt5 {
    public su1 a;
    public kyo b;
    public PerAdNativeJavscriptEngineJsContext c;
    public /* synthetic */ Object d;
    public final /* synthetic */ su1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(su1 su1Var, nt5 nt5Var) {
        super(nt5Var);
        this.e = su1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return su1.a(this.e, this);
    }
}
