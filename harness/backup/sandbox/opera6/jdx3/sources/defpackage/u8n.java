package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u8n implements View.OnAttachStateChangeListener, cll {
    public static final int[] h = {R.attr.theme};
    public final dll a;
    public final View b;
    public int c;
    public ff2 d;
    public ArrayDeque e;
    public final ArrayList f = new ArrayList();
    public boolean g;

    public u8n(dll dllVar, View view) {
        this.a = dllVar;
        this.b = view;
        view.addOnAttachStateChangeListener(this);
        this.c = dllVar.a;
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    public static void a(dll dllVar, zg zgVar, r8n r8nVar) {
        View view = (View) zgVar.b;
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar == null) {
            u8nVar = new u8n(dllVar, view);
            view.setTag(2131365014, u8nVar);
        }
        u8nVar.f.add(0, r8nVar);
    }

    public static void b(dll dllVar, View view, r8n r8nVar) {
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar == null) {
            u8nVar = new u8n(dllVar, view);
            view.setTag(2131365014, u8nVar);
        }
        u8nVar.f.add(r8nVar);
    }

    public static void d(int i, View view) {
        u8n u8nVar;
        Object parent = view.getParent();
        if (!(parent instanceof View) || (u8nVar = (u8n) view.getTag(2131365014)) == null || u8nVar.d == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        typedValue.type = 1;
        typedValue.resourceId = i;
        typedValue.data = i;
        u8nVar.d = new ff2(h, typedValue);
        i(view.getContext(), ((View) parent).getContext().getTheme(), i);
        g(view);
    }

    public static void e(Dialog dialog) {
        View decorView = dialog.getWindow().getDecorView();
        dll dllVarS = q9n.s(decorView);
        if (dllVarS == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Context context = dialog.getContext();
        while ((context instanceof ContextThemeWrapper) && !(context instanceof Activity)) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            arrayDeque.push(new t8n(contextThemeWrapper, ((Integer) mzg.j(contextThemeWrapper, "getThemeResId", (Class[]) null, new Object[0])).intValue()));
            context = contextThemeWrapper.getBaseContext();
        }
        f(dllVarS, decorView, null, arrayDeque);
        b(dllVarS, decorView, new x8n());
    }

    public static void f(dll dllVar, View view, ff2 ff2Var, ArrayDeque arrayDeque) {
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar == null) {
            u8nVar = new u8n(dllVar, view);
            view.setTag(2131365014, u8nVar);
        }
        u8nVar.d = ff2Var;
        u8nVar.e = arrayDeque;
    }

    public static void g(View view) {
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar != null) {
            u8nVar.c(true, false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                g(viewGroup.getChildAt(i));
            }
        }
    }

    public static void h(View view) {
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar != null) {
            u8nVar.f.clear();
        }
        view.setTag(2131365014, null);
    }

    public static void i(Context context, Resources.Theme theme, int i) {
        context.getTheme().setTo(theme);
        context.setTheme(2132083157);
        context.setTheme(i);
    }

    @Override // defpackage.cll
    public final void K() {
        c(false, false);
    }

    public final void c(boolean z, boolean z2) {
        dll dllVar = this.a;
        if (z || this.c != dllVar.a) {
            this.c = dllVar.a;
            ff2 ff2Var = this.d;
            ArrayDeque arrayDeque = this.e;
            int i = 0;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    t8n t8nVar = (t8n) it.next();
                    Context baseContext = t8nVar.a.getBaseContext();
                    ContextWrapper contextWrapper = t8nVar.a;
                    Resources.Theme theme = baseContext.getTheme();
                    int i2 = t8nVar.c;
                    i(contextWrapper, theme, i2 != 0 ? f03.E(i2, baseContext, 0) : t8nVar.b);
                }
            }
            View view = this.b;
            if (ff2Var != null) {
                Context context = view.getContext();
                Context baseContext2 = context;
                while ((baseContext2 instanceof ContextWrapper) && !(baseContext2 instanceof Activity)) {
                    baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
                    if (baseContext2.getTheme() != context.getTheme()) {
                        break;
                    }
                }
                i(context, baseContext2.getTheme(), ff2Var.c(baseContext2).data);
                if (z2) {
                    q9n.J(view, View.class, new bxl((byte) 22));
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r8n) obj).a(view);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.F(this);
        c(false, true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.H(this);
        this.g = false;
    }
}
