package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class s53 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ s53(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
