package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class n02 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wth b;
    public final /* synthetic */ j31 c;

    public /* synthetic */ n02(wth wthVar, j31 j31Var, byte b) {
        this.a = b;
        this.b = wthVar;
        this.c = j31Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                tw7 tw7Var = (tw7) obj;
                boolean z = tw7Var instanceof rw7;
                j31 j31Var = this.c;
                if (z) {
                    j31Var.invoke((Object) null);
                } else {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    List list = (List) ((sw7) tw7Var).a;
                    int size = list.size();
                    byte b = 1;
                    wth wthVar = this.b;
                    if (size == 1) {
                        long jLongValue = ((Number) list.get(0)).longValue();
                        wthVar.y(jLongValue, new o02(wthVar, jLongValue, j31Var, (byte) 0));
                    } else {
                        n02 n02Var = new n02(wthVar, j31Var, b);
                        if (list.size() <= 0) {
                            n02Var.invoke(null);
                        } else {
                            wthVar.y(((Number) list.get(0)).longValue(), new tw0(n02Var, wthVar, list, 0, (byte) 1));
                        }
                    }
                }
                return Unit.a;
            default:
                sfb sfbVar = (sfb) obj;
                j31 j31Var2 = this.c;
                if (sfbVar != null) {
                    long j = sfbVar.a;
                    ArrayList arrayList = sfbVar.h;
                    if (arrayList.size() <= 0) {
                        j31Var2.invoke((Object) null);
                    } else {
                        long jLongValue2 = ((Number) arrayList.get(0)).longValue();
                        wth wthVar2 = this.b;
                        wthVar2.z(j, jLongValue2, new p02(j31Var2, wthVar2, j, arrayList, 0, 1));
                    }
                } else {
                    j31Var2.invoke((Object) null);
                }
                return Unit.a;
        }
    }
}
