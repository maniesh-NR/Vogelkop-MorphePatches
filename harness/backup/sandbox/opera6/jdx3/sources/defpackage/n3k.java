package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final /* synthetic */ class n3k implements hcb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3k b;

    public /* synthetic */ n3k(p3k p3kVar, byte b) {
        this.a = b;
        this.b = p3kVar;
    }

    @Override // defpackage.hcb
    public final int getAsInt() {
        byte b = this.a;
        p3k p3kVar = this.b;
        switch (b) {
            case 0:
                ViewGroup viewGroup = p3kVar.b;
                if (viewGroup.isLaidOut() && !viewGroup.isLayoutRequested()) {
                    return viewGroup.getWidth();
                }
                viewGroup.measure(0, 0);
                return viewGroup.getMeasuredWidth();
            default:
                ViewGroup viewGroup2 = p3kVar.c;
                if (viewGroup2.isLaidOut() && !viewGroup2.isLayoutRequested()) {
                    return viewGroup2.getWidth();
                }
                viewGroup2.measure(0, 0);
                return viewGroup2.getMeasuredWidth();
        }
    }
}
