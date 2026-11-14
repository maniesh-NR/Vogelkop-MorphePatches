package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class plh implements gdj, f99, pr9 {
    public final /* synthetic */ jdj a;
    private final unb job;

    public plh(jdj jdjVar, d3k d3kVar) {
        this.a = jdjVar;
        this.job = d3kVar;
    }

    @Override // defpackage.pr9
    public final f99 b(CoroutineContext coroutineContext, int i, h04 h04Var) {
        return ipe.x(this, coroutineContext, i, h04Var);
    }

    public final Object collect(l99 l99Var, mt5 mt5Var) {
        this.a.collect(l99Var, mt5Var);
        return px5.a;
    }
}
