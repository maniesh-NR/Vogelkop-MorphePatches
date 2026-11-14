package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lfa implements v1g {
    public final ifa a;
    public final efa b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = a("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");
    public static final Pattern a0 = a("GAP");
    public static final Pattern b0 = a("PRECISE");
    public static final Pattern c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern k0 = a("END-ON-NEXT");
    public static final Pattern l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern v0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern w0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern x0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public lfa(ifa ifaVar, efa efaVar) {
        this.a = ifaVar;
        this.b = efaVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static vl7 b(String str, ul7[] ul7VarArr) {
        ul7[] ul7VarArr2 = new ul7[ul7VarArr.length];
        for (int i2 = 0; i2 < ul7VarArr.length; i2++) {
            ul7 ul7Var = ul7VarArr[i2];
            ul7VarArr2[i2] = new ul7(ul7Var.b, ul7Var.c, ul7Var.d, null);
        }
        return new vl7(str, true, ul7VarArr2);
    }

    public static ul7 c(String str, String str2, HashMap map) throws s1g {
        String strJ = j(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new ul7(q54.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = q54.d;
            String str3 = tym.a;
            return new ul7(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = q54.e;
        return new ul7(uuid2, null, "video/mp4", w8h.e(uuid2, (UUID[]) null, bArrDecode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x03e1, code lost:
    
        throw new defpackage.kfa();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0797 A[PHI: r51
      0x0797: PHI (r51v18 int) = (r51v14 int), (r51v15 int), (r51v16 int), (r51v19 int) binds: [B:278:0x07ba, B:275:0x07ae, B:272:0x07a1, B:269:0x0795] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0955 A[PHI: r29
      0x0955: PHI (r29v17 java.util.regex.Matcher) = 
      (r29v4 java.util.regex.Matcher)
      (r29v5 java.util.regex.Matcher)
      (r29v6 java.util.regex.Matcher)
      (r29v7 java.util.regex.Matcher)
      (r29v8 java.util.regex.Matcher)
      (r29v9 java.util.regex.Matcher)
      (r29v10 java.util.regex.Matcher)
      (r29v11 java.util.regex.Matcher)
      (r29v12 java.util.regex.Matcher)
      (r29v13 java.util.regex.Matcher)
      (r29v14 java.util.regex.Matcher)
      (r29v15 java.util.regex.Matcher)
      (r29v18 java.util.regex.Matcher)
     binds: [B:391:0x09ed, B:388:0x09e1, B:385:0x09d4, B:382:0x09c8, B:379:0x09bc, B:376:0x09b0, B:373:0x09a4, B:370:0x0998, B:367:0x098a, B:364:0x097c, B:361:0x096e, B:358:0x0960, B:355:0x0953] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0f5a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.efa d(defpackage.ifa r131, defpackage.efa r132, defpackage.g77 r133, java.lang.String r134) throws defpackage.kfa, defpackage.s1g, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 4118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfa.d(ifa, efa, g77, java.lang.String):efa");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ifa f(defpackage.g77 r43, java.lang.String r44) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfa.f(g77, java.lang.String):ifa");
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws s1g {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw s1g.g("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = x0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:9:0x0028, B:30:0x0067, B:32:0x006d, B:34:0x0077, B:36:0x007f, B:40:0x0095, B:42:0x009d, B:44:0x00a5, B:46:0x00ad, B:48:0x00b5, B:50:0x00bd, B:52:0x00c5, B:54:0x00cd, B:56:0x00d5, B:57:0x00d9, B:65:0x00ff, B:66:0x0105, B:12:0x002f, B:14:0x0035, B:18:0x003e, B:20:0x0046, B:22:0x004f, B:24:0x0055, B:26:0x005b, B:27:0x0060), top: B:77:0x000f }] */
    @Override // defpackage.v1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r7, defpackage.ld6 r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfa.e(android.net.Uri, ld6):java.lang.Object");
    }
}
