package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import java.io.File;

/* loaded from: classes.dex */
public final class olh {
    public final glh a;
    public final SettingsManager b;
    public final umi c;

    public olh(glh glhVar, SettingsManager settingsManager, umi umiVar) {
        this.a = glhVar;
        this.b = settingsManager;
        this.c = umiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(dx3 dx3Var, boolean z, boolean z2) {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) dx3Var.getApplication();
        olh olhVar = (olh) operaApplication.r.C0.get();
        SettingsManager settingsManagerJ = operaApplication.J();
        Uri uriFromFile = settingsManagerJ.O() ? Uri.fromFile(s29.f(new File((File) settingsManagerJ.f.get(), "Offline pages"), z)) : settingsManagerJ.t(z);
        lcp.G(dx3Var, uriFromFile, z2, new s2g((Object) olhVar, (Object) settingsManagerJ, (Object) uriFromFile, (byte) 5));
    }

    public static String b(ilh ilhVar, String str) {
        String str2 = ilhVar.b;
        Uri uri = Uri.parse(str2);
        UrlMangler.Builder builder = new UrlMangler.Builder("offline", new Uri.Builder().scheme("opera-offline").authority(TextUtils.isEmpty(uri.getHost()) ? "localhost" : uri.getHost()).path(Long.toString(ilhVar.a)).build().toString());
        builder.displayString(str);
        builder.externalUrl(str2);
        builder.c.put("offline_page_timestamp", Long.toString(ilhVar.d));
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(dx3 dx3Var, boolean z) {
        if (r9n.X(dx3Var)) {
            a(dx3Var, true, z);
        } else {
            f03.U(dx3Var.j, "android.permission.WRITE_EXTERNAL_STORAGE", new nrl(dx3Var, z));
        }
    }

    public final void c(BrowserActivity browserActivity, d7l d7lVar, String str, String str2, xx1 xx1Var) {
        qe9 qe9Var = new qe9(this, d7lVar, browserActivity, str, str2, xx1Var, (byte) 2);
        this.c.e(new ws1(this, browserActivity, str, str2, (byte) 13)).c(new r9g((Object) qe9Var, (byte) 19)).a(null, null);
    }
}
