package defpackage;

/* loaded from: classes.dex */
public abstract class fgd extends wz4 {
    public final long j;

    public fgd(ed6 ed6Var, nd6 nd6Var, oj9 oj9Var, int i, Object obj, long j, long j2, long j3) {
        super(ed6Var, nd6Var, 1, oj9Var, i, obj, j, j2);
        oj9Var.getClass();
        this.j = j3;
    }

    public long a() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public boolean b() {
        throw null;
    }
}
