package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ukh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class pv1 extends nt5 {
    public defpackage.pr a;
    public Integer b;
    public ArrayList c;
    public Integer d;
    public Boolean e;
    public String f;
    public Boolean g;
    public List h;
    public Boolean i;
    public Integer j;
    public Boolean k;
    public ukh l;
    public /* synthetic */ Object m;
    public final /* synthetic */ defpackage.pr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv1(defpackage.pr prVar, nt5 nt5Var) {
        super(nt5Var);
        this.n = prVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= LinearLayoutManager.INVALID_OFFSET;
        return this.n.d(this);
    }
}
