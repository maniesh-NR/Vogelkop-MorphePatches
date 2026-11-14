package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.dialog.DialogDelegate;

/* loaded from: classes.dex */
public final /* synthetic */ class ys2 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys2(i iVar, Object obj, byte b) {
        this.a = b;
        this.b = iVar;
        this.c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Throwable {
        byte b = this.a;
        Object obj = this.c;
        mz7 mz7Var = this.b;
        switch (b) {
            case 0:
                ole oleVar = (ole) obj;
                ru2 ru2Var = ((zs2) mz7Var).d;
                if (ru2Var != null) {
                    String str = ru2Var.b;
                    bt2 bt2Var = (bt2) oleVar.a;
                    if (!bt2Var.e.a()) {
                        i7f i7fVar = bt2Var.g;
                        g7f g7fVarC = u35.c(i7fVar, i7fVar);
                        while (g7fVarC.hasNext()) {
                            ts2 ts2Var = ((ss2) g7fVarC.next()).a;
                            int i = ts2Var.b;
                            if (i == 0 || i == 2) {
                                q3 q3Var = new q3(ts2Var, ru2Var, (byte) 28);
                                String str2 = (i != 3 || str.length() == 0) ? ru2Var.c : str;
                                sxh sxhVar = new sxh(2132017795, new Object[]{new rxh(2132017591)});
                                xj xjVar = new xj(q3Var, ru2Var, (byte) 16);
                                gkj gkjVar = new gkj(false, false);
                                gkjVar.a = null;
                                gkjVar.b = null;
                                gkjVar.c = null;
                                gkjVar.d = str2;
                                gkjVar.e = null;
                                gkjVar.f = null;
                                gkjVar.g = null;
                                gkjVar.h = xjVar;
                                gkjVar.i = null;
                                gkjVar.j = null;
                                gkjVar.k = 2132020155;
                                gkjVar.l = 2132018111;
                                gkjVar.m = 0;
                                gkjVar.n = true;
                                gkjVar.o = sxhVar;
                                DialogDelegate dialogDelegate = ts2Var.a.p;
                                if (dialogDelegate != null) {
                                    dialogDelegate.a(gkjVar);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                cv2 cv2Var = (cv2) obj;
                int bindingAdapterPosition = ((xt5) mz7Var).getBindingAdapterPosition();
                nz7 nz7VarValueOf = bindingAdapterPosition != -1 ? Integer.valueOf(bindingAdapterPosition) : null;
                if (nz7VarValueOf != null) {
                    cv2Var.invoke(nz7VarValueOf);
                    break;
                }
                break;
            case 2:
                mz7 mz7Var2 = mz7Var;
                Context context = (Context) obj;
                nz7 nz7Var = mz7Var2.g;
                qy7 qy7Var = new qy7(context, view, nz7Var != null ? nz7Var : null, new jf7(mz7Var2, view, (byte) 8));
                ua7 ua7Var = new ua7(context, qy7Var, view);
                mz7Var2.h = ua7Var;
                PopupWindow popupWindow = (PopupWindow) ua7Var.d;
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                n1 n1Var = qy7Var.d;
                int iM0 = n1Var.m0();
                View view2 = qy7Var.a;
                int width = view2.getWidth() * iM0;
                LinearLayout linearLayout = qy7Var.c;
                float width2 = ((view.getWidth() / 2.0f) + iArr[0]) - ((linearLayout.getPaddingEnd() + (linearLayout.getPaddingStart() + width)) / 2.0f);
                int paddingBottom = iArr[1] - (linearLayout.getPaddingBottom() + (linearLayout.getPaddingTop() + (view2.getHeight() * n1Var.n0())));
                popupWindow.setBackgroundDrawable(context.getDrawable(2131233078));
                popupWindow.setOutsideTouchable(true);
                popupWindow.setTouchable(true);
                popupWindow.setAnimationStyle(2132084400);
                popupWindow.setElevation(view.getContext().getResources().getDimensionPixelSize(2131165657));
                try {
                    popupWindow.showAtLocation(view, 0, zed.b(width2), paddingBottom);
                    break;
                } catch (WindowManager.BadTokenException unused) {
                    Toast.makeText(context, "Don't use EmojiPickerView inside a Popup", 1).show();
                    break;
                }
            default:
                ((xb9) mz7Var).f0((ja2) obj);
                break;
        }
        return true;
        return true;
    }
}
