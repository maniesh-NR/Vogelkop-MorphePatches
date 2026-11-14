package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p8h extends nt5 {
    public String t;
    public qwh u;
    public Iterator v;
    public zf w;
    public /* synthetic */ Object x;
    public final /* synthetic */ q8h y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8h(q8h q8hVar, nt5 nt5Var) {
        super(nt5Var);
        this.y = q8hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= LinearLayoutManager.INVALID_OFFSET;
        return this.y.h(null, null, this);
    }
}
