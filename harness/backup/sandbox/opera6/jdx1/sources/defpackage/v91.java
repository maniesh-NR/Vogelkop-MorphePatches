package defpackage;

import android.os.CancellationSignal;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v91 implements Function1 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ v91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                p1d.h((p1d) obj, (ifg) this.b, 0, 0);
                break;
            case 1:
                p1d p1dVar = (p1d) obj;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        p1d.h(p1dVar, (ifg) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                break;
            case 2:
                ((ph4) this.b).cancel();
                break;
            case 3:
                Throwable th = (Throwable) obj;
                cd5 cd5Var = (cd5) this.b;
                if (th != null) {
                    cd5Var.B0(th);
                } else {
                    cd5Var.j0(Unit.a);
                }
                break;
            case 4:
                rj4 rj4Var = (rj4) this.b;
                x61 metadata = ((go9) obj).getMetadata();
                lj4 lj4Var = new lj4(metadata, rj4Var);
                wi4 wi4Var = rj4Var.n;
                metadata.a.getFrameNumber();
                break;
            case 5:
                ((v84) this.b).cancel();
                break;
            case 6:
                ((CancellationSignal) this.b).cancel();
                break;
            case 7:
                ((ListenableFuture) this.b).cancel(false);
                break;
            case 8:
                ((w6j) this.b).b();
                break;
            case 9:
                nh4 nh4Var = (nh4) this.b;
                p0i p0iVar = t0i.b;
                Unit unit = Unit.a;
                nh4Var.resumeWith(unit);
                break;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                smg smgVar = (smg) this.b;
                if (smgVar != null) {
                    smgVar.d = zBooleanValue;
                }
                break;
            case 11:
                List list = (List) obj;
                Object objQ = CollectionsKt.Q(list);
                v6i v6iVar = (v6i) this.b;
                if (!Intrinsics.a(objQ, v6iVar)) {
                    break;
                }
                break;
            case 12:
                List list2 = (List) obj;
                Object objQ2 = CollectionsKt.Q(list2);
                w6i w6iVar = (w6i) this.b;
                if (!Intrinsics.a(objQ2, w6iVar)) {
                    break;
                }
                break;
            case 13:
                List list3 = (List) obj;
                Object objQ3 = CollectionsKt.Q(list3);
                x6i x6iVar = (x6i) this.b;
                if (!Intrinsics.a(objQ3, x6iVar)) {
                    break;
                }
                break;
            case 14:
                List list4 = (List) obj;
                Object objQ4 = CollectionsKt.Q(list4);
                t6i t6iVar = (t6i) this.b;
                if (!Intrinsics.a(objQ4, t6iVar)) {
                    break;
                }
                break;
            case 15:
                List list5 = (List) obj;
                Object objQ5 = CollectionsKt.Q(list5);
                i7i i7iVar = (i7i) this.b;
                if (!Intrinsics.a(objQ5, i7iVar)) {
                    break;
                }
                break;
            case 16:
                break;
            case 17:
                List list6 = (List) obj;
                Object objQ6 = CollectionsKt.Q(list6);
                h7i h7iVar = (h7i) this.b;
                if (!Intrinsics.a(objQ6, h7iVar)) {
                    break;
                }
                break;
            case 18:
                Throwable th2 = (Throwable) obj;
                uuk uukVar = (uuk) this.b;
                nh4 nh4Var2 = uukVar.c;
                if (nh4Var2 != null) {
                    nh4Var2.d(th2);
                }
                uukVar.c = null;
                break;
            case 19:
                ((CancellationTokenSource) this.b).cancel();
                break;
            case 20:
                float[] fArr = ((afd) obj).a;
                b2c b2cVar = (b2c) this.b;
                if (b2cVar.f()) {
                    rm5.v(b2cVar).g(b2cVar, fArr);
                }
                break;
            case 21:
                ((xb7) this.b).dispose();
                break;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    CancellationException cancellationException = th3 instanceof CancellationException ? (CancellationException) th3 : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException(th3.getMessage());
                    }
                    ((ynb) this.b).C(cancellationException);
                }
                break;
        }
        return Unit.a;
    }
}
