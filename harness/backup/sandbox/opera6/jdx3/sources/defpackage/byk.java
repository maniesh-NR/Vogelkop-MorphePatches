package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class byk extends cyk {
    public final String a;
    public final String b;
    public final Drawable c;

    public byk(String str, String str2, Drawable drawable) {
        this.a = str;
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byk)) {
            return false;
        }
        byk bykVar = (byk) obj;
        return Intrinsics.a(this.a, bykVar.a) && Intrinsics.a(this.b, bykVar.b) && Intrinsics.a(this.c, bykVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.c;
        return iHashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
