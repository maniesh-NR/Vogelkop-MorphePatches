package ads_mobile_sdk;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import defpackage.dyi;
import defpackage.gyo;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eq1 extends kuk implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ fq1 k;
    public final /* synthetic */ cy0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, fq1 fq1Var, cy0 cy0Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = l2;
        this.k = fq1Var;
        this.l = cy0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new eq1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(this.b);
        builder.setMessage(this.c);
        String str = this.f;
        String str2 = this.g;
        String str3 = this.h;
        Long l = this.i;
        Long l2 = this.j;
        fq1 fq1Var = this.k;
        builder.setPositiveButton(this.d, new gyo(str, str2, str3, l, l2, fq1Var));
        builder.setNegativeButton(this.e, new dyi(fq1Var, this.l, (byte) 2));
        builder.create().show();
        return Unit.a;
    }
}
