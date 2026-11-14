package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lvg {
    public final int a;
    public final int b;

    public lvg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvg)) {
            return false;
        }
        lvg lvgVar = (lvg) obj;
        return this.a == lvgVar.a && this.b == lvgVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
