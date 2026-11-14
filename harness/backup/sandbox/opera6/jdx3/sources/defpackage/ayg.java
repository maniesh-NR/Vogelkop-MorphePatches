package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ayg {
    public final Class a;
    public final Class b;

    public ayg(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayg)) {
            return false;
        }
        ayg aygVar = (ayg) obj;
        return aygVar.a.equals(this.a) && aygVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}
