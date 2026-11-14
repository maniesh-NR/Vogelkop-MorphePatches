package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class kk6 extends nt5 {
    public Context t;
    public i8f u;
    public h8f v;
    public /* synthetic */ Object w;
    public final /* synthetic */ lk6 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk6(lk6 lk6Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = lk6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.e(null, null, this);
    }
}
