package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1rSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        return sko.j("[Exception Manager]: ", str);
    }

    public static final String getCurrencyIso4217Code(String str, String str2) {
        String strConcat = "";
        for (byte b : MessageDigest.getInstance(str2).digest(str.getBytes(Charsets.UTF_8))) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }

    public static final Pair<Integer, Integer> getMediationNetwork(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        ucd ucdVarI = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").i(str);
        if (ucdVarI != null) {
            e5 e5Var = ucdVarI.c;
            MatchGroup matchGroupG = e5Var.g(1);
            Integer intOrNull = (matchGroupG == null || (str4 = matchGroupG.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupG2 = e5Var.g(3);
            Integer intOrNull2 = (matchGroupG2 == null || (str3 = matchGroupG2.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupG3 = e5Var.g(4);
            Integer intOrNull3 = (matchGroupG3 == null || (str2 = matchGroupG3.a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getRevenue(@NotNull String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ucd ucdVarI = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").i(str);
        if (ucdVarI != null) {
            e5 e5Var = ucdVarI.c;
            MatchGroup matchGroupG = e5Var.g(1);
            Integer intOrNull = (matchGroupG == null || (str7 = matchGroupG.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupG2 = e5Var.g(2);
            Integer intOrNull2 = (matchGroupG2 == null || (str6 = matchGroupG2.a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup matchGroupG3 = e5Var.g(3);
            Integer intOrNull3 = (matchGroupG3 == null || (str5 = matchGroupG3.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupG4 = e5Var.g(4);
            Integer intOrNull4 = (matchGroupG4 == null || (str4 = matchGroupG4.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupG5 = e5Var.g(5);
            Integer intOrNull5 = (matchGroupG5 == null || (str3 = matchGroupG5.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup matchGroupG6 = e5Var.g(6);
            Integer intOrNull6 = (matchGroupG6 == null || (str2 = matchGroupG6.a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                return new Pair<>(Integer.valueOf(intOrNull3.intValue() + (intOrNull2.intValue() * 1000) + (intOrNull.intValue() * 1000000)), Integer.valueOf(num.intValue() + (intOrNull5.intValue() * 1000) + (intOrNull4.intValue() * 1000000)));
            }
        }
        return null;
    }

    private static boolean getRevenue(@NotNull Object... objArr) {
        return !e82.o(objArr, (Object) null);
    }
}
