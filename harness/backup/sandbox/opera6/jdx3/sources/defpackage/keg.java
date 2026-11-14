package defpackage;

import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class keg implements j6l {
    public final BrowserActivity a;
    public final /* synthetic */ meg b;

    public keg(meg megVar, BrowserActivity browserActivity) {
        this.b = megVar;
        this.a = browserActivity;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        this.a.moveTaskToBack(true);
        this.b.a();
    }
}
