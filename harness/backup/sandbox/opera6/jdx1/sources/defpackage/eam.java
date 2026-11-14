package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public class eam<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public eam(Type type) {
        Objects.requireNonNull(type);
        Type typeC = phj.C(type);
        this.b = typeC;
        this.a = phj.U(typeC);
        this.c = typeC.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eam) {
            return phj.P(this.b, ((eam) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return phj.B0(this.b);
    }
}
