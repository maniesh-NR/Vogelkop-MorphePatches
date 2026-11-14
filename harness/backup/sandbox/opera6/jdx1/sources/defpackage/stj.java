package defpackage;

/* loaded from: classes.dex */
public final class stj implements qn7 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public stj(int i) {
        this.a = i;
    }

    @Override // defpackage.we1
    public final a1n a(j8m j8mVar) {
        return new ng2((byte) 7, this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof stj) && ((stj) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
