package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g35 extends kfo {
    public final r25[] k;

    public g35(r25[] r25VarArr) {
        this.k = r25VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return g35.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.k, ((g35) obj).k);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.k);
    }

    public final String toString() {
        return "";
    }
}
