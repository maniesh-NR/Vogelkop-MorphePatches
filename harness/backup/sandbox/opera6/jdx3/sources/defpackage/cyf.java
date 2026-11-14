package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cyf extends zxf {
    public final /* synthetic */ dyf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyf(dyf dyfVar) {
        super(dyfVar);
        this.e = dyfVar;
    }

    @Override // defpackage.zxf
    public final ArrayList b(nre nreVar) {
        return i41.y(nreVar.e, nreVar.g != null);
    }

    @Override // defpackage.zxf
    public final boolean f() {
        Context context = this.e.a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).J().i("enable_newsfeed");
    }
}
