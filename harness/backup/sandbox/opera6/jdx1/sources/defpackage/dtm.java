package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public enum dtm {
    PREVIEW(SurfaceHolder.class),
    IMAGE_CAPTURE(null),
    IMAGE_ANALYSIS(null),
    VIDEO_CAPTURE(MediaCodec.class),
    STREAM_SHARING(SurfaceTexture.class),
    UNDEFINED(null);

    public static final urj b = new urj((byte) 7);
    public final Class a;

    dtm(Class cls) {
        this.a = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Preview";
        }
        if (iOrdinal == 1) {
            return "ImageCapture";
        }
        if (iOrdinal == 2) {
            return "ImageAnalysis";
        }
        if (iOrdinal == 3) {
            return "VideoCapture";
        }
        if (iOrdinal == 4) {
            return "StreamSharing";
        }
        if (iOrdinal == 5) {
            return "Undefined";
        }
        h9o.p();
        return null;
    }
}
