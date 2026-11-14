package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ctm {
    public final a64 a;
    public final Executor b;
    public final b2j c;
    public final ThreadLocal d;
    public final k31 e;
    public final a64 f;

    public ctm(a64 a64Var, Executor executor) {
        this.a = a64Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new b2j(executor);
        this.d = new ThreadLocal();
        k31 k31Var = new k31(this, (byte) 6);
        this.e = k31Var;
        this.f = sgb.b(a64Var.b.plus(zch.a()).plus(fr3.I(k31Var)));
    }
}
