package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class jaf extends nt5 {
    public Object t;
    public w6g u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ kaf x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaf(kaf kafVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = kafVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.c(null, this);
    }
}
