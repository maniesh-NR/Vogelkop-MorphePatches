package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.opera.android.menu.CustomMenuItemView;

/* loaded from: classes.dex */
public final /* synthetic */ class w53 implements View.OnHoverListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w53(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                y53 y53Var = (y53) obj;
                Context context = y53Var.g;
                or2 or2Var = y53Var.c;
                if (motionEvent.getAction() != 9) {
                    if (motionEvent.getAction() == 10) {
                        ((CardView) ((rf2) or2Var.d).i).b(f03.t(2130970224, context, 2131101243));
                        break;
                    }
                } else {
                    ((CardView) ((rf2) or2Var.d).i).b(context.getColor(2131100268));
                    break;
                }
                break;
            default:
                CustomMenuItemView customMenuItemView = (CustomMenuItemView) obj;
                int i = CustomMenuItemView.f;
                if (motionEvent.getAction() == 9) {
                    view.setBackgroundColor(customMenuItemView.getContext().getColor(2131100268));
                }
                if (motionEvent.getAction() == 10) {
                    view.setBackgroundColor(f03.t(2130969331, customMenuItemView.getContext(), 2131101243));
                    break;
                }
                break;
        }
        return true;
    }
}
