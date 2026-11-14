package ads_mobile_sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.rap;
import defpackage.vkp;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tp {
    public final vkp a;
    public final qr0 b;
    public final ah3 c;

    public tp(vkp vkpVar, qr0 qr0Var, ah3 ah3Var) {
        this.a = vkpVar;
        this.b = qr0Var;
        this.c = ah3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.tp r7, java.lang.String r8, double r9, boolean r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tp.a(ads_mobile_sdk.tp, java.lang.String, double, boolean, nt5):java.lang.Object");
    }

    public final rap a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (160.0d * d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth * options.outHeight;
        if (i > 0) {
            qr0 qr0Var = this.b;
            qr0Var.getClass();
            options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Number) qr0Var.a("gads:nativeads:image:sample:pixels", (Object) 1048576, (Function1) fo.a$11)).intValue())) / 2);
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return bitmapDecodeByteArray == null ? new ev0("Cannot decode image", ae1.a) : new hv0(bitmapDecodeByteArray);
    }
}
