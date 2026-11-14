package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kvg {
    public final int a;
    public final long b;

    public kvg(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kvg.class == obj.getClass()) {
            kvg kvgVar = (kvg) obj;
            if (this.b == kvgVar.b && this.a == kvgVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b));
    }
}
