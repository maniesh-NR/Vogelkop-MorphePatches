package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class sv7 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv7 b;

    public /* synthetic */ sv7(yv7 yv7Var, byte b) {
        this.a = b;
        this.b = yv7Var;
    }

    public final Object get() {
        byte b = this.a;
        yv7 yv7Var = this.b;
        switch (b) {
            case 0:
                return (eri) yv7Var.d.f.g();
            case 1:
                String string = yv7Var.l.q().toString();
                return TextUtils.isEmpty(string) ? String.valueOf(yv7Var.l.getText()) : string;
            case 2:
                return yv7Var.n.a;
            default:
                return Integer.valueOf(yv7Var.l.getHighlightColor());
        }
    }
}
