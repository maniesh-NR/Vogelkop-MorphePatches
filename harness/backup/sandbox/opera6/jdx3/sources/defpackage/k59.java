package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class k59 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l59 b;

    public /* synthetic */ k59(l59 l59Var, byte b) {
        this.a = b;
        this.b = l59Var;
    }

    public final void onFailure(Exception exc) {
        boolean z = exc instanceof IOException;
        l59 l59Var = this.b;
        if (z) {
            l59Var.a(new cm(2, (String) null, (byte) 2));
        } else {
            l59Var.a(new cm(3, (String) null, (byte) 2));
        }
    }

    public final void onSuccess(Object obj) {
        byte b = this.a;
        l59 l59Var = this.b;
        switch (b) {
            case 0:
                l59Var.a(new cm(1, (String) obj, (byte) 2));
                break;
            default:
                l59Var.a(new cm(1, (String) null, (byte) 2));
                break;
        }
    }
}
