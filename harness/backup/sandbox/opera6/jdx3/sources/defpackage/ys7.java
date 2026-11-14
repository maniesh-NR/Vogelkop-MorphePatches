package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.hype.image.editor.EditImage;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ys7 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ys7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        List listG;
        int iIndexOf;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditImage editImage = (EditImage) obj;
                xtb[] xtbVarArr = EditImage.s;
                boolean z = i == 6;
                boolean z2 = i == 5;
                if (!z && !z2) {
                    return false;
                }
                bfl bflVar = editImage.j;
                editImage.c(true, false);
                if (!z2 || bflVar == null || (iIndexOf = (listG = y1j.g(editImage.f())).indexOf(bflVar)) < 0 || iIndexOf >= listG.size() - 1) {
                    return true;
                }
                editImage.a((bfl) listG.get(iIndexOf + 1), true);
                return true;
            case 1:
                Runnable runnable = (Runnable) obj;
                if (i == 4) {
                    runnable.run();
                    q9n.u(textView);
                    return true;
                }
                if (!oup.g0(keyEvent)) {
                    return false;
                }
                runnable.run();
                return true;
            case 2:
                awi awiVar = (awi) obj;
                if (i == 6) {
                    awiVar.I0(((OperaTextInputEditText) awiVar.u.d).getText());
                }
                return false;
            case 3:
                c9j c9jVar = (c9j) obj;
                xtb[] xtbVarArr2 = c9j.w;
                if (i != 3) {
                    return false;
                }
                c9jVar.I0(false);
                return true;
            default:
                r9l r9lVar = (r9l) obj;
                if (i != 3 && !oup.g0(keyEvent)) {
                    return false;
                }
                r9lVar.u();
                return true;
        }
    }
}
