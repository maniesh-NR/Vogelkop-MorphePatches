package defpackage;

/* loaded from: classes.dex */
public final class p41 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p41(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p41) {
            return this.a == ((p41) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
