package defpackage;

import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t25 extends r25 {
    public final /* synthetic */ byte f;
    public final ArrayList g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t25(byte b) {
        super("Downloads", new rxh(2132018731), new rxh(2132018732), 2131232067, a35.d);
        this.f = b;
        switch (b) {
            case 1:
                super("OfflinePages", new rxh(2132021496), null, 2131232164, a35.f);
                this.g = new ArrayList();
                break;
            default:
                this.g = new ArrayList();
                break;
        }
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        byte b = this.f;
        ArrayList arrayList = this.g;
        switch (b) {
            case 0:
                if (!this.h) {
                    c(s25Var, new su(this, s25Var, runnable, (byte) 11));
                    break;
                } else {
                    fp1 fp1Var = s25Var.a;
                    String[] strArr = OperaApplication.K;
                    rf7 rf7Var = ((OperaApplication) fp1Var.getApplicationContext()).m().a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        rf7Var.c((re7) obj, null);
                    }
                    runnable.run();
                    break;
                }
            default:
                if (!this.h) {
                    c(s25Var, new su(this, s25Var, runnable, (byte) 14));
                    break;
                } else {
                    fp1 fp1Var2 = s25Var.a;
                    String[] strArr2 = OperaApplication.K;
                    ((OperaApplication) fp1Var2.getApplicationContext()).H().a(arrayList, true);
                    break;
                }
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                fp1 fp1Var = s25Var.a;
                String[] strArr = OperaApplication.K;
                rf7 rf7Var = ((OperaApplication) fp1Var.getApplicationContext()).m().a;
                ArrayList arrayList = this.g;
                arrayList.clear();
                for (re7 re7Var : Collections.unmodifiableList(rf7Var.c)) {
                    if (re7Var.l() || re7Var.f == 2) {
                        arrayList.add(re7Var);
                    }
                }
                umi umiVar = s25Var.b;
                jl4 jl4Var = new jl4(this, (byte) 10);
                su suVar = new su(this, callback, s25Var, (byte) 10);
                nml nmlVarE = umiVar.e(jl4Var);
                nmlVarE.b(umiVar.f(new lw0(suVar, (byte) 1)));
                nmlVarE.a(null);
                break;
            default:
                fp1 fp1Var2 = s25Var.a;
                String[] strArr2 = OperaApplication.K;
                ((OperaApplication) fp1Var2.getApplicationContext()).H().f(new su(this, callback, s25Var, (byte) 13));
                break;
        }
    }
}
