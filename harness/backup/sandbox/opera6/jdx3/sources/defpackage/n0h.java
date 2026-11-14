package defpackage;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class n0h implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ n0h(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return ((loj) obj).a.equals(str);
            case 1:
                return str.equals(((aln) obj).getId());
            case 2:
                return am2.c(((aln) obj).f()).equals(str);
            default:
                return ((aln) obj).getId().equals(str);
        }
    }
}
