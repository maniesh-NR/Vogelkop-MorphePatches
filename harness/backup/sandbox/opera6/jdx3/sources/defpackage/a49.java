package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.FindInPage;

/* loaded from: classes.dex */
public final class a49 implements j6l {
    public final FindInPage a;
    public final k6l b;
    public int c;

    public a49(BrowserActivity browserActivity, FindInPage findInPage, k6l k6lVar) {
        this.a = findInPage;
        this.b = k6lVar;
        aib.B(k6lVar, browserActivity, this, new al7(this, (byte) 8));
    }

    @Override // defpackage.j6l
    public final void d(int i) {
        int iS = this.b.s(p6l.b);
        if (iS == 0 && this.c > 0) {
            this.a.o = "";
        }
        this.c = iS;
    }
}
