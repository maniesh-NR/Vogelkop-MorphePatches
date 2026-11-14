package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class s94 extends nt5 {
    public fd4 t;
    public uc4 u;
    public SessionConfiguration v;
    public /* synthetic */ Object w;
    public final /* synthetic */ t94 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s94(t94 t94Var, nt5 nt5Var) {
        super(nt5Var);
        this.x = t94Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= LinearLayoutManager.INVALID_OFFSET;
        return this.x.a(null, this);
    }
}
