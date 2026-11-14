package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zy8 {
    public final String a;
    public final byte[] b;

    public zy8(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        zy8 zy8Var = (zy8) obj;
        return this.a.equals(zy8Var.a) && Intrinsics.a(this.b, zy8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
