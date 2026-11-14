package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class nd6 {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final byte b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final byte h;

    static {
        rjd.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nd6(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        z4o.w(j >= 0);
        z4o.w(j >= 0);
        z4o.w(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final md6 a() {
        md6 md6Var = new md6();
        md6Var.a = this.a;
        md6Var.b = this.b;
        md6Var.c = this.c;
        md6Var.d = this.d;
        md6Var.e = this.e;
        md6Var.f = this.f;
        md6Var.g = this.g;
        md6Var.h = this.h;
        return md6Var;
    }

    public final nd6 b(long j) {
        long j2 = this.f;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new nd6(this.a, this.b, this.c, this.d, this.e + j, j3, this.g, this.h);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        byte b = this.b;
        if (b == 1) {
            str = "GET";
        } else if (b == 2) {
            str = "POST";
        } else {
            if (b != 3) {
                h9o.e();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return p3p.k(this.h, "]", sb);
    }
}
