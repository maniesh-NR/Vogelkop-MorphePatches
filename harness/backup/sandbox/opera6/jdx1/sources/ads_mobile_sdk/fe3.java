package ads_mobile_sdk;

import android.content.Context;
import defpackage.fsg;
import defpackage.l3p;
import defpackage.oap;
import defpackage.u6k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class fe3 implements oap {
    public final nx5 a;
    public final z2 b;
    public final ae3 c;
    public final l3p d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public fe3(nx5 nx5Var, z2 z2Var, ae3 ae3Var, l3p l3pVar) {
        this.a = nx5Var;
        this.b = z2Var;
        this.c = ae3Var;
        this.d = l3pVar;
    }

    @Override // defpackage.oap
    public final void a(Context context, boolean z, boolean z2) {
        boolean andSet = this.e.getAndSet(true);
        nx5 nx5Var = this.a;
        if (andSet) {
            xu0.a("This ad has already been shown.", (Exception) null);
            xh3.a(nx5Var, new ce3(this, null, (byte) 0));
            xh3.a("The ad has already been shown", null, 6);
            return;
        }
        try {
            this.d.a();
            defpackage.na2.B(nx5Var, h.a, null, new fsg(new u6k((byte) 15, null, this), null, (byte) 3), 2);
        } catch (Exception e) {
            xh3.a("Mediation Fullscreen Ad failed to show.", e, 4);
            xh3.a(nx5Var, new ce3(this, null, (byte) 1));
        }
    }
}
