package defpackage;

import android.net.Uri;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t82 {
    public final String a;
    public final SettingsManager b;
    public final ji c;

    /* JADX WARN: Multi-variable type inference failed */
    public t82(BrowserActivity browserActivity, SettingsManager settingsManager, ji jiVar) {
        this.a = browserActivity.getString(2132020640);
        this.b = settingsManager;
        this.c = jiVar;
    }

    public final lsc a(g82 g82Var, lqm lqmVar) {
        oue oueVar = (oue) this.c.get();
        String str = g82Var.c;
        Uri uri = Uri.parse(str);
        nv6 nv6Var = oueVar.a;
        long j = oue.b;
        String host = uri.getHost();
        if (host != null) {
            ((pd7) nv6Var.a).f(new ni2((Object) nv6Var, (Object) host, j, (byte) 3));
        }
        UrlMangler.Builder builder = new UrlMangler.Builder("article", str);
        builder.title(g82Var.b);
        builder.displayString(this.a);
        builder.externalUrl(g82Var.d);
        String str2 = g82Var.a;
        HashMap map = builder.c;
        map.put("article_id", str2);
        map.put("article_transcoded", "1");
        String str3 = g82Var.e;
        if (str3 != null) {
            map.put("article_share_url", str3);
        }
        return wqm.f(builder.build(), null, lqmVar);
    }
}
