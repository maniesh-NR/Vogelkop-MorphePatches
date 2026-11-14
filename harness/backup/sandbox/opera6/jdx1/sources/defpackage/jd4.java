package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jd4 {
    public final fd4 a;
    public final Map b;

    public jd4(fd4 fd4Var, Map map) {
        this.a = fd4Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd4)) {
            return false;
        }
        jd4 jd4Var = (jd4) obj;
        return this.a.equals(jd4Var.a) && Intrinsics.a(this.b, jd4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.a + ", streamConfigMap=" + this.b + ')';
    }
}
