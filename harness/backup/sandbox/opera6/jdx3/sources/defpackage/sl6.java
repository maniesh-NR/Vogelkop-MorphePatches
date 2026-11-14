package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* loaded from: classes.dex */
public final class sl6 {
    public final ResolveInfo a;

    public sl6(Context context) {
        ResolveInfo resolveInfoResolveActivity;
        try {
            resolveInfoResolveActivity = context.getPackageManager().resolveActivity(a(), 65536);
        } catch (NullPointerException unused) {
            resolveInfoResolveActivity = null;
        }
        this.a = resolveInfoResolveActivity;
    }

    public static Intent a() {
        return new Intent("android.intent.action.VIEW", Uri.parse("http://www.opera.com/mobile/operabrowser"));
    }

    public final boolean b() {
        return c() && "com.opera.browser.beta".equals(this.a.activityInfo.packageName);
    }

    public final boolean c() {
        ResolveInfo resolveInfo = this.a;
        return resolveInfo != null && resolveInfo.match > 0;
    }
}
