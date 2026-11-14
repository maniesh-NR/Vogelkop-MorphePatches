package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class tw0 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tw0(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public /* synthetic */ tw0(lol lolVar, zw0 zw0Var, Context context, int i, String str) {
        this.a = (byte) 0;
        this.c = lolVar;
        this.d = context;
        this.b = i;
        this.e = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                lol lolVar = (lol) obj4;
                Context context = (Context) obj3;
                String str = (String) obj2;
                xw0 xw0Var = (xw0) obj;
                if ((xw0Var instanceof vw0) || (xw0Var instanceof ww0)) {
                    lolVar.invoke(xw0Var);
                } else {
                    if (!Intrinsics.a(xw0Var, uw0.a)) {
                        h9o.p();
                        return null;
                    }
                    oa5 oa5VarG = na5.b.g(context, str);
                    anj anjVarT = r9h.t(str);
                    umj umjVar = umj.a;
                    oa5 oa5Var = new oa5(oa5VarG.a, 0);
                    int i2 = this.b;
                    lolVar.invoke(new vw0(new zmj(context, str, anjVarT, umjVar, i2, i2, oa5Var, true), oa5VarG.b, null));
                }
                return Unit.a;
            case 1:
                n02 n02Var = (n02) obj4;
                wth wthVar = (wth) obj3;
                List list = (List) obj2;
                tw7 tw7Var = (tw7) obj;
                if (tw7Var instanceof rw7) {
                    int i3 = i + 1;
                    if (i3 < 0 || i3 >= list.size()) {
                        n02Var.invoke(null);
                    } else {
                        wthVar.y(((Number) list.get(i3)).longValue(), new tw0((Object) n02Var, (Object) wthVar, (Object) list, i3, (byte) 1));
                    }
                } else {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    sfb sfbVar = (sfb) ((sw7) tw7Var).a;
                    if (sfbVar == null || sfbVar.h.isEmpty()) {
                        int i4 = i + 1;
                        if (i4 < 0 || i4 >= list.size()) {
                            n02Var.invoke(null);
                        } else {
                            wthVar.y(((Number) list.get(i4)).longValue(), new tw0((Object) n02Var, (Object) wthVar, (Object) list, i4, (byte) 1));
                        }
                    } else {
                        n02Var.invoke(sfbVar);
                    }
                }
                return Unit.a;
            case 2:
                dcb dcbVar = (dcb) obj3;
                zde zdeVar = (zde) obj2;
                if (obj == ((i37) obj4)) {
                    qp2.n("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof vak) {
                    int i5 = dcbVar.a - i;
                    int iD = zdeVar.d(obj);
                    zdeVar.g(Math.min(i5, iD >= 0 ? zdeVar.c[iD] : Integer.MAX_VALUE), obj);
                }
                return Unit.a;
            default:
                qga qgaVar = (qga) obj4;
                vfd vfdVar = (vfd) obj3;
                ifg ifgVar = (ifg) obj2;
                p1d p1dVar = (p1d) obj;
                int i6 = qgaVar.c;
                vhl vhlVar = qgaVar.b;
                j2m j2mVar = qgaVar.d;
                ojl ojlVar = (ojl) qgaVar.e.invoke();
                vhlVar.a(fsf.b, lah.n(p1dVar, i6, j2mVar, ojlVar != null ? ojlVar.a : null, vfdVar.getLayoutDirection() == d2c.b, ifgVar.a), i, ifgVar.a);
                p1d.h(p1dVar, ifgVar, Math.round(-vhlVar.a.h()), 0);
                return Unit.a;
        }
    }
}
