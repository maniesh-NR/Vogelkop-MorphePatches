package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.Pair;
import com.leanplum.utils.SizeUtil;
import java.text.CollationElementIterator;
import java.text.Collator;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class aik {
    public static final String[] a = {"https://www.", "http://www.", "https://", "http://"};
    public static final u1b b = u1b.p(2, new Object[]{"HUAWEI", "HONOR"});

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int iCodePointAt = str.codePointAt(0);
        return new String(Character.toChars(Character.toUpperCase(iCodePointAt))).concat(str.substring(Character.charCount(iCodePointAt)));
    }

    public static String b(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2 == null ? "" : str2;
    }

    public static String c(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static Pair d(String str, String str2) {
        int[] iArr;
        if (str2.isEmpty()) {
            return new Pair(-1, -1);
        }
        Collator collator = Collator.getInstance();
        if (!(collator instanceof RuleBasedCollator)) {
            Matcher matcher = Pattern.compile(Pattern.quote(str2), 66).matcher(str);
            return matcher.find() ? new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())) : new Pair(-1, -1);
        }
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) collator;
        Pair[] pairArrK = k(str2, ruleBasedCollator);
        Pair[] pairArrK2 = k(str, ruleBasedCollator);
        int[] iArr2 = new int[pairArrK.length];
        iArr2[0] = -1;
        int i = -1;
        for (int i2 = 1; i2 < pairArrK.length; i2++) {
            Pair pair = pairArrK[i2];
            while (i > -1 && !pairArrK[i + 1].equals(pair)) {
                i = iArr2[i];
            }
            int i3 = i + 1;
            if (pairArrK[i3].equals(pair)) {
                i = i3;
            }
            iArr2[i2] = i;
        }
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            iArr = new int[0];
        } else {
            CollationElementIterator collationElementIterator = ruleBasedCollator.getCollationElementIterator(str);
            for (int offset = collationElementIterator.getOffset(); offset != -1; offset = collationElementIterator.next()) {
                arrayList.add(Integer.valueOf(collationElementIterator.getOffset()));
            }
            int size = arrayList.size();
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[size]);
            int[] iArr3 = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr3[i4] = numArr[i4].intValue();
            }
            iArr = iArr3;
        }
        int length = pairArrK2.length;
        int length2 = pairArrK.length;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            Pair pair2 = pairArrK2[i6];
            while (i5 > -1 && !pairArrK[i5 + 1].equals(pair2)) {
                i5 = iArr2[i5];
            }
            int i7 = i5 + 1;
            if (pairArrK[i7].equals(pair2)) {
                i5 = i7;
            }
            if (i5 == length2 - 1) {
                return new Pair(Integer.valueOf(iArr[(i6 - length2) + 1]), Integer.valueOf(iArr[i6 + 1]));
            }
        }
        return new Pair(-1, -1);
    }

    public static String e(Date date) {
        return DateUtils.getRelativeTimeSpanString(date.getTime(), new Date().getTime(), 60000L, 262144).toString();
    }

    public static String f(String str) {
        int iIndexOf = str.indexOf("://", 0);
        int i = iIndexOf != -1 ? iIndexOf + 3 : 0;
        int iIndexOf2 = str.indexOf(47, i);
        int iIndexOf3 = str.indexOf(63, i);
        if (iIndexOf3 != -1 && (iIndexOf2 == -1 || iIndexOf3 < iIndexOf2)) {
            iIndexOf2 = iIndexOf3;
        }
        int iIndexOf4 = str.indexOf(35, i);
        if (iIndexOf4 != -1 && (iIndexOf2 == -1 || iIndexOf4 < iIndexOf2)) {
            iIndexOf2 = iIndexOf4;
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        int iIndexOf5 = str.indexOf(64, i);
        if (iIndexOf5 >= i && iIndexOf5 < iIndexOf2) {
            i = iIndexOf5 + 1;
        }
        int iIndexOf6 = str.indexOf(58, i);
        if (iIndexOf6 >= i && iIndexOf6 < iIndexOf2) {
            iIndexOf2 = iIndexOf6;
        }
        return str.substring(i, iIndexOf2);
    }

    public static String g(String str) {
        String strF = f(str);
        return strF.startsWith("www.") ? strF.substring(4) : strF;
    }

    public static String h(long j, Context context) {
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return (TextUtils.isEmpty(language) || !language.startsWith("zh")) ? n(Formatter.formatShortFileSize(context, j)) : m(j);
    }

    public static String i(long j, Context context) {
        String language = context.getResources().getConfiguration().locale.getLanguage();
        return (TextUtils.isEmpty(language) || !language.startsWith("zh")) ? n(Formatter.formatFileSize(context, j)) : m(j);
    }

    public static String j(long j, Context context) {
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        String strH = h(j, context);
        int length = strH.length() + 1;
        int iCharCount = 0;
        int iMax = 0;
        while (iCharCount < strH.length()) {
            int iCodePointAt = strH.codePointAt(iCharCount);
            if (Character.isDigit(iCodePointAt) || iCodePointAt == decimalSeparator) {
                length = Math.min(length, iCharCount);
                iMax = Math.max(iMax, iCharCount);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (length > iMax) {
            return strH;
        }
        try {
            int i = iMax + 1;
            return String.format(Locale.getDefault(), "%s%.0f%s", strH.substring(0, length), Float.valueOf(NumberFormat.getInstance().parse(strH.substring(length, i)).floatValue()), strH.substring(i, strH.length()));
        } catch (ParseException unused) {
            return strH;
        }
    }

    public static Pair[] k(String str, RuleBasedCollator ruleBasedCollator) {
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            return new Pair[0];
        }
        CollationElementIterator collationElementIterator = ruleBasedCollator.getCollationElementIterator(str);
        for (int next = collationElementIterator.next(); next != -1; next = collationElementIterator.next()) {
            arrayList.add(new Pair(Integer.valueOf(CollationElementIterator.primaryOrder(next)), Integer.valueOf(CollationElementIterator.secondaryOrder(next))));
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }

    public static String l(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return "HSUPA";
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "HSPA";
            case 11:
                return "iDen";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "eHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return "GSM";
            case 17:
                return "TD_SCDMA";
            case SizeUtil.textSize0_1 /* 18 */:
                return "IWLAN";
            case 19:
            default:
                return null;
            case SizeUtil.textSize0 /* 20 */:
                return "NR";
        }
    }

    public static String m(long j) {
        if (j >= 1024) {
            double d = j;
            int iLog = (int) (Math.log(d) / 6.931471805599453d);
            return String.format(Locale.US, "%.1f %cB", Double.valueOf(d / Math.pow(1024.0d, iLog)), Character.valueOf("KMGTPE".charAt(iLog - 1)));
        }
        return j + " B";
    }

    public static String n(String str) {
        return (b.contains(Build.BRAND) && Locale.getDefault().getLanguage().equals("en")) ? str.replaceAll("[\u202a\u202b\u202c\u200e\u200f]", "") : str;
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String p(String str) {
        int iIndexOf;
        int i;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int iIndexOf2 = str.indexOf("://");
        int i2 = iIndexOf2 >= 0 ? iIndexOf2 + 3 : 0;
        int iIndexOf3 = str.indexOf(47, i2);
        int iIndexOf4 = str.indexOf(35, i2);
        int iIndexOf5 = str.indexOf(63, i2);
        int length = str.length();
        if (iIndexOf3 >= 0) {
            length = Math.min(iIndexOf3, length);
        }
        if (iIndexOf4 >= 0) {
            length = Math.min(iIndexOf4, length);
        }
        if (iIndexOf5 >= 0) {
            length = Math.min(iIndexOf5, length);
        }
        int iIndexOf6 = str.indexOf(64, i2);
        if (iIndexOf6 <= i2 || iIndexOf6 >= length || (iIndexOf = str.indexOf(58, i2)) < 0 || (i = iIndexOf + 1) >= iIndexOf6) {
            return str;
        }
        return str.substring(0, i) + "*****" + str.substring(iIndexOf6);
    }

    public static String q(String str, HashSet hashSet) {
        for (int i = 0; i < str.length(); i++) {
            if (!hashSet.contains(Character.valueOf(str.charAt(i)))) {
                StringBuilder sb = new StringBuilder(str.substring(0, i));
                int i2 = i + 1;
                int i3 = i2;
                while (i2 < str.length()) {
                    if (!hashSet.contains(Character.valueOf(str.charAt(i2)))) {
                        sb.append((CharSequence) str, i3, i2);
                        i3 = i2 + 1;
                    }
                    i2++;
                }
                sb.append((CharSequence) str, i3, str.length());
                return sb.toString();
            }
        }
        return str;
    }

    public static ArrayList r(boolean z, String str, char c) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (c == str.charAt(i)) {
                if (z || i > i2) {
                    arrayList.add(str.substring(i2, i));
                }
                i2 = i + 1;
            }
            i++;
        }
        if (z || i > i2) {
            arrayList.add(str.substring(i2, i));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static String s(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.startsWith(str2)) {
                return str.substring(str2.length());
            }
        }
        return str;
    }

    public static CharSequence t(CharSequence charSequence) {
        int iCharCount = 0;
        while (iCharCount < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        int length = charSequence.length();
        while (length > iCharCount) {
            int iCodePointBefore = Character.codePointBefore(charSequence, length);
            if (!Character.isWhitespace(iCodePointBefore)) {
                break;
            }
            length -= Character.charCount(iCodePointBefore);
        }
        return charSequence.subSequence(iCharCount, length);
    }
}
