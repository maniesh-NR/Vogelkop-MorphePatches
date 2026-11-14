package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class tc5 extends esf implements Serializable {
    public final c9 a;

    public tc5(c9 c9Var) {
        this.a = c9Var;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof tc5) && this.a == ((tc5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
