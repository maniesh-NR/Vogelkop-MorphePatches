package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class uk5 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ igi b;

    public /* synthetic */ uk5(igi igiVar, byte b) {
        this.a = b;
        this.b = igiVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        igi igiVar = this.b;
        tw7 tw7Var = (tw7) obj;
        switch (b) {
            case 0:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    }
                } else {
                    ((List) igiVar.e).addAll((List) ((rw7) tw7Var).a);
                }
                ((vr9) igiVar.f).run();
                break;
            case 1:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    }
                } else {
                    ((List) igiVar.e).add((p58) ((rw7) tw7Var).a);
                }
                ((vr9) igiVar.f).run();
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        ((List) igiVar.d).add((y5j) ((sw7) tw7Var).a);
                    }
                } else {
                    ((List) igiVar.e).add((p58) ((rw7) tw7Var).a);
                }
                ((vr9) igiVar.f).run();
                break;
        }
    }
}
