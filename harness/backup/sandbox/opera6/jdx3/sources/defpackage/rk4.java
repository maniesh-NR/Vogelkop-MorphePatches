package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class rk4 implements sk4 {
    public final Set a;

    public rk4(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof rk4) && this.a.equals(((rk4) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
