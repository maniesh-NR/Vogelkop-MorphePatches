package defpackage;

import com.opera.android.browser.obml.Platform;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class n32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Callback b;

    public /* synthetic */ n32(Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Callback callback = this.b;
        switch (b) {
            case 0:
                callback.run(m32.b);
                break;
            case 1:
                callback.run(m32.b);
                break;
            case 2:
                callback.run(fsb.a);
                break;
            case 3:
                callback.run(Boolean.FALSE);
                break;
            case 4:
                callback.run(Platform.c());
                break;
            case 5:
                callback.run(Platform.c());
                break;
            default:
                callback.run(Platform.c());
                break;
        }
    }
}
