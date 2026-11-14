package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lx1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bhi b;

    public /* synthetic */ lx1(bhi bhiVar, byte b) {
        this.a = b;
        this.b = bhiVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bhi bhiVar = this.b;
        switch (b) {
            case 0:
                tw7 tw7Var = (tw7) obj;
                if (tw7Var instanceof rw7) {
                    p0i p0iVar = t0i.b;
                    bhiVar.resumeWith((Object) null);
                } else {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    tfb tfbVar = (tfb) ((sw7) tw7Var).a;
                    p0i p0iVar2 = t0i.b;
                    bhiVar.resumeWith(tfbVar);
                }
                return Unit.a;
            case 1:
                tw7 tw7Var2 = (tw7) obj;
                if (tw7Var2 instanceof rw7) {
                    p0i p0iVar3 = t0i.b;
                    bhiVar.resumeWith(l08.a);
                } else {
                    if (!(tw7Var2 instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    List list = (List) ((sw7) tw7Var2).a;
                    p0i p0iVar4 = t0i.b;
                    bhiVar.resumeWith(list);
                }
                return Unit.a;
            case 2:
                tw7 tw7Var3 = (tw7) obj;
                if (tw7Var3 instanceof rw7) {
                    p0i p0iVar5 = t0i.b;
                    bhiVar.resumeWith(l08.a);
                } else {
                    if (!(tw7Var3 instanceof sw7)) {
                        h9o.p();
                        return null;
                    }
                    List list2 = (List) ((sw7) tw7Var3).a;
                    p0i p0iVar6 = t0i.b;
                    bhiVar.resumeWith(list2);
                }
                return Unit.a;
            default:
                p0i p0iVar7 = t0i.b;
                bhiVar.resumeWith(CollectionsKt.Y(CollectionsKt.c0(new yg9((byte) 14), (List) obj)));
                return Unit.a;
        }
    }
}
