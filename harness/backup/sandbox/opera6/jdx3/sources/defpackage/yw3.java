package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class yw3 implements ivn, dkj {
    public final /* synthetic */ dx3 a;

    public /* synthetic */ yw3(dx3 dx3Var) {
        this.a = dx3Var;
    }

    @Override // defpackage.dkj
    public final void a() {
        olh.d(this.a, true);
    }

    @Override // defpackage.ivn
    public final void d(int i, String str) {
        fp1 fp1Var = this.a;
        fp1Var.getClass();
        Intent intentB = mdb.b(fp1Var);
        intentB.setAction("android.intent.action.MAIN");
        intentB.addCategory("android.intent.category.LAUNCHER");
        intentB.setAction("com.opera.android.INTERNAL_WEB_SEARCH");
        intentB.putExtra("query", str);
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_IN_NEW_TAB", true);
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_INCOGNITO_MODE", vep.A(i));
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_URL_ORIGIN", vep.A(8));
        fp1Var.startActivity(intentB);
    }
}
