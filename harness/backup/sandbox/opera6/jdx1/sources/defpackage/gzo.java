package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class gzo {
    public static final Regex b = new Regex("\\$\\{AUCTION_\\w+\\}");
    public final Map a;

    public gzo(String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.a = rbd.c(new Pair[]{new Pair("${AUCTION_ID}", str), new Pair("${AUCTION_SEAT_ID}", str2), new Pair("${AUCTION_BID_ID}", str3), new Pair("${AUCTION_IMP_ID}", str4), new Pair("${AUCTION_AD_ID}", str5), new Pair("${AUCTION_PRICE}", d != null ? d.toString() : null), new Pair("${AUCTION_CURRENCY}", str6)});
    }
}
