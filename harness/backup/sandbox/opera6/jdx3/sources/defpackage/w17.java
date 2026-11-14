package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.opera.android.esim.work.EsimPromotionWorker;
import com.opera.android.esim.work.EsimUpsellWorker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w17 extends o5o {
    public final /* synthetic */ byte a;
    public final Object b;

    public w17() {
        this.a = (byte) 0;
        this.b = new CopyOnWriteArrayList();
    }

    public w17(j4c j4cVar) {
        this.a = (byte) 1;
        this.b = j4cVar;
    }

    public final ajc a(Context context, String str, WorkerParameters workerParameters) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                while (it.hasNext()) {
                    try {
                        ajc ajcVarA = ((o5o) it.next()).a(context, str, workerParameters);
                        if (ajcVarA != null) {
                            return ajcVarA;
                        }
                    } catch (Throwable th) {
                        qs7 qs7VarX = qs7.x();
                        int i = x17.a;
                        qs7VarX.getClass();
                        throw th;
                    }
                }
                return null;
            default:
                j4c j4cVar = (j4c) obj;
                if (Intrinsics.a(str, EsimPromotionWorker.class.getName())) {
                    return new EsimPromotionWorker(context, workerParameters, ((dp6) j4cVar.get()).c());
                }
                if (!Intrinsics.a(str, EsimUpsellWorker.class.getName())) {
                    return null;
                }
                dp6 dp6Var = (dp6) j4cVar.get();
                f1p f1pVar = dp6Var.n;
                esg esgVar = new esg((byte) 11, new vm6(new tw2(dp6Var.c, (byte) 28)), new lq6(dp6Var.d()), false);
                jq6 jq6Var = new jq6(dp6Var.d());
                c5o c5oVar = new c5o();
                c5oVar.a = esgVar;
                c5oVar.b = jq6Var;
                return new EsimUpsellWorker(context, workerParameters, c5oVar);
        }
    }
}
