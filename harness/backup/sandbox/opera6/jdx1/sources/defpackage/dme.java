package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class dme extends nt5 {
    public ulh t;
    public poe u;
    public poe v;
    public i4d w;
    public /* synthetic */ Object x;
    public final /* synthetic */ fme y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dme(fme fmeVar, nt5 nt5Var) {
        super(nt5Var);
        this.y = fmeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.j(null, null, null, this);
    }
}
