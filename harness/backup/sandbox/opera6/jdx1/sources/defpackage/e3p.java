package defpackage;

import ads_mobile_sdk.h7;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class e3p implements dd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ e3p(h7 h7Var, Context context, String str, View view, Activity activity, byte b) {
        this.a = b;
        this.b = h7Var;
        this.c = context;
        this.d = str;
        this.e = view;
        this.f = activity;
    }

    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        Activity activity = this.f;
        View view = this.e;
        String str = this.d;
        Context context = this.c;
        h7 h7Var = this.b;
        switch (b) {
            case 0:
                return ((edp) h7Var.b.f.get()).a(context, str, view, activity);
            default:
                return ((edp) h7Var.b.f.get()).b(context, str, view, activity);
        }
    }
}
