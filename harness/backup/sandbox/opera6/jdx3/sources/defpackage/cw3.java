package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserContainer;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class cw3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw3 b;

    public /* synthetic */ cw3(tw3 tw3Var, byte b) {
        this.a = b;
        this.b = tw3Var;
    }

    public final Object invoke() {
        r9l r9lVar;
        byte b = this.a;
        oji ojiVar = null;
        tw3 tw3Var = this.b;
        switch (b) {
            case 0:
                return tw3Var.b.a;
            case 1:
                return tw3Var.b.findViewById(2131364492);
            case 2:
                BrowserContainer browserContainer = tw3Var.b.B;
                if (browserContainer != null) {
                    return browserContainer;
                }
                return null;
            case 3:
                qim qimVar = tw3Var.b.o;
                Objects.requireNonNull(qimVar);
                return qimVar;
            case 4:
                return new File(new File(tw3Var.b.getFilesDir(), "images"), "google_ai_mode_attachments");
            case 5:
                qim qimVar2 = tw3Var.b.o;
                Objects.requireNonNull(qimVar2);
                return qimVar2.e;
            case 6:
                fnh fnhVar = tw3Var.b.C;
                if (fnhVar != null) {
                    return fnhVar;
                }
                return null;
            case 7:
                return (u4l) tw3Var.a.s.get();
            case 8:
                return tw3Var.b.b0;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return tw3Var.b.J0();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                BrowserActivity browserActivity = tw3Var.b;
                v9l v9lVar = (v9l) browserActivity.v0.f();
                if (v9lVar != null && (r9lVar = v9lVar.v) != null) {
                    ojiVar = new oji(r9lVar);
                }
                return ojiVar == null ? browserActivity.W0 : ojiVar;
            case 11:
                String[] strArr = OperaApplication.K;
                return ((OperaApplication) tw3Var.b.getApplication()).n();
            case 12:
                qim qimVar3 = tw3Var.b.o;
                Objects.requireNonNull(qimVar3);
                return qimVar3.d;
            case 13:
                qim qimVar4 = tw3Var.b.o;
                Objects.requireNonNull(qimVar4);
                return qimVar4.e;
            case 14:
                return ru9.c(tw3Var.b);
            case 15:
                String[] strArr2 = OperaApplication.K;
                return ((OperaApplication) tw3Var.b.getApplication()).L().c;
            default:
                qim qimVar5 = tw3Var.b.o;
                Objects.requireNonNull(qimVar5);
                return qimVar5.g;
        }
    }
}
