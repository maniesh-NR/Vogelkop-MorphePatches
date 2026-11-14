package defpackage;

/* loaded from: classes.dex */
public final class kq6 extends nt5 {
    public String t;
    public String u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ s9i x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq6(s9i s9iVar, nt5 nt5Var) {
        super(nt5Var);
        this.x = s9iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        Object objV = this.x.V(null, this);
        return objV == px5.a ? objV : new t0i(objV);
    }
}
