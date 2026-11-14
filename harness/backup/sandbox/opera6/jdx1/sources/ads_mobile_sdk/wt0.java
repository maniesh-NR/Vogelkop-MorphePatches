package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.anp;
import defpackage.fbp;
import defpackage.opo;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wt0 implements opo, fbp {
    public final Context a;
    public final th3 b;
    public final jjc c;
    public final l7 d;
    public final anp g;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ListenableFuture h = r0b.b;

    public wt0(Context context, th3 th3Var, jjc jjcVar, l7 l7Var, anp anpVar) {
        this.a = context;
        this.b = th3Var;
        this.c = jjcVar;
        this.d = l7Var;
        this.g = anpVar;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        if (!this.e.getAndSet(true) && this.d.u()) {
            c5j c5jVar = new c5j();
            this.h = c5jVar;
            this.b.a(fl0.EVENT_ID_INIT_GASS_TRACKER, new fmn(this, c5jVar, (byte) 23));
            return r0b.b;
        }
        return r0b.b;
    }

    @Override // defpackage.opo
    public final void a(HashMap map) {
        map.put("gs", this.h);
    }

    @Override // defpackage.opo
    public final void a(HashMap map, Context context, View view) {
        map.put("gs", this.h);
    }

    @Override // defpackage.opo
    public final void b(HashMap map) {
        map.put("gs", this.h);
    }
}
