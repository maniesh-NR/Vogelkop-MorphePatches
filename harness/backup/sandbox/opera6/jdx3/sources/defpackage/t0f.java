package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class t0f {
    public final int a;
    public final Bitmap b;
    public final CharSequence c;
    public final PendingIntent d;
    public final int e;
    public final String f;

    public t0f(Bitmap bitmap, CharSequence charSequence, PendingIntent pendingIntent, int i, String str) {
        this.a = 0;
        this.b = bitmap;
        this.c = charSequence;
        this.d = pendingIntent;
        this.e = i;
        this.f = str;
    }

    public t0f(CharSequence charSequence, PendingIntent pendingIntent) {
        this.a = 2131231858;
        this.b = null;
        this.c = charSequence;
        this.d = pendingIntent;
        this.e = 1;
        this.f = null;
    }
}
