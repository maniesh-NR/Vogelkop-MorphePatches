package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class d73 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f73 b;

    public /* synthetic */ d73(f73 f73Var, byte b) {
        this.a = b;
        this.b = f73Var;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        f73 f73Var = this.b;
        switch (b) {
            case 0:
                r8n r8nVar = f73Var.f;
                if (r8nVar != null) {
                    r8nVar.a(view);
                    break;
                }
                break;
            case 1:
                e73 e73Var = f73Var.g;
                if (e73Var != null) {
                    e73Var.a(view);
                    break;
                }
                break;
            default:
                f73Var.d.f.setImageDrawable(f03.x(2130971259, view.getContext()));
                break;
        }
    }
}
