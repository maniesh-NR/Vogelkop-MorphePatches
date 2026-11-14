package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class xbp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cn b;

    public /* synthetic */ xbp(cn cnVar, byte b) {
        this.a = b;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(new cm(2, "placement id is invalid", (byte) 0));
                break;
            case 1:
                this.b.g(new cm(1, fki.s(new StringBuilder("Required min SDK API level 24, but current API is "), Build.VERSION.SDK_INT, '!'), (byte) 0));
                break;
            default:
                this.b.g(new cm(105, "Required min WebView version 63", (byte) 0));
                break;
        }
    }
}
