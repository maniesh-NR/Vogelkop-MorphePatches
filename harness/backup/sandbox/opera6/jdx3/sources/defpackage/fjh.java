package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fjh extends j0i implements Function2 {
    public final /* synthetic */ Context A;
    public RectF u;
    public Iterator v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ i97 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjh(ArrayList arrayList, i97 i97Var, Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = arrayList;
        this.z = i97Var;
        this.A = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        fjh fjhVar = new fjh(this.y, this.z, this.A, mt5Var);
        fjhVar.x = obj;
        return fjhVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        RectF rectF;
        Iterator it;
        l1j l1jVar = (l1j) this.x;
        px5 px5Var = px5.a;
        boolean z = this.w;
        if (!z) {
            ybh.y(obj);
            rectF = new RectF();
            it = this.y.iterator();
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.v;
            rectF = this.u;
            ybh.y(obj);
        }
        while (it.hasNext()) {
            f76 f76Var = (f76) it.next();
            rectF.setEmpty();
            s9i s9iVar = f76Var.g;
            i97 i97Var = this.z;
            if (s9iVar != null) {
                s9iVar.P(i97Var.b).computeBounds(rectF, true);
            } else {
                rm5.Y(new d82(new ac3(new d82(f76Var.e, (byte) 1), (mt5) null), (byte) 3), rectF);
            }
            if (!rectF.isEmpty()) {
                Resources resources = this.A.getResources();
                float f = i97Var.c;
                int i = bb5.j;
                float f2 = (-(((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics())) * f)) / 2.0f;
                rectF.inset(f2, f2);
                this.x = l1jVar;
                this.u = rectF;
                this.v = it;
                this.w = true;
                l1jVar.a(this, rectF);
                px5 px5Var2 = px5.a;
                return px5Var;
            }
        }
        return Unit.a;
    }
}
