package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class wm6 extends nt5 {
    public String t;
    public String u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ne5 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm6(ne5 ne5Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = ne5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.H(this);
    }
}
