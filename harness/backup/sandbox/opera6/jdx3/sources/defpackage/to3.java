package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final /* synthetic */ class to3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo3 b;

    public /* synthetic */ to3(wo3 wo3Var, byte b) {
        this.a = b;
        this.b = wo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wo3 wo3Var = this.b;
        switch (b) {
            case 0:
                wo3Var.H0();
                break;
            default:
                RecyclerView recyclerView = wo3Var.J0().c;
                wo3Var.H0();
                recyclerView.y0(wo3Var.G);
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView.t = false;
                recyclerView.B0(new lv2((byte) 0));
                break;
        }
    }
}
