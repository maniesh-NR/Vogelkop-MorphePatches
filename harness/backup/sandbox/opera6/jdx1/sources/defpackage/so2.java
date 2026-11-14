package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class so2 {
    public static final so2 c = new so2(0, 2);
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final ao5 e = new ao5(new so2(0, 1));
    public final int a;
    public final int b;

    public so2(int i, int i2) {
        this.a = i;
        if (i2 != 0) {
            this.b = i2;
        } else {
            t3p.q("Null streamState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof so2)) {
            return false;
        }
        so2 so2Var = (so2) obj;
        return this.a == so2Var.a && vep.e(this.b, so2Var.b);
    }

    public final int hashCode() {
        return (((this.a ^ 1000003) * 1000003) ^ vep.A(this.b)) * 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=null}");
        return sb.toString();
    }
}
