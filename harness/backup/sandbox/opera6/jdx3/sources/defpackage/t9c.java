package defpackage;

import android.content.Context;
import android.net.Uri;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;

/* loaded from: classes.dex */
public final class t9c extends PostponableAction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t9c(ActionCallback actionCallback, Comparable comparable, byte b) {
        this.a = b;
        this.b = comparable;
        this.c = actionCallback;
    }

    public /* synthetic */ t9c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lqm lqmVar = lqm.K;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((z0c) obj2).h(new y0a((u9c) obj, (byte) 9));
                break;
            case 1:
                v9c v9cVar = (v9c) obj;
                v9cVar.b.startActivity(new wgf(Uri.parse((String) obj2), lqmVar).b(v9cVar.b, "com.opera.android.action.OPEN_URL"));
                break;
            case 2:
                v9c v9cVar2 = (v9c) obj;
                v9cVar2.b.startActivity(new wgf((Uri) obj2, lqmVar).b(v9cVar2.b, "com.opera.android.action.OPEN_URL"));
                break;
            default:
                Context context = ((v9c) obj2).b;
                context.startActivity(new wgf((Uri) obj, lqmVar).b(context, "com.opera.android.action.OPEN_URL"));
                break;
        }
    }
}
