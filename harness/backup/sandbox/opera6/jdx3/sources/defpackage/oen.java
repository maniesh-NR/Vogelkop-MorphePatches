package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oen {
    public static final oen d = new oen(null, null, false);
    public final Integer a;
    public final CharSequence b;
    public final boolean c;

    public oen(Integer num, CharSequence charSequence, boolean z) {
        this.a = num;
        this.b = charSequence;
        this.c = z;
    }

    public static oen a(oen oenVar, Integer num, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            num = oenVar.a;
        }
        if ((i & 2) != 0) {
            charSequence = oenVar.b;
        }
        boolean z = (i & 4) != 0 ? oenVar.c : true;
        oenVar.getClass();
        return new oen(num, charSequence, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oen)) {
            return false;
        }
        oen oenVar = (oen) obj;
        return Intrinsics.a(this.a, oenVar.a) && Intrinsics.a(this.b, oenVar.b) && this.c == oenVar.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
