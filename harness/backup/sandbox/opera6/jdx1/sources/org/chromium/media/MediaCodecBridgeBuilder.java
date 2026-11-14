package org.chromium.media;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.x7d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MediaCodecBridgeBuilder {
    public static MediaCodecBridge createAudioDecoder(String str, MediaCrypto mediaCrypto, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, boolean z2) {
        try {
            Locale locale = Locale.US;
            boolean z3 = false;
            MediaCodec mediaCodec = (MediaCodec) MediaCodecUtil.b(str, 0, mediaCrypto).b;
            if (mediaCodec == null) {
                return null;
            }
            MediaCodecBridge mediaCodecBridge = new MediaCodecBridge(mediaCodec, z2);
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
            x7d.A(mediaFormatCreateAudioFormat, new byte[][]{bArr, bArr2, bArr3});
            if (z) {
                mediaFormatCreateAudioFormat.setInteger("is-adts", 1);
            }
            try {
                mediaCodec.configure(mediaFormatCreateAudioFormat, (Surface) null, mediaCrypto, 0);
                z3 = true;
            } catch (MediaCodec.CryptoException | IllegalArgumentException | IllegalStateException | Exception unused) {
            }
            if (!z3) {
                return null;
            }
            if (mediaCodecBridge.f()) {
                return mediaCodecBridge;
            }
            mediaCodecBridge.release();
            return null;
        } catch (Exception unused2) {
            Locale locale2 = Locale.US;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: Exception -> 0x00ab, TryCatch #2 {Exception -> 0x00ab, blocks: (B:3:0x0001, B:5:0x0009, B:13:0x002a, B:15:0x0030, B:21:0x0055, B:23:0x005b, B:26:0x0069, B:39:0x009f, B:41:0x00a5, B:11:0x001f, B:12:0x0024), top: B:53:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[Catch: CryptoException | IllegalArgumentException | IllegalStateException | Exception -> 0x00aa, TryCatch #3 {CryptoException | IllegalArgumentException | IllegalStateException | Exception -> 0x00aa, blocks: (B:32:0x0077, B:33:0x007a, B:35:0x0087, B:36:0x008d, B:38:0x0099), top: B:55:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: CryptoException | IllegalArgumentException | IllegalStateException | Exception -> 0x00aa, TryCatch #3 {CryptoException | IllegalArgumentException | IllegalStateException | Exception -> 0x00aa, blocks: (B:32:0x0077, B:33:0x007a, B:35:0x0087, B:36:0x008d, B:38:0x0099), top: B:55:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #2 {Exception -> 0x00ab, blocks: (B:3:0x0001, B:5:0x0009, B:13:0x002a, B:15:0x0030, B:21:0x0055, B:23:0x005b, B:26:0x0069, B:39:0x009f, B:41:0x00a5, B:11:0x001f, B:12:0x0024), top: B:53:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.chromium.media.MediaCodecBridge createVideoDecoder(java.lang.String r16, int r17, android.media.MediaCrypto r18, int r19, int r20, android.view.Surface r21, byte[] r22, byte[] r23, int r24, int r25, int r26, org.chromium.media.HdrMetadata r27, boolean r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, int r33) throws java.io.IOException {
        /*
            r0 = 0
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Exception -> Lab
            boolean r1 = r32.isEmpty()     // Catch: java.lang.Exception -> Lab
            if (r1 != 0) goto L24
            nrl r1 = new nrl     // Catch: java.lang.Exception -> Lab
            r1.<init>()     // Catch: java.lang.Exception -> Lab
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r32)     // Catch: java.lang.Exception -> L1d
            r1.b = r2     // Catch: java.lang.Exception -> L1d
            r3 = r16
            boolean r2 = org.chromium.media.MediaCodecUtil.a(r2, r3)     // Catch: java.lang.Exception -> L1f
            r1.a = r2     // Catch: java.lang.Exception -> L1f
            goto L2a
        L1d:
            r3 = r16
        L1f:
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Exception -> Lab
            r1.b = r0     // Catch: java.lang.Exception -> Lab
            goto L2a
        L24:
            r3 = r16
            nrl r1 = org.chromium.media.MediaCodecUtil.b(r16, r17, r18)     // Catch: java.lang.Exception -> Lab
        L2a:
            java.lang.Object r2 = r1.b     // Catch: java.lang.Exception -> Lab
            android.media.MediaCodec r2 = (android.media.MediaCodec) r2     // Catch: java.lang.Exception -> Lab
            if (r2 == 0) goto Laa
            org.chromium.media.MediaCodecBridge r13 = new org.chromium.media.MediaCodecBridge     // Catch: java.lang.Exception -> Lab
            r4 = r29
            r13.<init>(r2, r4)     // Catch: java.lang.Exception -> Lab
            byte[][] r6 = new byte[][]{r22, r23}     // Catch: java.lang.Exception -> Lab
            boolean r1 = r1.a     // Catch: java.lang.Exception -> Lab
            r14 = 0
            r15 = 1
            if (r1 == 0) goto L53
            if (r28 == 0) goto L53
            r11 = r15
        L44:
            r4 = r19
            r5 = r20
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r33
            goto L55
        L53:
            r11 = r14
            goto L44
        L55:
            android.media.MediaFormat r1 = defpackage.x7d.e(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lab
            if (r31 == 0) goto L65
            java.lang.String r3 = "low-latency"
            r1.setInteger(r3, r15)     // Catch: java.lang.Exception -> Lab
            java.lang.String r3 = "vdec-lowlatency"
            r1.setInteger(r3, r15)     // Catch: java.lang.Exception -> Lab
        L65:
            r3 = r17
            if (r3 != r15) goto L6e
            java.lang.String r3 = "secure-playback"
            r1.setFeatureEnabled(r3, r15)     // Catch: java.lang.Exception -> Lab
        L6e:
            if (r30 == 0) goto L71
            r14 = 2
        L71:
            java.lang.String r3 = "max-input-size"
            r4 = r14 & 2
            if (r4 == 0) goto L7a
            r1.removeKey(r3)     // Catch: java.lang.Throwable -> Laa
        L7a:
            r5 = r18
            r6 = r21
            r2.configure(r1, r6, r5, r14)     // Catch: java.lang.Throwable -> Laa
            android.media.MediaFormat r2 = r2.getInputFormat()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L8d
            r1 = 2147483647(0x7fffffff, float:NaN)
            r13.c = r1     // Catch: java.lang.Throwable -> Laa
            goto L9f
        L8d:
            int r1 = r1.getInteger(r3)     // Catch: java.lang.Throwable -> Laa
            r13.c = r1     // Catch: java.lang.Throwable -> Laa
            boolean r1 = r2.containsKey(r3)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L9f
            int r1 = r2.getInteger(r3)     // Catch: java.lang.Throwable -> Laa
            r13.c = r1     // Catch: java.lang.Throwable -> Laa
        L9f:
            boolean r1 = r13.f()     // Catch: java.lang.Exception -> Lab
            if (r1 != 0) goto La9
            r13.release()     // Catch: java.lang.Exception -> Lab
            goto Laa
        La9:
            return r13
        Laa:
            return r0
        Lab:
            java.util.Locale r1 = java.util.Locale.US
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaCodecBridgeBuilder.createVideoDecoder(java.lang.String, int, android.media.MediaCrypto, int, int, android.view.Surface, byte[], byte[], int, int, int, org.chromium.media.HdrMetadata, boolean, boolean, boolean, boolean, java.lang.String, int):org.chromium.media.MediaCodecBridge");
    }
}
