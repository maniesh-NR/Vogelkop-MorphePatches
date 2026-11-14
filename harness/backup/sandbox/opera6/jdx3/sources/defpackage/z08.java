package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class z08 extends ze {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z08(byte b, int i) {
        super(i);
        this.b = b;
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(!i0l.g());
            case 1:
                return Boolean.valueOf(((wnh) xnh.t(context).i()).b(1024));
            default:
                return super.b(context, l1bVar, mt5Var);
        }
    }

    @Override // defpackage.h8f
    public final Object c(Context context, kk6 kk6Var) {
        switch (this.b) {
            case 0:
                String[] strArr = OperaApplication.K;
                return Boolean.valueOf(((OperaApplication) context.getApplicationContext()).J().c() == b7j.d);
            case 1:
                String[] strArr2 = OperaApplication.K;
                return Boolean.valueOf(((OperaApplication) context.getApplicationContext()).J().i("live_scores_enabled"));
            default:
                String[] strArr3 = OperaApplication.K;
                return Boolean.valueOf(((OperaApplication) context.getApplicationContext()).J().i("enable_newsfeed"));
        }
    }
}
