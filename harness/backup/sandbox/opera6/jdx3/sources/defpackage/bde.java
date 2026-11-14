package defpackage;

import com.opera.android.browser.TabInfo;

/* loaded from: classes.dex */
public final class bde extends y08 implements j6l {
    public int a;
    public int b;
    public int c;

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        this.b++;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void T(b2l b2lVar, TabInfo tabInfo) {
        if (((d7l) b2lVar).j.a().d != tabInfo.d) {
            this.c++;
        }
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        this.a++;
    }
}
