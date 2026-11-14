package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l3d {
    public final Object a;
    public final Throwable b;

    public l3d(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public l3d(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3d)) {
            return false;
        }
        l3d l3dVar = (l3d) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(l3dVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || l3dVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
