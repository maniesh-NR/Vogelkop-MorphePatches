package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l94 {
    public Object a;
    public o94 b;
    public byh c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        byh byhVar = this.c;
        if (byhVar != null) {
            byhVar.addListener(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        o94 o94Var = this.b;
        boolean z = o94Var != null && o94Var.b.j(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        o94 o94Var = this.b;
        if (o94Var == null || !o94Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        o94 o94Var = this.b;
        boolean z = o94Var != null && o94Var.b.k(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        byh byhVar;
        o94 o94Var = this.b;
        if (o94Var != null && !o94Var.b.isDone()) {
            o94Var.a(new q6("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 1));
        }
        if (this.d || (byhVar = this.c) == null) {
            return;
        }
        byhVar.j(null);
    }
}
