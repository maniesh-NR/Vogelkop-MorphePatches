package defpackage;

import java.util.Arrays;
import java.util.Objects;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class u28 {
    public final byte[] a;
    public final String b;
    public final byte[] c;

    public u28(byte[] bArr, String str, byte[] bArr2) {
        this.a = bArr;
        this.b = str;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u28)) {
            return false;
        }
        u28 u28Var = (u28) obj;
        return Arrays.equals(this.a, u28Var.a) && this.b.contentEquals(u28Var.b) && Arrays.equals(this.c, u28Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        return "EncryptedTopic { ".concat("EncryptedTopic=" + c.i(this.a) + ", KeyIdentifier=" + this.b + ", EncapsulatedKey=" + c.i(this.c) + " }");
    }
}
