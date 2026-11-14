package defpackage;

import com.opera.android.custom_views.ToolbarProgressBar;

/* loaded from: classes.dex */
public final class n4h implements Runnable {
    public int a = -1;
    public int b;
    public final /* synthetic */ shf c;

    public n4h(shf shfVar) {
        this.c = shfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        shf shfVar = this.c;
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) shfVar.a;
        toolbarProgressBar.a = false;
        toolbarProgressBar.setProgress(i);
        int i2 = this.b;
        if (i2 > 0) {
            ToolbarProgressBar toolbarProgressBar2 = (ToolbarProgressBar) shfVar.a;
            toolbarProgressBar2.a = true;
            toolbarProgressBar2.setProgress(i2);
        }
        vml.a(this);
        this.a = -1;
        this.b = 0;
    }
}
