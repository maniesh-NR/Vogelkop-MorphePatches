package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.custom_views.OperaTextInputEditText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dw7 extends nz0 {
    public final Context a;
    public String b;
    public int c;
    public final u4l d;
    public final m4l e;
    public final Function0 f;
    public final String g;

    static {
        l4l l4lVar = m4l.Companion;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw7(Context context, u4l u4lVar, int i, Function0 function0) {
        super(true, false);
        m4l m4lVarA = u4lVar.a(i);
        String string = m4lVarA.c().a(context.getResources()).toString();
        int i2 = m4lVarA.c;
        this.a = context;
        this.b = string;
        this.c = i2;
        this.d = u4lVar;
        this.e = m4lVarA;
        this.f = function0;
        this.g = string;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132020969);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083349;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131559412, (ViewGroup) null, false);
        int i = 2131362370;
        GridLayout gridLayoutJ = w1h.j(2131362370, viewInflate);
        if (gridLayoutJ != null) {
            i = 2131364772;
            TextInputEditText textInputEditText = (OperaTextInputEditText) w1h.j(2131364772, viewInflate);
            if (textInputEditText != null) {
                textInputEditText.setText(this.b);
                textInputEditText.addTextChangedListener(new h63(this, (byte) 0));
                az0Var.setView((LinearLayout) viewInflate);
                h6n it = new g6n(gridLayoutJ).iterator();
                final int i2 = 0;
                while (true) {
                    h6n h6nVar = it;
                    if (!h6nVar.hasNext()) {
                        return;
                    }
                    Object next = h6nVar.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        j95.n();
                        throw null;
                    }
                    final View view = (View) next;
                    q9n.f(view, new r8n() { // from class: f63
                        @Override // defpackage.r8n
                        public final void a(View view2) {
                            m4l.Companion.getClass();
                            dxh dxhVar = ((k4l) m4l.d.get(i2)).a;
                            View view3 = view;
                            view3.setBackgroundTintList(dxhVar.b(view3.getContext()));
                        }
                    });
                    ((Checkable) view).setChecked(i2 == this.c);
                    view.setOnClickListener(new g63(this, i2, (byte) 0));
                    i2 = i3;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        String str = this.b;
        int i = this.c;
        boolean zA = Intrinsics.a(str, this.g);
        m4l m4lVar = this.e;
        if (zA) {
            str = m4lVar.b;
        }
        this.d.b(m4l.a(m4lVar, str, i, 1));
        this.f.invoke();
    }

    @Override // defpackage.nz0
    public final Context wrapContext(Context context) {
        return this.a;
    }
}
