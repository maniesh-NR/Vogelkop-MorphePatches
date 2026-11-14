package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x25 extends r25 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x25(byte b) {
        super("Passwords", new rxh(2132021333), null, 2131232168, a35.b);
        this.f = b;
        switch (b) {
            case 1:
                super("NewsPersonalization", new rxh(2132021329), null, 2131232211, a35.i);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        switch (this.f) {
            case 0:
                i7f i7fVar = lx3.a;
                N.Mxlx0ho4();
                runnable.run();
                break;
            default:
                fp1 fp1Var = s25Var.a;
                String[] strArr = OperaApplication.K;
                fqe fqeVarY = ((OperaApplication) fp1Var.getApplicationContext()).y();
                uqe uqeVarC = fqeVarY.c();
                uqeVarC.e.removeAll();
                stm stmVar = uqeVarC.j;
                ta7 ta7Var = stmVar.j;
                ta7Var.s().edit().putString("user_id", null).apply();
                ArrayList arrayList = new ArrayList();
                SharedPreferences sharedPreferencesS = ta7Var.s();
                for (String str : sharedPreferencesS.getAll().keySet()) {
                    if (str.startsWith("known_user_id_")) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesS.edit();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        editorEdit.remove((String) obj);
                    }
                    editorEdit.apply();
                }
                i16 i16Var = (i16) ta7Var.b;
                List list = (List) i16Var.c;
                i32 i32Var = (i32) i16Var.b;
                if (list == null) {
                    i32Var.i();
                }
                List list2 = Collections.EMPTY_LIST;
                i16Var.c = list2;
                i32Var.g(list2);
                ta7Var.m = null;
                ta7Var.h = null;
                qb7 qb7Var = (qb7) ta7Var.c;
                List list3 = (List) qb7Var.b;
                i32 i32Var2 = (i32) qb7Var.a;
                if (list3 == null) {
                    i32Var2.i();
                }
                qb7Var.b = list2;
                i32Var2.g(list2);
                ta7Var.i = null;
                ta7Var.j = null;
                stmVar.c();
                Context context = fqeVarY.a;
                String[] strArr2 = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).J().Y("recommendations_language_region", null);
                runnable.run();
                break;
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                p25 p25Var = new p25((iu2) callback, s25Var, (byte) 1);
                i7f i7fVar = lx3.a;
                N.MjVrCWbP(p25Var);
                break;
            default:
                ((iu2) callback).run(s25Var.a.getString(2132021393));
                break;
        }
    }
}
