package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class pae extends nt5 {
    public spi t;
    public mqh u;
    public float v;
    public /* synthetic */ Object w;
    public final /* synthetic */ sae x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pae(sae saeVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = saeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.g(null, null, 0.0f, 0.0f, this);
    }
}
