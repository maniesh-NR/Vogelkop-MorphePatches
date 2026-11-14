package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class lp3 extends nt5 {
    public mp3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mp3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp3(mp3 mp3Var, nt5 nt5Var) {
        super(nt5Var);
        this.c = mp3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= LinearLayoutManager.INVALID_OFFSET;
        return this.c.a(this);
    }
}
