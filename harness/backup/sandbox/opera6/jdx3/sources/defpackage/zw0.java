package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zw0 {
    public final deg a;
    public final gv3 b;

    public zw0(deg degVar, gv3 gv3Var) {
        this.a = degVar;
        this.b = gv3Var;
    }

    public static void a(dwh dwhVar, int i, Function1 function1) {
        dwhVar.b.b(i, i);
        dwhVar.a();
        dwhVar.j();
        dwhVar.c(Bitmap.Config.RGB_565);
        dwhVar.f(new phi(new ab(function1, (byte) 6)));
    }

    public final void b(Context context, int i, int i2, File file, o29 o29Var, lol lolVar) {
        if (yw0.a[o29Var.ordinal()] == 1) {
            a(this.a.h(file), i, lolVar);
        } else {
            kg7 kg7VarG = lg7.g(o29Var);
            lolVar.invoke(new vw0(ic4.R(sgb.F(kg7VarG.a, context), i2), f03.t(kg7VarG.d, context, 2131101243), Integer.valueOf(f03.t(kg7VarG.b, context, 2131101243))));
        }
    }

    public final void c(Context context, int i, int i2, String str, lol lolVar) {
        String strT = dbh.t(cqp.f0(this.b.b).a, str);
        if (strT.length() != 0) {
            a(this.a.g(Uri.parse(strT)), i, new tw0(lolVar, this, context, i, str));
        } else {
            kg7 kg7VarG = lg7.g(o29.DOCUMENT);
            lolVar.invoke(new vw0(ic4.R(sgb.F(kg7VarG.a, context), i2), f03.t(kg7VarG.d, context, 2131101243), Integer.valueOf(f03.t(kg7VarG.b, context, 2131101243))));
        }
    }
}
