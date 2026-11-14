package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.browser.chromium.ChromiumContent;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class zu5 implements eua {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zu5(Object obj, Context context, byte b) {
        this.a = b;
        this.c = obj;
        this.b = context;
    }

    public /* synthetic */ zu5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.content.Context, dx3, hjf] */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String str;
        n88 n88Var;
        byte b = this.a;
        wb0 wb0Var = wb0.b;
        vb0 vb0Var = vb0.b;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                ((OperaApplication) ((Context) obj2).getApplicationContext()).L().c.H(p90.c);
                ((gjm) obj).e(new qk(), false);
                break;
            case 1:
                im6 im6Var = (im6) obj;
                im6Var.d = wb0Var;
                n98 n98Var = (n98) im6Var.b;
                BrowserActivity browserActivityO = q9n.o((Context) obj2);
                if (browserActivityO != null) {
                    int iOrdinal = n98Var.ordinal();
                    if (iOrdinal == 0) {
                        str = "country_change_free_in_app";
                    } else if (iOrdinal != 1) {
                        h9o.p();
                        break;
                    } else {
                        str = "country_change_paid_in_app";
                    }
                    a98 a98Var = new a98(ImagesContract.LOCAL, str);
                    int iOrdinal2 = n98Var.ordinal();
                    if (iOrdinal2 == 0) {
                        n88Var = n88.a;
                    } else if (iOrdinal2 != 1) {
                        h9o.p();
                        break;
                    } else {
                        n88Var = null;
                    }
                    new ggf(browserActivityO, null, a98Var, n88Var).execute();
                    break;
                }
                break;
            case 2:
                ((xq3) obj).c = wb0Var;
                BrowserActivity browserActivityO2 = q9n.o((Context) obj2);
                if (browserActivityO2 != null) {
                    new ggf(browserActivityO2, null, new a98(ImagesContract.LOCAL, "free_upsell_in_app"), r88.a).execute();
                    break;
                }
                break;
            case 3:
                ((x5f) ((orm) obj2)).i0(hl0.b);
                ((yqd) obj).run();
                break;
            case 4:
                ((x5f) ((orm) obj2)).i0(hl0.c);
                ((gjm) obj).e(new swe(), false);
                break;
            case 5:
                ((o4i) obj).d.b.invoke((Context) obj2);
                break;
            case 6:
                ((n4i) obj).b.invoke((Context) obj2);
                break;
            case 7:
                ((rii) obj2).o((pr) obj, hjm.a);
                break;
            case 8:
                qq8 qq8Var = (qq8) obj2;
                x5f x5fVar = (x5f) qq8Var.b;
                x5fVar.w0(vb0Var);
                ?? C = ((ChromiumContent) qq8Var.c).c();
                zhj.a(new nr2(x5fVar, new AutofillManager(), new gw(C), (Address) obj, new yh2(qq8Var.a, (byte) 1)), 4099).c(C);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                b2l b2lVar = (b2l) obj;
                ((ydn) obj2).C(false);
                if (!((d7l) b2lVar).j.isLoading()) {
                    ((d7l) b2lVar).b();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                t5d t5dVar = (t5d) obj2;
                gom gomVar = (gom) obj;
                if (t5dVar != null) {
                    mom.b(t5dVar, gomVar);
                    break;
                }
                break;
            default:
                ((xq3) obj2).b = vb0Var;
                yug.c((yug) ((ven) obj).e.get(), 17, ven.j, 4);
                break;
        }
    }
}
