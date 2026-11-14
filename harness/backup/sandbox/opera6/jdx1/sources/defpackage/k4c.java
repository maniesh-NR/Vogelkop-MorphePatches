package defpackage;

import com.opera.android.Lazy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k4c extends lim implements bg1 {
    public final /* synthetic */ tcc a;
    public final /* synthetic */ yo7 b;
    public final /* synthetic */ Lazy c;

    public k4c(Lazy lazy, tcc tccVar, yo7 yo7Var) {
        this.a = tccVar;
        this.b = yo7Var;
        Objects.requireNonNull(lazy);
        this.c = lazy;
    }

    public final void W(ndc ndcVar) {
        this.c.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.b(this);
    }

    public final void run(Object obj) {
        vml.e(new qn(this, this.a, this.b, obj, (byte) 11));
    }
}
