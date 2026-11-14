package defpackage;

import android.text.StaticLayout;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class ju7 extends i {
    public final ov0 b;
    public final x77 c;

    public ju7(ov0 ov0Var, x77 x77Var) {
        super((FrameLayout) ov0Var.b);
        this.b = ov0Var;
        this.c = x77Var;
        final OperaTextView operaTextView = (OperaTextView) ov0Var.d;
        final int maxLines = operaTextView.getMaxLines();
        p37.B(operaTextView, operaTextView, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: vkl
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                TextView textView = operaTextView;
                int height = (textView.getHeight() - textView.getPaddingTop()) - textView.getPaddingBottom();
                int i = maxLines;
                StaticLayout staticLayoutG = na2.G(textView, i, 1);
                int lineForVertical = staticLayoutG.getLineForVertical(height);
                if (staticLayoutG.getLineBottom(lineForVertical) <= height) {
                    lineForVertical++;
                }
                int iC = djh.c(lineForVertical, 1, i);
                if (iC != textView.getMaxLines()) {
                    textView.setMaxLines(iC);
                }
            }
        });
    }
}
