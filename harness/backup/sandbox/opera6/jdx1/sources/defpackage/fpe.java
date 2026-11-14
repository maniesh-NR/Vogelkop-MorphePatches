package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fpe {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ gpe c;

    public fpe(gpe gpeVar, ol6 ol6Var, Executor executor) {
        this.c = gpeVar;
        this.a = new WeakReference(ol6Var);
        this.b = executor;
    }
}
