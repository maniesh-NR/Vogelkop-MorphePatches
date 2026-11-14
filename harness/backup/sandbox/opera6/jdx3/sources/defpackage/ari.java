package defpackage;

import kotlin.text.c;

/* loaded from: classes.dex */
public final class ari implements yl2 {
    public final String a;

    public ari(String str) {
        this.a = str;
    }

    @Override // defpackage.yl2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.yl2
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.yl2
    public final float f() {
        return 0.25f;
    }

    @Override // defpackage.yl2
    public final boolean g(String str) {
        String str2 = this.a;
        return str2.length() != str.length() && c.q(str2, str, false);
    }

    @Override // defpackage.yl2
    public final String h() {
        return this.a;
    }

    @Override // defpackage.yl2
    public final boolean j(String str) {
        return this.a.equals(str);
    }
}
