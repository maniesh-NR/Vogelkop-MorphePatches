package defpackage;

import android.util.Range;
import android.util.Rational;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qa8 {
    public final boolean a;
    public final Range b;
    public final Rational c;

    public qa8(boolean z, Range range, Rational rational) {
        this.a = z;
        this.b = range;
        this.c = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa8)) {
            return false;
        }
        qa8 qa8Var = (qa8) obj;
        return this.a == qa8Var.a && Intrinsics.a(this.b, qa8Var.b) && Intrinsics.a(this.c, qa8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 961)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=0, range=" + this.b + ", step=" + this.c + ')';
    }
}
