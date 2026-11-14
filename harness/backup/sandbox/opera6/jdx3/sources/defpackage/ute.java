package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ute extends oh4 {
    public final Context b;
    public final /* synthetic */ wte c;

    public ute(wte wteVar, Context context) {
        this.c = wteVar;
        this.b = context;
    }

    @Override // defpackage.oh4
    public final void b() {
        wte wteVar = this.c;
        if (wteVar.n.isEmpty() || !wteVar.a()) {
            wteVar.b();
        }
        e();
    }

    @Override // defpackage.oh4
    public final void d(Object obj) {
        l1c l1cVar = (l1c) obj;
        if (l1cVar == null) {
            return;
        }
        l0c l0cVar = l1cVar.c;
        wte wteVar = this.c;
        wteVar.u = l0cVar;
        wteVar.t = new x77(this.b, l1cVar);
        wteVar.b();
    }

    @Override // defpackage.oh4
    public final void e() {
        this.c.c.a(this);
    }
}
