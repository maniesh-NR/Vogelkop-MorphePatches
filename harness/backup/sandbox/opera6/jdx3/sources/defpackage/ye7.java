package defpackage;

/* loaded from: classes.dex */
public final class ye7 extends yvj {
    public final vvj b;

    public ye7(ze7 ze7Var, vvj vvjVar) {
        super(ze7Var);
        this.b = vvjVar;
    }

    @Override // defpackage.qw4
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.qw4
    public final boolean b(Object obj, Object obj2) {
        return ((xe7) obj).a == ((xe7) obj2).a;
    }

    @Override // defpackage.qw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xe7 xe7Var = (xe7) obj;
        xe7 xe7Var2 = (xe7) obj2;
        boolean z = xe7Var.c;
        boolean z2 = xe7Var2.c;
        long j = xe7Var2.a;
        if (z != z2) {
            return z ? 1 : -1;
        }
        long j2 = xe7Var.a;
        return (j2 < 0 || j < 0) ? cs5.p(j2, j) : this.b.b.compare(xe7Var.d, xe7Var2.d);
    }
}
