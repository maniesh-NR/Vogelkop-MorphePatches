package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j1i extends nt5 {
    public /* synthetic */ Object A;
    public final /* synthetic */ k1i B;
    public int C;
    public String t;
    public ab4 u;
    public Function1 v;
    public nqh w;
    public AutoCloseable x;
    public x94 y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1i(k1i k1iVar, nt5 nt5Var) {
        super(nt5Var);
        this.B = k1iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= LinearLayoutManager.INVALID_OFFSET;
        return this.B.a(null, null, null, this);
    }
}
