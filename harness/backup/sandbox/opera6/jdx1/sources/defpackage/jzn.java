package defpackage;

/* loaded from: classes.dex */
public final class jzn implements Comparable {
    public final int a;
    public final fzn b;

    public jzn(int i, fzn fznVar) {
        this.a = i;
        this.b = fznVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((jzn) obj).a);
    }
}
