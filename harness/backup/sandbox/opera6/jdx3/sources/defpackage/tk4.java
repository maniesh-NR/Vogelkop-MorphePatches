package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.opera.android.custom_views.CardView;

/* loaded from: classes.dex */
public final class tk4 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((CardView) obj).f);
                break;
            case 1:
                tx4 tx4Var = ((Chip) obj).e;
                if (tx4Var == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    tx4Var.getOutline(outline);
                    break;
                }
            case 2:
                int width = view.getWidth();
                int height = view.getHeight();
                int i = ((m9f) obj).b;
                outline.setRoundRect(0, 0, width, height + i, i);
                break;
            case 3:
                wbj wbjVar = (wbj) obj;
                if (((saj) wbjVar.b) != null && !((RectF) wbjVar.c).isEmpty()) {
                    RectF rectF = (RectF) wbjVar.c;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, wbjVar.f);
                    break;
                }
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), z7h.i(((View) obj).getContext(), 8.0f));
                break;
        }
    }
}
