package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fcj {
    public final String a;
    public final File b;
    public final Uri c;
    public final long d;

    public fcj(String str, File file, Uri uri, long j) {
        this.a = str;
        this.b = file;
        this.c = uri;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcj)) {
            return false;
        }
        fcj fcjVar = (fcj) obj;
        return Intrinsics.a(this.a, fcjVar.a) && this.b.equals(fcjVar.b) && Intrinsics.a(this.c, fcjVar.c) && this.d == fcjVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
