package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class tpc {
    public final String a;
    public final String b;
    public final String c;

    public tpc(String str, String str2, String str3) {
        this.a = str != null ? str.toLowerCase(Locale.ROOT) : null;
        this.b = str2 != null ? str2.toLowerCase(Locale.ROOT) : null;
        this.c = str3.toLowerCase(Locale.ROOT);
    }
}
