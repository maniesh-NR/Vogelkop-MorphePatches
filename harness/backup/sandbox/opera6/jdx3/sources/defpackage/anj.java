package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class anj {
    public static final String[] d = {"www."};
    public final String a;
    public final String b;
    public final String c;

    public anj(String str) {
        this(str, "", "");
    }

    public anj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        String str = this.a;
        return str.length() > 0 ? str.substring(0, 1).toUpperCase(Locale.ROOT) : "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anj)) {
            return false;
        }
        anj anjVar = (anj) obj;
        return Intrinsics.a(this.a, anjVar.a) && Intrinsics.a(this.b, anjVar.b) && Intrinsics.a(this.c, anjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
