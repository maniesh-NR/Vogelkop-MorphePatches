package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class k31 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((v31) obj).postOnAnimation(runnable);
                break;
            case 1:
                ((iw4) obj).b.post(runnable);
                break;
            case 2:
                ((szk) obj).c(runnable);
                break;
            case 3:
                tym.S(((mhd) obj).a, runnable);
                break;
            case 4:
                ((az9) obj).post(runnable);
                break;
            case 5:
                tym.S(((npd) obj).l, runnable);
                break;
            default:
                ctm ctmVar = (ctm) obj;
                ctmVar.c.execute(new npl(ctmVar, runnable, (byte) 15));
                break;
        }
    }
}
