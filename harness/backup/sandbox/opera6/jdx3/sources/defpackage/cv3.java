package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.downloads.DownloadItem;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.webapps.WebappActivity;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class cv3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx3 b;

    public /* synthetic */ cv3(dx3 dx3Var, byte b) {
        this.a = b;
        this.b = dx3Var;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.app.Activity, l2b] */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.app.Activity, com.opera.android.webapps.WebappActivity, dx3] */
    public final boolean a(xf7 xf7Var, DownloadItem downloadItem, int i) {
        int i2;
        byte b = this.a;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                WebContents webContentsF = downloadItem.f();
                GURL gurl = ChromiumContent.V;
                ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContentsF);
                i2 = chromiumContent != null ? chromiumContent.i : Integer.MIN_VALUE;
                ?? r12 = (BrowserActivity) xd5Var;
                String[] strArr = OperaApplication.K;
                new ru3(r12, ((OperaApplication) r12.getApplication()).m().a.a(xf7Var, downloadItem, null, i, i2, false));
                return true;
            case 1:
                xd5 xd5Var2 = (EsimActivity) xd5Var;
                if (!xd5Var2.getLifecycle().i.d(qcc.e)) {
                    return false;
                }
                WebContents webContentsF2 = downloadItem.f();
                GURL gurl2 = ChromiumContent.V;
                ChromiumContent chromiumContent2 = (ChromiumContent) N.Mo8CJari(webContentsF2);
                i2 = chromiumContent2 != null ? chromiumContent2.i : Integer.MIN_VALUE;
                String[] strArr2 = OperaApplication.K;
                new cx3(xd5Var2, ((OperaApplication) xd5Var2.getApplication()).m().a.a(xf7Var, downloadItem, null, i, i2, false), (byte) 0);
                return true;
            case 2:
                ?? r122 = (l2b) xd5Var;
                r122.W.append('c');
                WebContents webContentsF3 = downloadItem.f();
                GURL gurl3 = ChromiumContent.V;
                ChromiumContent chromiumContent3 = (ChromiumContent) N.Mo8CJari(webContentsF3);
                i2 = chromiumContent3 != null ? chromiumContent3.i : Integer.MIN_VALUE;
                String[] strArr3 = OperaApplication.K;
                r122.N0(((OperaApplication) r122.getApplication()).m().a.a(xf7Var, downloadItem, null, i, i2, false));
                return true;
            default:
                WebContents webContentsF4 = downloadItem.f();
                GURL gurl4 = ChromiumContent.V;
                ChromiumContent chromiumContent4 = (ChromiumContent) N.Mo8CJari(webContentsF4);
                ?? r123 = (WebappActivity) xd5Var;
                int i3 = WebappActivity.J;
                ChromiumContent chromiumContentF0 = r123.f0();
                if (chromiumContent4 == null || chromiumContentF0 == null || downloadItem.f() != chromiumContentF0.f()) {
                    return false;
                }
                String[] strArr4 = OperaApplication.K;
                new cx3(r123, ((OperaApplication) r123.getApplication()).m().a.a(xf7Var, downloadItem, null, i, chromiumContent4.i, false), (byte) 0);
                return true;
        }
    }
}
