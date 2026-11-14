package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jjd {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final UUID a;
    public final UUID b;
    public final Uri c;
    public final l1b d;
    public final l1b e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final h1b i;
    public final byte[] j;

    static {
        String str = tym.a;
        k = "0";
        l = "1";
        m = "2";
        n = "3";
        o = "4";
        p = "5";
        q = "6";
        r = "7";
    }

    public jjd(ijd ijdVar) {
        z4o.H((ijdVar.c && ((Uri) ijdVar.e) == null) ? false : true);
        UUID uuid = (UUID) ijdVar.d;
        uuid.getClass();
        this.a = uuid;
        this.b = uuid;
        this.c = (Uri) ijdVar.e;
        l1b l1bVar = (l1b) ijdVar.f;
        this.d = l1bVar;
        this.e = l1bVar;
        this.f = ijdVar.a;
        this.h = ijdVar.c;
        this.g = ijdVar.b;
        this.i = (h1b) ijdVar.g;
        byte[] bArr = (byte[]) ijdVar.h;
        this.j = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjd)) {
            return false;
        }
        jjd jjdVar = (jjd) obj;
        return this.a.equals(jjdVar.a) && Objects.equals(this.c, jjdVar.c) && Objects.equals(this.e, jjdVar.e) && this.f == jjdVar.f && this.h == jjdVar.h && this.g == jjdVar.g && this.i.equals(jjdVar.i) && Arrays.equals(this.j, jjdVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.c;
        return Arrays.hashCode(this.j) + ((this.i.hashCode() + ((((((((this.e.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31)) * 31);
    }
}
