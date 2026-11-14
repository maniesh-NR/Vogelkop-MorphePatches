package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final int getMonetizationNetwork(@NotNull String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        ucd ucdVarI = new Regex("(\\d+).(\\d+).(\\d+).*").i(str);
        if (ucdVarI == null) {
            return -1;
        }
        e5 e5Var = ucdVarI.c;
        MatchGroup matchGroupG = e5Var.g(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupG == null || (str4 = matchGroupG.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupG2 = e5Var.g(2);
        int iIntValue3 = (((matchGroupG2 == null || (str3 = matchGroupG2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupG3 = e5Var.g(3);
        if (matchGroupG3 != null && (str2 = matchGroupG3.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String getMonetizationNetwork(String str, String str2) {
        String strConcat = "";
        for (byte b : MessageDigest.getInstance(str2).digest(str.getBytes(Charsets.UTF_8))) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }
}
