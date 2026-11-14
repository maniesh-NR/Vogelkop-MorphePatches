package ads_mobile_sdk;

import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e52 extends ozb implements Function0 {
    public final /* synthetic */ s52 a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(s52 s52Var, WebView webView, boolean z) {
        super(0);
        this.a = s52Var;
        this.b = webView;
        this.c = z;
    }

    public final Object invoke() {
        return new gj1(this.a.j, this.b, this.c);
    }
}
