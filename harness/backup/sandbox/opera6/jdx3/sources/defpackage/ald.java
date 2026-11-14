package defpackage;

import com.opera.android.custom_views.StylingImageButton;

/* loaded from: classes.dex */
public final /* synthetic */ class ald {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k24 b;

    public /* synthetic */ ald(k24 k24Var, byte b) {
        this.a = b;
        this.b = k24Var;
    }

    public final void a(int i) {
        byte b = this.a;
        k24 k24Var = this.b;
        switch (b) {
            case 0:
                ((StylingImageButton) ((or2) ((gld) k24Var).s.f).b).setImageResource(i == 0 ? 2131232297 : 2131232294);
                break;
            default:
                ((rld) k24Var).o0(i);
                break;
        }
    }
}
