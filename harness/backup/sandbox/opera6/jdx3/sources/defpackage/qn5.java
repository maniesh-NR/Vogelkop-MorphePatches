package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class qn5 {
    public static final Set a = e82.E(new String[]{"AR", "BG", "BS", "CA", "CS", "CY", "DA", "DE", "EL", "EN", "ES", "ET", "EU", "FI", "FR", "GL", "HE", "HI", "HR", "HU", "ID", "IT", "JA", "KA", "KO", "LT", "LV", "MK", "MS", "MT", "NL", "NO", "PL", "PT", "PT_BR", "RO", "RU", "SK", "SL", "SQ", "SR", "SR_LATN", "SV", "TH", "TL", "TR", "UK", "VI", "ZH", "ZH-HANT"});

    public static String a(String str) {
        Object next;
        List listY = StringsKt.Y(str.toUpperCase(Locale.ROOT), new String[]{"_"}, 0, 6);
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.E((String) next, (CharSequence) listY.get(0), false)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            return str2.toLowerCase(Locale.ROOT);
        }
        return null;
    }
}
