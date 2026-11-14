package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class dt implements acl {
    public final /* synthetic */ et a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public dt(et etVar, boolean z, String str, int i) {
        this.a = etVar;
        this.b = z;
        this.c = str;
        this.d = i;
    }

    public final void a(Exception exc, Drawable drawable) {
        boolean z = this.b;
        et etVar = this.a;
        if (!z) {
            etVar.u(null);
            return;
        }
        etVar.w();
        etVar.l();
        etVar.t(this.d, this.c, false);
    }

    public final void b(Drawable drawable) {
    }

    public final void c(Bitmap bitmap, int i) {
        this.a.u(bitmap);
    }
}
