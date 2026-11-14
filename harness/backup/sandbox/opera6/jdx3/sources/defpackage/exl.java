package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class exl extends mgh implements Runnable {
    public dxl d;

    public exl(dxl dxlVar, Callback callback) {
        super((Object) null, callback, (byte) 8);
        this.d = dxlVar;
    }

    public final void cancel() {
        super.cancel();
        this.d = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dxl dxlVar = this.d;
        if (dxlVar != null) {
            ((mgh) this).b = dxlVar.f();
            this.d = null;
        }
    }
}
