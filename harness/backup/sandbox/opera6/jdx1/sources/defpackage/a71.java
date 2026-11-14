package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class a71 {
    public final v31 a;
    public final Object b = new Object();
    public boolean c;
    public final y61 d;

    public a71(v31 v31Var) {
        this.a = v31Var;
        y61 y61Var = new y61();
        this.d = y61Var;
        if (v31Var.isAttachedToWindow()) {
            Context context = v31Var.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(y61Var);
                this.c = true;
            }
        }
        v31Var.addOnAttachStateChangeListener(new z61(this, (byte) 0));
    }

    public final q3a a() {
        q3a q3aVar;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            q3aVar = new q3a(new u3a());
        }
        return q3aVar;
    }

    public final void b(q3a q3aVar) {
        synchronized (this.b) {
            if (!q3aVar.s) {
                q3aVar.s = true;
                q3aVar.b();
            }
        }
    }
}
