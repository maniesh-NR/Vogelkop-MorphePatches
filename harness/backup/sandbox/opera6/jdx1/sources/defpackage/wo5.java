package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wo5 {
    public final Uri a;
    public final boolean b;

    public wo5(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wo5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wo5 wo5Var = (wo5) obj;
        return Intrinsics.a(this.a, wo5Var.a) && this.b == wo5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
