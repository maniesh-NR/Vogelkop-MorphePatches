package org.chromium.media;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import defpackage.na2;
import defpackage.o2n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class VideoAcceleratorUtil {
    public static final String[] a = {"video/x-vnd.on2.vp8", "video/x-vnd.on2.vp9", "video/av01", "video/avc", "video/hevc"};
    public static final String[] b = {"video/x-vnd.on2.vp8", "video/x-vnd.on2.vp9", "video/av01", "video/avc", "video/hevc", "video/dolby-vision"};
    public static final Set c;
    public static final o2n[] d;

    public static class SupportedProfileAdapter {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
        public String k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public byte q;

        public final int getLevel() {
            return this.b;
        }

        public final int getMaxFramerateDenominator() {
            return this.h ? 1 : 0;
        }

        public final int getMaxFramerateNumerator() {
            return this.g;
        }

        public final int getMaxHeight() {
            return this.d;
        }

        public final int getMaxNumberOfTemporalLayers() {
            return this.q;
        }

        public final int getMaxWidth() {
            return this.c;
        }

        public final int getMinHeight() {
            return this.f;
        }

        public final int getMinWidth() {
            return this.e;
        }

        public final String getName() {
            return this.k;
        }

        public final int getProfile() {
            return this.a;
        }

        public final boolean isSoftwareCodec() {
            return this.l;
        }

        public final boolean requiresLowLatency() {
            return this.n;
        }

        public final boolean requiresSecurePlayback() {
            return this.p;
        }

        public final boolean supportsCbr() {
            return this.i;
        }

        public final boolean supportsLowLatency() {
            return this.m;
        }

        public final boolean supportsSecurePlayback() {
            return this.o;
        }

        public final boolean supportsVbr() {
            return this.j;
        }
    }

    static {
        Object[] objArr = {"c2.qti.avc.encoder", "c2.exynos.h264.encoder", "c2.cros-codecs.vaapi.av1.encoder", "c2.cros-codecs.vaapi.avc.encoder", "c2.cros-codecs.vaapi.vp9.encoder"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                qp2.o(rfp.o(obj, "duplicate element: "));
                return;
            }
        }
        c = Collections.unmodifiableSet(hashSet);
        d = new o2n[]{new o2n(320, 180), new o2n(640, 360), new o2n(1280, 720), new o2n(1920, 1080), new o2n(2560, 1440), new o2n(3840, 2160), new o2n(5120, 2880), new o2n(7680, 4320)};
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.chromium.media.VideoAcceleratorUtil.SupportedProfileAdapter[] getSupportedDecoderProfiles() {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.VideoAcceleratorUtil.getSupportedDecoderProfiles():org.chromium.media.VideoAcceleratorUtil$SupportedProfileAdapter[]");
    }

    public static SupportedProfileAdapter[] getSupportedEncoderProfiles() {
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        boolean z;
        try {
            int i5 = 0;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i6 = 0;
            while (i6 < 5) {
                String str2 = a[i6];
                int length = codecInfos.length;
                int i7 = i5;
                while (i7 < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i7];
                    if (!mediaCodecInfo.isAlias() && mediaCodecInfo.isEncoder() && (mediaCodecInfo.isHardwareAccelerated() || str2.equalsIgnoreCase("video/avc"))) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                            int[] iArr = capabilitiesForType.colorFormats;
                            int length2 = iArr.length;
                            int i8 = i5;
                            while (true) {
                                if (i8 >= length2) {
                                    break;
                                }
                                if (iArr[i8] == 21) {
                                    MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                                    if (encoderCapabilities != null) {
                                        boolean zIsBitrateModeSupported = encoderCapabilities.isBitrateModeSupported(2);
                                        boolean zIsBitrateModeSupported2 = encoderCapabilities.isBitrateModeSupported(1);
                                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                        if (videoCapabilities != null) {
                                            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
                                            Range<Integer> supportedHeightsFor = videoCapabilities.getSupportedHeightsFor(((Integer) supportedWidths.getUpper()).intValue());
                                            int iIntValue = ((Integer) supportedWidths.getLower()).intValue();
                                            boolean z2 = true;
                                            int iIntValue2 = ((Integer) supportedHeightsFor.getLower()).intValue();
                                            mediaCodecInfoArr = codecInfos;
                                            i2 = i6;
                                            ArrayList arrayList3 = new ArrayList(Arrays.asList(d));
                                            arrayList3.add(new o2n(((Integer) supportedWidths.getUpper()).intValue(), ((Integer) supportedHeightsFor.getUpper()).intValue()));
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            int widthAlignment = videoCapabilities.getWidthAlignment();
                                            int heightAlignment = videoCapabilities.getHeightAlignment();
                                            str = str2;
                                            int size = arrayList3.size();
                                            i3 = length;
                                            int i9 = 0;
                                            while (i9 < size) {
                                                Object obj = arrayList3.get(i9);
                                                i9++;
                                                ArrayList arrayList4 = arrayList3;
                                                o2n o2nVar = (o2n) obj;
                                                int i10 = size;
                                                int i11 = ((o2nVar.a + widthAlignment) - 1) & (~(widthAlignment - 1));
                                                int i12 = ((o2nVar.b + heightAlignment) - 1) & (~(heightAlignment - 1));
                                                if (videoCapabilities.isSizeSupported(i11, i12)) {
                                                    int i13 = i7;
                                                    int iFloor = (int) Math.floor(((Double) videoCapabilities.getSupportedFrameRatesFor(i11, i12).getUpper()).doubleValue());
                                                    if (linkedHashMap.containsKey(Integer.valueOf(iFloor))) {
                                                        o2n o2nVar2 = (o2n) linkedHashMap.get(Integer.valueOf(iFloor));
                                                        if (i11 >= o2nVar2.a && i12 >= o2nVar2.b) {
                                                            linkedHashMap.put(Integer.valueOf(iFloor), new o2n(i11, i12));
                                                        }
                                                    } else {
                                                        linkedHashMap.put(Integer.valueOf(iFloor), new o2n(i11, i12));
                                                    }
                                                    size = i10;
                                                    arrayList3 = arrayList4;
                                                    i7 = i13;
                                                    i9 = i9;
                                                } else {
                                                    size = i10;
                                                    arrayList3 = arrayList4;
                                                }
                                            }
                                            i4 = i7;
                                            HashSet hashSet = new HashSet();
                                            int iT = na2.t(str);
                                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                                                try {
                                                    hashSet.add(Integer.valueOf(na2.E(iT, codecProfileLevel.profile)));
                                                } catch (RuntimeException unused) {
                                                    int i14 = codecProfileLevel.profile;
                                                }
                                            }
                                            String name = mediaCodecInfo.getName();
                                            boolean zIsSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                            byte b2 = (Build.VERSION.SDK_INT < 30 || !c.contains(name.toLowerCase(Locale.getDefault()))) ? (byte) 1 : (byte) 3;
                                            ArrayList arrayList5 = mediaCodecInfo.isHardwareAccelerated() ? arrayList : arrayList2;
                                            Iterator it = linkedHashMap.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                int iIntValue3 = ((Integer) entry.getKey()).intValue();
                                                int i15 = ((o2n) entry.getValue()).a;
                                                int i16 = ((o2n) entry.getValue()).b;
                                                boolean z3 = (i16 == i15 || !videoCapabilities.isSizeSupported(i16, i15)) ? false : z2;
                                                Iterator it2 = hashSet.iterator();
                                                while (it2.hasNext()) {
                                                    HashSet hashSet2 = hashSet;
                                                    int iIntValue4 = ((Integer) it2.next()).intValue();
                                                    Iterator it3 = it;
                                                    SupportedProfileAdapter supportedProfileAdapter = new SupportedProfileAdapter();
                                                    supportedProfileAdapter.a = iIntValue4;
                                                    supportedProfileAdapter.e = iIntValue;
                                                    supportedProfileAdapter.f = iIntValue2;
                                                    supportedProfileAdapter.c = i15;
                                                    supportedProfileAdapter.d = i16;
                                                    supportedProfileAdapter.g = iIntValue3;
                                                    MediaCodecInfo.VideoCapabilities videoCapabilities2 = videoCapabilities;
                                                    supportedProfileAdapter.h = z2;
                                                    supportedProfileAdapter.i = zIsBitrateModeSupported;
                                                    supportedProfileAdapter.j = zIsBitrateModeSupported2;
                                                    supportedProfileAdapter.k = name;
                                                    supportedProfileAdapter.l = zIsSoftwareOnly;
                                                    supportedProfileAdapter.m = false;
                                                    supportedProfileAdapter.n = false;
                                                    supportedProfileAdapter.q = b2;
                                                    arrayList5.add(supportedProfileAdapter);
                                                    if (z3) {
                                                        SupportedProfileAdapter supportedProfileAdapter2 = new SupportedProfileAdapter();
                                                        supportedProfileAdapter2.a = iIntValue4;
                                                        supportedProfileAdapter2.e = iIntValue2;
                                                        supportedProfileAdapter2.f = iIntValue;
                                                        supportedProfileAdapter2.c = i16;
                                                        supportedProfileAdapter2.d = i15;
                                                        supportedProfileAdapter2.g = iIntValue3;
                                                        z = true;
                                                        supportedProfileAdapter2.h = true;
                                                        supportedProfileAdapter2.i = zIsBitrateModeSupported;
                                                        supportedProfileAdapter2.j = zIsBitrateModeSupported2;
                                                        supportedProfileAdapter2.k = name;
                                                        supportedProfileAdapter2.l = zIsSoftwareOnly;
                                                        supportedProfileAdapter2.m = false;
                                                        supportedProfileAdapter2.n = false;
                                                        supportedProfileAdapter2.q = b2;
                                                        arrayList5.add(supportedProfileAdapter2);
                                                    } else {
                                                        z = true;
                                                    }
                                                    z2 = z;
                                                    it = it3;
                                                    hashSet = hashSet2;
                                                    videoCapabilities = videoCapabilities2;
                                                }
                                            }
                                            i = 0;
                                        }
                                    }
                                } else {
                                    i8++;
                                    codecInfos = codecInfos;
                                }
                            }
                        } catch (IllegalArgumentException unused2) {
                        }
                        mediaCodecInfoArr = codecInfos;
                        i = i5;
                        i2 = i6;
                        str = str2;
                        i3 = length;
                        i4 = i7;
                    } else {
                        mediaCodecInfoArr = codecInfos;
                        i = i5;
                        i2 = i6;
                        str = str2;
                        i3 = length;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    i5 = i;
                    codecInfos = mediaCodecInfoArr;
                    str2 = str;
                    i6 = i2;
                    length = i3;
                }
                i6++;
                codecInfos = codecInfos;
            }
            arrayList.addAll(arrayList2);
            SupportedProfileAdapter[] supportedProfileAdapterArr = new SupportedProfileAdapter[arrayList.size()];
            arrayList.toArray(supportedProfileAdapterArr);
            return supportedProfileAdapterArr;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
