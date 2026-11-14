package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x6j {
    public final Class a;
    public final int[] b;
    public final Function2 c;

    public x6j(Class cls, Function2 function2) {
        this(cls, new int[]{-1}, function2);
    }

    public x6j(Class cls, int[] iArr, Function2 function2) {
        this.a = cls;
        this.b = iArr;
        this.c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x6j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x6j x6jVar = (x6j) obj;
        return Intrinsics.a(this.a, x6jVar.a) && Arrays.equals(this.b, x6jVar.b) && Intrinsics.a(this.c, x6jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
