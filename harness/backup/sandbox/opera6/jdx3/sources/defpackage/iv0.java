package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import com.opera.android.OperaApplication;
import com.opera.android.aiassistant.appwidget.AiAssistantAppWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class iv0 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ iv0(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String type = null;
        type = null;
        Context context = this.b;
        switch (b) {
            case 0:
                int i = AiAssistantAppWidget.b;
                int i2 = eif.a;
                return kfo.I(context, AiAssistantAppWidget.class);
            case 1:
                Integer num = (Integer) obj;
                int i3 = AiAssistantAppWidget.b;
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                String[] strArr = OperaApplication.K;
                ((yk6) ((OperaApplication) context.getApplicationContext()).e().get()).h.u(iIntValue);
                return Unit.a;
            case 2:
                Uri uri = (Uri) obj;
                if (s29.g(uri)) {
                    String str = (String) N.MWbg1PSR(uri.toString());
                    if (str.length() > 0) {
                        type = str;
                    }
                } else if ("content".equals(uri.getScheme())) {
                    type = context.getContentResolver().getType(uri);
                }
                return new ly1(uri, type);
            case 3:
                Object obj2 = ((t0i) obj).a;
                l22 l22Var = (l22) (obj2 instanceof q0i ? null : obj2);
                if (l22Var != null) {
                    new c5o(context, (byte) 3).E(l22Var.a, l22Var.b, l22Var.c);
                }
                return Unit.a;
            default:
                return new kl5((Configuration) obj, r9n.i(context));
        }
    }
}
