package org.chromium.media;

import J.N;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import defpackage.i75;
import defpackage.na2;
import defpackage.ugd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MediaCodecUtil {
    public static boolean a(MediaCodec mediaCodec, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (mediaCodec == null) {
            return false;
        }
        try {
            MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
            if (!codecInfo.isEncoder() && (capabilitiesForType = codecInfo.getCapabilitiesForType(str)) != null) {
                if (capabilitiesForType.isFeatureSupported("adaptive-playback")) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public static nrl b(String str, int i, MediaCrypto mediaCrypto) throws IOException {
        MediaCodec mediaCodecCreateDecoderByType;
        nrl nrlVar = new nrl();
        if (!N.Ma9YTBDp(str)) {
            Locale locale = Locale.US;
            return nrlVar;
        }
        try {
            if ((str.startsWith("video") && i == 1) || (str.startsWith("audio") && mediaCrypto != null && mediaCrypto.requiresSecureDecoderComponent(str))) {
                String defaultCodecName = getDefaultCodecName(str, 0, false, false, true);
                if (defaultCodecName.equals("")) {
                    return nrlVar;
                }
                MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(defaultCodecName);
                nrlVar.b = mediaCodecCreateByCodecName;
                nrlVar.a = a(mediaCodecCreateByCodecName, str);
                return nrlVar;
            }
            if (i == 2) {
                mediaCodecCreateDecoderByType = MediaCodec.createByCodecName(getDefaultCodecName(str, 0, true, false, false));
                nrlVar.b = mediaCodecCreateDecoderByType;
            } else if (str.equals("audio/raw")) {
                mediaCodecCreateDecoderByType = MediaCodec.createByCodecName("OMX.google.raw.decoder");
                nrlVar.b = mediaCodecCreateDecoderByType;
            } else {
                mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(str);
                nrlVar.b = mediaCodecCreateDecoderByType;
            }
            nrlVar.a = a(mediaCodecCreateDecoderByType, str);
            return nrlVar;
        } catch (Exception unused) {
            Locale locale2 = Locale.US;
            nrlVar.b = null;
            return nrlVar;
        }
    }

    public static boolean c(MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo.isHardwareAccelerated() && !mediaCodecInfo.isSoftwareOnly()) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
            if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("c2.android.") && !lowerCase.contains(".sw.dec") && !lowerCase.contains(".sw.enc")) {
                return false;
            }
        }
        return true;
    }

    public static boolean canDecode(String str, boolean z) {
        if (!N.Ma9YTBDp(str)) {
            Locale locale = Locale.US;
            return false;
        }
        q38 q38Var = ugd.a;
        if (((MediaCodecInfo[]) q38Var.b).length <= 0) {
            MediaCodec mediaCodec = (MediaCodec) b(str, z ? 1 : 0, null).b;
            if (mediaCodec == null) {
                return false;
            }
            try {
                mediaCodec.release();
            } catch (IllegalStateException unused) {
            }
            return true;
        }
        Iterator it = q38Var.iterator();
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (!mediaCodecInfo.isEncoder()) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType == null) {
                        continue;
                    } else if (z) {
                        if (capabilitiesForType.isFeatureSupported("secure-playback")) {
                            return true;
                        }
                    } else if (!capabilitiesForType.isFeatureRequired("secure-playback")) {
                        return true;
                    }
                } catch (IllegalArgumentException unused2) {
                    continue;
                }
            }
        }
        return false;
    }

    public static String getDefaultCodecName(String str, int i, boolean z, boolean z2, boolean z3) {
        Iterator it = ugd.a.iterator();
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (mediaCodecInfo.isEncoder() == i) {
                boolean zC = c(mediaCodecInfo);
                if (!z || zC) {
                    if (!z2 || !zC) {
                        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(str)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                    if (capabilitiesForType != null && z3 == capabilitiesForType.isFeatureSupported("secure-playback")) {
                                        return mediaCodecInfo.getName();
                                    }
                                } catch (IllegalArgumentException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        Locale locale = Locale.US;
        return "";
    }

    public static Object[] getSupportedCodecProfileLevels() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ugd.a.iterator();
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (N.Ma9YTBDp(str)) {
                    try {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                            try {
                                final int iT = na2.t(str);
                                final int iE = na2.E(iT, codecProfileLevel.profile);
                                final int iD = na2.D(iT, codecProfileLevel.level);
                                arrayList.add(new Object(iT, iE, iD) { // from class: org.chromium.media.CodecProfileLevelList$CodecProfileLevelAdapter
                                    public final int a;
                                    public final int b;
                                    public final int c;

                                    {
                                        this.a = iT;
                                        this.b = iE;
                                        this.c = iD;
                                    }

                                    public final int getCodec() {
                                        return this.a;
                                    }

                                    public final int getLevel() {
                                        return this.c;
                                    }

                                    public final int getProfile() {
                                        return this.b;
                                    }
                                });
                            } catch (i75 unused) {
                            }
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    Locale locale = Locale.US;
                }
            }
        }
        return arrayList.toArray();
    }

    public static boolean requiresSecureDecoderComponent(MediaCrypto mediaCrypto, String str) {
        if (mediaCrypto == null) {
            return false;
        }
        try {
            return mediaCrypto.requiresSecureDecoderComponent(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
