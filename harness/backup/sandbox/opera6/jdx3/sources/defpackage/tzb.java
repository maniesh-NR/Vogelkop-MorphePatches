package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tzb {
    public final String a;
    public final Locale b;
    public final String c;
    public final String d;

    public tzb() {
        this.a = "";
        this.b = null;
        this.c = "";
        this.d = "";
    }

    public tzb(Context context, String str) {
        this.a = str;
        this.b = wwc.f(str);
        xwc xwcVarA = ywc.a(str);
        String strA = aik.a(context.getString(xwcVarA.b));
        Objects.requireNonNull(strA);
        this.c = strA;
        this.d = xwcVarA.a;
    }
}
