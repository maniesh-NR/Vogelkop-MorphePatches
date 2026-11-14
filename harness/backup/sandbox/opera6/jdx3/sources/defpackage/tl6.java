package defpackage;

import android.os.Build;
import com.leanplum.utils.SizeUtil;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class tl6 {
    public static final HashSet a;

    static {
        String str;
        HashSet hashSet = new HashSet();
        for (int i : vep.B(47)) {
            switch (i) {
                case 1:
                    str = "MBOX";
                    break;
                case 2:
                    str = "GIONEE F205";
                    break;
                case 3:
                    str = "GIONEE F6L";
                    break;
                case 4:
                    str = "GIONEE M7";
                    break;
                case 5:
                    str = "GIONEE M7L";
                    break;
                case 6:
                    str = "GIONEE S10";
                    break;
                case 7:
                    str = "GIONEE S10B";
                    break;
                case 8:
                    str = "GIONEE S10L";
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    str = "GIONEE S10 lite";
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    str = "GIONEE S11 lite";
                    break;
                case 11:
                    str = "M7 Power";
                    break;
                case 12:
                    str = "AUM-AL20";
                    break;
                case 13:
                    str = "AUM-L29";
                    break;
                case 14:
                    str = "AUM-L41";
                    break;
                case 15:
                    str = "BKK-L21";
                    break;
                case 16:
                    str = "BKK-LX2";
                    break;
                case 17:
                    str = "BLN-L21";
                    break;
                case SizeUtil.textSize0_1 /* 18 */:
                    str = "BND-AL10";
                    break;
                case 19:
                    str = "BND-L21";
                    break;
                case SizeUtil.textSize0 /* 20 */:
                    str = "COR-AL00";
                    break;
                case 21:
                    str = "COR-L29";
                    break;
                case SizeUtil.textSize1 /* 22 */:
                    str = "DLI-L42";
                    break;
                case 23:
                    str = "GLK-AL00";
                    break;
                case SizeUtil.textSize2 /* 24 */:
                    str = "JAT-L29";
                    break;
                case 25:
                    str = "JAT-L41";
                    break;
                case 26:
                    str = "JAT-LX1";
                    break;
                case 27:
                    str = "KSA-LX9";
                    break;
                case 28:
                    str = "LLD-AL20";
                    break;
                case 29:
                    str = "LLD-L21";
                    break;
                case 30:
                    str = "LLD-L31";
                    break;
                case 31:
                    str = "LND-L29";
                    break;
                case 32:
                    str = "STF-L09";
                    break;
                case 33:
                    str = "Infinix HOT 4 Pro";
                    break;
                case 34:
                    str = "itel S32";
                    break;
                case 35:
                    str = "itel A44 Power";
                    break;
                case 36:
                    str = "Z60";
                    break;
                case 37:
                    str = "Lenovo L38011";
                    break;
                case 38:
                    str = "C3600";
                    break;
                case 39:
                    str = "C3700";
                    break;
                case 40:
                    str = "LT P10I";
                    break;
                case 41:
                    str = "TVBOX-5G";
                    break;
                case 42:
                    str = "i60";
                    break;
                case 43:
                    str = "TECNO KB2";
                    break;
                case 44:
                    str = "TECNO K8";
                    break;
                case 45:
                    str = "vivo 1820";
                    break;
                case 46:
                    str = "ZTE BLADE A0620";
                    break;
                case 47:
                    str = "ZTE V0840";
                    break;
                default:
                    throw null;
            }
            hashSet.add(str);
        }
        a = hashSet;
    }

    public static boolean a() {
        return !a.contains(Build.MODEL);
    }
}
