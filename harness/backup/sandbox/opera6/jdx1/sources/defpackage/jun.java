package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jun {
    public final lun[] a;
    public final String b;
    public final byte[] c;
    public final boolean d;

    public jun(String str, lun[] lunVarArr) {
        this.b = str;
        this.c = null;
        this.a = lunVarArr;
        this.d = false;
    }

    public jun(byte[] bArr, lun[] lunVarArr) {
        Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = lunVarArr;
        this.d = true;
    }

    public final void a(int i) {
        boolean z = this.d;
        if (i == z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        sb.append(z ? !z ? "Unknown" : "ArrayBuffer" : "String");
        sb.append(" expected, but got ");
        sb.append(i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String");
        throw new IllegalStateException(sb.toString());
    }

    public final String b() {
        a(0);
        return this.b;
    }
}
