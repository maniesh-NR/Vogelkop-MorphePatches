package ads_mobile_sdk;

import android.net.Uri;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class kz extends nt5 {
    public vz a;
    public Uri b;
    public MotionEvent c;
    public ox d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vz f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return vz.a(this.f, (Uri) null, (MotionEvent) null, this);
    }
}
