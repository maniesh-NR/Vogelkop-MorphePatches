package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class pt5 extends AtomicBoolean implements OutcomeReceiver {

    @NotNull
    private final mt5<Object> a;

    public pt5(nh4 nh4Var) {
        super(false);
        this.a = nh4Var;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            mt5<Object> mt5Var = this.a;
            p0i p0iVar = t0i.b;
            mt5Var.resumeWith(new q0i(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            mt5<Object> mt5Var = this.a;
            p0i p0iVar = t0i.b;
            mt5Var.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ")";
    }
}
