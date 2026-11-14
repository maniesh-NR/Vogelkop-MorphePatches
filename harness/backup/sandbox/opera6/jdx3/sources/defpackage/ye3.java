package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class ye3 implements fbh {
    public final WeakReference a;

    public ye3(fbh fbhVar) {
        this.a = new WeakReference(fbhVar);
    }

    @Override // defpackage.fbh
    public final void a(mf3 mf3Var, List list) {
        fbh fbhVar = (fbh) this.a.get();
        if (fbhVar == null) {
            return;
        }
        fbhVar.a(mf3Var, list);
    }
}
