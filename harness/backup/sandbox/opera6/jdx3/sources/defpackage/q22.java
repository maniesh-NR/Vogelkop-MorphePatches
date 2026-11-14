package defpackage;

import android.content.SharedPreferences;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class q22 implements kz3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((x22) obj).u = null;
                break;
            case 1:
                if (hjmVar == hjm.a) {
                    nv6 nv6VarB = ru9.c(((ImageView) obj).getContext()).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("main.menu.button.hint.closed", true);
                    nv6VarB.w();
                    break;
                }
                break;
            case 2:
                ((jmn) obj).B = null;
                break;
            default:
                ((lqn) obj).K = null;
                break;
        }
    }
}
