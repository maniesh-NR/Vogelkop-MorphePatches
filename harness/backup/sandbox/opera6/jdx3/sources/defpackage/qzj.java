package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.opera.android.webapps.ShortcutHelper;

/* loaded from: classes.dex */
public final class qzj implements e2m {
    public final Context a;
    public final zyk b;

    public qzj(Context context, Integer num) {
        this.a = context;
        this.b = z4c.b(new s4f(num, this, (byte) 26));
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmapC = ShortcutHelper.c(((Number) this.b.getValue()).intValue(), -1, this.a, bitmap);
        if (bitmapC == null) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapC;
    }

    public final String key() {
        return sko.i(((Number) this.b.getValue()).intValue(), "SpeedDialPrettifyTransformation");
    }
}
