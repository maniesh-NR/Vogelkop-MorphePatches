package defpackage;

import android.app.Activity;
import java.util.List;

/* loaded from: classes.dex */
public final class yn extends rn {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ao n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn(ao aoVar, Activity activity, zy zyVar, dl dlVar, List list, byte b) {
        super(aoVar, activity, zyVar, dlVar, list);
        this.m = b;
        this.n = aoVar;
    }

    public final void a() {
        switch (this.m) {
            case 0:
                ao.t.d(new c4(new bi(this, (byte) 5), (byte) 8));
                break;
            default:
                ao.t.d(new c4(new bi(this, (byte) 6), (byte) 8));
                break;
        }
    }
}
