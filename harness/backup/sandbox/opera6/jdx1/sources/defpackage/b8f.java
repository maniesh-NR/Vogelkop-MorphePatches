package defpackage;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;

/* loaded from: classes.dex */
public final class b8f implements DeepLinkListener {
    public final Context a;

    public b8f(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public final void onDeepLinking(DeepLinkResult deepLinkResult) {
        if (a8f.a[deepLinkResult.getStatus().ordinal()] == 1) {
            DeepLink deepLink = deepLinkResult.getDeepLink();
            if (Boolean.FALSE.equals(deepLink.isDeferred())) {
                return;
            }
            String deepLinkValue = deepLink.getDeepLinkValue();
            if (wqm.v(deepLinkValue)) {
                Uri uri = Uri.parse(deepLinkValue);
                lk6 lk6Var = lk6.a;
                ik6 ik6Var = ik6.b;
                lqm lqmVar = lqm.i;
                Context context = this.a;
                if (lk6.f(3, ik6Var, lqmVar, context, uri)) {
                    lk6.a(uri, lqmVar, 3, context);
                }
            }
        }
    }
}
