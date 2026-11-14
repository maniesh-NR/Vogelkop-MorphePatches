package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class t24 implements hz8 {
    public final /* synthetic */ byte a;
    public final vrf b;
    public final Object c;

    public /* synthetic */ t24(Object obj, vrf vrfVar, byte b) {
        this.a = b;
        this.c = obj;
        this.b = vrfVar;
    }

    @Override // defpackage.hz8
    public final Object a(l38 l38Var) {
        byte b = this.a;
        Object obj = this.c;
        vrf vrfVar = this.b;
        switch (b) {
            case 0:
                d04 d04Var = new d04();
                d04Var.write((byte[]) obj);
                return new hwj(new jwj(d04Var, vrfVar.e, null), null, dd6.b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new hwj(new jwj(new tlh(new re6(byteBuffer)), vrfVar.e, new f34(byteBuffer)), null, dd6.b);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = nzm.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof VectorDrawableCompat);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(vrfVar.a.getResources(), f03.k(bitmapDrawable, eza.a(vrfVar), vrfVar.b, vrfVar.c, (apj) xf8.K(vrfVar, dza.b), vrfVar.d == wog.b));
                }
                return new oxa(ipe.k(bitmapDrawable), z, dd6.b);
        }
    }
}
