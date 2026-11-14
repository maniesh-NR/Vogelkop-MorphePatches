package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.core.app.NotificationCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ogd {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public ogd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = dzd.o(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(tym.g(i, widthAlignment) * widthAlignment, tym.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ogd i(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17) {
        /*
            ogd r0 = new ogd
            java.lang.String r1 = "adaptive-playback"
            boolean r8 = r14.isFeatureSupported(r1)
            java.lang.String r1 = "tunneled-playback"
            r14.isFeatureSupported(r1)
            java.lang.String r1 = "secure-playback"
            boolean r9 = r14.isFeatureSupported(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L57
            java.lang.String r1 = "detached-surface"
            boolean r1 = r14.isFeatureSupported(r1)
            if (r1 == 0) goto L57
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L57
            java.lang.String r2 = "OPPO"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L57
            java.lang.String r2 = "realme"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L57
            java.lang.String r2 = "motorola"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L57
            java.lang.String r2 = "LENOVO"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L57
            r1 = 1
        L4c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r1
            r1 = r11
            goto L59
        L57:
            r1 = 0
            goto L4c
        L59:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogd.i(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):ogd");
    }

    public final sj6 b(oj9 oj9Var, oj9 oj9Var2) {
        oj9 oj9Var3;
        oj9 oj9Var4;
        int i;
        String str = oj9Var.n;
        ja5 ja5Var = oj9Var.D;
        String str2 = oj9Var2.n;
        ja5 ja5Var2 = oj9Var2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (oj9Var.z != oj9Var2.z) {
                i2 |= 1024;
            }
            boolean z = (oj9Var.u == oj9Var2.u && oj9Var.v == oj9Var2.v) ? false : true;
            if (!this.e && z) {
                i2 |= NotificationCompat.FLAG_GROUP_SUMMARY;
            }
            if ((!ja5.e(ja5Var) || !ja5.e(ja5Var2)) && !Objects.equals(ja5Var, ja5Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !oj9Var.b(oj9Var2)) {
                i2 |= 2;
            }
            int i3 = oj9Var.w;
            if (i3 != -1 && (i = oj9Var.x) != -1 && i3 == oj9Var2.w && i == oj9Var2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(oj9Var2.n, "video/dolby-vision")) {
                Pair pairB = j75.b(oj9Var);
                Pair pairB2 = j75.b(oj9Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new sj6(this.a, oj9Var, oj9Var2, oj9Var.b(oj9Var2) ? 3 : 2, 0);
            }
            oj9Var3 = oj9Var;
            oj9Var4 = oj9Var2;
        } else {
            oj9Var3 = oj9Var;
            oj9Var4 = oj9Var2;
            if (oj9Var3.F != oj9Var4.F) {
                i2 |= 4096;
            }
            if (oj9Var3.G != oj9Var4.G) {
                i2 |= 8192;
            }
            if (oj9Var3.H != oj9Var4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairB3 = j75.b(oj9Var3);
                Pair pairB4 = j75.b(oj9Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new sj6(this.a, oj9Var3, oj9Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new sj6(this.a, oj9Var3, oj9Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new sj6(this.a, oj9Var3, oj9Var4, 3, 0);
            }
            if (!oj9Var3.b(oj9Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new sj6(this.a, oj9Var3, oj9Var4, 1, 0);
            }
        }
        return new sj6(this.a, oj9Var3, oj9Var4, 0, i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x008d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.oj9 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogd.c(oj9, boolean):boolean");
    }

    public final boolean d(oj9 oj9Var) {
        return (Objects.equals(oj9Var.n, "audio/flac") && oj9Var.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(oj9 oj9Var) {
        int i;
        String str = oj9Var.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(wgd.b(oj9Var))) || !c(oj9Var, true) || !d(oj9Var)) {
            return false;
        }
        if (this.i) {
            int i2 = oj9Var.u;
            if (i2 > 0 && (i = oj9Var.v) > 0) {
                return g(i2, i, oj9Var.y);
            }
        } else {
            int i3 = oj9Var.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    h("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = oj9Var.F;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder sbP = sko.p(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    sbP.append(i5);
                    sbP.append("]");
                    w7d.K(sbP.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    h("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(oj9 oj9Var) {
        if (this.i) {
            return this.e;
        }
        Pair pairB = j75.b(oj9Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r9, int r10, double r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogd.g(int, int, double):boolean");
    }

    public final void h(String str) {
        StringBuilder sbS = p3p.s("NoSupport [", str, "] [");
        sbS.append(this.a);
        sbS.append(", ");
        sbS.append(this.b);
        sbS.append("] [");
        sbS.append(tym.a);
        sbS.append("]");
        w7d.m(sbS.toString());
    }

    public final String toString() {
        return this.a;
    }
}
