package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pb1 implements Choreographer.FrameCallback {
    public final /* synthetic */ nh4 a;
    public final /* synthetic */ Function1 b;

    public pb1(nh4 nh4Var, qb1 qb1Var, Function1 function1) {
        this.a = nh4Var;
        this.b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object q0iVar;
        Function1 function1 = this.b;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        this.a.resumeWith(q0iVar);
    }
}
