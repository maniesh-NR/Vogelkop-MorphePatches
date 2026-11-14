package com.opera.android.bookmarks;

import J.N;
import com.opera.android.bookmarks.BookmarksBridge;
import defpackage.eri;
import defpackage.eti;
import defpackage.pl3;
import defpackage.q6e;
import defpackage.shf;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class d extends b implements pl3 {
    public shf d;

    @Override // defpackage.ol3
    public final String b() {
        return null;
    }

    @Override // defpackage.al3
    public final long d() {
        return N.MNmBobM5(this.b.a);
    }

    @Override // defpackage.pl3
    public final String f() {
        return (String) N.MqJub8Kf(this.b.a);
    }

    @Override // defpackage.ol3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.pl3
    public final shf getUrl() {
        shf shfVar;
        int i;
        shf shfVar2 = this.d;
        BookmarksBridge.BookmarkNode bookmarkNode = this.b;
        if (shfVar2 == null || !((String) shfVar2.a).equals((String) N.MqJub8Kf(bookmarkNode.a))) {
            GURL gurl = new GURL((String) N.MqJub8Kf(bookmarkNode.a));
            q6e q6eVar = eti.a;
            String strG = gurl.g();
            q6e q6eVar2 = eti.a;
            if (q6eVar2 != null) {
                for (eri eriVar : Collections.unmodifiableList(q6eVar2.a)) {
                    String url = eriVar.getUrl();
                    HashMap map = eti.b;
                    Pattern patternCompile = (Pattern) map.get(url);
                    if (patternCompile == null) {
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        while (true) {
                            int iIndexOf = url.indexOf(37, i2);
                            if (iIndexOf == -1 || (i = iIndexOf + 1) == url.length()) {
                                break;
                            }
                            sb.append(Pattern.quote(url.substring(i2, iIndexOf)));
                            i2 = iIndexOf + 2;
                            char cCharAt = url.charAt(i);
                            if (cCharAt == 'i') {
                                sb.append("(?:.*?)");
                            } else if (cCharAt != 's') {
                                sb.append(Pattern.quote(url.substring(iIndexOf, i2)));
                            } else {
                                sb.append("(.*?)");
                            }
                        }
                        sb.append(Pattern.quote(url.substring(i2)));
                        patternCompile = Pattern.compile(sb.toString());
                        map.put(url, patternCompile);
                    }
                    Matcher matcher = patternCompile.matcher(strG);
                    String strGroup = (!matcher.matches() || matcher.groupCount() <= 0) ? null : matcher.group(1);
                    if (strGroup != null) {
                        try {
                            shfVar = new shf(strG, a26.B(strGroup), eriVar);
                            break;
                        } catch (IllegalArgumentException unused) {
                            continue;
                        }
                    }
                }
                shfVar = new shf(strG, (byte) 13);
                this.d = shfVar;
            } else {
                shfVar = new shf(strG, (byte) 13);
                this.d = shfVar;
            }
        }
        return this.d;
    }
}
