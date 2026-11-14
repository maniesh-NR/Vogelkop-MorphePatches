package defpackage;

/* loaded from: classes.dex */
public final class u61 implements tgg {
    public final int a;

    public u61(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u61) && this.a == ((u61) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return p3p.i(this.a, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
