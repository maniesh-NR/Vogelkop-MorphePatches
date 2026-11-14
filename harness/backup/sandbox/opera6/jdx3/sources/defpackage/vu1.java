package defpackage;

import com.opera.android.minigame.appwidget.JumpMinigameAppWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class vu1 implements mzk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vu1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.mzk
    public final void k(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yu1) obj).c();
                break;
            case 1:
                int i = eif.a;
                kfo.k0(((atb) obj).a, JumpMinigameAppWidget.class);
                break;
            default:
                ((ien) obj).o();
                break;
        }
    }
}
