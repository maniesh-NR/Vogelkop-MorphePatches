package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zh8 extends rhg {
    public final byte j;
    public final String k;
    public final int l;
    public final oj9 m;
    public final int n;
    public final jrd o;
    public final boolean p;

    public zh8(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zh8(int i, Exception exc, int i2, String str, int i3, oj9 oj9Var, int i4, jrd jrdVar, boolean z) {
        String str2;
        int i5;
        oj9 oj9Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            oj9Var2 = oj9Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            oj9Var2 = oj9Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            oj9Var2 = oj9Var;
            sb.append(oj9Var2);
            sb.append(", format_supported=");
            String str4 = tym.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    h9o.e();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(string, exc, i2, i, str2, i5, oj9Var2, i4, jrdVar, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zh8(String str, Throwable th, int i, int i2, String str2, int i3, oj9 oj9Var, int i4, jrd jrdVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        z4o.w(!z || i2 == 1);
        z4o.w(th != null || i2 == 3);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = oj9Var;
        this.n = i4;
        this.o = jrdVar;
        this.p = z;
    }

    public static zh8 h(int i, RuntimeException runtimeException) {
        return new zh8(2, runtimeException, i);
    }

    @Override // defpackage.rhg
    public final boolean d(rhg rhgVar) {
        if (!super.d(rhgVar)) {
            return false;
        }
        String str = tym.a;
        zh8 zh8Var = (zh8) rhgVar;
        return this.j == zh8Var.j && Objects.equals(this.k, zh8Var.k) && this.l == zh8Var.l && Objects.equals(this.m, zh8Var.m) && this.n == zh8Var.n && Objects.equals(this.o, zh8Var.o) && this.p == zh8Var.p;
    }

    public final zh8 g(jrd jrdVar) {
        String message = getMessage();
        String str = tym.a;
        return new zh8(message, getCause(), this.a, this.j, this.k, this.l, this.m, this.n, jrdVar, this.b, this.p);
    }
}
