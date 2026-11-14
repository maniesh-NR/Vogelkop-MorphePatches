package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qza extends nt5 {
    public Context t;
    public Bitmap u;
    public Map v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ tza y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qza(tza tzaVar, nt5 nt5Var) {
        super(nt5Var);
        this.y = tzaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
