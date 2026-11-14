package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ib9 extends hb9 {
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final Uri l;

    public ib9(long j, long j2, String str, String str2, String str3, String str4, String str5, long j3, long j4, String str6, Uri uri) {
        super(j, j2, str);
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = j3;
        this.j = j4;
        this.k = str6;
        this.l = uri;
    }

    public final boolean e() {
        return this.i <= System.currentTimeMillis();
    }
}
