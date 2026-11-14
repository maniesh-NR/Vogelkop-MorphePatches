package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class ym3 {
    public final ml3 a;
    public final SparseArray b = new SparseArray();

    public ym3(ml3 ml3Var) {
        this.a = ml3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym3) {
            return this.a.equals(((ym3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
