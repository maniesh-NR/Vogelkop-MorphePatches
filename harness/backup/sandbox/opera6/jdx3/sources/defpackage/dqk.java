package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dqk extends gqk {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dqk.class.equals(obj.getClass())) {
            dqk dqkVar = (dqk) obj;
            if (this.a == dqkVar.a && this.b == dqkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
