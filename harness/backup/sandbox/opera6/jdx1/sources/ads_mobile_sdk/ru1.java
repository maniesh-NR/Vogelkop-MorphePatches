package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import defpackage.kyo;
import defpackage.prb;

/* loaded from: classes.dex */
public final class ru1 extends nt5 {
    public Object a;
    public Object b;
    public kyo c;
    public PerAdNativeJavscriptEngineJsContext d;
    public ve2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ su1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(su1 su1Var, nt5 nt5Var) {
        super(nt5Var);
        this.g = su1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= LinearLayoutManager.INVALID_OFFSET;
        return this.g.a((prb) null, (kyo) null, (PerAdNativeJavscriptEngineJsContext) null, this);
    }
}
