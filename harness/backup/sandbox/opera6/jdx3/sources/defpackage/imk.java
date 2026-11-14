package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class imk {
    public final String a;
    public final double b;

    public imk(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imk)) {
            return false;
        }
        imk imkVar = (imk) obj;
        if (Double.compare(imkVar.b, this.b) != 0) {
            return false;
        }
        return this.a.equals(imkVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Double.valueOf(this.b));
    }
}
