package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class eeh implements v7e {
    public final Context a;
    public final v7e b;
    public final v7e c;
    public final Class d;

    public eeh(Context context, v7e v7eVar, v7e v7eVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = v7eVar;
        this.c = v7eVar2;
        this.d = cls;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        Uri uri = (Uri) obj;
        return new u7e(new o6f(uri), new deh(this.a, this.b, this.c, uri, i, i2, trfVar, this.d));
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        return mkh.y((Uri) obj);
    }
}
