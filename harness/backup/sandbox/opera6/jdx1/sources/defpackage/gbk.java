package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* loaded from: classes.dex */
public final class gbk implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ jg3 a;
    public final /* synthetic */ lqh b;

    public gbk(jg3 jg3Var, lqh lqhVar) {
        this.a = jg3Var;
        this.b = lqhVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        vrf vrfVar = this.a.b;
        apj apjVar = vrfVar.b;
        lli lliVar = vrfVar.c;
        xm5 xm5Var = dza.b;
        long jQ = zi4.q(width, height, apjVar, lliVar, (apj) xf8.K(vrfVar, xm5Var));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            double dR = zi4.r(width, height, i, i2, vrfVar.c, (apj) xf8.K(vrfVar, xm5Var));
            boolean z = dR < 1.0d;
            this.b.a = z;
            if (z || vrfVar.d == wog.a) {
                imageDecoder.setTargetSize(zed.a(width * dR), zed.a(dR * height));
            }
        }
        imageDecoder.setOnPartialImageListener(new dbk());
        imageDecoder.setAllocator(eza.a(vrfVar) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) xf8.K(vrfVar, eza.g)).booleanValue() ? 1 : 0);
        xm5 xm5Var2 = eza.c;
        if (((ColorSpace) xf8.K(vrfVar, xm5Var2)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) xf8.K(vrfVar, xm5Var2));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) xf8.K(vrfVar, eza.d)).booleanValue());
    }
}
