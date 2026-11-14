package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wwo {

    @NotNull
    public static final vwo Companion = new vwo();
    public final String a;
    public final String b;
    public final zwo c;

    public wwo(int i, String str, String str2, zwo zwoVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, two.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zwoVar;
        }
    }

    public wwo(String str, String str2, zwo zwoVar) {
        this.a = str;
        this.b = str2;
        this.c = zwoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwo)) {
            return false;
        }
        wwo wwoVar = (wwo) obj;
        return Intrinsics.a(this.a, wwoVar.a) && Intrinsics.a(this.b, wwoVar.b) && Intrinsics.a(this.c, wwoVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        zwo zwoVar = this.c;
        return iHashCode2 + (zwoVar != null ? zwoVar.hashCode() : 0);
    }

    public final String toString() {
        return "User(userId=" + this.a + ", consent=" + this.b + ", ext=" + this.c + ')';
    }
}
