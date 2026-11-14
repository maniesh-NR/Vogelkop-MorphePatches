package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class tg8 extends nt5 {
    public LinkedHashMap t;
    public /* synthetic */ Object u;
    public final /* synthetic */ pjn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg8(pjn pjnVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = pjnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.j(null, null, this);
    }
}
