package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kj2 extends sj2 {
    public final /* synthetic */ byte f = 0;
    public final Object g;

    public kj2(Context context, int i, zy9 zy9Var, Runnable runnable) {
        super(context, 2132017591, i, zy9Var);
        this.g = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(cd9 cd9Var, Context context, s6h s6hVar, ode odeVar) {
        super(context, 0, 2132022045, s6hVar);
        this.g = odeVar;
        Objects.requireNonNull(cd9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(vj2 vj2Var, Activity activity, int i, eme emeVar) {
        super(activity, 2132017591, i, emeVar);
        this.g = vj2Var;
    }

    @Override // defpackage.sj2
    public final void i() {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ArrayDeque arrayDeque = ((vj2) obj).e;
                while (!arrayDeque.isEmpty()) {
                    ((Runnable) ((Pair) arrayDeque.removeFirst()).first).run();
                }
                break;
            default:
                ((ode) obj).r(Boolean.TRUE);
                break;
        }
    }
}
