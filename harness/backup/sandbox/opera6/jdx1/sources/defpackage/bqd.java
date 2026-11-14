package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class bqd {
    public dqd a;

    public bqd(String str, int i, int i2) {
        if (str == null) {
            t3p.q("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            qp2.o("packageName should be nonempty");
            throw null;
        }
        this.a = new dqd(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bqd) {
            return this.a.equals(((bqd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
