package defpackage;

/* loaded from: classes.dex */
public final class v26 implements r2m {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public v26(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        qp2.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.r2m
    public final z2m a(jza jzaVar) {
        if ((jzaVar instanceof xnk) && ((xnk) jzaVar).c != dd6.a) {
            return new w26(jzaVar, this.b);
        }
        return new yze(jzaVar);
    }
}
