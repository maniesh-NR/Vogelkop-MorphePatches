package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class av5 implements eua {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ av5(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).L().c.H(p90.b);
                ((OperaApplication) context.getApplicationContext()).J().V(1, "banner_blocker");
                break;
            default:
                new zhj(new wzg(null, uxk.class, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(context);
                break;
        }
    }
}
