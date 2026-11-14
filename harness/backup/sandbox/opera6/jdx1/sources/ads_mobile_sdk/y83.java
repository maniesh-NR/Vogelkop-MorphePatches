package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.jjj;
import defpackage.zio;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y83 extends nt5 {
    public Object a;
    public Object b;
    public jjj c;
    public ArrayList d;
    public Iterator e;
    public tr f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zio h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y83(zio zioVar, nt5 nt5Var) {
        super(nt5Var);
        this.h = zioVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= LinearLayoutManager.INVALID_OFFSET;
        return zio.a(this.h, this);
    }
}
