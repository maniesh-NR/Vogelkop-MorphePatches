package defpackage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
public final /* synthetic */ class weh implements OnFailureListener, OnCanceledListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lfh b;

    public /* synthetic */ weh(lfh lfhVar, byte b) {
        this.a = b;
        this.b = lfhVar;
    }

    public final void onCanceled() {
        byte b = this.a;
        dfh dfhVar = dfh.a;
        lfh lfhVar = this.b;
        switch (b) {
            case 1:
                lfhVar.j.r(dfhVar);
                break;
            default:
                lfhVar.j.r(dfhVar);
                break;
        }
    }

    public final void onFailure(Exception exc) {
        byte b = this.a;
        yeh yehVar = yeh.a;
        lfh lfhVar = this.b;
        switch (b) {
            case 0:
                lfhVar.j.r(new cfh(yehVar));
                break;
            default:
                lfhVar.j.r(new cfh(yehVar));
                break;
        }
    }
}
