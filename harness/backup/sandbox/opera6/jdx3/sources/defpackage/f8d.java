package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class f8d {
    public final boolean a;
    public final boolean b;
    public final /* synthetic */ byte c;
    public final float d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f8d(float f) {
        this(true, false);
        this.c = (byte) 0;
        this.d = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f8d(float f, boolean z) {
        this(z, true);
        this.c = (byte) 1;
        this.d = f;
    }

    public f8d(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static String a(wlk wlkVar, Resources resources) {
        o9g o9gVar = wlkVar.c;
        double d = wlkVar.d;
        int i = o9gVar.a;
        int i2 = o9gVar.b;
        String str = wlkVar.b;
        if (i != 0 || i2 >= 2) {
            return resources.getString(2132021674, z7h.k(str, d / ((i * 12) + i2)));
        }
        return null;
    }
}
