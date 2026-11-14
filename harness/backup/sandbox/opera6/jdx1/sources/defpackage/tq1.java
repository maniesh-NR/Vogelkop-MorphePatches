package defpackage;

import android.graphics.Typeface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tq1 {
    public final Typeface a;
    public final String b;
    public final int c;

    public tq1(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tq1)) {
            return false;
        }
        tq1 tq1Var = (tq1) obj;
        return this.c == tq1Var.c && Objects.equals(this.a, tq1Var.a) && Objects.equals(this.b, tq1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
