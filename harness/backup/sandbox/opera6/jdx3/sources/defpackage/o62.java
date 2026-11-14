package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class o62 implements bqb, n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ o62(Function1 function1, byte b) {
        this.a = b;
        this.b = function1;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        Function1 function1 = this.b;
        switch (b) {
            case 1:
                function1.invoke((String) obj);
                return Unit.a;
            case 2:
                return function1.invoke(obj);
            case 3:
                return function1.invoke(obj);
            case 4:
                return function1.invoke(obj);
            case 5:
                return function1.invoke(obj);
            default:
                function1.invoke((z37) obj);
                return Unit.a;
        }
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        cw0 cw0Var;
        atn atnVar = null;
        if (!(tw7Var instanceof rw7)) {
            if (!(tw7Var instanceof sw7)) {
                h9o.p();
                return;
            }
            x32 x32Var = (x32) ((sw7) tw7Var).a;
            if (x32Var != null) {
                if (x32Var instanceof v32) {
                    gu4 gu4Var = ((v32) x32Var).a;
                    String str = gu4Var.b;
                    ArrayList arrayList = gu4Var.i;
                    ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        mu4 mu4Var = (mu4) obj;
                        ou4 ou4Var = mu4Var.a;
                        String str2 = mu4Var.b;
                        int iOrdinal = ou4Var.ordinal();
                        if (iOrdinal == 0) {
                            qp2.o("");
                            return;
                        }
                        if (iOrdinal == 1) {
                            cw0Var = new cw0(str2);
                        } else if (iOrdinal == 2) {
                            cw0Var = new dw0(str2);
                        } else {
                            if (iOrdinal != 3) {
                                h9o.p();
                                return;
                            }
                            cw0Var = new cw0(str2);
                        }
                        arrayList2.add(cw0Var);
                    }
                    atnVar = new atn(str, arrayList2);
                } else if (!(x32Var instanceof w32)) {
                    if (x32Var instanceof y32) {
                        qp2.o("");
                        return;
                    }
                }
            }
            h9o.p();
            return;
        }
        this.b.invoke(atnVar);
    }
}
