package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class iu5 implements j8f {
    public final String a;
    public final String b;
    public final String c;

    public iu5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.j8f
    public final String a() {
        return this.b;
    }

    @Override // defpackage.j8f
    public final Uri b() {
        return Uri.parse("https://picsum.photos/200/300");
    }

    @Override // defpackage.j8f
    public final String c() {
        return this.c;
    }

    @Override // defpackage.j8f
    public final Double d() {
        return Double.valueOf(8.5d);
    }

    @Override // defpackage.j8f
    public final String getTitle() {
        return this.a;
    }

    @Override // defpackage.j8f
    public final Uri getUrl() {
        return Uri.parse("https://booking.com");
    }
}
