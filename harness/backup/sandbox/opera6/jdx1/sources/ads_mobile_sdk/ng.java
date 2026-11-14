package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ng {
    public final Context a;
    public final i41 b;
    public final ApplicationInfo c;
    public final AtomicReference d = new AtomicReference();

    public ng(Context context, i41 i41Var) {
        this.a = context;
        this.b = i41Var;
        this.c = context.getApplicationInfo();
    }
}
