package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.opera.api.Callback;
import java.io.File;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class q32 {
    public final Context a;
    public final yv3 b;

    public q32(Context context, yv3 yv3Var) {
        this.a = context;
        this.b = yv3Var;
    }

    public final void a(File file, Callback callback) {
        if (fr3.Q(this.a, "android.permission.CAMERA")) {
            b(file, new n32(callback, (byte) 0));
        } else {
            f03.U((WindowAndroid) this.b.get(), "android.permission.CAMERA", new p32(this, file, callback));
        }
    }

    public final void b(File file, Runnable runnable) {
        Uri uriX = w7d.x(file);
        o32 o32Var = new o32(runnable, (byte) 0);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uriX);
        intent.addFlags(2);
        ((hjf) oi.d(this.a)).D(intent, new qj2(o32Var, (byte) 15));
    }
}
