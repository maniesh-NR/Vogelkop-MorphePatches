package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class lic {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        Map mapC = rbd.c(new Pair[]{new Pair("adguard_ads", 2132017316), new Pair("adguard_mobile_ads", 2132017317), new Pair("easylist", 2132017320), new Pair("nocoin", 2132017322), new Pair("opera_fixes", 2132017324), new Pair("ublock", 2132017360), new Pair("regional_albania", 2132017326), new Pair("regional_arabic", 2132017327), new Pair("regional_bulgarian", 2132017328), new Pair("regional_chinese", 2132017329), new Pair("regional_czech_slovak", 2132017330), new Pair("regional_estonia", 2132017332), new Pair("regional_finland", 2132017333), new Pair("regional_france", 2132017334), new Pair("regional_germany", 2132017335), new Pair("regional_greek", 2132017336), new Pair("regional_hebrew", 2132017337), new Pair("regional_hungary", 2132017338), new Pair("regional_iceland", 2132017339), new Pair("regional_india", 2132017340), new Pair("regional_indonesia", 2132017341), new Pair("regional_italy", 2132017342), new Pair("regional_japan", 2132017343), new Pair("regional_korea", 2132017344), new Pair("regional_latvia", 2132017345), new Pair("regional_lithuania", 2132017346), new Pair("regional_macedonia", 2132017347), new Pair("regional_netherlands", 2132017331), new Pair("regional_norway", 2132017348), new Pair("regional_persia", 2132017349), new Pair("regional_poland", 2132017350), new Pair("regional_romania", 2132017351), new Pair("regional_russia", 2132017352), new Pair("regional_serbia_croatia", 2132017353), new Pair("regional_slovenia", 2132017354), new Pair("regional_spanish_portuguese", 2132017355), new Pair("regional_sweden", 2132017356), new Pair("regional_thailand", 2132017357), new Pair("regional_turkey", 2132017358), new Pair("regional_vietnam", 2132017359)});
        LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(mapC.size()));
        for (Map.Entry entry : mapC.entrySet()) {
            linkedHashMap.put(entry.getKey(), new rxh(((Number) entry.getValue()).intValue()));
        }
        a = linkedHashMap;
        Map mapC2 = rbd.c(new Pair[]{new Pair("adguard_ads", 2132017319), new Pair("adguard_mobile_ads", 2132017318), new Pair("easylist", 2132017321), new Pair("nocoin", 2132017323), new Pair("opera_fixes", 2132017325), new Pair("ublock", 2132017361)});
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qbd.a(mapC2.size()));
        for (Map.Entry entry2 : mapC2.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new rxh(((Number) entry2.getValue()).intValue()));
        }
        b = linkedHashMap2;
    }
}
