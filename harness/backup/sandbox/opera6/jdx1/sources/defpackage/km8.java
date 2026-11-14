package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public final class km8 implements n7e {
    public final Context a;
    public final long b;
    public final Intent c;
    public final AtomicBoolean d;
    public PropertyModel e;
    public final /* synthetic */ bpd f;
    public final tm8 g;
    public final /* synthetic */ bpd h;

    public km8(bpd bpdVar, Context context, tm8 tm8Var, Intent intent) {
        Objects.requireNonNull(bpdVar);
        this.h = bpdVar;
        long j = tm8Var.s;
        Objects.requireNonNull(bpdVar);
        this.f = bpdVar;
        this.d = new AtomicBoolean(false);
        this.a = context;
        this.b = j;
        this.c = intent;
        this.g = tm8Var;
    }

    public final void a(int i, PropertyModel propertyModel) {
        if (1 == i || 2 == i) {
            return;
        }
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.h.c = null;
        d23 d23Var = this.g.u;
        if (d23Var != null) {
            d23Var.onResult(sm8.c());
        }
    }

    public final boolean b() {
        if (this.e == null) {
            return false;
        }
        this.f.getClass();
        throw null;
    }
}
