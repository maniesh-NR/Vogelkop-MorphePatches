package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class n42 implements View.OnClickListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ n42(byte b) {
        this.a = b;
    }

    public /* synthetic */ n42(Object obj, byte b) {
        this.a = b;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                na2.T(view.getContext());
                break;
            case 2:
                na2.T(view.getContext());
                break;
            case 3:
                FullscreenWebActivity.A0(view.getContext(), "https://opera.com/features/flow", new rxh(2132019506));
                break;
            case 4:
                z77 z77VarU = sfe.U(view.getContext());
                String strG = vtp.G(1, view.getContext());
                qxh qxhVar = strG != null ? new qxh(strG) : null;
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = "Install Referrer";
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = null;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 0;
                gkjVar.l = 0;
                gkjVar.m = 0;
                gkjVar.n = true;
                gkjVar.o = qxhVar;
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                break;
            case 5:
                Context context = view.getContext();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).Q();
                break;
            default:
                Context context2 = view.getContext();
                String[] strArr2 = OperaApplication.K;
                ((SharedPreferences) ((som) ((OperaApplication) context2.getApplicationContext()).r.b1.get()).f.get()).edit().putLong("last_signin", System.currentTimeMillis() - 172800000).apply();
                break;
        }
    }
}
