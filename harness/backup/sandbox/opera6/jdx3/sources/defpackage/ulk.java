package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ulk {
    public final String a;
    public final Date b;
    public final boolean c;

    public ulk(String str, Date date, boolean z) {
        this.a = str;
        this.b = date;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulk)) {
            return false;
        }
        ulk ulkVar = (ulk) obj;
        return Intrinsics.a(this.a, ulkVar.a) && Intrinsics.a(this.b, ulkVar.b) && this.c == ulkVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
