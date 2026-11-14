package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zhj {
    public final wzg a;
    public final Bundle b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final List g;

    public zhj(wzg wzgVar, Bundle bundle, int i, int i2, String str, boolean z, List list) {
        this.a = wzgVar;
        this.b = bundle;
        this.c = i;
        this.e = i2;
        this.d = str;
        this.f = z;
        this.g = Collections.unmodifiableList(list);
    }

    public static zhj a(ryl rylVar, int i) {
        return new zhj(new wzg(rylVar, rylVar.getClass(), (byte) 4), null, 2, i, null, false, Arrays.asList(new n6h[0]));
    }

    public static zhj b(Class cls) {
        return new zhj(new wzg(null, cls, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0]));
    }

    public final void c(Context context) {
        ((ll9) context.getSystemService("com.opera.android.ui.FRAGMENT_CONTROLLER_SERVICE")).b(this);
    }
}
