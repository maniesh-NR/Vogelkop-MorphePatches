package defpackage;

/* loaded from: classes.dex */
public final class ff4 implements i1i {
    public final /* synthetic */ byte b;
    public final i1i c;

    public ff4(long j, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = new nql(j, new ef4(j));
                break;
            default:
                this.c = new ff4(j, (byte) 1);
                break;
        }
    }

    @Override // defpackage.i1i
    public final long a() {
        byte b = this.b;
        i1i i1iVar = this.c;
        switch (b) {
            case 0:
                return ((nql) ((ff4) i1iVar).c).b;
            default:
                return ((nql) i1iVar).b;
        }
    }

    @Override // defpackage.i1i
    public final h1i b(df4 df4Var) {
        byte b = this.b;
        i1i i1iVar = this.c;
        switch (b) {
            case 0:
                if (((nql) ((ff4) i1iVar).c).b(df4Var).b) {
                    return h1i.e;
                }
                sg4 sg4Var = df4Var.c;
                return (!(sg4Var instanceof sg4) || sg4Var.a <= 0) ? h1i.d : h1i.f;
            default:
                return ((nql) i1iVar).b(df4Var);
        }
    }
}
