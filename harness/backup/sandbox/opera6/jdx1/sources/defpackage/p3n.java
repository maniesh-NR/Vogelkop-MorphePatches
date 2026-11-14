package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* loaded from: classes.dex */
public final class p3n implements oyh {
    public static final mrf d = new mrf("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new xxd());
    public static final mrf e = new mrf("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new z4k((byte) 11));
    public static final tmj f = new tmj((byte) 8);
    public final o3n a;
    public final zg3 b;
    public final tmj c = f;

    public p3n(zg3 zg3Var, o3n o3nVar) {
        this.b = zg3Var;
        this.a = o3nVar;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, bh7 bh7Var) {
        Bitmap scaledFrameAtTime = null;
        if (i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && bh7Var != bh7.c) {
            try {
                int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i6 == 90 || i6 == 270) {
                    i5 = i4;
                    i4 = i5;
                }
                float fA = bh7Var.a(i4, i5, i2, i3);
                scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fA), Math.round(fA * i5));
            } catch (Throwable unused) {
            }
        }
        return scaledFrameAtTime == null ? mediaMetadataRetriever.getFrameAtTime(j, i) : scaledFrameAtTime;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        return true;
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) throws IOException {
        long jLongValue = ((Long) trfVar.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            qp2.o(p3p.l(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        Integer num = (Integer) trfVar.c(e);
        if (num == null) {
            num = 2;
        }
        bh7 bh7Var = (bh7) trfVar.c(bh7.e);
        if (bh7Var == null) {
            bh7Var = bh7.d;
        }
        bh7 bh7Var2 = bh7Var;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.a.h(mediaMetadataRetriever, obj);
                Bitmap bitmapC = c(mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, bh7Var2);
                mediaMetadataRetriever.release();
                return ah3.c(this.b, bitmapC);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
