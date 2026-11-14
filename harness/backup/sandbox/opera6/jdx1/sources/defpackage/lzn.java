package defpackage;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class lzn {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", -1);
        map.put("lime", -16711936);
        map.put("cyan", -16711681);
        map.put("red", -65536);
        map.put("yellow", -256);
        map.put("magenta", -65281);
        map.put("blue", -16776961);
        map.put("black", -16777216);
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", -1);
        map2.put("bg_lime", -16711936);
        map2.put("bg_cyan", -16711681);
        map2.put("bg_red", -65536);
        map2.put("bg_yellow", -256);
        map2.put("bg_magenta", -65281);
        map2.put("bg_blue", -16776961);
        map2.put("bg_black", -16777216);
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r19, defpackage.izn r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzn.a(java.lang.String, izn, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, izn iznVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            fzn fznVar = (fzn) list.get(i);
            String str2 = iznVar.a;
            Set set = iznVar.d;
            String str3 = iznVar.c;
            if (fznVar.a.isEmpty() && fznVar.b.isEmpty() && fznVar.c.isEmpty() && fznVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = fzn.a(fzn.a(fzn.a(0, fznVar.a, str, 1073741824), fznVar.b, str2, 2), fznVar.d, str3, 4);
                size = (iA == -1 || !set.containsAll(fznVar.c)) ? 0 : iA + (fznVar.c.size() << 2);
            }
            if (size > 0) {
                arrayList.add(new jzn(size, fznVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, izn iznVar) {
        ArrayList arrayListB = b(list, str, iznVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((jzn) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static gzn d(String str, Matcher matcher, g1g g1gVar, ArrayList arrayList) {
        kzn kznVar = new kzn();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            kznVar.a = nzn.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            kznVar.b = nzn.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, kznVar);
            StringBuilder sb = new StringBuilder();
            String strN = g1gVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strN.trim());
                strN = g1gVar.n(StandardCharsets.UTF_8);
            }
            kznVar.c = f(str, sb.toString(), arrayList);
            return new gzn(kznVar.a().a(), kznVar.a, kznVar.b);
        } catch (IllegalArgumentException unused) {
            w7d.K("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, defpackage.kzn r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzn.e(java.lang.String, kzn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzn.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, kzn kznVar) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    w7d.K("Invalid anchor value: ".concat(strSubstring));
                    i = LinearLayoutManager.INVALID_OFFSET;
                    break;
            }
            kznVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            kznVar.e = nzn.b(str);
            kznVar.f = false;
        } else {
            kznVar.e = Integer.parseInt(str);
            kznVar.f = true;
        }
    }
}
