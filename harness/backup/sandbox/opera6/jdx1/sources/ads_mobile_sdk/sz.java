package ads_mobile_sdk;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class sz extends nt5 {
    public Object a;
    public Closeable b;
    public Object c;
    public pfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vz f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(vz vzVar, nt5 nt5Var) {
        super(nt5Var);
        this.f = vzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f.a((Bundle) null, (mt5) this);
    }
}
