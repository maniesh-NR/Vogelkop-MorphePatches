package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class sd4 {
    public final String a;

    public static void a(String str) {
        if (StringsKt.N(str)) {
            qp2.o("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return sko.j("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sd4) {
            return Intrinsics.a(this.a, ((sd4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
