package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ob9 implements r8n {
    public int a;
    public final WeakReference b;
    public boolean c;

    public ob9(TextView textView) {
        this.b = new WeakReference(textView);
    }

    public static void b(int i, View view) {
        ColorStateList colorStateListF;
        Context context = view.getContext();
        if (i == 0) {
            colorStateListF = f03.F(context);
        } else if (i != 1) {
            colorStateListF = i != 2 ? f03.F(context) : f03.W(2130969273, context);
        } else {
            colorStateListF = nb6.v(2131103822, context);
            if (colorStateListF == null) {
                colorStateListF = ColorStateList.valueOf(context.getColor(2131101243));
            }
        }
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateListF);
        }
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        b(this.a, view);
    }
}
