package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p5a implements WildcardType, Serializable {
    public final Type a;
    public final Type b;

    public p5a(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            qp2.o("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            qp2.o("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            phj.D(typeArr[0]);
            this.b = null;
            this.a = phj.C(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        phj.D(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            qp2.o("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.b = phj.C(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && phj.P(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : phj.g;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + phj.B0(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + phj.B0(type2);
    }
}
