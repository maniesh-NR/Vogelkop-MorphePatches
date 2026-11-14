package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class fle extends nt5 {
    public long t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ hle w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fle(hle hleVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = hleVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.B0(0L, 0L, this);
    }
}
