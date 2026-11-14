package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jsj {
    public final String a;
    public final Function0 b;

    public jsj(String str, ynh ynhVar, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsj)) {
            return false;
        }
        jsj jsjVar = (jsj) obj;
        return Intrinsics.a(this.a, jsjVar.a) && Intrinsics.a(null, null) && Intrinsics.a(this.b, jsjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((((str == null ? 0 : str.hashCode()) * 31) + 0) * 31);
    }

    public final String toString() {
        return "SnackbarData(message=" + this.a + ", action=" + ((Object) null) + ", onShown=" + this.b + ")";
    }
}
