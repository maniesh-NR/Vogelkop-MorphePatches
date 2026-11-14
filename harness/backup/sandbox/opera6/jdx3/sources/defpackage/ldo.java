package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ldo implements Comparable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ldo(String str, String str2, String str3, int i, boolean z, Context context) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sko.v(context.getString(2132022715, Integer.valueOf(i)), " • ", context.getString(z ? 2132021875 : 2132021874));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c.compareTo(((ldo) obj).c);
    }
}
