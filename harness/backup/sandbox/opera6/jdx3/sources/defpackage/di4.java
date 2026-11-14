package defpackage;

import com.opera.android.custom_views.CheckBox;

/* loaded from: classes.dex */
public final /* synthetic */ class di4 implements av4, tj9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gi4 b;

    public /* synthetic */ di4(gi4 gi4Var, byte b) {
        this.a = b;
        this.b = gi4Var;
    }

    @Override // defpackage.av4
    public final void E(CheckBox checkBox) {
        this.b.f = checkBox.n;
    }

    @Override // defpackage.tj9
    public final void d(int i) {
        byte b = this.a;
        gi4 gi4Var = this.b;
        switch (b) {
            case 1:
                gi4Var.d = ((fi4) gi4Var.a.get(i)).a;
                break;
            default:
                gi4Var.e = ((fi4) gi4Var.b.get(i)).a;
                break;
        }
    }
}
