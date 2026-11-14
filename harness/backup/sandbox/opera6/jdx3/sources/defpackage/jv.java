package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class jv implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bz0 b;

    public /* synthetic */ jv(bz0 bz0Var, byte b) {
        this.a = b;
        this.b = bz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bz0 bz0Var = this.b;
        switch (b) {
            case 0:
                bz0Var.dismiss();
                break;
            default:
                Context context = bz0Var.getContext();
                if (!phj.s) {
                    phj.s = true;
                    String[] strArr = OperaApplication.K;
                    x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
                    if (x5fVar.h) {
                        zpa zpaVar = x5fVar.d;
                        x56 x56VarF = zpa.F();
                        am2.f(zpaVar, x56VarF).b.p(23, 1, 1L);
                        x5fVar.U0(x56VarF);
                    }
                    Toast toastMakeText = Toast.makeText(context, context.getString(2132018554), 1);
                    if (Build.VERSION.SDK_INT >= 30) {
                        r9n.M(toastMakeText);
                    } else {
                        toastMakeText.getView().addOnAttachStateChangeListener(new cz0((byte) 0));
                    }
                    toastMakeText.show();
                    break;
                }
                break;
        }
    }
}
