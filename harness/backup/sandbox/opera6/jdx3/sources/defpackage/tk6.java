package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.opera.android.aiassistant.appwidget.AiAssistantAppWidget;
import com.opera.android.shortcut.AriaShortcutWidgetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class tk6 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wjh b;

    public /* synthetic */ tk6(wjh wjhVar, byte b) {
        this.a = b;
        this.b = wjhVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wjh wjhVar = this.b;
        switch (b) {
            case 0:
                boolean zN = wjhVar.n();
                Context context = (Context) wjhVar.c;
                byte b2 = 1;
                byte b3 = 2;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) AiAssistantAppWidget.class), zN ? 1 : 2, 1);
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) AriaShortcutWidgetActivity.class), zN ? 1 : 2, 1);
                if (zN) {
                    new rml(Unit.a, (umi) wjhVar.d).a(new tk6(wjhVar, b2)).t(new tk6(wjhVar, b3)).l();
                } else {
                    wjhVar.u(0);
                }
                return Unit.a;
            case 1:
                int i = AiAssistantAppWidget.b;
                Context context2 = (Context) wjhVar.c;
                int i2 = eif.a;
                return kfo.I(context2, AiAssistantAppWidget.class);
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    wjhVar.u(num.intValue());
                }
                return Unit.a;
        }
    }
}
