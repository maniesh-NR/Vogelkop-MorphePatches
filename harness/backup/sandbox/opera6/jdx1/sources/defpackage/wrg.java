package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class wrg implements srg, Serializable {
    public final Class a;

    public wrg(Class cls) {
        this.a = cls;
    }

    public final boolean apply(Object obj) {
        return this.a.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wrg) && this.a == ((wrg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
