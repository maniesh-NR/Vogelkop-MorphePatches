package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rte implements lkf, mkf {
    public final BrowserActivity a;
    public final gjm b;
    public final fqe c;
    public final ew3 d;
    public final x5f e;

    public rte(BrowserActivity browserActivity, gjm gjmVar, fqe fqeVar, ew3 ew3Var, x5f x5fVar) {
        this.a = browserActivity;
        this.b = gjmVar;
        this.c = fqeVar;
        this.d = ew3Var;
        this.e = x5fVar;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        if (!Intrinsics.a(cls, dte.class)) {
            if (Intrinsics.a(cls, sse.class)) {
                return new sse();
            }
            return null;
        }
        return new dte(this.c, (ru9) this.d.get(), this.e, this.a);
    }

    public final Fragment b(Class cls) {
        boolean zA = Intrinsics.a(cls, zse.class);
        gjm gjmVar = this.b;
        if (zA) {
            return new zse(this.a.l, gjmVar);
        }
        if (Intrinsics.a(cls, rse.class)) {
            return new rse(gjmVar);
        }
        return null;
    }
}
