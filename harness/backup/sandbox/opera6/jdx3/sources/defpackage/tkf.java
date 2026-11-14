package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class tkf {
    public final String a;
    public int b;
    public int c;

    public tkf(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return this.a + "\t" + this.b + "\t" + this.c;
    }
}
