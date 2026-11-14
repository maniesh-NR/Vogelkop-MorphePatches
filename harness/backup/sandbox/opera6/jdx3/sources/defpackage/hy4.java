package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.opera.android.browser.passwordmanager.ChooseCredentialsDialogRequest;
import com.opera.android.custom_views.CheckBox;
import java.util.WeakHashMap;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class hy4 extends nz0 {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public boolean c;
    public final Object d;
    public Object e;

    public hy4(cie cieVar, i16 i16Var) {
        super(false, false);
        this.b = cieVar;
        this.d = i16Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy4(ChooseCredentialsDialogRequest chooseCredentialsDialogRequest, String str, iy4[] iy4VarArr) {
        super(false, false);
        this.e = chooseCredentialsDialogRequest;
        this.b = str;
        this.d = iy4VarArr;
    }

    public hy4(db dbVar, bf9 bf9Var, uif uifVar) {
        super(true, false);
        this.b = dbVar;
        this.d = bf9Var;
        this.e = uifVar;
    }

    public hy4(String str, String str2, b27 b27Var) {
        super(false, false);
        this.b = str;
        this.d = str2;
        this.e = b27Var;
        this.c = false;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
        }
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (((iy4[]) obj).length == 1) {
                    return context.getString(2132021526);
                }
                return null;
            case 1:
                return (String) obj;
            case 2:
                return context.getString(2132019049);
            default:
                return context.getString(2132021594);
        }
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        switch (this.a) {
            case 2:
                return 2132083349;
            default:
                return super.getTheme();
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Context context = az0Var.getContext();
                View viewInflate = LayoutInflater.from(context).inflate(2131558668, (ViewGroup) null);
                viewInflate.setPaddingRelative(viewInflate.getPaddingStart(), viewInflate.getPaddingTop(), viewInflate.getPaddingEnd(), fan.a(16.0f, context.getResources()));
                TextView textView = (TextView) viewInflate.findViewById(2131363525);
                ((TextView) viewInflate.findViewById(2131363784)).setText((String) obj2);
                wy0 wy0Var = az0Var.a;
                wy0Var.e = viewInflate;
                iy4[] iy4VarArr = (iy4[]) obj;
                yy0 yy0Var = new yy0(context, 0, iy4VarArr);
                sk skVar = new sk(this, (byte) 5);
                wy0Var.o = yy0Var;
                wy0Var.p = skVar;
                textView.setText(iy4VarArr.length == 1 ? 2132021527 : 2132018220);
                wy0Var.k = true;
                break;
            case 1:
                az0Var.a.f = (String) obj2;
                break;
            case 2:
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(az0Var.getContext()).inflate(2131558723, (ViewGroup) null);
                i9c i9cVar = new i9c(viewGroup, (cie) obj2, (i16) obj);
                this.e = i9cVar;
                WeakHashMap weakHashMap = r5n.a;
                View view = (View) m5n.f(viewGroup, 2131362899);
                ViewGroup viewGroup2 = (ViewGroup) i9cVar.e;
                viewGroup2.removeView(view);
                viewGroup2.addView(view);
                az0Var.setView(viewGroup);
                break;
            default:
                az0Var.b(2132021759);
                az0Var.setView(phj.I(az0Var.getContext(), 2132021758, false, (av4) null));
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        switch (this.a) {
            case 1:
                ((b27) this.e).p(this.c);
                break;
        }
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    N.MyhGgz0G(((ChooseCredentialsDialogRequest) this.e).b);
                    break;
                }
                break;
            case 1:
            default:
                super.onFinished(hjmVar);
                break;
            case 2:
                super.onFinished(hjmVar);
                if (!this.c) {
                    ((i16) ((i9c) this.e).f).x(false, hjmVar == hjm.b);
                    break;
                }
                break;
            case 3:
                ((uif) this.e).b(this.c);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) throws JSONException {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    N.M2LTxUAH(((ChooseCredentialsDialogRequest) this.e).b, 0);
                    break;
                }
                break;
            case 1:
                this.c = true;
                break;
            case 2:
                this.c = true;
                i9c i9cVar = (i9c) this.e;
                if (i9cVar != null) {
                    i9cVar.g();
                    break;
                }
                break;
            default:
                this.c = true;
                ((db) this.b).j(true);
                ((bf9) this.d).h();
                CheckBox checkBox = (CheckBox) bz0Var.findViewById(2131362471);
                if (checkBox != null ? checkBox.n : false) {
                    ((uif) this.e).i(zhj.a(e35.H0(3), 4097));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        switch (this.a) {
            case 0:
                phj.Q(bz0Var, false);
                break;
            case 1:
            default:
                super.onShowDialog(bz0Var);
                break;
            case 2:
                super.onShowDialog(bz0Var);
                Button buttonF = bz0Var.f(-1);
                buttonF.setEnabled(false);
                i9c i9cVar = (i9c) this.e;
                y0a y0aVar = new y0a(buttonF, (byte) 6);
                i9cVar.g = y0aVar;
                if (i9cVar.b) {
                    y0aVar.run(Boolean.TRUE);
                }
                Window window = bz0Var.getWindow();
                if (window != null) {
                    window.setSoftInputMode(16);
                    break;
                }
                break;
        }
    }
}
