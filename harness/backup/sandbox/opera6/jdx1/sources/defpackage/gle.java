package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class gle extends nt5 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ hle v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gle(hle hleVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = hleVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.f0(0L, this);
    }
}
