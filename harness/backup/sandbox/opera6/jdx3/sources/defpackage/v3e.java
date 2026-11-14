package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class v3e {
    public final Context a;
    public yl6 b;
    public BrowserActivity c;

    public v3e(Context context) {
        this.a = context;
    }

    public final Boolean a() {
        ResolveInfo resolveInfoResolveActivity;
        try {
            resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity(sl6.a(), 65536);
        } catch (NullPointerException unused) {
            resolveInfoResolveActivity = null;
        }
        return Boolean.valueOf(resolveInfoResolveActivity != null && resolveInfoResolveActivity.match > 0 && "com.opera.browser.beta".equals(resolveInfoResolveActivity.activityInfo.packageName));
    }
}
