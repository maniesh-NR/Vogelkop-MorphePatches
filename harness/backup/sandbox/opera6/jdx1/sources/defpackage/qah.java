package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class qah extends nt5 {
    public float t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rah v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qah(rah rahVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = rahVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a1(0.0f, this);
    }
}
