package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.browser.autofill.SaveCardDialogRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class m98 implements eua {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m98(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ m98(rii riiVar, pr prVar) {
        this.a = (byte) 3;
        this.b = riiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wb0 wb0Var = wb0.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((im6) obj).d = wb0Var;
                break;
            case 1:
                ((xq3) obj).c = wb0Var;
                break;
            case 2:
                ((gjm) obj).e(new xyg(0), false);
                break;
            case 3:
                SaveCardDialogRequest saveCardDialogRequest = (SaveCardDialogRequest) ((rii) obj).b;
                Context context = saveCardDialogRequest.b;
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).L().c.x0(vb0.b);
                N.MGK4TqSx(saveCardDialogRequest.e);
                break;
            case 4:
                ((qq8) obj).i(hjm.a);
                break;
            case 5:
                ((tmi) obj).invoke(Boolean.FALSE);
                break;
            case 6:
                ((k4m) obj).run();
                break;
            default:
                ((xq3) obj).b = vb0.c;
                break;
        }
    }
}
