package defpackage;

import com.leanplum.core.BuildConfig;
import com.leanplum.internal.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d2 implements l2 {
    public static final d2 b = new d2();
    public static final String c = x1.b("1");
    public static final String d = x1.b(BuildConfig.BUILD_NUMBER);
    public static final s15 e = uqh.a(Boolean.TYPE);
    public static final String f = Constants.Kinds.BOOLEAN;

    @Override // defpackage.l2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        int iMin = Math.min(str.length(), 64);
        boolean z = false;
        String strSubstring = str.substring(0, iMin);
        String str2 = c;
        if (Intrinsics.a(strSubstring, str2)) {
            z = true;
        } else if (!Intrinsics.a(strSubstring, str2)) {
            qp2.o(sko.j("Boolean is malformed: ", strSubstring));
            return null;
        }
        return new z1(Boolean.valueOf(z), iMin);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return ((Boolean) obj).booleanValue() ? c : d;
    }

    @Override // defpackage.l2
    public final s15 d() {
        return e;
    }

    @Override // defpackage.l2
    public final String e(Object obj) {
        return ((Boolean) obj).booleanValue() ? c : d;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d2);
    }

    @Override // defpackage.l2
    public final String getName() {
        return f;
    }

    public final int hashCode() {
        return 1146361196;
    }

    public final String toString() {
        return "Bool";
    }
}
