package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;

/* loaded from: classes.dex */
public final class fp3 extends r22 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp3(BrowserActivity browserActivity, BottomBar bottomBar, w6j w6jVar, byte b) {
        super(browserActivity, bottomBar, w6jVar);
        this.e = b;
    }

    @Override // defpackage.r22
    public final boolean O() {
        byte b = this.e;
        return true;
    }

    @Override // defpackage.r22
    public final no3 d(rsg rsgVar) {
        switch (this.e) {
            case 0:
                return new no3(false, false, false);
            default:
                return new no3(false, !rsgVar.c, false);
        }
    }

    @Override // defpackage.r22
    public final boolean i() {
        byte b = this.e;
        return false;
    }
}
