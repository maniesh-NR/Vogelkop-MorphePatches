package defpackage;

import android.os.SystemClock;
import android.view.View;
import java.util.function.Supplier;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public final class dnf extends o93 {
    public final PropertyModel c;
    public boolean d;
    public boolean e;
    public final hp2 f = new hp2((byte) 13, false);

    public dnf(PropertyModel propertyModel) {
        this.c = propertyModel;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        x5h x5hVar = hvd.g;
        PropertyModel propertyModel = this.c;
        gtj gtjVarE = gtj.e(view, (CharSequence) propertyModel.c(x5hVar), 5000);
        q9n.h(view.getContext());
        String str = (String) propertyModel.c(hvd.b);
        if (str != null) {
            this.f.b = SystemClock.elapsedRealtime();
            gtjVarE.g(str, new zvd(this, (byte) 8));
            jf7 jf7Var = new jf7(this, gtjVarE, (byte) 27);
            View viewFindViewById = ((na3) gtjVarE.a).i.findViewById(2131364491);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(jf7Var);
            }
        }
        return gtjVarE;
    }

    @Override // defpackage.o93
    public final void f(int i) {
        if (this.e) {
            return;
        }
        int i2 = 1;
        this.e = true;
        Callback callback = (Callback) this.c.c(hvd.t);
        if (callback != null) {
            if (!this.d) {
                if (i == 0) {
                    i2 = 4;
                } else if (i != 1) {
                    i2 = i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 9 : 3;
                }
            }
            callback.c(Integer.valueOf(i2));
        }
    }

    public final void g() {
        if (this.d || this.e) {
            return;
        }
        this.d = true;
        Supplier supplier = (Supplier) this.c.c(hvd.d);
        if (supplier != null) {
        }
    }
}
