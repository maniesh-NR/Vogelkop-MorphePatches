package defpackage;

import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.suggestion.ChatSuggestionView;

/* loaded from: classes.dex */
public final class tu4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tu4(Window window, byte b) {
        this.a = b;
        this.c = window;
    }

    public /* synthetic */ tu4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public tu4(x79 x79Var, View view) {
        this.a = (byte) 1;
        this.b = view;
        this.c = x79Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        mcj mcjVar;
        mcj mcjVar2;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((ChatSuggestionView) this.b).removeOnAttachStateChangeListener(this);
                na2.r((ChatSuggestionView) obj);
                break;
            case 1:
                View view2 = (View) this.b;
                x79 x79Var = (x79) obj;
                view2.setOnScrollChangeListener((za3) x79Var.c);
                view2.addOnLayoutChangeListener((z22) x79Var.e);
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) x79Var.b;
                if (operaBottomSheetBehavior != null) {
                    operaBottomSheetBehavior.x((r42) x79Var.d);
                    break;
                }
                break;
            case 2:
                ((ikc) this.b).k((f7f) obj);
                break;
            case 3:
                Window window = (Window) obj;
                Object context = window.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        mcjVar = null;
                    } else if (context instanceof BrowserActivity) {
                        RootView rootView = ((BrowserActivity) context).Q;
                        if (rootView == null) {
                            rootView = null;
                        }
                        mcjVar = rootView.z;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                this.b = mcjVar != null ? new x77(mcjVar, window) : null;
                break;
            case 4:
                Window window2 = (Window) obj;
                Object context2 = window2.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        mcjVar2 = null;
                    } else if (context2 instanceof BrowserActivity) {
                        RootView rootView2 = ((BrowserActivity) context2).Q;
                        if (rootView2 == null) {
                            rootView2 = null;
                        }
                        mcjVar2 = rootView2.z;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                this.b = mcjVar2 != null ? new p8f(mcjVar2, window2) : null;
                break;
            case 5:
                ((ViewGroup) this.b).addView((View) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                d4 d4Var = (d4) this.b;
                ndc ndcVarJ = z7h.j(d4Var);
                if (ndcVarJ == null) {
                    a8b.c("View tree for " + d4Var + " has no ViewTreeLifecycleOwner");
                    t3p.v();
                    break;
                } else {
                    ((pqh) obj).a = fac.w(d4Var, ndcVarJ.getLifecycle());
                    d4Var.removeOnAttachStateChangeListener(this);
                    break;
                }
            case 7:
                ((Runnable) this.b).run();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                View view2 = (View) this.b;
                view2.removeOnAttachStateChangeListener(this);
                view2.setOnScrollChangeListener(null);
                x79 x79Var = (x79) obj;
                view2.removeOnLayoutChangeListener((z22) x79Var.e);
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) x79Var.b;
                if (operaBottomSheetBehavior != null) {
                    operaBottomSheetBehavior.A.remove((r42) x79Var.d);
                    break;
                }
                break;
            case 2:
                ((ikc) this.b).p((f7f) obj);
                break;
            case 3:
                x77 x77Var = (x77) this.b;
                if (x77Var != null) {
                    mcj mcjVar = (mcj) x77Var.b;
                    ((i7f) mcjVar.a).c((jje) x77Var.d);
                }
                this.b = null;
                break;
            case 4:
                p8f p8fVar = (p8f) this.b;
                if (p8fVar != null) {
                    mcj mcjVar2 = (mcj) p8fVar.b;
                    ((i7f) mcjVar2.a).c((jje) p8fVar.d);
                }
                this.b = null;
                break;
            case 5:
                ((ViewGroup) this.b).addView((View) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 6:
                break;
            case 7:
                ((Runnable) obj).run();
                break;
            default:
                ((View) this.b).removeOnAttachStateChangeListener(this);
                ((hoh) obj).x();
                break;
        }
    }
}
