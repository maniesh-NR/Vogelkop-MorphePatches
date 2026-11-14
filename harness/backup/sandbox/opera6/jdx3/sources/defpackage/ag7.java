package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ag7 {
    public final ArrayList a = new ArrayList();
    public final Context b;

    @NonNull
    @WeakOwner
    private final yf7 c;

    @NonNull
    @WeakOwner
    private final zf7 d;
    public cv3 e;

    public ag7(rf7 rf7Var, umi umiVar, Context context) {
        this.b = context;
        yf7 yf7Var = new yf7(this, rf7Var, umiVar);
        this.c = yf7Var;
        this.d = new zf7(this, new OperaBrowserContext(true), umiVar);
        yf7Var.g = true;
        N.MN7xR1SP(new bl6(yf7Var, (byte) 22));
        a(new of7(rf7Var, (byte) 1));
    }

    public final void a(Runnable runnable) {
        yf7 yf7Var = this.c;
        if (yf7Var.g) {
            yf7Var.e.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final void b(Uri uri, Uri uri2, String str, String str2, byte[] bArr, long j, Callback callback) {
        String str3 = (String) N.MraTr5Xy();
        String path = uri2.getScheme().equals("file") ? uri2.getPath() : uri2.toString();
        this.c.h.put(str3, callback);
        N.MEKma8rK(str3, uri.toString(), path, str2, str, bArr, j);
        lg7.a(this.b, uri2);
    }
}
