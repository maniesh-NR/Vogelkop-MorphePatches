package defpackage;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class z3g implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ z3g(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                if (((w3g) obj).a == this.b) {
                }
                break;
            case 1:
                if (((i7j) obj).a == this.b) {
                }
                break;
            default:
                if (((aln) obj).f() == this.b) {
                }
                break;
        }
        return false;
    }
}
