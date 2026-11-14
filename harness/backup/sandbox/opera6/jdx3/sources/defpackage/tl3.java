package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.bookmarks.h;

/* loaded from: classes.dex */
public final class tl3 extends o93 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tl3(Object obj, Object obj2, byte b) {
        this.c = b;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ tl3(Object obj, Object obj2, Object obj3, byte b) {
        this.c = b;
        this.d = obj2;
        this.e = obj3;
    }

    public tl3(kuj kujVar, Uri uri) {
        this.c = (byte) 4;
        this.d = uri;
        this.e = kujVar;
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        byte b = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ul3 ul3Var = (ul3) obj2;
                pl3 pl3Var = (pl3) obj;
                ml3 ml3VarA = pl3Var.a(((h) ul3Var.c).o());
                gtj gtjVarD = gtj.d(view, (ml3VarA == null || ml3VarA.h()) ? new rxh(2132018036) : new sxh(2132018037, new Object[]{ml3VarA.getTitle()}), 5000, null);
                gtjVarD.f(2132018740, new nf(ul3Var, pl3Var, (byte) 16));
                gtjVarD.a.a(new sl3(ul3Var));
                return gtjVarD;
            case 1:
                gtj gtjVarC = gtj.c(view, 2132019984, 5000);
                gtjVarC.f(2132022116, new nf((n3l) obj2, (BrowserActivity) obj, (byte) 21));
                return gtjVarC;
            case 2:
                gtj gtjVarE = gtj.e(view, (String) obj2, 5000);
                gtjVarE.f(2132021713, new s53((Runnable) obj, (byte) 1));
                return gtjVarE;
            case 3:
                gtj gtjVarE2 = gtj.e(view, (String) obj2, 2500);
                gtjVarE2.g(view.getResources().getString(2132021985), new gf(obj, (byte) 29));
                return gtjVarE2;
            case 4:
                gtj gtjVarC2 = gtj.c(view, 2132021587, 5000);
                gtjVarC2.f(2132022116, new j5g(this, (Uri) obj2, (byte) 18));
                return gtjVarC2;
            default:
                return gtj.e(view, ((Resources) obj2).getString(2132021054, (String) obj), 5000);
        }
    }
}
