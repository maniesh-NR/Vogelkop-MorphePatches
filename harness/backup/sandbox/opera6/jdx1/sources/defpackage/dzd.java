package defpackage;

import ads_mobile_sdk.pd;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class dzd {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        fr frVarG;
        int iH;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (frVarG = g(str2)) != null && (iH = frVarG.h()) != 0 && iH != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : tym.Z(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrZ = tym.Z(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrZ) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        fr frVarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (frVarG = g(str2)) == null) {
                    return 0;
                }
                return frVarG.h();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        fr frVarG;
        String strF = null;
        if (str != null) {
            String strK0 = cqp.K0(str.trim());
            if (strK0.startsWith("avc1") || strK0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strK0.startsWith("hev1") || strK0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strK0.startsWith("dvav") || strK0.startsWith("dva1") || strK0.startsWith("dvhe") || strK0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strK0.startsWith("av01")) {
                return "video/av01";
            }
            if (strK0.startsWith("vp9") || strK0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strK0.startsWith("vp8") || strK0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strK0.startsWith("mp4a")) {
                if (strK0.startsWith("mp4a.") && (frVarG = g(strK0)) != null) {
                    strF = f(frVarG.b);
                }
                return strF == null ? "audio/mp4a-latm" : strF;
            }
            if (strK0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strK0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strK0.startsWith("ac-3") || strK0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strK0.startsWith("ec-3") || strK0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strK0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strK0.startsWith("ac-4") || strK0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strK0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strK0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strK0.startsWith("dtsh") || strK0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strK0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strK0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strK0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strK0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strK0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strK0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strK0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strK0.contains("eia608") || strK0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                throw fki.n(0, arrayList);
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case pd.A0 /* 96 */:
            case pd.H0 /* 97 */:
            case pd.Q0 /* 98 */:
            case pd.R0 /* 99 */:
            case pd.S0 /* 100 */:
            case pd.T0 /* 101 */:
                return "video/mpeg2";
            case pd.U0 /* 102 */:
            case pd.K0 /* 103 */:
            case pd.V0 /* 104 */:
                return "audio/mp4a-latm";
            case pd.W0 /* 105 */:
            case pd.h1 /* 107 */:
                return "audio/mpeg";
            case pd.g1 /* 106 */:
                return "video/mpeg";
            case pd.i1 /* 108 */:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static fr g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new fr(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, (byte) 15);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw fki.n(0, arrayList);
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : tym.Z(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        String strK0;
        if (str == null) {
            return null;
        }
        strK0 = cqp.K0(str);
        strK0.getClass();
        switch (strK0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strK0;
        }
    }
}
