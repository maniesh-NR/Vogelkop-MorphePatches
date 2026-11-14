package defpackage;

import android.util.Pair;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class kw4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kw4(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kw4(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((lw4) obj2).a((ole) obj, b2);
                break;
            case 1:
                chf chfVar = (chf) obj;
                OperaAccessTokenProvider operaAccessTokenProvider = (OperaAccessTokenProvider) ((a55) obj2).b.get(b2);
                if (operaAccessTokenProvider != null) {
                    operaAccessTokenProvider.b(chfVar);
                    break;
                } else {
                    chfVar.c();
                    break;
                }
            case 2:
                ((h4h) ((cy) obj2).c).b(b2, (Serializable) obj);
                break;
            case 3:
                am7 am7Var = (am7) obj2;
                ((bm7) obj).f(am7Var.a, am7Var.b, b2);
                break;
            default:
                Pair pair = (Pair) obj;
                ((el6) ((vrd) obj2).b.i).f(((Integer) pair.first).intValue(), (jrd) pair.second, b2);
                break;
        }
    }
}
