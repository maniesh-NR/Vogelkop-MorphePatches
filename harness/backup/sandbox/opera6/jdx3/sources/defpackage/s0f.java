package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public abstract class s0f {
    public final long a;
    public Bundle b;

    public s0f() {
        this.a = SystemClock.uptimeMillis();
    }

    public s0f(Bundle bundle) {
        this.b = bundle;
        this.a = bundle.getLong("action_created", SystemClock.uptimeMillis());
    }

    public Intent a(Context context) {
        return b(context, "com.opera.android.action.SHOW_ESIM");
    }

    public final Intent b(Context context, String str) {
        Intent intentB = mdb.b(context);
        intentB.addFlags(536870912);
        intentB.setAction(str);
        Bundle bundle = this.b;
        if (bundle != null) {
            intentB.putExtras(bundle);
        }
        intentB.putExtras(c());
        return intentB;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putLong("action_created", this.a);
        return bundle;
    }

    public yhe d(Context context) {
        return yhe.f(context, mdb.b.nextInt(), a(context), 1073741824, false);
    }

    public boolean e(BrowserActivity browserActivity) {
        s16 s16Var = new s16();
        ac8.a(new xxh());
        ac8.a(s16Var);
        return true;
    }

    public Uri f(Context context) {
        return null;
    }

    public boolean g(Context context) {
        return true;
    }
}
