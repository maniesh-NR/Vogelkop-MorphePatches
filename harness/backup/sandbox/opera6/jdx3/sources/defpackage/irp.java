package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class irp {
    public static final irp c;
    public final Integer a;
    public final Map b;

    static {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (mapUnmodifiableMap != null) {
            c = new irp(null, mapUnmodifiableMap);
        } else {
            t3p.q("Null splitInstallErrorCodeByModule");
        }
    }

    public irp(Integer num, Map map) {
        this.a = num;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof irp) {
            irp irpVar = (irp) obj;
            Integer num = irpVar.a;
            Integer num2 = this.a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.b.equals(irpVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.a + ", splitInstallErrorCodeByModule=" + String.valueOf(this.b) + "}";
    }
}
