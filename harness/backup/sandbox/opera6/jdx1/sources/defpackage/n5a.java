package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n5a implements GenericArrayType, Serializable {
    public final Type a;

    public n5a(Type type) {
        Objects.requireNonNull(type);
        this.a = phj.C(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && phj.P(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return phj.B0(this.a) + "[]";
    }
}
