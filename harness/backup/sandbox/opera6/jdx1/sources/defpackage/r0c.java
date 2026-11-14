package defpackage;

/* loaded from: classes.dex */
public abstract class r0c {
    public static final l1b a;
    public static final l1b b;

    static {
        k1b k1bVar = new k1b(4);
        k1bVar.e("zz", 2132020727);
        a = k1bVar.f(oy5.a).a();
        k1b k1bVar2 = new k1b(4);
        o18.s(2132020649, k1bVar2, "af", 2132020651, "sq");
        o18.s(2132020653, k1bVar2, "am", 2132020655, "ar");
        o18.s(2132020658, k1bVar2, "hy", 2132020659, "as");
        o18.s(2132019382, k1bVar2, "az", 2132020664, "ba");
        o18.s(2132020665, k1bVar2, "eu", 2132020667, "be");
        o18.s(2132020669, k1bVar2, "bn", 2132020673, "bs");
        o18.s(2132020675, k1bVar2, "pt-br", 2132020676, "br");
        o18.s(2132020678, k1bVar2, "bg", 2132020680, "my");
        o18.s(2132020685, k1bVar2, "ca", 2132020687, "ce");
        o18.s(2132020690, k1bVar2, "zh", 2132020691, "cv");
        o18.s(2132020697, k1bVar2, "hr", 2132020700, "cs");
        o18.s(2132020702, k1bVar2, "da", 2132020707, "nl");
        o18.s(2132020712, k1bVar2, "en", 2132020714, "et");
        o18.s(2132019402, k1bVar2, "fa", 2132020717, "fi");
        o18.s(2132020719, k1bVar2, "fr", 2132020721, "gl");
        o18.s(2132020723, k1bVar2, "ka", 2132020724, "de");
        o18.s(2132020729, k1bVar2, "el", 2132020734, "gu");
        o18.s(2132020736, k1bVar2, "ha", 2132020737, "he");
        o18.s(2132020738, k1bVar2, "hi", 2132020741, "hu");
        o18.s(2132020744, k1bVar2, "is", 2132020747, "id");
        o18.s(2132020751, k1bVar2, "ga", 2132020753, "it");
        o18.s(2132020757, k1bVar2, "ja", 2132020758, "jv");
        o18.s(2132020760, k1bVar2, "kn", 2132020761, "ks");
        o18.s(2132020762, k1bVar2, "kk", 2132020765, "ky");
        o18.s(2132020766, k1bVar2, "ko", 2132020770, "lv");
        o18.s(2132020774, k1bVar2, "lt", 2132020776, "lb");
        o18.s(2132020777, k1bVar2, "mk", 2132020779, "mg");
        o18.s(2132019443, k1bVar2, "ms", 2132020781, "ml");
        o18.s(2132020785, k1bVar2, "mr", 2132019448, "ne");
        o18.s(2132020800, k1bVar2, "no", 2132020801, "oc");
        o18.s(2132020802, k1bVar2, "or", 2132020810, "pl");
        o18.s(2132020812, k1bVar2, "pt", 2132020814, "pa");
        o18.s(2132020817, k1bVar2, "ro", 2132020819, "ru");
        o18.s(2132020826, k1bVar2, "sr", 2132020829, "sk");
        o18.s(2132020832, k1bVar2, "sl", 2132020838, "es");
        o18.s(2132019462, k1bVar2, "si", 2132020841, "sw");
        o18.s(2132020843, k1bVar2, "sv", 2132020847, "tg");
        o18.s(2132020849, k1bVar2, "ta", 2132020851, "tt");
        o18.s(2132020852, k1bVar2, "te", 2132020853, "th");
        o18.s(2132020859, k1bVar2, "tr", 2132020862, "uk");
        o18.s(2132020866, k1bVar2, "ur", 2132020868, "uz");
        o18.s(2132020872, k1bVar2, "vi", 2132020873, "cy");
        k1bVar2.e("fy", 2132020874);
        k1bVar2.e("yo", 2132020876);
        b = k1bVar2.d();
    }

    public static q0c a(l0c l0cVar) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(l0cVar.b);
        sb.append("-");
        String str = l0cVar.a;
        sb.append(str);
        String string = sb.toString();
        l1b l1bVar = b;
        Integer num2 = (Integer) l1bVar.get(string);
        if ((num2 == null && (num2 = (Integer) l1bVar.get(l0cVar.b)) == null) || (num = (Integer) a.get(str)) == null) {
            return null;
        }
        return new q0c(num.intValue(), num2.intValue());
    }
}
