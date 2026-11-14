package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0b {
    public final Resources.Theme a;
    public final int b;

    public a0b(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0b)) {
            return false;
        }
        a0b a0bVar = (a0b) obj;
        return Intrinsics.a(this.a, a0bVar.a) && this.b == a0bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
