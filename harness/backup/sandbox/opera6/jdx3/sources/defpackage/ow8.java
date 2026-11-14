package defpackage;

import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ow8 extends cu8 {
    public final /* synthetic */ xw8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow8(xw8 xw8Var, tni tniVar) {
        super(tniVar);
        this.m = xw8Var;
    }

    @Override // defpackage.ha2
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ab2 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ab2 ab2VarOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        isd isdVar = this.m.u;
        ((SparseIntArray) isdVar.b).put(i, ab2VarOnCreateViewHolder.U());
        return ab2VarOnCreateViewHolder;
    }
}
