package defpackage;

import com.opera.android.OperaApplication;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class jw3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ jw3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final void a(Callback callback) {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                operaApplication.d().a(callback);
                break;
            default:
                if (!operaApplication.D().b()) {
                    callback.run(uvg.NONE);
                    break;
                } else {
                    new hze(operaApplication.E()).a(callback);
                    break;
                }
        }
    }
}
