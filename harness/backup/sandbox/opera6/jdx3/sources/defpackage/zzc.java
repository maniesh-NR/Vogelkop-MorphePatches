package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzc extends phj {
    public final byte[] t;

    public zzc(byte[] bArr) {
        this.t = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zzc) && this.t.equals(((zzc) obj).t);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.t);
    }

    public final String toString() {
        return "";
    }
}
