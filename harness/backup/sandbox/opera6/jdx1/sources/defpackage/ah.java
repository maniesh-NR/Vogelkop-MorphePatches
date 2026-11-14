package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class ah {
    public final ComponentName a;
    public final long b;
    public final float c;

    public ah(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ah.class != obj.getClass()) {
            return false;
        }
        ah ahVar = (ah) obj;
        ComponentName componentName = ahVar.a;
        ComponentName componentName2 = this.a;
        if (componentName2 == null) {
            if (componentName != null) {
                return false;
            }
        } else if (!componentName2.equals(componentName)) {
            return false;
        }
        return this.b == ahVar.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(ahVar.c);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int iHashCode = componentName == null ? 0 : componentName.hashCode();
        long j = this.b;
        return Float.floatToIntBits(this.c) + ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
    }
}
