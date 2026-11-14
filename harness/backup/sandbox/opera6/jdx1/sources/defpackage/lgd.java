package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.chromium.media.MediaCodecBridge;

/* loaded from: classes.dex */
public final class lgd extends MediaCodec.Callback {
    public final WeakReference a;

    public lgd(MediaCodecBridge mediaCodecBridge) {
        this.a = new WeakReference(mediaCodecBridge);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.a.get();
        if (mediaCodecBridge == null) {
            wxe.t("MediaCodecBridge was garbage collected, ignoring onCryptoError", new Object[0]);
            return;
        }
        cryptoException.getMessage();
        Locale locale = Locale.US;
        mediaCodecBridge.d(MediaCodecBridge.b(cryptoException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.a.get();
        if (mediaCodecBridge == null) {
            wxe.t("MediaCodecBridge was garbage collected, ignoring onError", new Object[0]);
            return;
        }
        codecException.getDiagnosticInfo();
        Locale locale = Locale.US;
        mediaCodecBridge.d(MediaCodecBridge.a(codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.a.get();
        if (mediaCodecBridge == null) {
            wxe.t("MediaCodecBridge was garbage collected, ignoring onInputBufferAvailable", new Object[0]);
            return;
        }
        synchronized (mediaCodecBridge) {
            if (mediaCodecBridge.i) {
                return;
            }
            mediaCodecBridge.l.add(new MediaCodecBridge.DequeueInputResult(0, i));
            mediaCodecBridge.c();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.a.get();
        if (mediaCodecBridge == null) {
            wxe.t("MediaCodecBridge was garbage collected, ignoring onOutputBufferAvailable", new Object[0]);
            return;
        }
        synchronized (mediaCodecBridge) {
            if (mediaCodecBridge.i) {
                return;
            }
            mediaCodecBridge.m.add(new MediaCodecBridge.DequeueOutputResult(0, i, bufferInfo.flags, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs));
            mediaCodecBridge.c();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecBridge mediaCodecBridge = (MediaCodecBridge) this.a.get();
        if (mediaCodecBridge == null) {
            wxe.t("MediaCodecBridge was garbage collected, ignoring onOutputFormatChanged", new Object[0]);
            return;
        }
        synchronized (mediaCodecBridge) {
            mediaCodecBridge.m.add(new MediaCodecBridge.DequeueOutputResult(3, -1, 0, 0, 0, 0L));
            mediaCodecBridge.e.add(new MediaCodecBridge.MediaFormatWrapper(mediaFormat));
            mediaCodecBridge.c();
        }
    }
}
