package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wgd {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new vd3(new uac((byte) 20), (byte) 3));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((ogd) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((ogd) arrayList.remove(0));
    }

    public static String b(oj9 oj9Var) {
        Pair pairB;
        String str = oj9Var.n;
        String str2 = oj9Var.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairB = j75.b(oj9Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z, boolean z2) {
        sgd sgdVar = new sgd(str, z, z2);
        HashMap map = a;
        List list = (List) map.get(sgdVar);
        if (list != null) {
            return list;
        }
        boolean zEquals = str.equals("video/mv-hevc");
        nrl nrlVar = new nrl();
        nrlVar.a = z || z2 || zEquals;
        ArrayList arrayListE = e(sgdVar, nrlVar);
        if (z) {
            arrayListE.isEmpty();
        }
        a(str, arrayListE);
        h1b h1bVarS = h1b.s(arrayListE);
        map.put(sgdVar, h1bVarS);
        return h1bVarS;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(defpackage.sgd r16, nrl r17) throws java.lang.Exception {
        /*
            r0 = r16
            r1 = r17
            boolean r2 = r1.a
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbc
            r5.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r7 = r0.a     // Catch: java.lang.Exception -> Lbc
            boolean r13 = r0.b     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r6 = r1.b     // Catch: java.lang.Exception -> Lbc
            android.media.MediaCodecInfo[] r6 = (android.media.MediaCodecInfo[]) r6     // Catch: java.lang.Exception -> Lbc
            if (r6 != 0) goto L24
            android.media.MediaCodecList r6 = new android.media.MediaCodecList     // Catch: java.lang.Exception -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Exception -> Lbc
            android.media.MediaCodecInfo[] r6 = r6.getCodecInfos()     // Catch: java.lang.Exception -> Lbc
            r1.b = r6     // Catch: java.lang.Exception -> Lbc
        L24:
            int r14 = r6.length     // Catch: java.lang.Exception -> Lbc
            r6 = 0
            r15 = r6
        L27:
            if (r15 >= r14) goto Lbb
            java.lang.Object r6 = r1.b     // Catch: java.lang.Exception -> Lbc
            android.media.MediaCodecInfo[] r6 = (android.media.MediaCodecInfo[]) r6     // Catch: java.lang.Exception -> Lbc
            if (r6 != 0) goto L3a
            android.media.MediaCodecList r6 = new android.media.MediaCodecList     // Catch: java.lang.Exception -> Lbc
            r6.<init>(r2)     // Catch: java.lang.Exception -> Lbc
            android.media.MediaCodecInfo[] r6 = r6.getCodecInfos()     // Catch: java.lang.Exception -> Lbc
            r1.b = r6     // Catch: java.lang.Exception -> Lbc
        L3a:
            r6 = r6[r15]     // Catch: java.lang.Exception -> Lbc
            boolean r8 = r6.isAlias()     // Catch: java.lang.Exception -> Lbc
            if (r8 != 0) goto L90
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Exception -> Lbc
            boolean r9 = r6.isEncoder()     // Catch: java.lang.Exception -> Lbc
            if (r9 != 0) goto L90
            r9 = r8
            java.lang.String r8 = c(r6, r9, r7)     // Catch: java.lang.Exception -> Lbc
            if (r8 == 0) goto L90
            r10 = r9
            android.media.MediaCodecInfo$CodecCapabilities r9 = r6.getCapabilitiesForType(r8)     // Catch: java.lang.Exception -> L97
            boolean r11 = r9.isFeatureSupported(r4)     // Catch: java.lang.Exception -> L97
            boolean r12 = r9.isFeatureRequired(r4)     // Catch: java.lang.Exception -> L97
            boolean r1 = r0.c     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L67
            if (r12 != 0) goto L90
            goto L69
        L67:
            if (r11 == 0) goto L90
        L69:
            boolean r1 = r9.isFeatureSupported(r3)     // Catch: java.lang.Exception -> L97
            boolean r11 = r9.isFeatureRequired(r3)     // Catch: java.lang.Exception -> L97
            if (r13 != 0) goto L76
            if (r11 != 0) goto L90
            goto L78
        L76:
            if (r1 == 0) goto L90
        L78:
            r11 = r6
            r6 = r10
            boolean r10 = r11.isHardwareAccelerated()     // Catch: java.lang.Exception -> L95
            r12 = r11
            boolean r11 = r12.isSoftwareOnly()     // Catch: java.lang.Exception -> L95
            boolean r12 = r12.isVendor()     // Catch: java.lang.Exception -> L95
            if (r13 != r1) goto L90
            ogd r1 = defpackage.ogd.i(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L95
            r5.add(r1)     // Catch: java.lang.Exception -> L95
        L90:
            int r15 = r15 + 1
            r1 = r17
            goto L27
        L95:
            r0 = move-exception
            goto L99
        L97:
            r0 = move-exception
            r6 = r10
        L99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r1.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = "Failed to query codec "
            r1.append(r2)     // Catch: java.lang.Exception -> Lbc
            r1.append(r6)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch: java.lang.Exception -> Lbc
            r1.append(r8)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lbc
            defpackage.w7d.q(r1)     // Catch: java.lang.Exception -> Lbc
            throw r0     // Catch: java.lang.Exception -> Lbc
        Lbb:
            return r5
        Lbc:
            r0 = move-exception
            tgd r1 = new tgd
            java.lang.String r2 = "Failed to query underlying media codecs"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgd.e(sgd, nrl):java.util.ArrayList");
    }

    public static csh f(oj9 oj9Var, boolean z, boolean z2) {
        csh cshVarD;
        List listD = d(oj9Var.n, z, z2);
        String strB = b(oj9Var);
        if (strB == null) {
            a1b a1bVar = h1b.b;
            cshVarD = csh.e;
        } else {
            cshVarD = d(strB, z, z2);
        }
        z0b z0bVarP = h1b.p();
        z0bVarP.e(listD);
        z0bVarP.e(cshVarD);
        return z0bVarP.g();
    }
}
