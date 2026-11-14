package defpackage;

/* loaded from: classes.dex */
public abstract class o53 implements go5 {
    public final k73 a;

    public o53(k73 k73Var) {
        this.a = k73Var;
    }

    @Override // defpackage.go5
    public final boolean a(h5o h5oVar) {
        return c(h5oVar) && e(this.a.s());
    }

    @Override // defpackage.go5
    public final j94 b(xo5 xo5Var) {
        return f03.g(new r3((byte) 6, (mt5) null, (Object) this));
    }

    public int d() {
        return 7;
    }

    public boolean e(Object obj) {
        toe toeVar = (toe) obj;
        return (toeVar.a && toeVar.c) ? false : true;
    }
}
