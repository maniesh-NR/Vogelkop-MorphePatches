package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.opera.android.IntentDispatcherActivity;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hrj {
    public static final int f;
    public final Context a;
    public final grj b;
    public final int c;
    public sc d;
    public int e;

    static {
        frj.d.getClass();
        Iterator it = frj.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((frj) it.next()).c;
        }
        f = i;
    }

    public hrj(Context context, grj grjVar, int i) {
        this.a = context;
        this.b = grjVar;
        this.c = i;
    }

    public final brj a(String str) {
        Context context = this.a;
        String string = context.getString(2132018390, str);
        Intent action = new Intent(context, (Class<?>) IntentDispatcherActivity.class).setAction("android.intent.action.VIEW");
        p6l p6lVar = p6l.a;
        return new brj(action.setData(Uri.parse(eti.a(string, null, 8).g())), context.getString(2132018389), sgb.F(2131231915, context));
    }

    public final crj b(String str) {
        ActivityInfo activityInfo;
        Uri uri = Uri.parse(str);
        frj.d.getClass();
        String scheme = uri.getScheme();
        String[] strArr = aik.a;
        if (scheme == null) {
            scheme = "";
        }
        frj frjVar = scheme.equalsIgnoreCase("geo") ? frj.g : scheme.equalsIgnoreCase("tel") ? frj.f : scheme.equalsIgnoreCase("mailto") ? frj.e : frj.g;
        int i = frjVar.b;
        Context context = this.a;
        Intent intentD = frjVar.d(context, uri);
        if (frjVar == frj.g) {
            return new crj(intentD, context.getString(i), sgb.F(2131231915, context), frjVar);
        }
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intentD, 0);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        if ("android".equals(activityInfo.packageName)) {
            return new crj(intentD, context.getString(i), null, frjVar);
        }
        String string = resolveInfoResolveActivity.activityInfo.loadLabel(packageManager).toString();
        Drawable drawableLoadIcon = resolveInfoResolveActivity.activityInfo.loadIcon(packageManager);
        if (drawableLoadIcon == null) {
            drawableLoadIcon = resolveInfoResolveActivity.loadIcon(packageManager);
        }
        return new crj(intentD, string, drawableLoadIcon, frjVar);
    }
}
