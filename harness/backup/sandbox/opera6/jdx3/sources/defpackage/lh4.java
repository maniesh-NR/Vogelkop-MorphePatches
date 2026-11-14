package defpackage;

import android.graphics.Bitmap;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class lh4 implements Callback, hh4 {
    public static final lh4 c = new lh4(null, 0);
    public final /* synthetic */ byte a;
    public Callback b;

    public /* synthetic */ lh4(Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = null;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Callback callback = this.b;
                if (callback != null) {
                    this.b = null;
                    callback.run(obj);
                    break;
                }
                break;
            default:
                Bitmap bitmap = (Bitmap) obj;
                Callback callback2 = this.b;
                if (bitmap != null) {
                    if (!he2.a(new iy8(callback2, (byte) 1), new Bitmap[]{bitmap})) {
                        callback2.run(null);
                        break;
                    }
                } else {
                    callback2.run(null);
                    break;
                }
                break;
        }
    }
}
