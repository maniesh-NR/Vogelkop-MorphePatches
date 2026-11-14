package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ri extends xz {
    public final String b;
    public final String c;
    public final String d;

    public ri(wz wzVar, String str) {
        super(wzVar);
        this.b = str;
        Uri uri = Uri.parse(str);
        this.c = uri.getQueryParameter("a");
        this.d = uri.getQueryParameter("m");
    }

    @Override // defpackage.xz
    public final String a() {
        return this.c;
    }

    @Override // defpackage.xz
    public final String b() {
        return this.d;
    }

    @Override // defpackage.xz
    public final void c() {
        fvh fvhVar = new fvh();
        fvhVar.h(this.b);
        ((t9f) xne.b.get()).c(new kvh(fvhVar)).enqueue(new ydp((byte) 14));
    }
}
