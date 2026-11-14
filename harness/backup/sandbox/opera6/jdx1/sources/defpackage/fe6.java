package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class fe6 extends nt5 {
    public int A;
    public boolean t;
    public Object u;
    public pqh v;
    public Serializable w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ie6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe6(ie6 ie6Var, nt5 nt5Var) {
        super(nt5Var);
        this.z = ie6Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= LinearLayoutManager.INVALID_OFFSET;
        return this.z.h(false, this);
    }
}
