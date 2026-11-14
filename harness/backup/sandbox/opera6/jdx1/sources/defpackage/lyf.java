package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public class lyf {
    public final Object a;
    public final Object b;

    public lyf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lyf)) {
            return false;
        }
        lyf lyfVar = (lyf) obj;
        return Objects.equals(lyfVar.a, this.a) && Objects.equals(lyfVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return am2.o(sb, this.b, "}");
    }
}
