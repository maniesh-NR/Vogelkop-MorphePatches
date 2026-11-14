package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class pi8 {
    public final WeakReference a;
    public final ut3 b;
    public final /* synthetic */ qi8 c;

    public pi8(qi8 qi8Var, Context context) {
        this.c = qi8Var;
        this.a = new WeakReference(context);
        ut3 ut3Var = new ut3(this, (byte) 1);
        this.b = ut3Var;
        context.registerDeviceIdChangeListener(new k31(qi8Var.w.a(qi8Var.u, null), (byte) 2), ut3Var);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
