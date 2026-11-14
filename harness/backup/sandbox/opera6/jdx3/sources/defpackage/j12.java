package defpackage;

import android.net.Uri;
import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class j12 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Callback b;

    public /* synthetic */ j12(Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        af9 af9Var = af9.c;
        af9 af9Var2 = af9.a;
        Callback callback = this.b;
        switch (b) {
            case 0:
                callback.run((Uri) obj);
                break;
            case 1:
                callback.run((Uri) obj);
                break;
            case 2:
                callback.run(null);
                break;
            case 3:
                callback.run(Boolean.valueOf(obj != null));
                break;
            case 4:
                if (callback != null) {
                    callback.run(null);
                    break;
                }
                break;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    af9Var = af9Var2;
                }
                callback.run(af9Var);
                break;
            case 6:
                callback.run(Boolean.FALSE);
                break;
            case 7:
                callback.run(Boolean.FALSE);
                break;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    af9Var = af9Var2;
                }
                callback.run(af9Var);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                List list = (List) obj;
                callback.run(new j7m(list.get(0), list.get(1), list.get(2)));
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                c3g c3gVar = (c3g) obj;
                callback.run((c3gVar == null || c3gVar.b >= System.currentTimeMillis()) ? c3gVar : null);
                break;
            case 11:
                final long jCurrentTimeMillis = System.currentTimeMillis();
                callback.run(nb6.J(sfe.Q((List) obj, new srg() { // from class: n2g
                    public final boolean apply(Object obj2) {
                        return ((l2g) obj2).h > jCurrentTimeMillis;
                    }
                })));
                break;
            case 12:
                callback.run(Integer.valueOf(((b0k) obj).b));
                break;
            case 13:
                aln alnVar = (aln) obj;
                if (alnVar == null) {
                    callback.run(new pmn((byte) 1));
                    break;
                } else {
                    callback.run(new omn(alnVar));
                    break;
                }
            default:
                int iOrdinal = ((dy1) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        h9o.p();
                        break;
                    } else {
                        callback.run(xrn.a);
                        break;
                    }
                }
                break;
        }
    }
}
