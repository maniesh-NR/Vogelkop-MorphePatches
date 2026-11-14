package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class d19 implements oyh {
    public final /* synthetic */ byte a;

    public /* synthetic */ d19(byte b) {
        this.a = b;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) {
        switch (this.a) {
            case 0:
                return new p54((File) obj);
            case 1:
                return new p54((Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new lx9(drawable, (byte) 1);
                }
                return null;
        }
    }
}
