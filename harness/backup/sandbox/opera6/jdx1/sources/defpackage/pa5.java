package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class pa5 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        u35.n(-984833, map, "aliceblue", -332841, "antiquewhite");
        u35.l(-8388652, -16711681, "aqua", "aquamarine", map);
        u35.n(-983041, map, "azure", -657956, "beige");
        u35.n(-6972, map, "bisque", -16777216, "black");
        u35.n(-5171, map, "blanchedalmond", -16776961, "blue");
        u35.n(-7722014, map, "blueviolet", -5952982, "brown");
        u35.n(-2180985, map, "burlywood", -10510688, "cadetblue");
        u35.n(-8388864, map, "chartreuse", -2987746, "chocolate");
        u35.n(-32944, map, "coral", -10185235, "cornflowerblue");
        u35.n(-1828, map, "cornsilk", -2354116, "crimson");
        u35.l(-16777077, -16711681, "cyan", "darkblue", map);
        u35.n(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        u35.l(-16751616, -5658199, "darkgray", "darkgreen", map);
        u35.l(-4343957, -5658199, "darkgrey", "darkkhaki", map);
        u35.n(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        u35.n(-29696, map, "darkorange", -6737204, "darkorchid");
        u35.n(-7667712, map, "darkred", -1468806, "darksalmon");
        u35.n(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        u35.l(-7077677, -16724271, "darkturquoise", "darkviolet", map);
        u35.n(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        u35.l(-5103070, -14774017, "dodgerblue", "firebrick", map);
        u35.n(-1296, map, "floralwhite", -14513374, "forestgreen");
        u35.l(-2302756, -65281, "fuchsia", "gainsboro", map);
        u35.n(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        u35.n(-16744448, map, "green", -5374161, "greenyellow");
        u35.l(-983056, -8355712, "grey", "honeydew", map);
        u35.n(-38476, map, "hotpink", -3318692, "indianred");
        u35.n(-11861886, map, "indigo", -16, "ivory");
        u35.n(-989556, map, "khaki", -1644806, "lavender");
        u35.n(-3851, map, "lavenderblush", -8586240, "lawngreen");
        u35.n(-1331, map, "lemonchiffon", -5383962, "lightblue");
        u35.n(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        u35.n(-18751, map, "lightpink", -24454, "lightsalmon");
        u35.n(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        u35.l(-32, -5192482, "lightsteelblue", "lightyellow", map);
        u35.n(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        u35.n(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        u35.n(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        u35.n(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        u35.n(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        u35.n(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        u35.n(-15132304, map, "midnightblue", -655366, "mintcream");
        u35.n(-6943, map, "mistyrose", -6987, "moccasin");
        u35.n(-8531, map, "navajowhite", -16777088, "navy");
        u35.n(-133658, map, "oldlace", -8355840, "olive");
        u35.n(-9728477, map, "olivedrab", -23296, "orange");
        u35.n(-47872, map, "orangered", -2461482, "orchid");
        u35.n(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        u35.n(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        u35.n(-4139, map, "papayawhip", -9543, "peachpuff");
        u35.n(-3308225, map, "peru", -16181, "pink");
        u35.n(-2252579, map, "plum", -5185306, "powderblue");
        u35.n(-8388480, map, "purple", -10079335, "rebeccapurple");
        u35.n(-65536, map, "red", -4419697, "rosybrown");
        u35.n(-12490271, map, "royalblue", -7650029, "saddlebrown");
        u35.n(-360334, map, "salmon", -744352, "sandybrown");
        u35.n(-13726889, map, "seagreen", -2578, "seashell");
        u35.n(-6270419, map, "sienna", -4144960, "silver");
        u35.n(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        u35.l(-16711809, -1286, "snow", "springgreen", map);
        u35.n(-12156236, map, "steelblue", -2968436, "tan");
        u35.n(-16744320, map, "teal", -2572328, "thistle");
        u35.n(-40121, map, "tomato", 0, "transparent");
        u35.n(-12525360, map, "turquoise", -1146130, "violet");
        u35.n(-663885, map, "wheat", -1, "white");
        u35.n(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) throws NumberFormatException {
        int i;
        z4o.w(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return i2 | (-16777216);
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            hai.d();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(cqp.K0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        hai.d();
        return 0;
    }
}
