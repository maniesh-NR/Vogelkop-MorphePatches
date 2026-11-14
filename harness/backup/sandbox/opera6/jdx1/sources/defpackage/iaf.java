package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class iaf extends nt5 {
    public boolean t;
    public faf u;
    public /* synthetic */ Object v;
    public final /* synthetic */ kaf w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaf(kaf kafVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = kafVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.b(null, this);
    }
}
