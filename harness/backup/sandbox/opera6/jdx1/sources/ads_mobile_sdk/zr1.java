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
public final class zr1 extends kuk implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ cs1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ cy0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(Activity activity, String str, String str2, String str3, String str4, cs1 cs1Var, String str5, String str6, String str7, cy0 cy0Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.a = activity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = cs1Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = cy0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new zr1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        Activity activity = this.a;
        AlertDialog.Builder message = new AlertDialog.Builder(activity, R.style.Theme.Material.Dialog.Alert).setTitle(this.b).setMessage(this.c);
        cs1 cs1Var = this.f;
        message.setPositiveButton(this.d, new gyo(cs1Var, this.g, this.h, this.i, activity, this.j)).setNegativeButton(this.e, new dyi(cs1Var, this.j, (byte) 3)).create().show();
        return Unit.a;
    }
}
