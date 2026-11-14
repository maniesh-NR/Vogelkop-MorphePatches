package defpackage;

import android.graphics.Paint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ywc {
    public static final HashMap a = new HashMap();
    public static final String[] b = {"bn", "অ", "ta", "அ", "hi", "अ", "my", "က", "my-zg", "က", "si", "අ"};

    public static xwc a(String str) {
        xwc xwcVarB = b(str, true);
        return xwcVarB == null ? (xwc) a.get("en") : xwcVarB;
    }

    public static xwc b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = wwc.d(wwc.a);
        }
        String strC = wwc.c(str);
        d();
        HashMap map = a;
        xwc xwcVar = (xwc) map.get(strC);
        return (z && xwcVar == null && strC.indexOf(45) != -1) ? (xwc) map.get(strC.substring(0, strC.indexOf(45))) : xwcVar;
    }

    public static ArrayList c() {
        Paint paint = new Paint();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            if (!paint.hasGlyph(strArr[i + 1])) {
                arrayList.add(str);
            }
            i += 2;
        }
    }

    public static void d() {
        HashMap map = a;
        if (map.isEmpty()) {
            map.put("ar", new xwc("العربية", 2132019381));
            map.put("be", new xwc("Беларуская", 2132019383));
            map.put("bg", new xwc("Български", 2132019384));
            map.put("bn", new xwc("বাংলা", 2132019385));
            map.put("ca", new xwc("Català", 2132019387));
            map.put("cs", new xwc("Čeština", 2132019390));
            map.put("da", new xwc("Dansk", 2132019392));
            map.put("de", new xwc("Deutsch", 2132019393));
            map.put("el", new xwc("Ελληνικά", 2132019394));
            map.put("en", new xwc("English", 2132019395));
            map.put("en-gb", new xwc("English (United Kingdom)", 2132019396));
            map.put("es", new xwc("Español", 2132019398));
            map.put("es-es", new xwc("Español (España)", 2132019399));
            map.put("et", new xwc("Eesti", 2132019400));
            map.put("fa", new xwc("فارسی", 2132019402));
            map.put("fi", new xwc("Suomi", 2132019403));
            map.put("fr", new xwc("Français", 2132019404));
            map.put("he", new xwc("עברית", 2132019412));
            map.put("hi", new xwc("हिन्दी", 2132019413));
            map.put("hr", new xwc("Hrvatski", 2132019415));
            map.put("hu", new xwc("Magyar", 2132019417));
            map.put("in", new xwc("Bahasa Indonesia", 2132019419));
            map.put("it", new xwc("Italiano", 2132019422));
            map.put("ja", new xwc("日本語", 2132019423));
            map.put("ko", new xwc("한국어", 2132019429));
            map.put("lt", new xwc("Lietuvių", 2132019435));
            map.put("lv", new xwc("Latviešu", 2132019436));
            map.put("ms", new xwc("Bahasa Melayu", 2132019443));
            map.put("my", new xwc("ဗမာ", 2132019445));
            map.put("my-zg", new xwc("ဗမာ (Zawgyi)", 2132019446));
            map.put("nb", new xwc("Norsk bokmål", 2132019447));
            map.put("nl", new xwc("Nederlands", 2132019449));
            map.put("pl", new xwc("Polski", 2132019454));
            map.put("pt", new xwc("Português", 2132019456));
            map.put("pt-br", new xwc("Português (Brasil)", 2132019457));
            map.put("ro", new xwc("Română", 2132019458));
            map.put("ru", new xwc("Русский", 2132019459));
            map.put("si", new xwc("සිංහල", 2132019462));
            map.put("sk", new xwc("Slovenčina", 2132019463));
            map.put("sl", new xwc("Slovenščina", 2132019464));
            map.put("sv", new xwc("Svenska", 2132019472));
            map.put("sw", new xwc("Kiswahili", 2132019473));
            map.put("ta", new xwc("தமிழ்", 2132019474));
            map.put("th", new xwc("ไทย", 2132019477));
            map.put("tl", new xwc("Tagalog", 2132019479));
            map.put("tr", new xwc("Türkçe", 2132019480));
            map.put("uk", new xwc("Українська", 2132019483));
            map.put("ur", new xwc("اردو", 2132019484));
            map.put("vi", new xwc("Tiếng Việt", 2132019486));
            map.put("zh", new xwc("中文(香港)", 2132019491));
            map.put("zh-cn", new xwc("中文(简体)", 2132019490));
            map.put("zh-tw", new xwc("中文(台灣)", 2132019492));
        }
    }
}
