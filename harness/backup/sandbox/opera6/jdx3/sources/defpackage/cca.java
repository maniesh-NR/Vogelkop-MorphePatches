package defpackage;

import com.opera.android.browser.BrowserUtils;

/* loaded from: classes.dex */
public final class cca implements yl2 {
    public final String a;
    public final String b;
    public final int c;

    public cca(String str, String str2, int i) {
        this.a = str2;
        this.c = i;
        if (str.equals(str2)) {
            this.b = BrowserUtils.getDisplayString(str2);
        } else if (str.equals(wqm.G(str2))) {
            this.b = wqm.G(BrowserUtils.getDisplayString(str2));
        } else {
            this.b = str;
        }
    }

    @Override // defpackage.yl2
    public final CharSequence d() {
        return this.b;
    }

    @Override // defpackage.yl2
    public final float f() {
        return this.c;
    }

    @Override // defpackage.yl2
    public final boolean g(String str) {
        String str2 = this.b;
        return str2.length() != str.length() && str2.startsWith(str);
    }

    @Override // defpackage.yl2
    public final String h() {
        return this.a;
    }

    @Override // defpackage.yl2
    public final boolean j(String str) {
        return this.b.equals(str);
    }
}
