package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class k75 {
    public static final LruCache a = new LruCache(10);

    public static final MediaCodecInfo a(String str) throws Throwable {
        Object obj;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = a;
        synchronized (lruCache) {
            obj = lruCache.get(str);
        }
        try {
            if (obj != null) {
                return (MediaCodecInfo) obj;
            }
            try {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache) {
                        }
                        mediaCodecCreateEncoderByType.release();
                        return codecInfo;
                    } catch (Throwable th) {
                        th = th;
                        if (mediaCodecCreateEncoderByType != null) {
                            mediaCodecCreateEncoderByType.release();
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new rib(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new rib(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
    }
}
