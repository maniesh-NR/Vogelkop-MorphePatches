package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public final class wpd {
    public final byte a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ xkg g;

    /* JADX WARN: Multi-variable type inference failed */
    public wpd(int i, int i2, int i3, String str, Handler handler, xkg xkgVar) {
        this.f = handler;
        this.g = xkgVar;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        wpd wpdVar;
        if (this.e != null) {
            wpdVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            wpdVar = this;
            wpdVar.e = new fcn(wpdVar, this.a, this.b, this.d, this.c, (byte) 0);
        } else {
            wpdVar = this;
            wpdVar.e = new gcn((byte) 0, wpdVar.a, wpdVar.b, wpdVar.d, wpdVar);
        }
        return wpdVar.e;
    }
}
