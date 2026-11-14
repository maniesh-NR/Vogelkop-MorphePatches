package defpackage;

import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.CreditCard;
import com.opera.android.settings.SettingsManager;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class fs2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fs2(bf9 bf9Var, db dbVar, zwk zwkVar, SettingsManager settingsManager, umi umiVar, j4c j4cVar, t1 t1Var) {
        this.a = (byte) 2;
        this.b = bf9Var;
        this.c = dbVar;
        this.d = zwkVar;
        this.e = umiVar;
        this.f = j4cVar;
        this.g = t1Var;
    }

    public /* synthetic */ fs2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                zhj.a(new gs2((orm) obj6, (wh2) obj5, (AutofillManager) obj4, (gw) obj3, (CreditCard) obj2), 4099).c(((ot2) ((va2) obj).b).a);
                break;
            case 1:
                ((wjh) obj6).g((zd4) obj5, (zd4) obj4, (ntk) obj3, (ntk) obj2, (Map.Entry) obj);
                break;
            default:
                bf9 bf9Var = (bf9) obj6;
                bf9Var.a(new myk(bf9Var, (db) obj5, (zwk) obj4, (umi) obj3, (j4c) obj2, (t1) obj));
                break;
        }
    }
}
