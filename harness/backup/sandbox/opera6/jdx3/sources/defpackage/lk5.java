package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class lk5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jvg b;

    public /* synthetic */ lk5(jvg jvgVar, byte b) {
        this.a = b;
        this.b = jvgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ru0 ru0Var = ru0.c;
        jvg jvgVar = this.b;
        switch (b) {
            case 0:
                ((bmn) jvgVar.c).f(ru0Var, null);
                ((qf) jvgVar.b).b();
                break;
            case 1:
                bmn bmnVar = (bmn) jvgVar.c;
                bmnVar.f(ru0.e, null);
                ((qf) jvgVar.b).b();
                bmnVar.h();
                break;
            case 2:
                ((bmn) jvgVar.c).f(ru0Var, null);
                ((qf) jvgVar.b).b();
                break;
            default:
                ((bmn) jvgVar.c).g(view, (qf) jvgVar.b);
                break;
        }
    }
}
