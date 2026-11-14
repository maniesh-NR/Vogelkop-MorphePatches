package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class pr4 extends tr4 {
    private volatile /* synthetic */ int consumed$volatile;
    public final or4 d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(pr4.class, "consumed$volatile");
    }

    public /* synthetic */ pr4(or4 or4Var) {
        this(or4Var, h.a, -3, h04.a);
    }

    public pr4(or4 or4Var, CoroutineContext coroutineContext, int i, h04 h04Var) {
        super(coroutineContext, i, h04Var);
        this.d = or4Var;
    }

    public final String c() {
        return "channel=" + this.d;
    }

    public final Object collect(l99 l99Var, mt5 mt5Var) throws Throwable {
        if (((tr4) this).b == -3) {
            Object objG = fr3.G(l99Var, this.d, false, mt5Var);
            return objG == px5.a ? objG : Unit.a;
        }
        Object objCollect = super.collect(l99Var, mt5Var);
        return objCollect == px5.a ? objCollect : Unit.a;
    }

    public final Object d(z1h z1hVar, mt5 mt5Var) throws Throwable {
        Object objG = fr3.G(new i1j(z1hVar), this.d, false, mt5Var);
        return objG == px5.a ? objG : Unit.a;
    }

    public final tr4 e(CoroutineContext coroutineContext, int i, h04 h04Var) {
        return new pr4(this.d, coroutineContext, i, h04Var);
    }

    public final f99 f() {
        return new pr4(this.d);
    }

    public final or4 g(nx5 nx5Var) {
        return ((tr4) this).b == -3 ? this.d : super.g(nx5Var);
    }
}
