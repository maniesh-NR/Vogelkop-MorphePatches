package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class npi extends nt5 {
    public oqh t;
    public /* synthetic */ Object u;
    public final /* synthetic */ spi v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npi(spi spiVar, nt5 nt5Var) {
        super(nt5Var);
        this.v = spiVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.a(0L, this);
    }
}
