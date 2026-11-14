package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m8h extends nt5 {
    public wvh t;
    public Iterator u;
    public /* synthetic */ Object v;
    public final /* synthetic */ q8h w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8h(q8h q8hVar, nt5 nt5Var) {
        super(nt5Var);
        this.w = q8hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= LinearLayoutManager.INVALID_OFFSET;
        return this.w.e(null, this);
    }
}
