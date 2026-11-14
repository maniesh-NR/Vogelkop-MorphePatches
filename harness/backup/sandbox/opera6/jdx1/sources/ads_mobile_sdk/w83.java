package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.zio;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class w83 extends nt5 {
    public Object a;
    public Closeable b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zio e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w83(zio zioVar, nt5 nt5Var) {
        super(nt5Var);
        this.e = zioVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= LinearLayoutManager.INVALID_OFFSET;
        return zio.c(this.e, this);
    }
}
