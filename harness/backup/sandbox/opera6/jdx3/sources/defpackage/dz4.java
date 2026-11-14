package defpackage;

import android.app.Activity;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dz4 implements bag {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Callback b;

    public dz4(ChromiumContent chromiumContent, Callback callback) {
        this.b = callback;
    }

    public dz4(Callback callback) {
        this.b = callback;
    }

    @Override // defpackage.bag
    public final v9g g(Activity activity, List list) {
        switch (this.a) {
            case 0:
                return new t9g(activity, 2132020437, activity.getString(2132020442, activity.getString(2132017591)));
            default:
                return new t9g(activity, 2132018642, activity.getString(2132018641));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bag
    public final v9g n(dx3 dx3Var, ArrayList arrayList) {
        switch (this.a) {
            case 0:
                return new t9g(dx3Var, dx3Var.getString(2132020442, dx3Var.getString(2132017591)));
            default:
                return new t9g(dx3Var, dx3Var.getString(2132018640, dx3Var.getString(2132017591)));
        }
    }

    @Override // defpackage.bag
    public final void s() {
        byte b = this.a;
        Callback callback = this.b;
        switch (b) {
            case 0:
                callback.run(Boolean.FALSE);
                break;
            default:
                callback.run(Boolean.FALSE);
                break;
        }
    }

    @Override // defpackage.bag
    public final void t() {
        byte b = this.a;
        Callback callback = this.b;
        switch (b) {
            case 0:
                callback.run(Boolean.TRUE);
                break;
            default:
                callback.run(Boolean.TRUE);
                break;
        }
    }
}
