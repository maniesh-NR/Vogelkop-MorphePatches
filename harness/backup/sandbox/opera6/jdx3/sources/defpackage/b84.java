package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b84 {
    public final /* synthetic */ f84 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ iyk e;

    public /* synthetic */ b84(f84 f84Var, String str, int i, int i2, iyk iykVar) {
        this.a = f84Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = iykVar;
    }

    public final void a(c84 c84Var) {
        f84 f84Var = this.a;
        esg esgVar = f84Var.a;
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        iyk iykVar = this.e;
        if (c84Var != null) {
            Bitmap bitmap = c84Var.b;
            Bitmap bitmap2 = bitmap.isRecycled() ? null : bitmap;
            if (bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2 && c84Var.a.equals(str)) {
                iykVar.run(bitmap.isRecycled() ? null : bitmap);
                return;
            }
        }
        ((d84) esgVar.b).a = null;
        r9i r9iVar = (r9i) esgVar.c;
        j.a((SharedPreferences) ((e84) r9iVar.c).a.get(), "image_url");
        ((qie) r9iVar.e).n(new oml(((umi) r9iVar.d).c(new fv2(r9iVar, (byte) 27))), null);
        l45 l45Var = new l45(false, esgVar, str, new wx((Object) f84Var, (Object) iykVar, (byte) 24));
        f84Var.b.getClass();
        oya.b(str, i, i2, 7296, 0, l45Var);
    }
}
