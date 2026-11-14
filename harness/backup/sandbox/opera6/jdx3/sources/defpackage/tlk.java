package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tlk {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public tlk(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlk)) {
            return false;
        }
        tlk tlkVar = (tlk) obj;
        return Intrinsics.a(this.a, tlkVar.a) && Intrinsics.a(this.b, tlkVar.b) && Intrinsics.a(this.c, tlkVar.c) && this.d.equals(tlkVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
