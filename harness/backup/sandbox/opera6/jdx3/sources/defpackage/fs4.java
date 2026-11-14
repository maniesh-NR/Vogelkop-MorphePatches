package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fs4 {
    public final String a;
    public final ebb b;
    public final byte[] c;

    public fs4(String str, ebb ebbVar, byte[] bArr) {
        this.a = str;
        this.b = ebbVar;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs4)) {
            return false;
        }
        fs4 fs4Var = (fs4) obj;
        return this.a.equals(fs4Var.a) && Intrinsics.a(this.b, fs4Var.b) && Intrinsics.a(this.c, fs4Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
