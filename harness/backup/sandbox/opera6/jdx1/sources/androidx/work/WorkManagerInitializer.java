package androidx.work;

import android.content.Context;
import defpackage.fl5;
import defpackage.jl5;
import defpackage.x4o;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements v7b {
    static {
        qs7.B("WrkMgrInitializer");
    }

    public final Object create(Context context) {
        qs7.x().getClass();
        x4o.d(context, new jl5(new fl5()));
        return x4o.c(context);
    }

    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
