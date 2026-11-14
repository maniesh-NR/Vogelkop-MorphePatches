package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class rlh implements lak, f99, pr9 {
    public final /* synthetic */ nak a;
    private final unb job;

    public rlh(nak nakVar, d3k d3kVar) {
        this.a = nakVar;
        this.job = d3kVar;
    }

    @Override // defpackage.pr9
    public final f99 b(CoroutineContext coroutineContext, int i, h04 h04Var) {
        return (((i < 0 || i >= 2) && i != -2) || h04Var != h04.b) ? ipe.x(this, coroutineContext, i, h04Var) : this;
    }

    public final Object collect(l99 l99Var, mt5 mt5Var) {
        this.a.collect(l99Var, mt5Var);
        return px5.a;
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}
