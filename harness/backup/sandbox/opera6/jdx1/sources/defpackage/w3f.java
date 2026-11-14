package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w3f implements ozj {
    public final int a;
    public final Uri b;

    public w3f(Uri uri, int i) {
        this.a = i;
        this.b = uri;
    }

    public final String a() {
        return this.b.toString();
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3f)) {
            return false;
        }
        w3f w3fVar = (w3f) obj;
        return this.a == w3fVar.a && Intrinsics.a(this.b, w3fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
