package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import com.opera.android.favorites.a;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class nr8 {
    public static int b;
    public final nrl a = new nrl((byte) 26);

    public static int e(Context context) {
        int i = j14.B(context, true).a;
        int i2 = b;
        if (i2 >= i) {
            return i2;
        }
        b = i;
        return i;
    }

    public static hq8 g(mr8 mr8Var, tq8 tq8Var) {
        hq8 hq8VarU;
        if (tq8Var != null) {
            if (mr8Var.d(tq8Var)) {
                return tq8Var;
            }
            for (int i = 0; i < tq8Var.e.size(); i++) {
                if (tq8Var.u(i).j()) {
                    hq8VarU = g(mr8Var, (tq8) tq8Var.u(i));
                } else {
                    hq8VarU = tq8Var.u(i);
                    if (!mr8Var.d(hq8VarU)) {
                        hq8VarU = null;
                    }
                }
                if (hq8VarU != null) {
                    return hq8VarU;
                }
            }
        }
        return null;
    }

    public static ArrayList h(ei2 ei2Var, tq8 tq8Var) {
        ArrayList arrayList = new ArrayList();
        if (tq8Var != null) {
            for (int i = 0; i < tq8Var.e.size(); i++) {
                if (tq8Var.u(i).j()) {
                    arrayList.addAll(h(ei2Var, (tq8) tq8Var.u(i)));
                } else {
                    hq8 hq8VarU = tq8Var.u(i);
                    if (ei2Var.d(hq8VarU)) {
                        arrayList.add(hq8VarU);
                    }
                }
            }
        }
        return arrayList;
    }

    public final long a(mzj mzjVar) {
        Bitmap bitmap = mzjVar.c;
        String str = mzjVar.b;
        String str2 = mzjVar.a;
        Bitmap bitmapCopy = bitmap == null ? null : bitmap.copy(Bitmap.Config.ARGB_8888, false);
        if (bitmapCopy != null) {
            N.MwmLujL6(bitmapCopy, str2, wqm.b("https://", wqm.C(str)).g());
        }
        long jB = b(str2, str);
        ac8.a(new nzj(mzjVar));
        return jB;
    }

    public abstract long b(String str, String str2);

    public final hq8 c(String str, p6l p6lVar) {
        return g(new a32((Object) this, (Object) str, (Object) p6lVar, (byte) 9), ((e) this).f);
    }

    public final void d(hq8 hq8Var, tq8 tq8Var, int i) {
        if (hq8Var.j()) {
            N.Mv32kuYR(((b) tq8Var).i.a, i, ((b) hq8Var).i.a);
        } else {
            N.Mv32kuYR(((b) tq8Var).i.a, i, ((a) hq8Var).f.a);
        }
    }

    public final void f(Runnable runnable) {
        this.a.d(runnable);
    }
}
