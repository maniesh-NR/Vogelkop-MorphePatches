package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k8l {
    public final String a;

    public k8l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k8l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((k8l) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
