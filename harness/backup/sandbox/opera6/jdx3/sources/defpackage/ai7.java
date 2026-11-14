package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class ai7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hi7 b;

    public /* synthetic */ ai7(hi7 hi7Var, byte b) {
        this.a = b;
        this.b = hi7Var;
    }

    public /* synthetic */ ai7(hi7 hi7Var, ki5 ki5Var) {
        this.a = (byte) 0;
        this.b = hi7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hi7 hi7Var = this.b;
        switch (b) {
            case 0:
                ((FrameLayout) hi7Var.e.b).setVisibility(4);
                break;
            case 1:
                ((FrameLayout) hi7Var.e.b).setVisibility(0);
                break;
            case 2:
                ((View) hi7Var.e.d).setVisibility(0);
                break;
            default:
                hi7Var.e();
                break;
        }
    }
}
