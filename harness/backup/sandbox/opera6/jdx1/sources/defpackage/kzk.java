package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class kzk {
    public static final kzk a = new kzk();

    public final szk a(Looper looper, Handler.Callback callback) {
        return new szk(new Handler(looper, callback));
    }
}
