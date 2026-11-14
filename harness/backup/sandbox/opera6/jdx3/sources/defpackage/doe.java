package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class doe {

    @NotNull
    public static final coe Companion = new coe();
    public static final l4c[] f = {null, null, null, null, z4c.a(f7c.b, new vme(9))};
    public final String a;
    public final String b;
    public final String c;
    public final cpe d;
    public final List e;

    public /* synthetic */ doe(int i, String str, String str2, String str3, cpe cpeVar, List list) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, boe.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cpeVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doe)) {
            return false;
        }
        doe doeVar = (doe) obj;
        return Intrinsics.a(this.a, doeVar.a) && Intrinsics.a(this.b, doeVar.b) && Intrinsics.a(this.c, doeVar.c) && Intrinsics.a(this.d, doeVar.d) && Intrinsics.a(this.e, doeVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        List list = this.e;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "";
    }
}
