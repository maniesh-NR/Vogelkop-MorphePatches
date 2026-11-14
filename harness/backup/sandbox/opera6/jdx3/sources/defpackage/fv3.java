package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class fv3 implements dcj, n5o {
    public final /* synthetic */ BrowserActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ fv3(BrowserActivity browserActivity, String str) {
        this.a = browserActivity;
        this.b = str;
    }

    @Override // defpackage.dcj
    public final void b(jjm jjmVar, String str) {
        msh mshVarE;
        if (str != null) {
            String[] strArr = OperaApplication.K;
            fqe fqeVarY = ((OperaApplication) this.a.getApplication()).y();
            fue fueVarZ = ((OperaApplication) fqeVarY.a.getApplicationContext()).z();
            fueVarZ.d();
            uqe uqeVarC = fueVarZ.a.ordinal() != 1 ? null : fqeVarY.c();
            if (uqeVarC == null || (mshVarE = uqeVarC.e(this.b, true)) == null) {
                return;
            }
            uy8 uy8Var = uqeVarC.h;
            if (uy8Var.r.add((String) mshVarE.v.b)) {
                if (mshVarE instanceof ure) {
                    uy8Var.e(new by8(mshVarE, (byte) 2));
                } else {
                    uy8Var.c(new by8(mshVarE, (byte) 2));
                }
            }
        }
    }

    public final Object g(Object obj) {
        nhj nhjVar = new nhj();
        fp1 fp1Var = this.a;
        nhjVar.a = fp1Var;
        nhjVar.b = "ariaWidgetShortcut";
        nhjVar.e = this.b;
        nhjVar.h = IconCompat.c(2131820550, fp1Var);
        Intent intentB = mdb.b(fp1Var);
        intentB.setAction("com.opera.android.action.AI_ASSISTANT_FROM_SHORTCUT_WIDGET");
        nhjVar.c = new Intent[]{intentB};
        if (TextUtils.isEmpty(nhjVar.e)) {
            qp2.o("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = nhjVar.c;
        if (intentArr == null || intentArr.length == 0) {
            qp2.o("Shortcut must have an intent");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nhjVar);
        phj.C0(fp1Var, arrayList);
        return Unit.a;
    }
}
