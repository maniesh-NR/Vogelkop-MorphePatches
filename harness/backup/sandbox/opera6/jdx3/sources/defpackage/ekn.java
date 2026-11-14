package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class ekn {
    public final yp9 a = new yp9(4, 0.75f, true, (byte) 3);
    public final dkn b;

    public ekn(Context context, umi umiVar) {
        dkn dknVar = new dkn(this, new File(context.getCacheDir(), "wallpaper_avg_color_cache.json"), umiVar);
        dknVar.h();
        this.b = dknVar;
    }
}
