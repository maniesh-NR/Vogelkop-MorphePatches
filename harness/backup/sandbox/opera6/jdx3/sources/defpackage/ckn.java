package defpackage;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ckn {
    public final String a;
    public final Rect b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public ckn(String str, Rect rect, float f, float f2, float f3, float f4, float f5) {
        this.a = str;
        this.b = rect;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckn)) {
            return false;
        }
        ckn cknVar = (ckn) obj;
        return Intrinsics.a(this.a, cknVar.a) && Intrinsics.a(this.b, cknVar.b) && Float.compare(this.c, cknVar.c) == 0 && Float.compare(this.d, cknVar.d) == 0 && Float.compare(this.e, cknVar.e) == 0 && Float.compare(this.f, cknVar.f) == 0 && Float.compare(this.g, cknVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + sko.d(this.f, sko.d(this.e, sko.d(this.d, sko.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
