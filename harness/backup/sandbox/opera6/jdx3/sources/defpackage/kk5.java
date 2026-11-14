package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.browser.chromium.ChromiumContent;
import java.net.URISyntaxException;
import java.util.Iterator;
import kotlin.text.StringsKt;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class kk5 implements shj {
    public final /* synthetic */ byte a;
    public final ChromiumContent b;

    public /* synthetic */ kk5(ChromiumContent chromiumContent, byte b) {
        this.a = b;
        this.b = chromiumContent;
    }

    @Override // defpackage.shj
    public final boolean b(NavigationHandle navigationHandle, GURL gurl, boolean z, boolean z2) {
        byte b = this.a;
        ChromiumContent chromiumContent = this.b;
        switch (b) {
            case 0:
                String strG = gurl.g();
                String[] strArr = wqm.a;
                Uri uriD0 = a26.d0(strG);
                if (uriD0 != null && lcp.t(uriD0)) {
                    String queryParameter = uriD0.getQueryParameter("ofa_cb");
                    String string = queryParameter != null ? StringsKt.l0(queryParameter).toString() : null;
                    if (string != null && !StringsKt.N(string)) {
                        ac8.a(new sk5(string));
                    }
                    x1p.Y(chromiumContent, x1p.C(navigationHandle));
                    break;
                }
                break;
            case 1:
                String strG2 = gurl.g();
                Uri uri = Uri.parse("https://opera.com/connect");
                Uri uri2 = Uri.parse(strG2);
                if (TextUtils.equals(uri.getScheme(), uri2.getScheme())) {
                    String host = uri.getHost();
                    String host2 = uri2.getHost();
                    if (host2 != null && host2.startsWith("www.")) {
                        host2 = host2.substring(4);
                    }
                    if (TextUtils.equals(host, host2) && TextUtils.equals(cqp.y0(uri.getPath()), cqp.y0(uri2.getPath()))) {
                        new cd9().w0(chromiumContent.c());
                        x1p.Y(chromiumContent, x1p.C(navigationHandle));
                        break;
                    }
                }
                break;
            default:
                try {
                    Iterator<ResolveInfo> it = chromiumContent.getView().getContext().getPackageManager().queryIntentActivities(Intent.parseUri(gurl.g(), 0), 0).iterator();
                    while (it.hasNext()) {
                        if ("com.opera.android.MainLauncherActivity".equals(it.next().activityInfo.name)) {
                            boolean z3 = navigationHandle.f.b ? !TextUtils.equals(r7.c(), gurl.c()) : true;
                            if (navigationHandle.p && z3 && (navigationHandle.d & 255) == 0) {
                                xgf xgfVar = new xgf(gurl.g());
                                xgfVar.m = lqm.i;
                                xgfVar.n = true;
                                zi4.u(chromiumContent.getView().getContext(), xgfVar);
                                break;
                            }
                        }
                    }
                    break;
                } catch (URISyntaxException unused) {
                    return false;
                }
                break;
        }
        return true;
    }
}
