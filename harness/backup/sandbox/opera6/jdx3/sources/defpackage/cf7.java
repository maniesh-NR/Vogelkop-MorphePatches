package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class cf7 extends o93 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;
    public final Object f;

    public cf7(Context context, re7 re7Var) {
        this.c = (byte) 0;
        this.e = context;
        this.d = re7Var;
        this.f = new bf7(this, (byte) 0);
    }

    public cf7(gcj gcjVar, String str, Uri uri) {
        this.c = (byte) 2;
        this.e = gcjVar;
        this.d = str;
        this.f = uri;
    }

    public cf7(String str, BrowserActivity browserActivity, re7 re7Var) {
        this.c = (byte) 1;
        this.e = str;
        this.f = browserActivity;
        this.d = re7Var;
    }

    @Override // defpackage.o93
    public final boolean d() {
        switch (this.c) {
            case 0:
                return !((re7) this.d).l();
            default:
                return super.d();
        }
    }

    @Override // defpackage.o93
    public final gtj e(View view) {
        byte b = this.c;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((re7) obj3).u.b((bf7) obj2);
                gtj gtjVarD = gtj.d(view, new rxh(2132018652), 5000, null);
                gtjVarD.f(2132018613, new yk4(this, (byte) 11));
                return gtjVarD;
            case 1:
                gtj gtjVarE = gtj.e(view, (String) obj, 5000);
                gtjVarE.f(2132018613, new jf7((BrowserActivity) obj2, (re7) obj3, (byte) 0));
                return gtjVarE;
            default:
                gcj gcjVar = (gcj) obj;
                gtj gtjVarE2 = gtj.e(view, gcjVar.r.getString(2132018612, (String) obj3), 5000);
                gtjVarE2.f(2132022116, new j5g((Uri) obj2, gcjVar, (byte) 12));
                return gtjVarE2;
        }
    }

    @Override // defpackage.o93
    public final void f(int i) {
        switch (this.c) {
            case 0:
                ((re7) this.d).t((bf7) this.f);
                break;
        }
    }
}
