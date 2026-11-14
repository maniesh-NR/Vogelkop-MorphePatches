package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class xlh extends nt5 {
    public int A;
    public ewh t;
    public bza u;
    public y55 v;
    public jva w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ylh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlh(ylh ylhVar, nt5 nt5Var) {
        super(nt5Var);
        this.z = ylhVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        return this.z.a(null, 0, this);
    }
}
