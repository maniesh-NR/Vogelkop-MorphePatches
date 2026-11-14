package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import com.leanplum.Leanplum;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class cac extends AsyncTask {
    public final Context a;
    public final e84 b;
    public final r9c c;
    public volatile int d;
    public boolean e;

    public cac(Context context, e84 e84Var, r9c r9cVar) {
        this.a = context.getApplicationContext();
        this.b = e84Var;
        this.c = r9cVar;
    }

    public static String a(boolean z) {
        return z ? "yes" : "no";
    }

    public final void b(Map map) {
        r9c r9cVar = this.c;
        if (r9cVar.a) {
            Leanplum.setUserAttributes(map);
        } else {
            r9cVar.b.putAll(map);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ActivityInfo activityInfo;
        HashMap map = new HashMap();
        Context context = this.a;
        hs3.a.getClass();
        map.put("Branding", n9a.t(context));
        map.put("Legacy user", "no");
        map.put("Mini", a(r9n.D(this.a, "com.opera.mini.native")));
        map.put("News", a(r9n.D(this.a, "com.opera.app.news")));
        map.put("Ofa beta", a(r9n.D(this.a, "com.opera.browser.beta")));
        map.put("Touch", a(r9n.D(this.a, "com.opera.touch")));
        List listI = r9n.I(this.a, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("fb").authority("page").build()), 0L);
        boolean z = false;
        if (!listI.isEmpty() && (activityInfo = ((ResolveInfo) listI.get(0)).activityInfo) != null && "com.facebook.katana".equals(activityInfo.packageName)) {
            z = true;
        }
        map.put("Facebook deeplink supported", a(z));
        int iOrdinal = fue.c(this.a).ordinal();
        map.put("News backend", iOrdinal != 0 ? iOrdinal != 1 ? "" : "newsfeed" : "none");
        this.d = 1910404306;
        this.b.a("nothing");
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPostExecute(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cac.onPostExecute(java.lang.Object):void");
    }
}
