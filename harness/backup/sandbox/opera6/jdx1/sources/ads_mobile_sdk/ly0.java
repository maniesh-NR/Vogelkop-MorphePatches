package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ly0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ry0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ WebResourceRequest d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly0(Uri uri, WebResourceRequest webResourceRequest, ry0 ry0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = ry0Var;
        this.c = uri;
        this.d = webResourceRequest;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new ly0(this.c, this.d, this.b, mt5Var, (byte) 0);
            default:
                return new ly0(this.c, this.d, this.b, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    jz2 jz2Var = this.b.u;
                    if (jz2Var != null) {
                        String string = this.c.toString();
                        n08 requestHeaders = this.d.getRequestHeaders();
                        if (requestHeaders == null) {
                            requestHeaders = n08.a;
                        }
                        this.a = true;
                        if (jz2.a(jz2Var, string, 2, requestHeaders, this) == px5Var) {
                            return px5Var;
                        }
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                try {
                    if (!z2) {
                        ybh.y(obj);
                        wr3 wr3Var = this.b.r;
                        if (wr3Var == null) {
                            return null;
                        }
                        WebResourceRequest webResourceRequest = this.d;
                        this.a = true;
                        obj = wr3Var.a(webResourceRequest, this);
                        if (obj == px5Var2) {
                            return px5Var2;
                        }
                    } else {
                        if (!z2) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    return (WebResourceResponse) obj;
                } catch (Exception e) {
                    vr3 vr3Var = xu0.a;
                    xu0.c("Failed to intercept request using WebViewFirebaseAnalyticsEventsHandler: " + this.c, e);
                    return null;
                }
        }
    }
}
