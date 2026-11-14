package defpackage;

/* loaded from: classes.dex */
public final class ap2 {
    public final int a;
    public final gwa b;

    public ap2(int i, gwa gwaVar) {
        this.a = i;
        this.b = gwaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ap2) {
            ap2 ap2Var = (ap2) obj;
            return this.a == ap2Var.a && this.b == ap2Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
